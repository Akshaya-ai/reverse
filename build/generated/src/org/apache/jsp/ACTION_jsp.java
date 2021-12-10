package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.naming.*;
import java.sql.*;
import javax.sql.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class ACTION_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

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
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<title> Online Quiz</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");

String message,Seat_no,Name,ans1,ans2,ans3,ans4,ans5;
int Total=0;
Connection connect;
Class.forName("org.apache.derby.jdbc.ClientDriver");
connect=DriverManager.getConnection("jdbc:derby://localhost:1527/akshaya","akshaya","akshaya");
message="Thank you for participating in online Exam";
Seat_no=request.getParameter("Seat_no");
Name=request.getParameter("Name");
ans1=request.getParameter("group1");

ans2=request.getParameter("group2");
ans3=request.getParameter("group3");
ans4=request.getParameter("group4");
ans5=request.getParameter("group5");
if(ans1.equals("True"))
Total+=2;
if(ans2.equals("False"))
Total+=2;
if(ans3.equals("True"))
Total+=2;
if(ans4.equals("False"))
Total+=2;
if(ans5.equals("False"))
Total+=2;
PreparedStatement st=connect.prepareStatement("INSERT INTO AKSHAYA.EXAM(SEAT_NO,NAME,TOTAL)VALUES('"+Seat_no+"','"+Name+"','"+Total+"')");
st.executeUpdate();
response.setContentType("text/html");
out.println("<html>");
out.println("<head>");
out.println("</head>");
out.println("<body bgcolor=cyan>");
out.println("<center>");
out.println("<h1>"+message+"</h1>\n");
out.println("<h3>Yours results stored in our database</h3>");
out.print("<br><br>");
out.println("<b>"+"Participants and their Marks"+"</b>");
out.println("<table border=5>");
PreparedStatement st2=connect.prepareStatement("SELECT * FROM AKSHAYA.EXAM");
ResultSet rs=st2.executeQuery();
out.println("<th>"+"Seat_no"+"</th>");
out.println("<th>"+"Name"+"</th>");
out.println("<th>"+"Marks"+"</th>");
while(rs.next())
{
out.println("<tr>");
out.print("<td>"+rs.getString(1)+"</td>");

out.print("<td>"+rs.getString(2)+"</td>");
out.print("<td>"+rs.getString(3)+"</td>");
out.println("</tr>");
}
out.println("</table>");
if(rs!=null)
rs.close();
if(st!=null)
st.close();
if(connect!=null)
connect.close();
out.println("</center>");
out.println("</body></html>");
Total=0;

      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
