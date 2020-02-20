package com.bishe.paper.dao;

import com.bishe.paper.bean.dcpaper;
import com.bishe.paper.bean.dcpaperExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface dcpaperMapper {
    int countByExample(dcpaperExample example);

    int deleteByExample(dcpaperExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(dcpaper record);

    int insertSelective(dcpaper record);

    List<dcpaper> selectByExample(dcpaperExample example);

    dcpaper selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") dcpaper record, @Param("example") dcpaperExample example);

    int updateByExample(@Param("record") dcpaper record, @Param("example") dcpaperExample example);

    int updateByPrimaryKeySelective(dcpaper record);

    int updateByPrimaryKey(dcpaper record);
}