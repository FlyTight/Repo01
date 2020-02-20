package com.bishe.Aspect;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

//@Component
//@Aspect
public class ControllerAspect {

    private static final Logger logger = Logger.getLogger(ControllerAspect.class);

    @Before(value = "execution(* com.bishe.*.controller..*(..))")
    public void beforeLog(JoinPoint poit){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes)RequestContextHolder.currentRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        String remoteHost = request.getRemoteHost(); //谁访问的记录访问用户发送的Ip
        String className = poit.getTarget().getClass().getName();  //访问的类名
        Signature signature = poit.getSignature();  //获取目标方法的签名
        logger.info("请求的类是："+className+"目标方法的签名是："+signature+"发送请求地址"+remoteHost);
        //System.out.println("请求的类是："+className+"目标方法的签名是："+signature+"发送请求地址"+remoteHost);
    }
}
