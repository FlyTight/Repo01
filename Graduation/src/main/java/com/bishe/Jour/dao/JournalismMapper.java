package com.bishe.Jour.dao;
import java.util.List;

import com.bishe.Jour.bean.Journalism;
import com.bishe.Jour.bean.JournalismExample;
import org.apache.ibatis.annotations.Param;

public interface JournalismMapper {
    int countByExample(JournalismExample example);

    int deleteByExample(JournalismExample example);

    int deleteByPrimaryKey(Integer titleId);

    int insert(Journalism record);

    int insertSelective(Journalism record);

    List<Journalism> selectByExample(JournalismExample example);

    Journalism selectByPrimaryKey(Integer titleId);

    int updateByExampleSelective(@Param("record") Journalism record, @Param("example") JournalismExample example);

    int updateByExample(@Param("record") Journalism record, @Param("example") JournalismExample example);

    int updateByPrimaryKeySelective(Journalism record);

    int updateByPrimaryKey(Journalism record);
}