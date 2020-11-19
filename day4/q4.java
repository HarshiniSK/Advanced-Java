import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q4 extends HttpServlet{
    public void init()throws ServletException{

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.print("<html><body");
        int ll = Integer.parseInt(request.getParameter("ll"));
        int ul = Integer.parseInt(request.getParameter("ul"));
        int sum = 0;
        if(ll<ul){
            for(int i = ll; i<=ul; i++){
                sum += i;
            }
            out.println("<p>The sum is: "+sum+"</p>");
        }
        else{
            out.println("<p>Improper Inputs!</p>");
        }
        out.println("</body></html>");
    }

    public void destroy(){

    }
}