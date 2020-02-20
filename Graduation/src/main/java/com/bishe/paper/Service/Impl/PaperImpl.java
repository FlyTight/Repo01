package com.bishe.paper.Service.Impl;

import com.bishe.paper.Service.paperService;
import com.bishe.paper.bean.paper;
import com.bishe.paper.dao.paperMapper;
import com.bishe.utli.ConstantUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PaperImpl implements paperService {

    @Resource
    private paperMapper paperMapper;

    public PageInfo<paper> getList(int ptype,int pageNo) {
        PageHelper.startPage(pageNo, ConstantUtils.PAGE_SIZE);
        List<paper> list  = paperMapper.getList(ptype);
        PageInfo<paper> pageInfo = new PageInfo<>(list,ConstantUtils.NAVIGATE_PAGENUM);
        return pageInfo;
    }

    public PageInfo<paper> getLists(int pageNo) {
        PageHelper.startPage(pageNo, 10);
        List<paper> list  = paperMapper.getLists();
        PageInfo<paper> pageInfo = new PageInfo<>(list,ConstantUtils.NAVIGATE_PAGENUM);
        return pageInfo;
    }


    public int save(paper p) {
       return paperMapper.save(p);

    }

    public paper selectByPid(int pid) {
        return paperMapper.selectByPid(pid);
    }

    public int update(paper p) {
        return paperMapper.update(p);
    }

    public int delete(int pid) {
        return paperMapper.delete(pid);
    }

    public List<paper> getl() {
        return paperMapper.getLists();
    }

    public PageInfo<paper> getList(int pageNo) {
        PageHelper.startPage(pageNo, 5);
        List<paper> list  = paperMapper.getLists();
        PageInfo<paper> pageInfo = new PageInfo<>(list,ConstantUtils.NAVIGATE_PAGENUM);
        System.out.println(pageInfo.getTotal()+"!!!!!!!!!!!!!!");
        return pageInfo;
    }
}













