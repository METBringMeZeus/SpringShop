/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.75
 * Generated at: 2023-07-17 01:24:44 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.view.user.Products;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Category_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
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

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
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
      out.write("<head>\r\n");
      out.write("<title>Sản - phẩm</title>\r\n");
      out.write("<style>\r\n");
      out.write("/* Pagination links */\r\n");
      out.write("\r\n");
      out.write(".pagination{\r\n");
      out.write("	display:flex;\r\n");
      out.write("	justify-content:center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".pagination a {\r\n");
      out.write("	color: black;\r\n");
      out.write("	float: left;\r\n");
      out.write("	padding: 8px 16px;\r\n");
      out.write("	text-decoration: none;\r\n");
      out.write("	transition: background-color .3s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the active/current link */\r\n");
      out.write(".pagination a.active {\r\n");
      out.write("	background-color: dodgerblue;\r\n");
      out.write("	color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add a grey background color on mouse-over */\r\n");
      out.write(".pagination a:hover:not(.active) {\r\n");
      out.write("	background-color: #ddd;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<h1>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ idCategory }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("</h1>\r\n");
      out.write("	<div class=\"well well-small\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("			<span style=\"margin-left: 25px;\">Danh sách sản phẩm</span> <select\r\n");
      out.write("				class=\"pull-right\">\r\n");
      out.write("				<option>A - Z</option>\r\n");
      out.write("				<option>Cao - Thấp</option>\r\n");
      out.write("			</select>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/a.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/b.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/c.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/d.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/e.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/f.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/g.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/h.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/i.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("		<div class=\"row-fluid\">\r\n");
      out.write("			<ul class=\"thumbnails\">\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/a.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/b.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("				<li class=\"span4\">\r\n");
      out.write("					<div class=\"thumbnail\">\r\n");
      out.write("						<a href=\"product_details.html\" class=\"overlay\"></a> <a\r\n");
      out.write("							class=\"zoomTool\" href=\"product_details.html\" title=\"add to cart\"><span\r\n");
      out.write("							class=\"icon-search\"></span> QUICK VIEW</a> <a\r\n");
      out.write("							href=\"product_details.html\"><img src=\"assets/img/c.jpg\"\r\n");
      out.write("							alt=\"\"></a>\r\n");
      out.write("						<div class=\"caption cntr\">\r\n");
      out.write("							<p>Manicure & Pedicure</p>\r\n");
      out.write("							<p>\r\n");
      out.write("								<strong> $22.00</strong>\r\n");
      out.write("							</p>\r\n");
      out.write("							<h4>\r\n");
      out.write("								<a class=\"shopBtn\" href=\"#\" title=\"add to cart\"> Add to cart\r\n");
      out.write("								</a>\r\n");
      out.write("							</h4>\r\n");
      out.write("							<div class=\"actionList\">\r\n");
      out.write("								<a class=\"pull-left\" href=\"#\">Add to Wish List </a> <a\r\n");
      out.write("									class=\"pull-left\" href=\"#\"> Add to Compare </a>\r\n");
      out.write("							</div>\r\n");
      out.write("							<br class=\"clr\">\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</li>\r\n");
      out.write("			</ul>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	<div class=\"pagination\">\r\n");
      out.write("		<a href=\"#\">&laquo;</a> <a href=\"#\">1</a> <a class=\"active\" href=\"#\">2</a>\r\n");
      out.write("		<a href=\"#\">3</a> <a href=\"#\">4</a> <a href=\"#\">5</a> <a href=\"#\">6</a>\r\n");
      out.write("		<a href=\"#\">&raquo;</a>\r\n");
      out.write("	</div>\r\n");
      out.write("</body>");
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
