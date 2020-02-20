package com.bishe.paper.dao;


import com.bishe.paper.bean.paper;

import java.util.List;

public interface paperMapper {

    public List<paper> getList(int ptype);

    public List<paper> getLists();

    int save(paper p);

    paper selectByPid(int pid);

    int update(paper p);

    int delete(int pid);


}