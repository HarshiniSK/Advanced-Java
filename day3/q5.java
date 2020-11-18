import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q5 extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body");
        float cel = Float.parseFloat(request.getParameter("cel"));
        float fahr = (cel * 9/5) + 32 ;
        out.println("<p>The fahrenheit equivalent is: "+fahr+"</p>");
        out.println("</body></html>");

    }

    public void destroy() {

    }
}