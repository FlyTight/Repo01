<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/3
  Time: 15:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link href="${pageContext.request.contextPath}/css/index1.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/maps.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/google.js"></script>
    <script type="text/javascript">$(document).ready(function(){$().maps();});</script>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>
<div style="width: 100%;height: 50px;background-color:#b3e19d">
    <p style="font-size: 12px; color: gray;position:relative;left: 300px;">欢迎来到应急知识学习系统&nbsp;&nbsp;|&nbsp;&nbsp;首页</p>
    <p style="font-size: 12px; color: black;position:absolute;left: 1200px;top: 1px;">当前用户：${loginUser.username}&nbsp;&nbsp;在线学习人数：${sessionScope.loginNumber} 人&nbsp;&nbsp;<a href="${pageContext.request.contextPath}/login.jsp">退出</a></p>
</div>
<hr />
<span style="position: absolute;left: 200px;top:55px"><img src="${pageContext.request.contextPath}/img/logo.png" width="60px" height="60px"></span>
<div style="position: absolute; left: 270px;top:55px; color: dimgray;"><h2><b>应急知识学习系统</b></h2></div>
<br /><br />
<div class="content" >
    <ul class="venus-menu">
        <li class="active"><a href="#"><i class="icon-home"></i>主页</a></li>

        <li><a href="#"><i class="icon-magic"></i>个人中心</a></li>

        <li><a href="#"><i class="icon-envelope-alt"></i>新闻</a>
            <ul>
                <li><a href="#">应急要闻</a></li>
                </li>
                <li><a href="#">地方应急</a></li>
                </li>
                <li><a href="#">时政专栏</a>
                </li>
            </ul>
        </li>

        <li><a href="#"><i class="icon-envelope-alt"></i>科普</a>
            <ul>
                <li><a href="#">应计指南</a></li>
                <li><a href="#">生活安全</a></li>
                <li><a href="#">自然灾害</a></li>
                <li><a href="#">事故灾害</a></li>
            </ul>
        </li>

        <li><a href="#"><i class="icon-envelope-alt"></i>题库</a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/paper/list/1">自然灾害</a></li>
                <li><a href="${pageContext.request.contextPath}/paper/list/2">事故灾害</a></li>
                <li><a href="${pageContext.request.contextPath}/paper/list/3">公共卫生事件</a></li>
                <li><a href="${pageContext.request.contextPath}/paper/list/4">社会安全事件</a></li>
            </ul>
        </li>

        <li><a href="#"><i class="icon-quote-right"></i>试题测试</a>
            <ul>
                <li><a href="${pageContext.request.contextPath}/ceshi.jsp">综合测试</a></li>
                <li><a href="#">专项测试</a>
                    <ul>
                        <li><a href="#">自然灾害</a></li>
                        <li><a href="#">事故灾害</a></li>
                        <li><a href="#">公共卫生事件</a></li>
                        <li><a href="#">社会安全事件</a></li>
                    </ul>
                </li>
            </ul>
        </li>

        <li><a href="${pageContext.request.contextPath}/Backstage/main.html"><i class="icon-envelope-alt"></i>后台</a></li>

        <li><a href="${pageContext.request.contextPath}/diaocha.jsp"><i class="icon-envelope-alt"></i>大学生应急知识调查问卷</a></li>
        <li class="search">
            <form method="get">
                <input type="text" name="search" id="search" class="search" placeholder="搜索" onblur="sou()"/></form>
        </li >
    </ul>
</div>
<script type="text/javascript">

    function sou() {
        var text = $("#search").val();
        if(text==""){
            return;
        }else{
            window.location="${pageContext.request.contextPath}/paper/listss?text="+text;
        }
    }


</script>
</body>
</html>
