package edu.whut.cs.chende.util;



import org.apache.log4j.Logger;
import org.csource.common.MyException;
import org.csource.fastdfs.*;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;


public class FastDFSHelper {

    public static void main(String[] args) {
        FastDFSHelper fastDFSHelper=new FastDFSHelper();
        String file="C:\\Users\\chende\\Desktop\\ggdown.png";
//        File f=new File(file);
//        if (f.isFile())
//        fastDFSHelper.uploadFile(file);
//        else
//            System.out.println("f is not file");
        // [group1, M00/00/00/rBElrFxxPbKAOnHAAAOjo-5QKK0934.png]
        //测试下载
        fastDFSHelper.downloadFile(file,"group1","M00/00/00/rBElrFxxPbKAOnHAAAOjo-5QKK0934.png");
    }
    private static final Logger logger = Logger.getLogger(FastDFSHelper.class);
    private static TrackerClient trackerClient;

    static {
        try {
            ClientGlobal.init("src/main/resources/config/fastdfs-client.conf");
            trackerClient = new TrackerClient();
        } catch (IOException | MyException e) {
            logger.error("error", e);
        }
    }

    /**
     * 向FastDFS上传文件
     *
     * @param localFilename 本地文件名
     * @return 上传成功，返回组名和该文件在FastDFS中的名称；上传失败，返回null
     */
    public void uploadFile(String localFilename) {
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getConnection();
        } catch (IOException e) {
            logger.error("error", e);
        }
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        try {
            String[] arr = storageClient.upload_file(localFilename, null, null);
            if (arr == null || arr.length != 2) {
                logger.error("向FastDFS上传文件失败");
            } else {
                logger.info("向FastDFS上传文件成功");
            }
            System.out.println(Arrays.toString(arr));
        } catch (IOException | MyException e) {
            logger.error("error", e);
        } finally {
            try {
                if (trackerServer != null) {
                    logger.info("关闭trackerServer连接");
                    trackerServer.close();
                }
                storageClient = null;
            } catch (IOException e) {
                logger.error("error", e);
            }
        }
    }

    /**
     * 从FastDFS下载文件
     *
     * @param localFilename  本地文件名
     * @param groupName      文件在FastDFS中的组名
     * @param remoteFilename 文件在FastDFS中的名称
     */
    public void downloadFile(String localFilename, String groupName, String remoteFilename) {
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getConnection();
        } catch (IOException e) {
            logger.error("error", e);
        }
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(localFilename))) {
            byte[] content = storageClient.download_file(groupName, remoteFilename);
            if (content == null || content.length == 0) {
                logger.error("文件大小为空！");
                return;
            }
            bos.write(content);
            logger.info("成功下载文件： " + localFilename);
        } catch (IOException | MyException e) {
            logger.error("error", e);
        } finally {
            try {
                if (trackerServer != null) {
                    logger.info("关闭trackerServer连接");
                    trackerServer.close();
                }
                storageClient = null;
            } catch (IOException e) {
                logger.error("error", e);
            }
        }
    }

    /**
     * 从FastDFS删除文件
     *
     * @param localFilename  本地文件名
     * @param groupName      文件在FastDFS中的组名
     * @param remoteFilename 文件在FastDFS中的名称
     */
    public void deleteFile(String localFilename, String groupName, String remoteFilename) {
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getConnection();
        } catch (IOException e) {
            logger.error("error", e);
        }
        StorageServer storageServer = null;
        StorageClient storageClient = new StorageClient(trackerServer, storageServer);
        try {
            int i = storageClient.delete_file(groupName, remoteFilename);
            if (i == 0) {
                logger.info("FastDFS删除文件成功");
            } else {
                logger.info("FastDFS删除文件失败");
            }
        } catch (IOException | MyException e) {
            logger.error("error", e);
        } finally {
            try {
                if (trackerServer != null) {
                    logger.info("关闭trackerServer连接");
                    trackerServer.close();
                }
                storageClient = null;
            } catch (IOException e) {
                logger.error("error", e);
            }
        }
    }
}