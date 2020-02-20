<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/4
  Time: 17:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>多级CSS3下拉菜单导航</title>
    <link href="${pageContext.request.contextPath}/css/index1.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/maps.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/google.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
    <script type="text/javascript">$(document).ready(function(){$().maps();});</script>
</head>
<body>
    <jsp:include page="title.jsp"></jsp:include>
    <div id="weizhi">
        <span style="position:relative;left 500px;top: 8px;">aaa</span>
    </div>
    <div id="neirong2">
        <p style="text-align: center; color: #269ABC;">相关内容</p>
        <hr color="#95BDE1" />
        <ul>
            <li><a href="#">应急管理学习</a></li><br />
            <li><a href="#">应急管理学习</a></li><br />
            <li><a href="#">应急管理学习</a></li><br />
            <li><a href="#">应急管理学习</a></li><br />
            <li><a href="#">应急管理学习</a></li>
        </ul>
    </div>
    <br />

    <c:forEach items="${page.list}" var="l" varStatus="i">
        <div id="neirong">
            <p style="font-size: 21px;font-weight: bold;">&nbsp;&nbsp;&nbsp;&nbsp;问题：</p>
            <p style="font-size: 16px;">
                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                [单选]${i.count}. ${l.title}<br />
            <table width="800px" >
                <tr>
                    <td>A．${l.a}</td>
                </tr>
                <tr>
                    <td>B．${l.b}</td>
                </tr>
                <tr>
                    <td>C．${l.c}</td>
                </tr>
                <tr>
                    <td>D．${l.d}</td>
                </tr>
            </table>
            </p>
            <hr color="#95BDE1" />
            <p style="position: relative;left: 700px;text-decoration: none;"onclick="daan(pid${l.pid})"><input type="button" value="参考解析"/></p><br />
            <!-- 显示答案  -->
            <div id="daan">
                <p id="pid${l.pid}">
                    &nbsp;&nbsp;答案：&nbsp;${l.correct}<br>
                    &nbsp;&nbsp;解析：&nbsp;${l.answer}
                    <br/><br/>
                </p>
            </div>
        </div>
        <br>
    </c:forEach>


    <div id="fenye">
        <ul class="pagination" style="align-content: center">
            <li><a href="${pageContext.request.contextPath}/paper/list/${ptype}/?pageNo=1">首页</a></li>
            <li><a href="${pageContext.request.contextPath}/paper/list/${ptype}/?pageNo=${page.pageNum-1}">&laquo;</a></li>
            <c:forEach items="${page.navigatepageNums}" var="pageNum">
                <c:if test="${page.pageNum == pageNum}">
                    <li class="active"><a href="#">${pageNum}</a></li>
                </c:if>
                <c:if test="${page.pageNum != pageNum}">
                    <li><a href="${pageContext.request.contextPath}/paper/list/${ptype}/?pageNo=${pageNum}">${pageNum}</a></li>
                </c:if>
            </c:forEach>
            <li><a href="${pageContext.request.contextPath}/paper/list/${ptype}/?pageNo=${page.pageNum+1}">&raquo;</a></li>
            <li><a href="${pageContext.request.contextPath}/paper/list/${ptype}/?pageNo=${page.pages}">末页</a></li>
            <li><a href="#">共：${page.pages}页</a></li>
        </ul>
    </div>

<script>
    function daan(p){
        $(p).parent().fadeToggle();
    }
</script>
</body>


<!--
	答案通过pid查找,参数传入pid
-->

</html>
