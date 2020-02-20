package com.bishe.paper.controller;

import com.bishe.paper.Service.Impl.PaperImpl;
import com.bishe.paper.Service.Impl.dcPaperImpl;
import com.bishe.paper.bean.dcpaper;
import com.bishe.paper.bean.paper;
import com.bishe.utli.ResultEntity;
import com.github.pagehelper.PageInfo;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/paper")
public class papersController {

    @Autowired
    private PaperImpl papers;
    @Autowired
    private dcPaperImpl dcPaper;

    @RequestMapping("/list/{ptype}")
    public ModelAndView getList(@PathVariable("ptype") int ptype,@RequestParam(value = "pageNo",defaultValue = "1") int pageNo){
        ModelAndView mv = new ModelAndView("Choice");
        PageInfo<paper> page = papers.getList(ptype,pageNo);
        mv.addObject("page",page);
        mv.addObject("ptype",ptype);
        return mv;
    }

    @RequestMapping(value = "/lists",method = RequestMethod.GET)
    public ModelAndView getList(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo){
        ModelAndView mv = new ModelAndView("Backstage/paperBase");
        PageInfo<paper> page = papers.getLists(pageNo);
        mv.addObject("page",page);
        return mv;
    }


    @RequestMapping(value = "/save",method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> save(paper p){
        Map<String,Object> map = new HashMap<>();
        int i = papers.save(p);
        if(i>0){
            map.put("msg",200);
        }else {
            map.put("msg",400);
        }
        return map;
    }


    @RequestMapping("/save")
    @ResponseBody
    public int save(dcpaper p){
        dcpaper p1 = new dcpaper("0");
        p1.setSex(p.getSex());
        p1.setSchool(p.getSchool());
        p1.setA4(p.getA4());
        p1.setA5(p.getA5());
        if(!p.getA3().equals("1")){
            p.setA6("1");
        }
        if(!p.getA6().equals("A")){
            p1.setA6("1");
        }
        if(!p.getA7().equals("C")){
            p1.setA7("1");
        }
        if(!p.getA8().equals("A")){
            p1.setA8("1");
        }
        if(!p.getA9().equals("A")){
            p1.setA9("1");
        }
        if(!p.getA10().equals("C")){
            p1.setA10("1");
        }
        if(!p.getA11().equals("B")){
            p1.setA11("1");
        }
        if(!p.getA12().equals("A")){
            p1.setA12("1");
        }
        if(!p.getA13().equals("C")){
            p1.setA13("1");
        }
        if(!p.getA14().equals("A")){
            p1.setA14("1");
        }
        if(!p.getA15().equals("A")){
            p1.setA15("1");
        }
        if(!p.getA16().equals("C")){
            p1.setA16("1");
        }
        if(!p.getA17().equals("C")){
            p1.setA17("1");
        }
        if(!p.getA18().equals("A")){
            p1.setA18("1");
        }
        if(!p.getA19().equals("B")){
            p1.setA19("1");
        }
        if(!p.getA20().equals("A")){
            p1.setA20("1");
        }
        if(!p.getA21().equals("C")){
            p1.setA21("1");
        }
        if(!p.getA22().equals("C")){
            p1.setA22("1");
        }
        if(!p.getA23().equals("A")){
            p1.setA23("1");
        }

        boolean boo = dcPaper.save(p1);
        if(boo){
            return 1;
        }
        return 0;
    }

    @RequestMapping("/selectByPid/{pid}")
    public ModelAndView selectByPid(@PathVariable("pid") int pid){
        ModelAndView mv = new ModelAndView("Backstage/paperEdit");
        paper p = papers.selectByPid(pid);
        System.out.println(p);
        mv.addObject("paper",p);
        return mv;
    }


    @RequestMapping("/update")
    @ResponseBody
    public Map<String,Object> update(paper p){
        Map<String,Object> map = new HashMap<>();
            int i = papers.update(p);
            if(i>0){
                map.put("msg",200);
            }else {
                map.put("msg",400);
            }
            return map;
        }

    @RequestMapping("/delete/{pid}")
    @ResponseBody
    public Map<String,Object> delete(@PathVariable("pid") int pid){
        Map<String,Object> map = new HashMap<>();
        int i = papers.delete(pid);
        if(i>0){
            map.put("msg",200);
        }else {
            map.put("msg",400);
        }
        return map;
    }



    @RequestMapping(value = "/listss",method = RequestMethod.GET)
    @ResponseBody
    public List<paper> getl(){
        System.out.println("进来了");
        List<paper> list = papers.getl();
        return list;
    }
    @RequestMapping(value = "/listt",method = RequestMethod.GET)
    @ResponseBody
    public Map<String,Object> getListt(@RequestParam(value = "pageNo",defaultValue = "1") int pageNo){
        Map<String,Object> map = new HashMap<>();
        PageInfo<paper> page = papers.getList(pageNo);
        map.put("page",page);
       return map;
    }

}














