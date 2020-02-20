<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/15
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/bootstrap.min.css">
</head>
<body>
<form id="form1" action="${pageContext.request.contextPath}/paper/save" method="post">
    <table width="400px" border="0" cellpadding="2" cellspacing="1" bgcolor="#D1DDAA" align="center" >
        <tr>
            <td>题目类型</td>
            <td>
                <select name="ptype" id="ptype">
                    <option value="1">自然灾害</option>
                    <option value="2">事故灾害</option>
                    <option value="3">公共卫生事件</option>
                    <option value="4">社会安全事件</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>题目</td>
            <td>
                <textarea style="width: 300px;height: 50px;" name="title" id="title"></textarea>
            </td>
        </tr>
        <tr>
            <td>选项A</td>
            <td>
                <textarea style="width: 300px;height: 30px;" name="a" id="a"></textarea>
            </td>
        </tr>
        <tr>
            <td>选项B</td>
            <td>
                <textarea style="width: 300px;height: 30px;" name="b" id="b"></textarea>
            </td>
        </tr>
        <tr>
            <td>选项C</td>
            <td>
                <textarea style="width: 300px;height: 30px;" name="c" id="c"></textarea>
            </td>
        </tr>
        <tr>
            <td>选项D</td>
            <td>
                <textarea style="width: 300px;height: 30px;" name="d" id="d"></textarea>
            </td>
        </tr>
        <tr></tr>
        <tr>
            <td>正确选项</td>
            <td>
                <input name="correct" id="correct" />
            </td>
        </tr>
        <tr>
            <td>答案解析</td>
            <td>
                <textarea style="width: 300px;height: 50px;" name="answer" id="answer"></textarea>
            </td>
        </tr>
        <tr>
            <td colspan="2" style="text-align: right;"><button type="button" class="btn btn-success" onclick="tijiao()">提交</button></td>
        </tr>
    </table>
</form>

<script type="text/javascript">
    function tijiao() {
        var ptype = $("#ptype").val();
        var title = $("#title").val();
        var a = $("#a").val();
        var b = $("#b").val();
        var c = $("#c").val();
        var d = $("#d").val();
        var correct = $("#correct").val();
        var answer = $("#answer").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/paper/save",
            type:"post",
            data:{"ptype":ptype,"title":title,"a":a,"b":b,"c":c,"d":d,"correct":correct,"answer":answer},
            success:function (msg) {
                if(msg.msg==200){
                    alert("添加成功！");
                    window.location="${pageContext.request.contextPath}/paper/lists";
                }else{
                    alert("添加失败！");
                }
            }
        })
    }
</script>
</body>
</html>
