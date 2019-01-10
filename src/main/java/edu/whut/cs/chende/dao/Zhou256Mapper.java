package edu.whut.cs.chende.dao;

import edu.whut.cs.chende.entity.Zhou256;
import edu.whut.cs.chende.entity.Zhou256Example;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface Zhou256Mapper {
    long countByExample(Zhou256Example example);

    int deleteByExample(Zhou256Example example);

    int deleteByPrimaryKey(Integer id);

    int insert(Zhou256 record);

    int insertSelective(Zhou256 record);

    List<Zhou256> selectByExample(Zhou256Example example);

    Zhou256 selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Zhou256 record, @Param("example") Zhou256Example example);

    int updateByExample(@Param("record") Zhou256 record, @Param("example") Zhou256Example example);

    int updateByPrimaryKeySelective(Zhou256 record);

    int updateByPrimaryKey(Zhou256 record);
}