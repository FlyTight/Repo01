/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-19 02:48:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class title_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/index1.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/maps.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/google.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">$(document).ready(function(){$().maps();});</script>\r\n");
      out.write("    <link href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <script type=\"text/javascript\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div style=\"width: 100%;height: 50px;background-color:#b3e19d\">\r\n");
      out.write("    <p style=\"font-size: 12px; color: gray;position:relative;left: 300px;\">欢迎来到应急知识学习系统&nbsp;&nbsp;|&nbsp;&nbsp;首页</p>\r\n");
      out.write("    <p style=\"font-size: 12px; color: black;position:absolute;left: 1200px;top: 1px;\">当前用户：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${loginUser.username}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("&nbsp;&nbsp;在线学习人数：");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sessionScope.loginNumber}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write(" 人&nbsp;&nbsp;<a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/login.jsp\">退出</a></p>\r\n");
      out.write("</div>\r\n");
      out.write("<hr />\r\n");
      out.write("<span style=\"position: absolute;left: 200px;top:55px\"><img src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/img/logo.png\" width=\"60px\" height=\"60px\"></span>\r\n");
      out.write("<div style=\"position: absolute; left: 270px;top:55px; color: dimgray;\"><h2><b>应急知识学习系统</b></h2></div>\r\n");
      out.write("<br /><br />\r\n");
      out.write("<div class=\"content\" >\r\n");
      out.write("    <ul class=\"venus-menu\">\r\n");
      out.write("        <li class=\"active\"><a href=\"#\"><i class=\"icon-home\"></i>主页</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-magic\"></i>个人中心</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-envelope-alt\"></i>新闻</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">应急要闻</a></li>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#\">地方应急</a></li>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li><a href=\"#\">时政专栏</a>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-envelope-alt\"></i>科普</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"#\">应计指南</a></li>\r\n");
      out.write("                <li><a href=\"#\">生活安全</a></li>\r\n");
      out.write("                <li><a href=\"#\">自然灾害</a></li>\r\n");
      out.write("                <li><a href=\"#\">事故灾害</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-envelope-alt\"></i>题库</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/paper/list/1\">自然灾害</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/paper/list/2\">事故灾害</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/paper/list/3\">公共卫生事件</a></li>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/paper/list/4\">社会安全事件</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\"><i class=\"icon-quote-right\"></i>试题测试</a>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/ceshi.jsp\">综合测试</a></li>\r\n");
      out.write("                <li><a href=\"#\">专项测试</a>\r\n");
      out.write("                    <ul>\r\n");
      out.write("                        <li><a href=\"#\">自然灾害</a></li>\r\n");
      out.write("                        <li><a href=\"#\">事故灾害</a></li>\r\n");
      out.write("                        <li><a href=\"#\">公共卫生事件</a></li>\r\n");
      out.write("                        <li><a href=\"#\">社会安全事件</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/Backstage/main.html\"><i class=\"icon-envelope-alt\"></i>后台</a></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/diaocha.jsp\"><i class=\"icon-envelope-alt\"></i>大学生应急知识调查问卷</a></li>\r\n");
      out.write("        <li class=\"search\">\r\n");
      out.write("            <form method=\"get\">\r\n");
      out.write("                <input type=\"text\" name=\"search\" id=\"search\" class=\"search\" placeholder=\"搜索\" onblur=\"sou()\"/></form>\r\n");
      out.write("        </li >\r\n");
      out.write("    </ul>\r\n");
      out.write("</div>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("    function sou() {\r\n");
      out.write("        var text = $(\"#search\").val();\r\n");
      out.write("        if(text==\"\"){\r\n");
      out.write("            return;\r\n");
      out.write("        }else{\r\n");
      out.write("            window.location=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/paper/listss?text=\"+text;\r\n");
      out.write("        }\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}