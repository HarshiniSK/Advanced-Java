import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q4 extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int no = Integer.parseInt(request.getParameter("no"));
        out.println("<html><body>");
        int r, sum = 0, temp = no;
        while (no > 0) {
            r = no % 10;
            no /= 10;
            sum += r * r * r;
        }
        if (temp == sum) {
            out.println("<p>" + temp + " is an armstrong</p>");
        } else {
            out.println("<p>" + temp + " is not an armstrong</p>");
        }
        out.println("</body></html>");
    }

    public void destroy() {

    }
}