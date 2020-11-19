import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q3 extends HttpServlet{
    public void init()throws ServletException{

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.print("<html><body");
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int hcf = num1 < num2 ? num1 : num2 ;
        for(int i = 1; i<=hcf; i++){
            if(num1%i == 0 && num2%i == 0){
                hcf = i;
                break;
            }
        }
        out.println("<p>The HCF is : "+hcf+"</p>");
        out.println("</body></html>");
    }

    public void destroy(){

    }
}