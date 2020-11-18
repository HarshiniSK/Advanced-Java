import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q1 extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double p = Double.parseDouble(request.getParameter("p"));
        double r = Double.parseDouble(request.getParameter("r"));
        double t = Double.parseDouble(request.getParameter("t"));
        double si = p*r*t/100;
        double ci = (p*Math.pow((1+0.01*r),t))-p;
        out.println("<html><body>");
        out.println("<p>The simple interest is: Rs."+si+"</p>");
        out.println("<p>The compound interest is: Rs."+ci+"</p>");
        out.println("</body></html>");
    }

    public void destroy() {

    }
}