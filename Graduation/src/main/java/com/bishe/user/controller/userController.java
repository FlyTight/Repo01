package com.bishe.user.controller;

import com.bishe.user.bean.user;
import com.bishe.user.service.Impl.userImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/user")
public class userController {

    @Autowired
    private userImpl userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<user> getlist(){
        return userService.getlist();
    }

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    @ResponseBody
    public String login(user u, String code, HttpSession session, RedirectAttributes redirectAttributes){
        String text = (String)session.getAttribute("text");
//        System.out.println(text);
        //session中的验证码取出后要立即移除
        session.removeAttribute("text");
        //忽略大小写的验证
        if(code.equalsIgnoreCase(text)){
            //如果眼中你干嘛正确，再验证用户名和密码
            user us =  userService.getEmploye(u);

            if(us==null){
                redirectAttributes.addFlashAttribute("msg","用户名或密码错误");
                return "1";
            }else{
                session.setAttribute("loginUser",us);
                if(session.getAttribute("loginNumber") == null){
                    session.setAttribute("loginNumber",1);
                }else{
                    session.setAttribute("loginNumber",(int)session.getAttribute("loginNumber")+1);
                }

            }
        }else{
            //重定向的同时如果想携带错误提示信息去页面
            redirectAttributes.addFlashAttribute("msg","验证码错误");
            return "2";
        }

        return "3";
    }
}
