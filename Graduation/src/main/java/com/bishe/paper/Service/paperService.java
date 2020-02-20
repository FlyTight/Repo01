package com.bishe.paper.Service;

import com.bishe.paper.bean.paper;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface paperService {
    public PageInfo<paper> getList(int ptype, int pageNo);
    public PageInfo<paper> getLists(int pageNo);
}
