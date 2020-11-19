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
        int a = Integer.parseInt(request.getParameter("a"));
        int b = Integer.parseInt(request.getParameter("b"));
        int c = Integer.parseInt(request.getParameter("c"));
        double D = b*b - 4*a*c;
        double root1 = (-b + Math.sqrt(D))/(2*a);
        double root2 = (-b - Math.sqrt(D))/(2*a);
        out.println("<html><body>");
        out.println("<p>The roots are: "+root1+" , "+root2+" .</p>");
        out.println("</body></html>");
    }

    public void destroy() {

    }
}
