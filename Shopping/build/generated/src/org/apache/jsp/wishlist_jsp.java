package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.util.*;

public final class wishlist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/shopping1","yasir","yasir");
int i=0,l=0,jk=4;
String n= (String) session.getAttribute("name");
if(request.getParameter("id")!=null)
            {
                int m=0;
                PreparedStatement st=con.prepareStatement("SELECT ID FROM WISHLIST WHERE EMAIL =?");
                st.setString(1,request.getParameter("id"));
                ResultSet rs = st.executeQuery();
                while(rs.next())
                {
                    m++;
                }
             if(m == 0)
             {
             PreparedStatement stv=con.prepareStatement("INSERT INTO WISHLIST VALUES(?,?)");
             stv.setString(2,request.getParameter("id"));
             stv.setString(1, n); 
             stv.executeUpdate();
             }
            }
PreparedStatement st=con.prepareStatement("SELECT * FROM PRODUCTS WHERE ID IN ( SELECT ID FROM WISHLIST WHERE EMAIL =?)");
st.setString(1,n);
ResultSet rs=st.executeQuery();

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("            <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("         <style>\n");
      out.write("            .card0 {\n");
      out.write("    box-shadow: 0px 4px 8px 0px #757575;\n");
      out.write("    border-radius: 0px\n");
      out.write("}\n");
      out.write(".checked\n");
      out.write("                {\n");
      out.write("                    color: orange;\n");
      out.write("                }\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar10\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"navbar-collapse collapse\" id=\"navbar10\">\n");
      out.write("           <ul class=\"navbar-nav nav-fill w-100\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"cart.jsp\"> Cart </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"wishlist.jsp\"> Wishlist </a>\n");
      out.write("                </li>\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"logcategories.html\"> Categories </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"loghome.html\"> Home </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"order.jsp\"> Order </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"logcontact.html\">Contact Us</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"logabout.html\"> Profile </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("        <div class=\"my-3 small\">\n");
      out.write("           <h1 class=\"text-center\"> <img src=\"imge/9.jpg\" height=\"50\" width=\"50\">\n");
      out.write("            <a href=\"logabout.html\" class=\"text-dark \">Shopping Heart</a>\n");
      out.write("            <img src=\"imge/9.jpg\" height=\"50\" width=\"50\"></h1>\n");
      out.write("            <p class=\"text-center text-dark\">For Those Who Love Shopping</p>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <h2 class=\"text-light\">Welcome</h2>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0 ml-auto\" action=\"search\">\n");
      out.write("        <input class=\"form-control mr-sm-2\" type=\"search\" name=\"sr\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("        </header>\n");
      out.write("        <div class=\"small my-2\">\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("\n");
      out.write("        <div class=\"card-deck text-dark\">\n");
      out.write("            ");
while (rs.next()){
                    String z = rs.getString(1);
                    String pn = rs.getString(3);
                    int nm = rs.getInt(2);
                    int ig = rs.getInt(8);
                    int rp = rs.getInt(5);
                    int t = rs.getInt(6);
                    int g = rs.getInt(6);
                    i++;
                    l++;
                
      out.write("\n");
      out.write("                \n");
      out.write("                        <div class=\"card card0 text-left h-25\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                             <img class=\"card-img-top card-group \" src=\"");
      out.print( z);
      out.write("\" alt=\"Card image cap\">\n");
      out.write("                             <label name=\"number\">#");
      out.print( ig);
      out.write("</label>\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print( pn);
      out.write("</h5>\n");
      out.write("                            <div>\n");
      out.write("                            ");
 while(t!=0)
                            {
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <span class=\"fa fa-star checked\"></span>\n");
      out.write("                            ");
 
                                t--;
                            }
                            
      out.write("\n");
      out.write("                            ");
if(g!=5){while(g<5){
      out.write("\n");
      out.write("                            <span class=\"fa fa-star\"></span>\n");
      out.write("                            ");
g++;}}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <h5><i class=\"fa fa-inr\"></i> ");
      out.print( nm);
      out.write("</h5>\n");
      out.write("                            <h6>M.R.P <strike class=\"text-muted\"><i class=\"fa fa-inr\"></i> ");
      out.print( rp);
      out.write("</strike></h6>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-primary text-capitalize\" name=\"cart\" ><i class=\"fa fa-shopping-cart\"></i> Add to cart</button>\n");
      out.write("                            <button type=\"submit\" class=\"btn btn-danger text-capitalize\" name=\"wish\" ><i class=\"fa fa-heart-o\"></i> wishlist</button>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("             ");
if(i==0){
            PreparedStatement st1=con.prepareStatement("SELECT * FROM PRODUCTS WHERE IDE < 1005"); 
            ResultSet rs1=st1.executeQuery();
      out.write("\n");
      out.write("            <div class=\"text-center\">\n");
      out.write("                \n");
      out.write("              <img src=\"imge/EM.jpg\" class=\"rounded w-75 h-75\" alt=\"...\">\n");
      out.write("              \n");
      out.write("                \n");
      out.write("            </div>\n");
      out.write("            <div class=\"my-3 small card0 bg-dark\">\n");
      out.write("              <h1 class=\"text-center text-light\">You May Also Like..</h1>  \n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("            <div class=\"card-deck text-dark\">\n");
      out.write("            ");
while (rs1.next()){
                    String z = rs1.getString(1);
                    String pn = rs1.getString(3);
                    int nm = rs1.getInt(2);
                    int ig = rs1.getInt(8);
                    int rp = rs1.getInt(5);
                    int t = rs1.getInt(6);
                    int g=t;
                
      out.write("\n");
      out.write("                \n");
      out.write("                        <div class=\"card card0 text-left h-25\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                             <img class=\"card-img-top \" src=\"");
      out.print( z);
      out.write("\" alt=\"Card image cap\">\n");
      out.write("                             <label name=\"number\">#");
      out.print( ig);
      out.write("</label>\n");
      out.write("                            <h5 class=\"card-title\">");
      out.print( pn);
      out.write("</h5>\n");
      out.write("                            <div>\n");
      out.write("                            ");
 while(t!=0)
                            {
                            
      out.write("\n");
      out.write("                            \n");
      out.write("                            <span class=\"fa fa-star checked\"></span>\n");
      out.write("                            ");
 
                                t--;
                            }
                            
      out.write("\n");
      out.write("                            ");
if(g!=5){while(g<5){
      out.write("\n");
      out.write("                            <span class=\"fa fa-star\"></span>\n");
      out.write("                            ");
g++;}}
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <h5><i class=\"fa fa-inr\"></i> ");
      out.print( nm);
      out.write("</h5>\n");
      out.write("                            <h6>M.R.P <strike class=\"text-muted\"><i class=\"fa fa-inr\"></i> ");
      out.print( rp);
      out.write("</strike></h6>\n");
      out.write("                            <button class=\"btn btn-primary text-capitalize\" name=\"cart\" value=\"submit\" ONCLICK=\"submit()\"><i class=\"fa fa-shopping-cart\"></i> Add to cart</button>\n");
      out.write("                            <button class=\"btn btn-danger text-capitalize\" name=\"wish\" value=\"submit\" ONCLICK=\"submit()\"><i class=\"fa fa-heart-o\"></i> wishlist</button>\n");
      out.write("                          </div>\n");
      out.write("                        </div>\n");
      out.write("                            ");
}
      out.write("\n");
      out.write("            ");
}
      out.write("\n");
      out.write("            </div>\n");
      out.write("        \n");
      out.write("\n");
      out.write("            \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <div class=\"small my-2\">\n");
      out.write("        </div>\n");
      out.write("        <footer id=\"dk-footer\" class=\"dk-footer\">\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-2 col-lg-3\">\n");
      out.write("                    <div class=\"dk-footer-box-info\">\n");
      out.write("                        <a href=\"index.html\" class=\"footer-logo\">\n");
      out.write("                            <img src=\"imge/ss.png\" alt=\"footer_logo\" class=\"img-fluid \">\n");
      out.write("                        </a>\n");
      out.write("                        <p class=\"footer-info-text\">\n");
      out.write("                          ShoppingHeart.com is an Ecommerce website was started in 2021 by Yasir Ahmad Group of Companies\n");
      out.write("                        </p>\n");
      out.write("                        <div class=\"footer-social-link\">\n");
      out.write("                            <h3>Follow us</h3>\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-facebook\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-twitter\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-google-plus\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-linkedin\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">\n");
      out.write("                                        <i class=\"fa fa-instagram\"></i>\n");
      out.write("                                    </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"footer-awarad\">\n");
      out.write("                        <img src=\"images/icon/best.png\" alt=\"\">\n");
      out.write("                        <p>Best Shopping Web Site 2021</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-md-12 col-lg-8\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"contact-us\">\n");
      out.write("                                <div class=\"contact-icon\">\n");
      out.write("                                    <i class=\"fa fa-map-o\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"contact-info\">\n");
      out.write("                                    <h3>Kanpur India</h3>\n");
      out.write("                                    <p>Mall Road</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6\">\n");
      out.write("                            <div class=\"contact-us contact-us-last\">\n");
      out.write("                                <div class=\"contact-icon\">\n");
      out.write("                                    <i class=\"fa fa-volume-control-phone\" aria-hidden=\"true\"></i>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"contact-info\">\n");
      out.write("                                    <h3>6394407864</h3>\n");
      out.write("                                    <p>Give us a call</p>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12 col-lg-6\">\n");
      out.write("                            <div class=\"footer-widget footer-left-widget\">\n");
      out.write("                                <div class=\"section-heading\">\n");
      out.write("                                    <h3>Useful Links</h3>\n");
      out.write("                                    <span class=\"animate-border border-black\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"About.html\">About us</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"Contactus.html\">Contact us</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Our Team</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                                <ul>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Services</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Blog</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Testimonials</a>\n");
      out.write("                                    </li>\n");
      out.write("                                    <li>\n");
      out.write("                                        <a href=\"#\">Faq</a>\n");
      out.write("                                    </li>\n");
      out.write("                                </ul>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-12 col-lg-6\">\n");
      out.write("                            <div class=\"footer-widget\">\n");
      out.write("                                <div class=\"section-heading\">\n");
      out.write("                                    <h3>Subscribe</h3>\n");
      out.write("                                    <span class=\"animate-border border-black\"></span>\n");
      out.write("                                </div>\n");
      out.write("                                <p>\n");
      out.write("                               ShoppingHeart.com is different from other e- commerce websites as being the only website in India which serving both Individuals.</p>\n");
      out.write("                                <form action=\"#\">\n");
      out.write("                                    <div class=\"form-row h-25\">\n");
      out.write("                                        <div class=\"col dk-footer-form\">\n");
      out.write("                                            <input type=\"email\" class=\"form-control\" placeholder=\"Email Address\">\n");
      out.write("                                            <button type=\"submit\">\n");
      out.write("                                                <i class=\"fa fa-send\"></i>\n");
      out.write("                                            </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    <div class=\"copyright\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <span>Copyright © 2019, All Right Reserved Yasir Ahmad</span>\n");
      out.write("                    </div>                   \n");
      out.write("                    <div class=\"col-md-6\">\n");
      out.write("                        <div class=\"copyright-menu\">\n");
      out.write("                            <ul>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"index.html\">Home</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Terms</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"#\">Privacy Policy</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <a href=\"Contactus.html\">Contact Us</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    </div>                \n");
      out.write("            </div>            \n");
      out.write("        </div>        \n");
      out.write("        <div id=\"back-to-top\" class=\"back-to-top\">\n");
      out.write("            <button class=\"btn btn-dark\" title=\"Back to Top\" style=\"display: block\">\n");
      out.write("                <i class=\"fa fa-angle-up\"></i>\n");
      out.write("            </button>\n");
      out.write("        </div>        \n");
      out.write("</footer>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
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
