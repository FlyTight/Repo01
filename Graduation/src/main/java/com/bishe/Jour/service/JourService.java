package com.bishe.Jour.service;

import com.bishe.Jour.bean.Journalism;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface JourService {
    PageInfo<Journalism> getList(int pageNo);

    List<Journalism> getList();
}
