<%--
  Created by IntelliJ IDEA.
  User: IT直男
  Date: 2020/2/8
  Time: 16:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>调查问卷</title>
    <link href="${pageContext.request.contextPath}/css/index1.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/diaocha.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/maps.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/google.js"></script>
    <script type="text/javascript">$(document).ready(function(){$().maps();});</script>
</head>
<body>
<jsp:include page="title.jsp"></jsp:include>
<form action="" method="post" id="forms">
    <div id=diaocha>
        <p style="text-align: center;"><span style="font-size: 20px;font-weight: bold; color: cornflowerblue;">大学生应急知识情况调查问卷</span></p>

        <span style="font-size: 15px; color: #666;position: relative;left: 80px;">本问卷将对您所填写的一切保密<br/></span>
        <div class="top"></div>
        <br /><br />
        <p class="a1">1.您的性别</p>
        <input type="radio" value="0" name="sex"/>男<input type="radio" value="1" name="sex"/>女
        <br /><br />
        <p class="a1">2.您所在学校</p>
        <input type="text" id="school">
        <br /><br />
        <p class="a1">3.您有接受过应急知识的宣传吗？</p>
        <input type="radio" value="0" name="pro3"/>A.参加过
        <input type="radio" value="1" name="pro3"/>B.没有参加过
        <br /><br />
        <p class="a1">4.您在学习会遇到过哪些突发情况？</p>
        <p><input type="checkbox" value="A" name="pro4"/>A.外伤（擦伤、划伤、烫伤等）</p>
        <p><input type="checkbox" value="B" name="pro4"/>B.突发疾病</p>
        <p><input type="checkbox" value="C" name="pro4"/>C.遇到灾害（地震、火灾、大风雷电等）</p>
        <p><input type="checkbox" value="D" name="pro4"/>D.同学突发意外（摔倒、急性病发作或鱼刺等）</p>
        <p><input type="checkbox" value="E" name="pro4"/>E.实验室意外（摔倒、急性病发作或鱼刺等）</p>
        <br />
        <p class="a1">5.在寝室中您遇到过哪些突发情况</p>
        <p><input type="checkbox" value="A" name="pro5"/>A.自然灾害（地震、火灾等）</p>
        <p><input type="checkbox" value="B" name="pro5"/>B.用电安全(短路连电等)</p>
        <p><input type="checkbox" value="C" name="pro5"/>C.外伤（擦伤骨折等）</p>
        <p><input type="checkbox" value="D" name="pro5"/>D.食品安全</p>
        <p><input type="checkbox" value="E" name="pro5"/>E.突发性疾病</P>
        <br />
        <p class="a1">6.台风来临时,下列哪种行为是正确的？</p>
        <p><input type="radio" name="pro6" value="A"/>A.船只靠岸</p>
        <p><input type="radio" name="pro6" value="B"/>B.躲进室内靠窗户的地方</p>
        <p><input type="radio" name="pro6" value="C"/>C.启程远足</p>
        <p><input type="radio" name="pro6" value="D"/>D.海滩游泳</p>
        <br />
        <p class="a1">7.泥石流到来前,有什么预兆( )</p>
        <p><input type="radio" name="pro7" value="A"/>A.雨后道路积水</p>
        <p><input type="radio" name="pro7" value="B"/>B.万里晴空</p>
        <p><input type="radio" name="pro7" value="C"/>C.暴雨过后山谷传来巨响</p>
        <br />
        <p class="a1">8. 雷雨天气，有哪种行为是错误的（ ）</p>
        <p><input type="radio" name="pro8" value="A"/>A.在浴室使用太阳能热水器洗澡</p>
        <p><input type="radio" name="pro8" value="B"/>B.暂停使用电话和电脑等电气设备</p>
        <p><input type="radio" name="pro8" value="C"/>C.及时关闭门窗，不要靠近窗口或长时间在阳台逗留</p>
        <br />
        <p class="a1">9. 地震时应根据居住的特点采取不同的避震方式。居住在高层的人遇到地震突发事件时应选择正确的方式避震。请问：在以下三种方式中，哪一种是不安全的？ （ ）</p>
        <p><input type="radio" name="pro9" value="A"/>A.迅速乘电梯撤离</p>
        <p><input type="radio" name="pro9" value="B"/>B.先迅速躲进小开间房间</p>
        <p><input type="radio" name="pro9" value="C"/>C.先就地躲避在床、桌等坚固物体下</p>
        <br />
        <p class="a1">10.遇到高楼发生火灾，下列处理措施正确处理措施是？</p>
        <p><input type="radio" name="pro10" value="A"/>A.乘坐普通电梯逃生</p>
        <p><input type="radio" name="pro10" value="B"/>B.向上逃跑</p>
        <p><input type="radio" name="pro10" value="C"/>C.躲避到防烟楼梯间、避难层等地等待救援</p>
        <br />
        <p class="a1">11.电梯速度不正常时，应（ ）以应对可能受到的冲击？</p>
        <p><input type="radio" name="pro11" value="A"/>A.迅速趴伏</p>
        <p><input type="radio" name="pro11" value="B"/>B.双腿微微弯曲，背靠板壁</p>
        <p><input type="radio" name="pro11" value="C"/>C.两腿微微弯曲，上身向前倾斜</p>
        <br />
        <p class="a1">12.当灾害来临时，您会（）？</p>
        <p><input type="radio" name="pro12" value="A"/>A.立即寻找安全场所避难</p>
        <p><input type="radio" name="pro12" value="B"/>B.呆在人多的地方，聚在一起</p>
        <p><input type="radio" name="pro12" value="C"/>C.陷入绝望，盼望援助</p>
        <br />
        <p class="a1">13.如果发生泄露等事故，您将（）？</p>
        <p><input type="radio" name="pro13" value="A"/>A.仓皇逃走</p>
        <p><input type="radio" name="pro13" value="B"/>B.在家中闭门不出</p>
        <p><input type="radio" name="pro13" value="C"/>C.听从政府安排，撤出辐射区</p>
        <br />
        <p class="a1">14.您认为那些可以作为突发事件中的求救信号？</p>
        <p><input type="radio" name="pro14" value="A"/>A.SOS</p>
        <p><input type="radio" name="pro14" value="B"/>B.浓烟或火焰</p>
        <p><input type="radio" name="pro14" value="C"/>C.大声喊救命</p>
        <br />
        <p class="a1">15.您留意过公共场所的逃生线路图吗？</p>
        <p><input type="radio" name="pro15" value="A"/>A.留意过</p>
        <p><input type="radio" name="pro15" value="B"/>B.没有留意过</p>
        <br />
        <p class="a1">16.如果脚崴了，应该( )</p>
        <p><input type="radio" name="pro16" value="A"/>A.立即走到附近医院处理</p>
        <p><input type="radio" name="pro16" value="B"/>B.先进行热敷再去医院</p>
        <p><input type="radio" name="pro16" value="C"/>C.视情况处理</p>
        <br />
        <p class="a1">17.同学在夏天时发生中暑怎么办( )</p>
        <p><input type="radio" name="pro17" value="A"/>A.喂服热水</p>
        <p><input type="radio" name="pro17" value="B"/>B.原地等待救援</p>
        <p><input type="radio" name="pro17" value="C"/>C.用冷毛巾、冷水敷脸</p>
        <br />
        <p class="a1">18.骨折的正确做法是( )</p>
        <p><input type="radio" name="pro18" value="A"/>A.如果有血就先止血，然后再进行固定</p>
        <p><input type="radio" name="pro18" value="B"/>B.立刻找人把病人抬起来到医院救治</p>
        <p><input type="radio" name="pro18" value="C"/>C.自行处理</p>
        <br />
        <p class="a1">19. 眼睛被消毒液灼伤后，首先采取的正确方法是( )</p>
        <p><input type="radio" name="pro19" value="A"/>A.点眼药膏</p>
        <p><input type="radio" name="pro19" value="B"/>B.立即开大眼睑，用清水冲洗眼睛</p>
        <p><input type="radio" name="pro19" value="C"/>C.马上到医院看急诊</p>
        <br />
        <p class="a1">20. 风险是指生产安全事故或健康损害事件发生的（ ）的组合</p>
        <p><input type="radio" name="pro20" value="A"/>A.可能性和严重性</p>
        <p><input type="radio" name="pro20" value="B"/>B.频率和后果</p>
        <p><input type="radio" name="pro20" value="C"/>C.可能性和后果</p>
        <br />
        <p class="a1">21.（ ）是生产安全事故或健康损害事件发生的可能性和严重性的组合</p>
        <p><input type="radio" name="pro21" value="A"/>A.危险源</p>
        <p><input type="radio" name="pro21" value="B"/>B.危险点</p>
        <p><input type="radio" name="pro21" value="C"/>C.风险</p> .
        <br />
        <p class="a1">22.不能直接判定为重大风险的是( )</p>
        <p><input type="radio" name="pro22" value="A"/>A.违反法律、法规的</p>
        <p><input type="radio" name="pro22" value="B"/>B.作业人员在10人以上的</p>
        <p><input type="radio" name="pro22" value="C"/>C.有重大环境影响的</p>
        <br />
        <p class="a1">23.社会安全您是否了解</p>
        <p><input type="radio" name="pro23" value="A"/>A.了解</p>
        <p><input type="radio" name="pro23" value="C"/>B.从来没听过</p>
        <br />
        <p style="text-align: center"><button type="button" class="btn btn-primary btn-lg btn-block" onclick="tijiao()">提交问卷</button></p>
    </div>
</form>

<script>
    function tijiao(){
        // $("#forms").submit();
        var sex = $("input[name='sex']:checked").val();
        var school = $("#school").val();
        var pro3 = $("input[name='pro3']:checked").val();
        var pro4 = "";
        $.each($("input[name='pro4']"),function(){
            if(this.checked){
                pro4 = pro4+$(this).val();
            }
        });
        var pro5 = "";
        $.each($("input[name='pro5']"),function(){
            if(this.checked){
                pro5 = pro5+$(this).val();
            }
        });
        var pro6 = $("input[name='pro6']:checked").val();
        var pro7 = $("input[name='pro7']:checked").val();
        var pro8 = $("input[name='pro8']:checked").val();
        var pro9 = $("input[name='pro9']:checked").val();
        var pro10 = $("input[name='pro10']:checked").val();
        var pro11 = $("input[name='pro11']:checked").val();
        var pro12 = $("input[name='pro12']:checked").val();
        var pro13 = $("input[name='pro13']:checked").val();
        var pro14 = $("input[name='pro14']:checked").val();
        var pro15 = $("input[name='pro15']:checked").val();
        var pro16 = $("input[name='pro16']:checked").val();
        var pro17 = $("input[name='pro17']:checked").val();
        var pro18 = $("input[name='pro18']:checked").val();
        var pro19 = $("input[name='pro19']:checked").val();
        var pro20 = $("input[name='pro20']:checked").val();
        var pro21 = $("input[name='pro21']:checked").val();
        var pro22 = $("input[name='pro22']:checked").val();
        var pro23 = $("input[name='pro23']:checked").val();
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/paper/save",
            data:{"sex":sex,
                "school":school,
                "a3":pro3,"a4":pro4,"a5":pro5,"a6":pro6,"a7":pro7,
                "a8":pro8,"a9":pro9,"a10":pro10,"a11":pro11,"a12":pro12,
                "a13":pro13,"a14":pro14,"a15":pro15,"a16":pro16,"a17":pro17,
                "a18":pro18,"a19":pro19,"a20":pro20,"a21":pro21,"a22":pro22,"a23":pro23
                 },
            success:function(message){
                if(message==1){
                    alert("感谢您的填写！");
                    window.location.href="index.jsp";
                }else if(message==2){
                    alert("提交失败！");
                }
            }
        });
    }
</script>
</body>
</html>
