package com.bishe.user.service.Impl;

import com.bishe.user.bean.user;
import com.bishe.user.bean.userExample;
import com.bishe.user.dao.userMapper;
import com.bishe.user.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class userImpl implements userService {

    @Resource
    private userMapper userMapper;

    @Override
    public List<user> getlist() {
        userExample example = new userExample();
        return userMapper.selectByExample(example);
    }

    public user getEmploye(user u) {
        userExample example = new userExample();
        userExample.Criteria criteria = example.createCriteria();
        criteria.andUsernameEqualTo(u.getUsername());
        criteria.andPasswordEqualTo(u.getPassword());
        List<user> employees = userMapper.selectByExample(example);
        if(employees.size()>0){
            return employees.get(0);
        }
        return null;
    }
}
