/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.82
 * Generated at: 2024-03-06 19:39:26 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.entity.User;
import com.DAO.BooksDAOimpl;
import com.entity.Book_Details;
import java.util.List;
import com.DB.DBConnect;

public final class All_005fNew_005fBooks_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/all_components/Navbar.jsp", Long.valueOf(1709748111238L));
    _jspx_dependants.put("jar:file:/D:/Akash/IneuronInternshipProjectComplete/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/EbookApp_ineuron_Internship_Project/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/all_components/allCss.jsp", Long.valueOf(1695039843310L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1695062724085L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.entity.Book_Details");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.DAO.BooksDAOimpl");
    _jspx_imports_classes.add("com.entity.User");
    _jspx_imports_classes.add("com.DB.DBConnect");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
    _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>All Recent Books</title>\r\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\n");
      out.write("	crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("<script\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\n");
      out.write("	crossorigin=\"anonymous\"></script>\n");
      out.write("\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css\"\n");
      out.write("	integrity=\"sha512-iecdLmaskl7CVkqkXNQ/ZH/XLlvWZOJyj7Yy7tcenmpD1ypASozpmT/E0iPtmFIB46ZmdtAc9eNBvH0H/ZpiBw==\"\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("	\n");
      out.write("<link rel=\"stylesheet\" href=\"all_components/Style.css\">");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<style>\r\n");
      out.write("\r\n");
      out.write("#toast {\r\n");
      out.write("	min-width: 300px;\r\n");
      out.write("	position: fixed;\r\n");
      out.write("	bottom: 30px;\r\n");
      out.write("	left: 50%;\r\n");
      out.write("	margin-left: -125px;\r\n");
      out.write("	background: #333;\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	color: white;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	z-index: 1;\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("	visibility: hidden;\r\n");
      out.write("	box-shadow: 0px 0px 100px #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#toast.display {\r\n");
      out.write("	visibility: visible;\r\n");
      out.write("	animation: fadeIn 0.5, fadeOut 0.5s 2.5s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@keyframes fadeIn {from { bottom:0;\r\n");
      out.write("	opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("	bottom: 30px;\r\n");
      out.write("	opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write("@keyframes fadeOut {form { bottom:30px;\r\n");
      out.write("	opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("to {\r\n");
      out.write("	bottom: 0;\r\n");
      out.write("	opacity: 0;\r\n");
      out.write("}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");

	User u = (User) session.getAttribute("userobj");
	
      out.write("\r\n");
      out.write("\r\n");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write('\r');
      out.write('\n');
      out.write('	');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\"\n");
      out.write("	style=\"height: 10px; background-color: #303f9f\"></div>\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\n");
      out.write("	<div class=\"row\">\n");
      out.write("		<div class=\"col-md-3 text-success\">\n");
      out.write("			<h3>\n");
      out.write("				<i class=\"fa-solid fa-book\"></i>Ebooks\n");
      out.write("			</h3>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("		<div class=\"col-md-6\">\n");
      out.write("			<form class=\"form-inline my-2 my-lg-0\" action=\"Search.jsp\">\n");
      out.write("				<input class=\"form-control mr-sm-2\" type=\"search\" name=\"ch\"\n");
      out.write("					placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("				<button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("			</form>\n");
      out.write("		</div>\n");
      out.write("\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("		");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("	</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\n");
      out.write("	<a class=\"navbar-brand\" href=\"#\"><i class=\"fa-solid fa-house\"></i></a>\n");
      out.write("	<button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\"\n");
      out.write("		data-target=\"#navbarSupportedContent\"\n");
      out.write("		aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\"\n");
      out.write("		aria-label=\"Toggle navigation\">\n");
      out.write("		<span class=\"navbar-toggler-icon\"></span>\n");
      out.write("	</button>\n");
      out.write("\n");
      out.write("	<div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("		<ul class=\"navbar-nav mr-auto\">\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\" href=\"index.jsp\">Home\n");
      out.write("					<span class=\"sr-only\">(current)</span>\n");
      out.write("			</a></li>\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("				href=\"All_Recent_Books.jsp\"><i class=\"fa-solid fa-book-open\"></i>Recent\n");
      out.write("					Book</a></li>\n");
      out.write("\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link\"\n");
      out.write("				href=\"All_New_Books.jsp\"><i class=\"fa-solid fa-book-open\"></i>New\n");
      out.write("					Book</a></li>\n");
      out.write("\n");
      out.write("			<li class=\"nav-item active\"><a class=\"nav-link disabled\"\n");
      out.write("				href=\"All_Old_Books.jsp\"><i class=\"fa-solid fa-book-open\"></i>Old\n");
      out.write("					Book</a></li>\n");
      out.write("		</ul>\n");
      out.write("		<form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("\n");
      out.write("			<a href=\"Setting.jsp\" class=\"btn btn-light my-2 my-sm-0\" type=\"submit\">\n");
      out.write("				<i class=\"fa-solid fa-gear\"></i>Setting\n");
      out.write("			</a>\n");
      out.write("\n");
      out.write("			<button class=\"btn btn-light my-2 my-sm-0 ml-1\" type=\"submit\">\n");
      out.write("				<i class=\"fa-solid fa-square-phone\"></i>Contact Us\n");
      out.write("			</button>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("</nav>");
      out.write("\r\n");
      out.write("\r\n");
      out.write("	<div class=\"container-fluid\">\r\n");
      out.write("		<div class=\"row p-3\">\r\n");
      out.write("			<!-- 			<div class=\"col-md-3\"> -->\r\n");
      out.write("\r\n");
      out.write("			\r\n");
      out.write("\r\n");
      out.write("			");

			BooksDAOimpl dao = new BooksDAOimpl(DBConnect.getConn());
			List<Book_Details> list = dao.getAllNewBooks();
			for (Book_Details b : list) {
			
      out.write("\r\n");
      out.write("			<div class=\"col-md-3\">\r\n");
      out.write("				<div class=\"card crd-ho mt-2\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"\" src=\"Book/");
      out.print(b.getPhoto());
      out.write("\"\r\n");
      out.write("							style=\"width: 100px; height: 150px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>");
      out.print(b.getBookname());
      out.write("</p>\r\n");
      out.write("						<p>");
      out.print(b.getAuthor());
      out.write("</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							Categories:");
      out.print(b.getBookcategory());
      out.write("\r\n");
      out.write("						</p>\r\n");
      out.write("						\r\n");
      out.write("						<div class=\"row \">\r\n");
      out.write("						\r\n");
      out.write("						");

							if (u == null) {
							
      out.write("\r\n");
      out.write("							<a href=\"login.jsp\" class=\"btn btn-primary btn-sm ml-5\"><i\r\n");
      out.write("								class=\"fa-solid fa-cart-plus\"></i>Add Cart</a> \r\n");
      out.write("							");

							} else {
							
      out.write("\r\n");
      out.write("							<a href=\"cart?bid=");
      out.print(b.getBook_id());
      out.write("&&uid=");
      out.print(u.getId());
      out.write("\"\r\n");
      out.write("								class=\"btn btn-primary btn-sm ml-5\"><i\r\n");
      out.write("								class=\"fa-solid fa-cart-plus\"></i>Add Cart</a>\r\n");
      out.write("							");

							}
							
      out.write("\r\n");
      out.write("						\r\n");
      out.write("						\r\n");
      out.write("<!-- 							<a href=\"\" class=\"btn btn-danger btn-sm ml-5\"><i\r\n");
      out.write("								class=\"fa-solid fa-cart-plus\"></i>Add Cart</a> --> <a href=\"View_Books.jsp?bid=");
      out.print(b.getBook_id());
      out.write("\"\r\n");
      out.write("								class=\"btn btn-success btn-sm ml-1\">Details <i\r\n");
      out.write("								class=\"fa-solid fa-circle-info\"></i></a> <a href=\"\"\r\n");
      out.write("								class=\"btn btn-danger btn-sm ml-1\">");
      out.print(b.getPrice());
      out.write(" <i\r\n");
      out.write("								class=\"fa-solid fa-indian-rupee-sign\"></i></a>\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<!-- 	</div> -->\r\n");
      out.write("\r\n");
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

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /All_New_Books.jsp(67,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty addCart}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\r\n");
          out.write("<div id=\"toast\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${addCart}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</div>\r\n");
          out.write("\r\n");
          out.write("<script type=\"text/javascript\">\r\n");
          out.write("		showToast();\r\n");
          out.write("		function showToast(content)\r\n");
          out.write("		{\r\n");
          out.write("		    $('#toast').addClass(\"display\");\r\n");
          out.write("		    $('#toast').html(content);\r\n");
          out.write("		    setTimeout(()=>{\r\n");
          out.write("		        $(\"#toast\").removeClass(\"display\");\r\n");
          out.write("		    },2000)\r\n");
          out.write("		}	\r\n");
          out.write("</script>\r\n");
          out.write("\r\n");
          if (_jspx_meth_c_005fremove_005f0(_jspx_th_c_005fif_005f0, _jspx_page_context))
            return true;
          out.write("\r\n");
          out.write("\r\n");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fremove_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:remove
    org.apache.taglibs.standard.tag.common.core.RemoveTag _jspx_th_c_005fremove_005f0 = (org.apache.taglibs.standard.tag.common.core.RemoveTag) _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.get(org.apache.taglibs.standard.tag.common.core.RemoveTag.class);
    boolean _jspx_th_c_005fremove_005f0_reused = false;
    try {
      _jspx_th_c_005fremove_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fremove_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fif_005f0);
      // /All_New_Books.jsp(83,0) name = var type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setVar("addCart");
      // /All_New_Books.jsp(83,0) name = scope type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fremove_005f0.setScope("session");
      int _jspx_eval_c_005fremove_005f0 = _jspx_th_c_005fremove_005f0.doStartTag();
      if (_jspx_th_c_005fremove_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fremove_0026_005fvar_005fscope_005fnobody.reuse(_jspx_th_c_005fremove_005f0);
      _jspx_th_c_005fremove_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fremove_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fremove_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /all_components/Navbar.jsp(23,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userobj }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\n");
          out.write("			<div class=\"col-md-3\">\n");
          out.write("			<a href=\"cart.jsp\"><i class=\"fa-solid fa-cart-plus fa-2x\"></i></a>\n");
          out.write("				<a href=\"\" class=\"btn btn-success\"><i\n");
          out.write("					class=\"fa-solid fa-user-plus\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userobj.name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a> <a href=\"logout\"\n");
          out.write("					class=\"btn btn-primary text-white\"><i\n");
          out.write("					class=\"fa-solid fa-right-to-bracket\"></i>Logout</a>\n");
          out.write("			</div>\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /all_components/Navbar.jsp(34,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${empty userobj }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("			<div class=\"col-md-3\">\n");
          out.write("				<a href=\"login.jsp\" class=\"btn btn-success\"><i\n");
          out.write("					class=\"fa-solid fa-right-to-bracket\"></i>Login</a> <a\n");
          out.write("					href=\"register.jsp\" class=\"btn btn-primary text-white\"><i\n");
          out.write("					class=\"fa-solid fa-user-plus\"></i>Register</a>\n");
          out.write("			</div>\n");
          out.write("		");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }
}
