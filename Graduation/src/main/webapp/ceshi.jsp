<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/18
  Time: 20:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
</head>
<body>
<script type="text/javascript">
    $(function () {
        alert("已为您随机生成试卷");
    })
</script>
<jsp:include page="title.jsp"></jsp:include>
<div style="width: 1000px;height: 800px;align-content: center;position: absolute;left: 260px;top: 250px">
    <div style="width: 180px;height: 200px;background-color: whitesmoke;float: left;padding: 20px 10px;">
        <h4>知识类型</h4>
        <h5>随机练习</h5>
        <hr color="green" />
        <h4>题型库</h4>
        <h5>共20题</h5>

        <hr color="red" />
    </div>


    <div style="width: 800px;min-height: 100px;background-color: white;float: right;padding: 20px;">
        <h3>&nbsp;&nbsp;&nbsp;&nbsp;随即练习题&nbsp;&nbsp;&nbsp;[共计：20题]</h3>

        <div style="width: 100%; height: 60px; background-color: black;">答题卡：</div>
        <br />
        <span class="glyphicon glyphicon-tags"></span><h5>6&nbsp;[单选题]</h5>
        <hr>
        <p style="font-size: 20px;">有关于我国自然灾害的叙述正确的是?</p>
        <br />
        <div class="radio">
            <label>
                <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                <p style="font-size: 18px;">A.我国西南地区和台湾地震多发</p>
            </label>
        </div>
        <div class="radio">
            <label>
                <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                <p style="font-size: 18px;">B.我国西南地区和台湾地震多发</p>
            </label>
        </div>
        <div class="radio">
            <label>
                <input type="radio" name="optionsRadios" id="optionsRadios1" value="option1" checked>
                <p style="font-size: 18px;">C.我国西南地区和台湾地震多发</p>
            </label>
        </div>
        <div class="radio">
            <label>
                <input type="radio" name="optionsRadios" id="optionsRadios2" value="option2">
                <p style="font-size: 18px;">D.我国西南地区和台湾地震多发</p>
            </label>
        </div>
    </div>
    <div style="float: right;width: 800px; height: 80px;background-color: whitesmoke;padding: 20px;">
        <span><button type="button" class="btn btn-success btn-lm">&nbsp;&nbsp;&nbsp;&nbsp;上一题&nbsp;&nbsp;&nbsp;&nbsp;</button></span>
        <span><button type="button" class="btn btn-success btn-lm" style="position: absolute;left: 400px;">&nbsp;&nbsp;&nbsp;&nbsp;下一题&nbsp;&nbsp;&nbsp;&nbsp;</button></span>
        <span><button type="button" class="btn btn-warning btn-lm" style="position: absolute;left: 800px;">&nbsp;&nbsp;&nbsp;&nbsp;提交&nbsp;&nbsp;&nbsp;&nbsp;</button></span>
    </div>

</div>

</body>
</html>
