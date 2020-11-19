import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q5 extends HttpServlet{
    public void init()throws ServletException{

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.print("<html><body");
        int n = Integer.parseInt(request.getParameter("n"));
        int x = 0;
        out.println("<p>The series:</p>");
        for(int i = 0; i<=n; i++){
            x = (int)Math.pow(2,i);
            out.println("<p>"+x+"</p");
        }
        out.println("</body></html>");
    }

    public void destroy(){

    }
}