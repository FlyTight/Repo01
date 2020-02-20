<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">

</head>
<body>

<script type="text/javascript">
            function update(pid) {
                window.location="${pageContext.request.contextPath}/paper/selectByPid/"+pid;
            }
            function deletes(pid) {
                if(confirm("是否删除？")){
                    $.ajax({
                        url:"${pageContext.request.contextPath}/paper/delete/"+pid,
                        success:function (msg) {
                            if(msg.msg==200){
                                var tr = "#tr"+pid;
                                $(tr).remove();
                            }
                        }
                    })
                }
            }

            function add() {
                window.location.href="${pageContext.request.contextPath}/Backstage/paperAdd.jsp";
            }

</script>
<button type="button" class="btn btn-danger btn-xs" onclick="add()">增添</button>
<table class="table table-hover">
    <thead >
    <tr>
        <th width="50px"style="text-align: center">序号</th>
        <th width="150px"style="text-align: center">试卷类型</th>
        <th width="400px" style="text-align: center">题目</th>
        <th width="100px" style="text-align: center">选项A</th>
        <th width="100px" style="text-align: center">选项B</th>
        <th width="100px" style="text-align: center">选项C</th>
        <th width="100px" style="text-align: center">选项D</th>
        <th width="100px"style="text-align: center">正确答案</th>
        <th width="100px"style="text-align: center">试题解析</th>
        <th colspan="2"style="text-align: center">操作</th>
    </tr>
    </thead>
    <tbody id="tbody">
    <c:forEach items="${page.list}" var="page" varStatus="i">
        <tr id="tr${page.pid}">
            <td style="text-align: center">${i.count}</td>
            <td style="text-align: center">
                <c:if test="${page.ptype ==1}">自然灾害</c:if>
                <c:if test="${page.ptype ==2}">事故灾害</c:if>
                <c:if test="${page.ptype ==3}">公共卫生事件</c:if>
                <c:if test="${page.ptype ==4}">社会安全事件</c:if>
            </td>
            <td>
                <c:if test="${page.title.length()>20}">${page.title.substring(0,20)}...</c:if>
                <c:if test="${page.title.length()<=20}">${page.title}</c:if>
            </td>
            <td width="100px">
                <c:if test="${page.a.length()>8}">${page.a.substring(0,8)}...</c:if>
                <c:if test="${page.a.length()<=8}">${page.a}</c:if>
            </td>
            <td width="100px">
                        <c:if test="${page.b.length()>8}">${page.b.substring(0,8)}...</c:if>
                        <c:if test="${page.b.length()<=8}">${page.b}</c:if>
            </td>
            <td width="100px">
                <c:if test="${page.c.length()>8}">${page.c.substring(0,8)}...</c:if>
                <c:if test="${page.c.length()<=8}">${page.c}</c:if>
            </td>
            <td width="100px">
                <c:if test="${page.d.length()>8}">${page.d.substring(0,8)}...</c:if>
                <c:if test="${page.d.length()<=8}">${page.d}</c:if>
            </td>
            <td width="100px" style="text-align: center">${page.correct}</td>
            <td width="100px">${page.answer}</td>
            <td width="50px"><button type="button" class="btn btn-info btn-xs" onclick="update(${page.pid})">修改</button></td>
            <td width="50px"><button type="button" class="btn btn-danger btn-xs" onclick="deletes(${page.pid})">删除</button></td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<ul class="pagination" style="position: absolute;left: 550px">
    <li><a href="${pageContext.request.contextPath}/paper/lists/?pageNo=1">首页</a></li>
    <li><a href="${pageContext.request.contextPath}/paper/lists/?pageNo=${page.pageNum-1}">&laquo;</a></li>
    <c:forEach items="${page.navigatepageNums}" var="pageNum">
        <c:if test="${page.pageNum == pageNum}">
            <li class="active"><a href="#">${pageNum}</a></li>
        </c:if>
        <c:if test="${page.pageNum != pageNum}">
            <li><a href="${pageContext.request.contextPath}/paper/lists/?pageNo=${pageNum}">${pageNum}</a></li>
        </c:if>
    </c:forEach>
    <li><a href="${pageContext.request.contextPath}/paper/lists/?pageNo=${page.pageNum+1}">&raquo;</a></li>
    <li><a href="${pageContext.request.contextPath}/paper/lists/?pageNo=${page.pages}">末页</a></li>
</ul>
</body>
</html>
