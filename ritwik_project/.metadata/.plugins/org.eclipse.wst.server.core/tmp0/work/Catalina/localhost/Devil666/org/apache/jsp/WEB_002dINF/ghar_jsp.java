/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.54
 * Generated at: 2014-07-28 12:15:59 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ghar_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/css/ghar.css", Long.valueOf(1406543607252L));
    _jspx_dependants.put("/WEB-INF/javascript/ghar.js", Long.valueOf(1406544970173L));
  }

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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/css; charset=iso-8859-1\">\r\n");
      out.write("<style type=\"text/css\">");
      out.write("@CHARSET \"ISO-8859-1\";\r\n");
      out.write("#center-header {\r\n");
      out.write("background-color: blue;\r\n");
      out.write(" height: 100%;\r\n");
      out.write(" width:60%;\r\n");
      out.write(" float:left;\r\n");
      out.write(" text-align: center;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#main_page {\r\n");
      out.write("width:100%;\r\n");
      out.write("min-height: 600px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#top {\r\n");
      out.write("background-color: red; \r\n");
      out.write("height: 10%; \r\n");
      out.write("width:100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#first {\r\n");
      out.write("background-color: black;\r\n");
      out.write("font color=\"white\";\r\n");
      out.write("text-align: centre;\r\n");
      out.write("height: 100%; \r\n");
      out.write("width:5%; \r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#second {\r\n");
      out.write("background-color: black;\r\n");
      out.write("font color=\"white\";\r\n");
      out.write("text-align: centre;\r\n");
      out.write("height: 100%; \r\n");
      out.write("width:15%; \r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#last {\r\n");
      out.write("background-color: red; \r\n");
      out.write("height: 60px; \r\n");
      out.write("width:20%; \r\n");
      out.write("float:left;\r\n");
      out.write("text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#centre {\r\n");
      out.write("background-color: white; \r\n");
      out.write("\r\n");
      out.write("min-height: 300px; \r\n");
      out.write("width: 100%; \r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#centre-first {\r\n");
      out.write("font-size:20px;\r\n");
      out.write("text-align: center;\r\n");
      out.write("padding-top: 50px;\r\n");
      out.write("background-color: white; \r\n");
      out.write("min-height:300px;\r\n");
      out.write("width:20%; \r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".post {\r\n");
      out.write("background-color: white;\r\n");
      out.write("\r\n");
      out.write("width: 20%;\r\n");
      out.write("float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#lastpart {\r\n");
      out.write("background-color: red; \r\n");
      out.write("height: 60px; \r\n");
      out.write("width:5%;\r\n");
      out.write("vertical-align:bottom; \r\n");
      out.write("float:left;\r\n");
      out.write("text-align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".pose {\r\n");
      out.write("background-color: red;\r\n");
      out.write("\r\n");
      out.write("width: 80%;\r\n");
      out.write("float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".sub_pose {\r\n");
      out.write("background-color: red;\r\n");
      out.write("height: 20px;\r\n");
      out.write("width: 627px;\r\n");
      out.write("float: left;\r\n");
      out.write("align: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".second_pose {\r\n");
      out.write("background-color: white;\r\n");
      out.write("\r\n");
      out.write("width: 100%;\r\n");
      out.write("float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#centre-middle {\r\n");
      out.write("\r\n");
      out.write("background-image:url(http://worldcupzones.com/wp-content/uploads/2014/06/2014-fifa-world-cup-groups1.jpg);\r\n");
      out.write("min-height:601px;\r\n");
      out.write("width:60%; \r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".interior-one {\r\n");
      out.write("\r\n");
      out.write("width: 95%;\r\n");
      out.write("float: left;\r\n");
      out.write("margin-top: 5px;\r\n");
      out.write("margin-left: 20px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".one_part {\r\n");
      out.write("background-color: #888888 ;\r\n");
      out.write("height: 100%;\r\n");
      out.write("width: 90%;\r\n");
      out.write("float: left;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".second_part {\r\n");
      out.write("background-color: purple;\r\n");
      out.write("height: 100%;\r\n");
      out.write("width: 5%;\r\n");
      out.write("float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".third_part {\r\n");
      out.write("background-color: purple;\r\n");
      out.write("height: 100%;\r\n");
      out.write("width: 5%;\r\n");
      out.write("float: left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("#centre-last {\r\n");
      out.write("background-color: white; \r\n");
      out.write("min-height:600px;\r\n");
      out.write("width:20%; \r\n");
      out.write("float:left;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wall-post {\r\n");
      out.write("background-color: white; \r\n");
      out.write(" \r\n");
      out.write("width:100%; \r\n");
      out.write("float:left;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#wall-comments {\r\n");
      out.write("padding-bottom:8px;\r\n");
      out.write("width: 100%;\r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#end {\r\n");
      out.write("text-align: center;\r\n");
      out.write("background-color: blue;\r\n");
      out.write("margin-top:10px; \r\n");
      out.write("height: 10%; \r\n");
      out.write("width: 100%; \r\n");
      out.write("float:left;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("p#para {\r\n");
      out.write("color: violet;\r\n");
      out.write("font-size: 27px;\r\n");
      out.write("font-family: \"Times New Roman\", Times, serif;\r\n");
      out.write("}");
      out.write("</style>\r\n");
      out.write("<script src=\"http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js\">\r\n");
      out.write("</script>\r\n");
      out.write("<script>");
      out.write("$(document).ready(function(){\r\n");
      out.write("\t$(\"#post\").click(function(){\r\n");
      out.write("\t\tvar get= $(\"#textarea\").val();\r\n");
      out.write("\t\t$.post(\"/Devil666/postback\",{\r\n");
      out.write("\t\t\ttake: $(\"#textarea\").val()});\r\n");
      out.write("\t\tvar add= parseInt($(\"#totalCount\").val()) + 1;\r\n");
      out.write("\t\t$(\"#totalCount\").val(add);\r\n");
      out.write("\t\tvar id_name = \"div\"+add;\r\n");
      out.write("\t\t$(\"#wall-comments\").prepend('<div style=\"width: 845px;float: left;margin-top: 5px;margin-left: 20px;\" id=\"'+id_name+'\"></div>');\r\n");
      out.write("\t\tvar image = \"image\"+add;\r\n");
      out.write("\t\t$(\"#\"+id_name).append('<div style=\" width: 153px; float: left;\" id= \"'+image+'\"></div>');\r\n");
      out.write("\t\tvar write = \"write\"+add;\r\n");
      out.write("\t\t$(\"#\"+id_name).append('<div style=\"background-color: white; width: 80%; float: left;\" id= \"'+write+'\"></div>');\r\n");
      out.write("\t\tvar pic = \"pic\"+add;\r\n");
      out.write("\t\t$(\"#\"+image).append('<img id=\"'+pic+'\" src=\"http://desktop.freewallpaper4.me/view/original/5904/jesus-and-the-devil.jpg\" width=\"153px\" height=\"130\" />');\r\n");
      out.write("\t\tvar above = \"above\"+add;\r\n");
      out.write("\t\t$('#'+write).append('<div style= \"background-color: blue;height: 20px;width: 100%;float: left; align: left;\"id= \"'+above+'\"></div>');\r\n");
      out.write("\t\t$('#'+above).append('<div style= \"background-color: #888888;height: 20px;width:85%;float: left; align: left;\">RItwik put it into the flame wall on01-07-2014</div>');\r\n");
      out.write("\t\tvar edit = \"edit\"+add;\r\n");
      out.write("\t\t$('#'+above).append('<div style= \"background-color: green;height: 100%;width: 4%;float: left;\"id= \"'+edit+'\"></div>');\r\n");
      out.write("\t\tvar cross = \"cross\"+add;\r\n");
      out.write("\t\t$('#'+above).append('<div style= \"background-color: yellow;height: 100%;width: 4%;float: left;\"id= \"'+cross+'\"></div>');\r\n");
      out.write("\t\tvar fire_pencil = \"fire_pencil\"+add;\r\n");
      out.write("\t\t$('#'+edit).append('<img id=\"'+fire_pencil+'\" src=\"http://image.shutterstock.com/display_pic_with_logo/597991/597991,1320387303,1/stock-photo-pencil-idea-fire-burn-isolated-on-black-88053079.jpg\" width=\"30\" height=\"20\" />');\r\n");
      out.write("\t\tvar fire_cross = \"fire_cross\"+add;\r\n");
      out.write("\t\t$('#'+cross).append('<img id=\"'+fire_cross+'\" src=\"http://s.wallpaperhere.com/wallpapers/1920x1200/20120620/4fe16247be9e4.jpg\" width=\"30\" height=\"20\" />');\r\n");
      out.write("\t\tvar posting_div= \"posting_div\"+add;\r\n");
      out.write("\t\t$('#'+write).append('<div style= \"background-color: white;width: 100%;float: left; \"id= \"'+posting_div+'\">jshjds</div>');\r\n");
      out.write("\t\t$('#'+posting_div).text(get);\r\n");
      out.write("\t\t$('#textarea').val(\"\");\r\n");
      out.write("\t\t$(\"#\"+cross).click(function(){\r\n");
      out.write("\t\t\t$(\"#\"+id_name).remove();\r\n");
      out.write("\t\t}); \r\n");
      out.write("\t});\r\n");
      out.write("});\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t");
      out.write("</script>\r\n");
      out.write("<title>hello world</title>\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"\">\r\n");
      out.write("<div id= \"main_page\">\r\n");
      out.write("\r\n");
      out.write("\t<div id= \"top\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id= \"first\">\r\n");
      out.write("\t\t\t<img src=\"http://th09.deviantart.net/fs71/PRE/f/2011/071/2/2/devil_born_from_flame__by_chevsy-d1qjd9i.jpg\" alt=\"devil\" width=\"66px\" height=\"60px\">\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id= \"second\">\r\n");
      out.write("\t\t\t<p><font size=\"5\" color=\"white\">DEVIL666!</font></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id= \"center-header\" >\r\n");
      out.write("\t\t\t<p><font size=\"5\" color=\"black\">\"THE DIMPLE ON THE CHIN, THE DEVIL WITHIN\"</font></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id= \"last\">\r\n");
      out.write("\t\t\t<p><font size=\"4\" color=\"white\">WELCOME SINNER !!</font></p>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id = \"lastpart\">\r\n");
      out.write("\t\t\t<a href=\"http://localhost:8080/Devil666/taketo\">LOGOUT SINNER</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div id= \"centre\">\r\n");
      out.write("\t\r\n");
      out.write("\t\t<div id= \"centre-first\">\r\n");
      out.write("\t\t\t<img src=\"http://desktop.freewallpaper4.me/view/original/5904/jesus-and-the-devil.jpg\" alt=\"devil\" width=\"200\" height=\"150\">\r\n");
      out.write("\t\t\t<p id= \"para\">CHANGE AVTAR</p>\r\n");
      out.write("\t\t\t<span>MY <span style=\"color:red\">SINNERS</span> BUDDIES</span></br>\r\n");
      out.write("\t\t\t<span>MY <span style=\"color:red\"> HELL</span> GALLERY</span></br>\r\n");
      out.write("\t\t\t<span>MY <span style=\"color:red\"> HELL</span> VIDEOS</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id= \"centre-middle\">\r\n");
      out.write("\t\t\t<div id= \"wall-post\">\r\n");
      out.write("\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"ADD POST\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"UPLOAD IMAGE\"><br>\r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t\t<textarea rows=\"4\" cols=\"60\" id=\"textarea\"></textarea>\r\n");
      out.write("\t\t\t\t<form action=\"\">\r\n");
      out.write("\t\t\t\t\t<input type=\"button\" value=\"POST\" id= \"post\"> \r\n");
      out.write("\t\t\t\t</form>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t<div id= \"wall-comments\">\r\n");
      out.write("\t\t\t\t");
      out.print( (String) request.getAttribute("postDivs")  );
      out.write("\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<input type=\"hidden\" id=\"totalCount\" value=\"");
      out.print( request.getAttribute("values"));
      out.write("\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t<div id= \"centre-last\">\r\n");
      out.write("\t\t\tadsasdas\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\r\n");
      out.write("\t<div id= \"end\">\r\n");
      out.write("\t\t<p><font size=\"5\" color=\"black\">Hell End - all rights reserved</font></p>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("</div>\t\r\n");
      out.write("</body>\r\n");
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
