import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q2 extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        double km = Double.parseDouble(request.getParameter("km"));
        double cm = Double.parseDouble(request.getParameter("cm"));
        double c1 = km * 100000;
        double c2 = cm / 100000;
        out.println("<html><body>");
        out.println("<p>The km is converted to:"+c1+" cm</p>");
        out.println("<p>The cm is: Rs."+c2+" km</p>");
        out.println("</body></html>");

    }

    public void destroy() {

    }
}