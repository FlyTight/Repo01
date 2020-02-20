<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/17
  Time: 10:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/vuejs-2.5.16.js"></script>
    <script type="text/javascript" src="https://cdn.bootcss.com/axios/0.19.0/axios.min.js"></script>

    <!-- 引入样式 -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/Vue1.css">
    <!-- 引入组件库 -->
    <script src="${pageContext.request.contextPath}/js/vuejs2.js"></script>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.js"></script>
    <style>
        .el-table .warning-row {
            background: oldlace;
        }

        .el-table .success-row {
            background: #f0f9eb;
        }
    </style>
</head>
<body>

<div id="app">

    <div style="padding: 0px 300px;text-align: center">
        <el-table
                :data="list"
                style="width: 100%"
                :row-class-name="tableRowClassName"
                v-loading="loading">
            <el-table-column
                    prop="title"
                    label="题目"
                    width="180"
                    align="center">
            </el-table-column>
            <el-table-column
                    prop="a"
                    label="选项A"
                    width="180"
                    align="center">
            </el-table-column>
            <el-table-column
                    prop="b"
                    label="选项B"
                    width="180"
                    align="center">
            </el-table-column>
            <el-table-column
                    prop="c"
                    label="选项C"
                    width="180"
                    align="center">
            </el-table-column>
            <el-table-column
                    prop="d"
                    label="选项D"
                    width="180"
                    align="center">
            </el-table-column>
        </el-table>
    </div>
    <div style="padding: 0px 600px">
        <el-pagination
                background
                layout="prev, pager, next"
                :total="totalRecord"
                :page-sizes="pageSize"
                :current-page="currentNum"
                @current-change="changeNum">
        </el-pagination>
    </div>
</div>


<script type="text/javascript">
    new Vue({
        el:"#app",
        data:{
            msg:"欢迎使用vue",
            loading:false,
            list:[],
            pageSize:4,  //每页显示
            totalRecord:1, //总条目数
            currentNum:5,  //当前页数
            tableRowClassName({row, rowIndex}) {
                if (rowIndex%2 === 0) {
                    return 'warning-row';
                } else if (rowIndex%2 !== 0) {
                    return 'success-row';
                }
                return '';
            }
        },
        methods:{
            changeNum:function (num) {
                this.fenye("${pageContext.request.contextPath}/paper/listt?pageNo="+num);
            },
            fenye:function (url) {
                var _this = this;
                _this.loading=true;
                axios.get(url).then(function(msg){
                    _this.loading=false;
                    _this.list = msg.data.page.list;
                    _this.totalRecord = msg.data.page.total;
                    _this.currentNum = msg.data.page.pageNum;
                    _this.pageSize = msg.data.page.pageSize;
                    console.log(msg.data);
                    //成功执行
                }).catch();
            }
        },
        mounted:function () {
                this.fenye("${pageContext.request.contextPath}/paper/listt");
            }
    })
</script>







</body>
</html>
