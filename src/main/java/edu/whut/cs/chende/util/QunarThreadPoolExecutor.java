package edu.whut.cs.chende.util;


import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class QunarThreadPoolExecutor extends ThreadPoolExecutor {

    // 记录每个线程执行任务开始时间
    private ThreadLocal<Long> start = new ThreadLocal<Long>();

    // 记录所有任务完成使用的时间
    private AtomicLong totals = new AtomicLong();

    // 记录线程池完成的任务数
    private AtomicInteger tasks = new AtomicInteger();

    public QunarThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                   BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory, handler);
    }

    public QunarThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                   BlockingQueue<Runnable> workQueue, RejectedExecutionHandler handler) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, handler);
    }

    public QunarThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                   BlockingQueue<Runnable> workQueue, ThreadFactory threadFactory) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue, threadFactory);
    }

    public QunarThreadPoolExecutor(int corePoolSize, int maximumPoolSize, long keepAliveTime, TimeUnit unit,
                                   BlockingQueue<Runnable> workQueue) {
        super(corePoolSize, maximumPoolSize, keepAliveTime, unit, workQueue);
    }

    /**
     * 每个线程在调用run方法之前调用该方法
     */
    protected void beforeExecute(Thread t, Runnable r) {
        super.beforeExecute(t, r);
        start.set(System.currentTimeMillis());
    }

    /**
     * 每个线程在执行完run方法后调用该方法
     */
    protected void afterExecute(Runnable r, Throwable t) {
        super.afterExecute(r, t);
        tasks.incrementAndGet();
        totals.addAndGet(System.currentTimeMillis() - start.get());
    }

    @Override
    protected void terminated() {
        super.terminated();
        System.out.println("完成" + tasks.get() + "个任务,平均耗时: [" + totals.get() / tasks.get() + "] ms");
    }
}