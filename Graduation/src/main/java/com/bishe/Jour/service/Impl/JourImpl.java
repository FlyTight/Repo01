package com.bishe.Jour.service.Impl;

import com.bishe.Jour.bean.Journalism;
import com.bishe.Jour.bean.JournalismExample;
import com.bishe.Jour.dao.JournalismMapper;
import com.bishe.Jour.service.JourService;
import com.bishe.paper.bean.paper;
import com.bishe.utli.ConstantUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class JourImpl implements JourService {

    @Resource
    private JournalismMapper journalismMapper;

//    @Override
//    public List<Journalism> getList() {
//        JournalismExample example = new JournalismExample();
//        return journalismMapper.selectByExample(example);
//    }

    public PageInfo<Journalism> getList(int pageNo){
        PageHelper.startPage(pageNo, 1);
        JournalismExample example = new JournalismExample();
        List<Journalism> list  =  journalismMapper.selectByExample(example);
        PageInfo<Journalism> pageInfo = new PageInfo<>(list, ConstantUtils.NAVIGATE_PAGENUM);
        return pageInfo;
    }

    @Override
    public List<Journalism> getList() {
        JournalismExample example = new JournalismExample();
        return journalismMapper.selectByExample(example);
    }
}
