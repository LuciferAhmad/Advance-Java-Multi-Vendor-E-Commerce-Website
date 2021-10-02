package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.Connection;

public final class mcasual_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
 
    Connection con= DriverManager.getConnection("jdbc:derby://localhost:1527/shopping1","yasir","yasir");
    String n= (String) session.getAttribute("name");
    PreparedStatement st=null;
    if(request.getParameter("mc")!=null)
    {
        st=con.prepareStatement("SELECT * FROM PRODUCTS WHERE ID < 1004 "); 
    }
    else if(request.getParameter("wc")!=null)
    {
        st=con.prepareStatement("SELECT * FROM PRODUCTS WHERE ID BETWEEN 1004 AND 1006");
    }
    else if(request.getParameter("na")!=null)
    {
        st=con.prepareStatement("SELECT * FROM PRODUCTS WHERE ID BETWEEN 1008 AND 1010");
    }
    else if(request.getParameter("hc")!=null)
    {
        st=con.prepareStatement("SELECT * FROM PRODUCTS WHERE ID BETWEEN 1005 AND 1007");
    }
    else if(request.getParameter("hd")!=null)
    {
        st=con.prepareStatement("SELECT * FROM PRODUCTS WHERE ID  BETWEEN 1002 AND 1004");
    }
     ResultSet rs = st.executeQuery();
    if (request.getParameter("cart") != null) {
            if(n!=null)
            {
                PreparedStatement s= con.prepareStatement("INSERT INTO CART(ID,IMAGE,PRICE,RATE,EMAIL) VALUES (?,?,?,?,?,?)");
                
            }
            else
            {
                request.getRequestDispatcher("SignIn.html").include(request, response);
            }
                
        } else if (request.getParameter("wish") != null) {
                
        }
        

      out.write("\n");
      out.write("<html>\n");
      out.write("     <head>\n");
      out.write("            <meta charset=\"UTF-8\">\n");
      out.write("            <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\">\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("            <link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("            <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/sweetalert/2.1.2/sweetalert.min.js\"></script>\n");
      out.write("            <style>\n");
      out.write("                .card0 {\n");
      out.write("                    box-shadow: 0px 4px 8px 0px #757575;\n");
      out.write("                    border-radius: 0px\n");
      out.write("                }\n");
      out.write("                .checked\n");
      out.write("                {\n");
      out.write("                    color: orange;\n");
      out.write("                }\n");
      out.write("            </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
if(n!=null) {
      out.write("\n");
      out.write("         <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar10\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("       <div class=\"navbar-collapse collapse\" id=\"navbar10\">\n");
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
      out.write("            <a href=\"About.html\" class=\"text-dark \">Shopping Heart</a>\n");
      out.write("            <img src=\"imge/9.jpg\" height=\"50\" width=\"50\"></h1>\n");
      out.write("            <p class=\"text-center text-dark\">For Those Who Love Shopping</p>\n");
      out.write("        </div>\n");
      out.write("        <header>\n");
      out.write("            <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("                <h2 class=\"text-light\">Welcome</h2>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("            <div class=\"collapse navbar-collapse \" id=\"navbarSupportedContent\">\n");
      out.write("        <form class=\"form-inline my-2 my-lg-0 ml-auto\">\n");
      out.write("        <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\n");
      out.write("        <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Search</button>\n");
      out.write("         </form>\n");
      out.write("        </div>\n");
      out.write("        </nav>\n");
      out.write("        </header>\n");
      out.write("        ");
}
        else {
      out.write("\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbar10\">\n");
      out.write("            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("        <div class=\"navbar-collapse collapse\" id=\"navbar10\">\n");
      out.write("           <ul class=\"navbar-nav nav-fill w-100\">\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"SignIn.html\"> Sign In </a>\n");
      out.write("                </li>\n");
      out.write("               <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Categories.html\"> Categories </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"index.html\"> Home </a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"Contactus.html\">Contact Us</a>\n");
      out.write("                </li>\n");
      out.write("                <li class=\"nav-item\">\n");
      out.write("                    <a class=\"nav-link\" href=\"About.html\"> About </a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("        <div class=\"my-3 small\">\n");
      out.write("           <h1 class=\"text-center\"> <img src=\"imge/9.jpg\" height=\"50\" width=\"50\">\n");
      out.write("            <a href=\"About.html\" class=\"text-dark \">Shopping Heart</a>\n");
      out.write("            <img src=\"imge/9.jpg\" height=\"50\" width=\"50\"></h1>\n");
      out.write("            <p class=\"text-center text-dark\">For Those Who Love Shopping</p>\n");
      out.write("        </div>\n");
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
      out.write("                </header>\n");
      out.write("        ");
}
      out.write("\n");
      out.write("        <div class=\"small my-3\">\n");
      out.write("        </div>\n");
      out.write("        <div class=\"row\">\n");
      out.write("            <div class=\"col-md-3\">\n");
      out.write("              <div class=\"nav-side-menu\">\n");
      out.write("                            <ul id=\"menu-content\" >\n");
      out.write("                                <li>\n");
      out.write("                                  <a href=\"#\">\n");
      out.write("                                  <i class=\"fas fa-tachometer-alt fa-lg\"></i> Dashboard\n");
      out.write("                                  </a>\n");
      out.write("                                </li>\n");
      out.write("\n");
      out.write("                                <li  data-toggle=\"collapse\" data-target=\"#products\" class=\"collapsed active\">\n");
      out.write("                                  <a href=\"#\"><i class=\"fab fa-studiovinari fa-lg\"></i> UI Elements <span class=\"arrow\"></span></a>\n");
      out.write("                                </li>\n");
      out.write("                                <ul class=\"sub-menu collapse\" id=\"products\">\n");
      out.write("                                    <li class=\"active\"><a href=\"#\">CSS3 Animation</a></li>\n");
      out.write("                                    <li><a href=\"#\">General</a></li>\n");
      out.write("                                    <li><a href=\"#\">Buttons</a></li>\n");
      out.write("                                    <li><a href=\"#\">Tabs & Accordions</a></li>\n");
      out.write("                                    <li><a href=\"#\">Typography</a></li>\n");
      out.write("                                    <li><a href=\"#\">FontAwesome</a></li>\n");
      out.write("                                    <li><a href=\"#\">Slider</a></li>\n");
      out.write("                                    <li><a href=\"#\">Panels</a></li>\n");
      out.write("                                    <li><a href=\"#\">Widgets</a></li>\n");
      out.write("                                    <li><a href=\"#\">Bootstrap Model</a></li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <li data-toggle=\"collapse\" data-target=\"#service\" class=\"collapsed\">\n");
      out.write("                                  <a href=\"#\"><i class=\"fab fa-fort-awesome-alt fa-lg\"></i> Services <span class=\"arrow\"></span></a>\n");
      out.write("                                </li>  \n");
      out.write("                                <ul class=\"sub-menu collapse\" id=\"service\">\n");
      out.write("                                  <li>New Service 1</li>\n");
      out.write("                                  <li>New Service 2</li>\n");
      out.write("                                  <li>New Service 3</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <li data-toggle=\"collapse\" data-target=\"#new\" class=\"collapsed\">\n");
      out.write("                                  <a href=\"#\"><i class=\"fab fa-pagelines fa-lg\"></i> New <span class=\"arrow\"></span></a>\n");
      out.write("                                </li>\n");
      out.write("                                <ul class=\"sub-menu collapse\" id=\"new\">\n");
      out.write("                                  <li>New New 1</li>\n");
      out.write("                                  <li>New New 2</li>\n");
      out.write("                                  <li>New New 3</li>\n");
      out.write("                                </ul>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                 <li>\n");
      out.write("                                  <a href=\"#\">\n");
      out.write("                                  <i class=\"fas fa-user-tie fa-lg\"></i> Profile\n");
      out.write("                                  </a>\n");
      out.write("                                  </li>\n");
      out.write("\n");
      out.write("                                 <li>\n");
      out.write("                                  <a href=\"#\">\n");
      out.write("                                  <i class=\"fa fa-users fa-lg\"></i> Users\n");
      out.write("                                  </a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                     </div>\n");
      out.write("                </div>\n");
      out.write("            <div class=\"col\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                <div id=\"carouselExampleIndicators\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("              <div class=\"carousel-inner\">\n");
      out.write("                <div class=\"carousel-item active\">\n");
      out.write("                  <img class=\"d-block w-100 \" src=\"imge/1.jpg\" alt=\"First slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                  <img class=\"d-block w-100\" src=\"imge/2.jpg\" alt=\"Second slide\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"carousel-item\">\n");
      out.write("                  <img class=\"d-block w-100\" src=\"imge/3.jpg\" alt=\"Third slide\">\n");
      out.write("                </div>\n");
      out.write("              </div>\n");
      out.write("              <a class=\"carousel-control-prev\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Previous</span>\n");
      out.write("              </a>\n");
      out.write("              <a class=\"carousel-control-next\" href=\"#carouselExampleIndicators\" role=\"button\" data-slide=\"next\">\n");
      out.write("                <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                <span class=\"sr-only\">Next</span>\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            </div>\n");
      out.write("                <div class=\"small my-3\">\n");
      out.write("        </div>\n");
      out.write("                <FORM NAME=\"form1\" METHOD=\"POST\">\n");
      out.write("                    <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"card-deck card0 text-dark text-capitalize\"> \n");
      out.write("                ");
while (rs.next()){
                    String z = rs.getString(2);
                    String pn = rs.getString(4);
                    int nm = rs.getInt(3);
                    int i = rs.getInt(1);
                    int rp = rs.getInt(6);
                    int t = rs.getInt(7);
                    int g=t;
                
      out.write("\n");
      out.write("                \n");
      out.write("                        <div class=\"card card0 text-left h-25\">\n");
      out.write("                          <div class=\"card-body\">\n");
      out.write("                             <img class=\"card-img-top \" src=\"");
      out.print( z);
      out.write("\" alt=\"Card image cap\">\n");
      out.write("                             <h6 id=\"ID\">#");
      out.print( i);
      out.write("</h6>\n");
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
      out.write("                ");
}
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                </Form>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("        <SCRIPT LANGUAGE=\"JavaScript\">\n");
      out.write("        function submit()\n");
      out.write("        {\n");
      out.write("            document.form1.cart.value = \"yes\";\n");
      out.write("            document.form1.wish.value = \"yes\";\n");
      out.write("            form1.submit();\n");
      out.write("        } \n");
      out.write("         \n");
      out.write("        </SCRIPT>\n");
      out.write("        <div class=\"small my-3\">\n");
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
