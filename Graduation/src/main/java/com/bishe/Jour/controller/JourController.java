package com.bishe.Jour.controller;

import com.bishe.Jour.bean.Journalism;
import com.bishe.Jour.service.JourService;
import com.bishe.paper.bean.paper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/jour")
@Controller
public class JourController {
    @Resource
    private JourService jourService;

@RequestMapping("/list")
@ResponseBody
   public List<Journalism> getList(){
    List<Journalism> list = jourService.getList();
    System.out.println(list.size()+"!!!!!!!!!!!!!!11");
    for (Journalism journalism : list) {
        System.out.println(journalism);
    }
    return jourService.getList();

   }
}
