/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.34
 * Generated at: 2018-10-18 01:57:57 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.jdbc.model.vo.*;

public final class memberUpdateForm_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/views/member/../common/header.jsp", Long.valueOf(1539664823793L));
    _jspx_dependants.put("/views/member/../common/footer.jsp", Long.valueOf(1539664797761L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("com.kh.jdbc.model.vo");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
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

	Member m=(Member)session.getAttribute("m");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>회원 정보 수정 페이지</title>\r\n");
      out.write("<script src=\"/jdbc1/resources/js/jquery-3.3.1.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<header style=\"background:magenta; color:green;\">\r\n");
      out.write("\t<h1>JDBC 테스트 - 1 -</h1>\r\n");
      out.write("\t<br>\r\n");
      out.write("\t<hr>\r\n");
      out.write("</header>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<h1>회원 정보 수정 페이지</h1>\r\n");
      out.write("\t\r\n");
      out.write("\t<form action=\"/jdbc1/mUpdate.do\" method=\"post\" id=\"mUpdate\">\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>ID : </td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(m.getUserId() );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>변경할 PWD : </td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"userPwd\" id=\"userPwd\"/></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>변경할 PWD 확인 : </td>\r\n");
      out.write("\t\t\t\t<td><input type=\"password\" name=\"userPwd2\" id=\"userPwd2\"/></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td colspan=\"3\" id=\"result\"></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>이름 : </td>\r\n");
      out.write("\t\t\t\t<td>");
      out.print(m.getUserName() );
      out.write("</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>성별 : </td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"M\"/>남성\r\n");
      out.write("\t\t\t\t\t<input type=\"radio\" name=\"gender\" value=\"F\"/>여성\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>나이 : </td>\r\n");
      out.write("\t\t\t\t<td><input type=\"number\" name=\"age\" min=\"10\" max=\"100\" value=\"");
      out.print(m.getAge());
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>이메일 : </td>\r\n");
      out.write("\t\t\t\t<td><input type=\"email\" name=\"email\" value=\"");
      out.print(m.getEmail());
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>연락처 : </td>\r\n");
      out.write("\t\t\t\t<td><input type=\"tel\" name=\"phone\" value=\"");
      out.print(m.getPhone());
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>주소 : </td>\r\n");
      out.write("\t\t\t\t<td><input type=\"text\" name=\"address\" value=\"");
      out.print(m.getAddress());
      out.write("\"/></td>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td>취미 : </td>\r\n");
      out.write("\t\t\t\t<td>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"자전거\"/>자전거 &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"독서\"/>독서 &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"산책\"/>산책 <br>\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"음악감상\"/>음악감상 &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"낚시\"/>낚시 &nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"checkbox\" name=\"hobby\" value=\"여행\"/>여행 \r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<td></td>\r\n");
      out.write("\t\t\t\t<td colspan=\"2\">\r\n");
      out.write("\t\t\t\t\t<input type=\"submit\" value=\"회원 정보 수정\"/>\r\n");
      out.write("\t\t\t\t\t&nbsp;&nbsp;\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" onclick=\"memberDel();\" value=\"회원 탈퇴\"/>\r\n");
      out.write("\t\t\t\t</td>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t</form>\r\n");
      out.write("\t\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t\r\n");
      out.write("\t<a href=\"/jdbc1/index.jsp\">처음으로 돌아가기</a>\r\n");
      out.write("\t\r\n");
      out.write("\t");
      out.write("\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("<br><br><br><br>\r\n");
      out.write("\r\n");
      out.write("<footer style=\"background:red; color:white;\">\r\n");
      out.write("\t<hr>\r\n");
      out.write("\t<p align=\"center\">\r\n");
      out.write("\t\tCopyright by KH Academy\r\n");
      out.write("\t</p>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("\t<br><br>\r\n");
      out.write("</footer>");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\t<script>\r\n");
      out.write("\t\t// 일반적으로 script 작성 구간은 어디가 되든 큰 문제는 없으나 HTML과 CSS가 웹 문서에 로드되는 시점을 고려한다면 head영역이나 body의 최하단에 작성하여 로드된 이후, 로드 시점에 동작함으로써 웹 문서 표현의 속도를 높이는 방식을 권장한다\r\n");
      out.write("\t\t$(function(){\r\n");
      out.write("\t\t\t// 성별 radio 선택하기\r\n");
      out.write("\t\t\t$('input:radio').each(function(){\r\n");
      out.write("\t\t\t\tif($(this).val()=='");
      out.print(m.getGender());
      out.write("') {\r\n");
      out.write("\t\t\t\t\t$(this).prop('checked',true);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(this).prop('checked',false);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t$(this).prop('disabled',true);\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 취미 checkbox 선택하기\r\n");
      out.write("\t\t\tvar array='");
      out.print(m.getHobby());
      out.write("'.split(', ');\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\tconsole.log(array);\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t$('input:checkbox').each(function(){\r\n");
      out.write("\t\t\t\tif($.inArray($(this).val(),array)>-1){\r\n");
      out.write("\t\t\t\t\t$(this).prop('checked',true);\r\n");
      out.write("\t\t\t\t}else{\r\n");
      out.write("\t\t\t\t\t$(this).prop('checked',false);\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t// 변경 비밀번호 일치 여부 확인하기\r\n");
      out.write("\t\t\t$('#mUpdate').submit(function(){\r\n");
      out.write("\t\t\t\t// 비밀번호가 일치하지 않을 때\r\n");
      out.write("\t\t\t\tif($('#userPwd').val()!=$('#userPwd2').val()){\r\n");
      out.write("\t\t\t\t\t$('#result').text('비밀번호가 일치하지 않다').show().fadeOut(1000);\r\n");
      out.write("\t\t\t\t} // 비밀번호를 입력하지 않았을 때\r\n");
      out.write("\t\t\t\telse if($('#userPwd').val()==\"\"){\r\n");
      out.write("\t\t\t\t\t$('#result').text('비밀번호를 입력하라').show().fadeOut(1000);\r\n");
      out.write("\t\t\t\t} // 정상 입력 시\r\n");
      out.write("\t\t\t\telse{\r\n");
      out.write("\t\t\t\t\treturn;\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\tevent.preventDefault();\r\n");
      out.write("\t\t\t});\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t});\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t// '회원 탈퇴' 버튼을 누를 경우 mDelete.do로 이동시키기\r\n");
      out.write("\t\tfunction memberDel(){\r\n");
      out.write("\t\t\tlocation.href=\"/jdbc1/mDelete.do\";\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
