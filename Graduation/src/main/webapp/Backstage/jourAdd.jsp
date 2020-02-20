<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/17
  Time: 20:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/js/Ueditor/ueditor.config.js"></script>
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/js/Ueditor/ueditor.all.min.js"> </script>
    <!--建议手动加在语言，避免在ie下有时因为加载语言失败导致编辑器加载失败-->
    <!--这里加载的语言文件会覆盖你在配置项目里添加的语言类型，比如你在配置项目里配置的是英文，这里加载的中文，那最后就是中文-->
    <script type="text/javascript" charset="utf-8" src="${pageContext.request.contextPath}/js/Ueditor/lang/zh-cn/zh-cn.js"></script>
</head>
<body>
<form action="${pageContext.request.contextPath}/tz/save" method="get">
    标题：<input type="text" name="title">
    类别：<select class="form-control">
        <option value="1">应急要闻</option>
        <option value="2">地方应急</option>
        <option value="3">时政专栏</option>
    </select>
    发表时间：<input type="date">
    <script id="editor" name="content" type="text/plain" style="width:1024px;height:400px;"></script>
    <input type="submit" value="提交">
</form>
<script type="text/javascript">
    var ue = UE.getEditor('editor');
</script>
</body>
</html>
