import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q2 extends HttpServlet{
    public void init()throws ServletException{

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<html><body");
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int lcm = (num1 > num2) ? num1 : num2;

        while(true) {
          if( lcm % num1 == 0 && lcm % num2 == 0 ) {
            out.println("<p>The LCM is: "+lcm+"</p>");
            break;
          }
          ++lcm;
        }
        out.print("</body></html>");
    }

    public void destroy(){

    }
}