<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8">
    <title>应急知识学习系统</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" />
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
</head>
<body>

<nav class="navbar navbar-default" role="navigation">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="#">应急知识学习系统</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li class="active"><a href="#">关于我们</a></li>
                <li><a href="#">主页</a></li>
                <li class="dropdown">
                    <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                        学习
                        <b class="caret"></b>
                    </a>
                    <ul class="dropdown-menu">
                        <li class="divider"></li>
                        <li><a href="#">自然灾害</a></li>
                        <li class="divider"></li>
                        <li><a href="#">事故灾害</a></li>
                        <li class="divider"></li>
                        <li><a href="#">公共卫生事件</a></li>
                        <li class="divider"></li>
                        <li><a href="#">社会安全事件</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</nav>
<div id="a">
    <div id="a1">
        <img src="img/1.png"  width="580px" height="400px" />
    </div>
    <div id="a2">
        <form id="form1" action="${pageContext.request.contextPath}/user/login" method="post">
            <br /><br /><br /><br />
            <table  width="300px" border="0" cellspacing="0px" cellpadding="0px">
                <tr>
                    <td align="right"></span>用户名：</td>
                    <td><input class="form-control" type="text" id="username" name="username" placeholder="请输入用户名"></td>

                </tr>
            </table>
            <br /><br />
            <table  width="300px" border="0" cellspacing="0px" cellpadding="0px">
                <tr>
                    <td align="right">&nbsp;&nbsp;&nbsp;密码：</td>
                    <td><input class="form-control" type="text" name="username" id="password"  placeholder="请输入密码"></td>
                </tr>
            </table>
            <br /><br />
            <table  width="200px" border="0" cellspacing="0px" cellpadding="0px">
                <tr>
                    <td align="right" width="70px">验证码：</td>
                    <td><input class="form-control" type="text" id="code" name="code" placeholder="请输入验证码">
                        <span style="position: absolute">
                                <img id="img" onclick="getVerifiCode()" title="点击刷新验证码" src="${pageContext.request.contextPath}/code/verify"/>
                        </span></td>
                </tr>
            </table>
            <br>
            <button type="button" class="btn btn-success btn-lg btn-block" onclick="login()">登陆</button>
            <a href="#" style="text-decoration: none;position: absolute;right: 90px">没有账号？注册一个</a>
        </form>
    </div>
</div>
</body>

<script>

    function getVerifiCode() {
        $("#img").prop('src','${pageContext.request.contextPath}/code/verify?a='+new Date().getTime());
    }

        function login() {
            var username = $("#username").val();
            var password = $("#password").val();
            var code = $("#code").val();
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/user/login",
                data:{"username":username,"password":password,"code":code},
                success:function(message){
                    if(message==1){
                        getVerifiCode();
                        alert("用户名或密码不正确");
                    }else if(message==2){
                        getVerifiCode();
                        alert("验证码错误");
                    }else if(message==3){
                        alert("登陆成功");
                        window.location.href="index.jsp";
                    }
                }
            });
        }
</script>
</html>