/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-02-06 07:49:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <title>应急知识学习系统</title>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/login.css\" />\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/css/bootstrap.min.css\">\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-3.4.1.js\"></script>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/bootstrap.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("            <a class=\"navbar-brand\" href=\"#\">应急知识学习系统</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div>\r\n");
      out.write("            <ul class=\"nav navbar-nav\">\r\n");
      out.write("                <li class=\"active\"><a href=\"#\">关于我们</a></li>\r\n");
      out.write("                <li><a href=\"#\">主页</a></li>\r\n");
      out.write("                <li class=\"dropdown\">\r\n");
      out.write("                    <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                        学习\r\n");
      out.write("                        <b class=\"caret\"></b>\r\n");
      out.write("                    </a>\r\n");
      out.write("                    <ul class=\"dropdown-menu\">\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">自然灾害</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">事故灾害</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">公共卫生事件</a></li>\r\n");
      out.write("                        <li class=\"divider\"></li>\r\n");
      out.write("                        <li><a href=\"#\">社会安全事件</a></li>\r\n");
      out.write("                    </ul>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"a\">\r\n");
      out.write("    <div id=\"a1\">\r\n");
      out.write("        <img src=\"img/1.png\"  width=\"580px\" height=\"400px\" />\r\n");
      out.write("    </div>\r\n");
      out.write("    <div id=\"a2\">\r\n");
      out.write("        <form id=\"form1\" action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/login\" method=\"post\">\r\n");
      out.write("            <br /><br /><br /><br />\r\n");
      out.write("            <table  width=\"300px\" border=\"0\" cellspacing=\"0px\" cellpadding=\"0px\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\"></span>用户名：</td>\r\n");
      out.write("                    <td><input class=\"form-control\" type=\"text\" id=\"username\" name=\"username\" placeholder=\"请输入用户名\"></td>\r\n");
      out.write("\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br /><br />\r\n");
      out.write("            <table  width=\"300px\" border=\"0\" cellspacing=\"0px\" cellpadding=\"0px\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\">&nbsp;&nbsp;&nbsp;密码：</td>\r\n");
      out.write("                    <td><input class=\"form-control\" type=\"text\" name=\"username\" id=\"password\"  placeholder=\"请输入密码\"></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br /><br />\r\n");
      out.write("            <table  width=\"200px\" border=\"0\" cellspacing=\"0px\" cellpadding=\"0px\">\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td align=\"right\" width=\"70px\">验证码：</td>\r\n");
      out.write("                    <td><input class=\"form-control\" type=\"text\" id=\"code\" name=\"code\" placeholder=\"请输入验证码\">\r\n");
      out.write("                        <span style=\"position: absolute\">\r\n");
      out.write("                                <img id=\"img\" onclick=\"getVerifiCode()\" title=\"点击刷新验证码\" src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/code/verify\"/>\r\n");
      out.write("                        </span></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            <br>\r\n");
      out.write("            <button type=\"button\" class=\"btn btn-success btn-lg btn-block\" onclick=\"login()\">登陆</button>\r\n");
      out.write("            <a href=\"#\" style=\"text-decoration: none;position: absolute;right: 90px\">没有账号？注册一个</a>\r\n");
      out.write("        </form>\r\n");
      out.write("    </div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("    function getVerifiCode() {\r\n");
      out.write("        $(\"#img\").prop('src','");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/code/verify?a='+new Date().getTime());\r\n");
      out.write("    }\r\n");
      out.write("\r\n");
      out.write("        function login() {\r\n");
      out.write("            var username = $(\"#username\").val();\r\n");
      out.write("            var password = $(\"#password\").val();\r\n");
      out.write("            var code = $(\"#code\").val();\r\n");
      out.write("            $.ajax({\r\n");
      out.write("                type:\"post\",\r\n");
      out.write("                url:\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/user/login\",\r\n");
      out.write("                data:{\"username\":username,\"password\":password,\"code\":code},\r\n");
      out.write("                success:function(message){\r\n");
      out.write("                    if(message==1){\r\n");
      out.write("                        getVerifiCode();\r\n");
      out.write("                        alert(\"用户名或密码不正确\");\r\n");
      out.write("                    }else if(message==2){\r\n");
      out.write("                        getVerifiCode();\r\n");
      out.write("                        alert(\"验证码错误\");\r\n");
      out.write("                    }else if(message==3){\r\n");
      out.write("                        alert(\"登陆成功\");\r\n");
      out.write("                        window.location.href=\"index.jsp\";\r\n");
      out.write("                    }\r\n");
      out.write("                }\r\n");
      out.write("            });\r\n");
      out.write("        }\r\n");
      out.write("</script>\r\n");
      out.write("</html>");
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