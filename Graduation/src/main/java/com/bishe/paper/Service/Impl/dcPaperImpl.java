package com.bishe.paper.Service.Impl;

import com.bishe.paper.bean.dcpaper;
import com.bishe.paper.dao.dcpaperMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class dcPaperImpl {

    @Resource
    private dcpaperMapper dcpaperMapper;

    public boolean save(dcpaper p1) {
        return dcpaperMapper.insert(p1)>0?true:false;
    }
}
