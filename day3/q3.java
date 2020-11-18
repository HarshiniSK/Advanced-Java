import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class q3 extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        int num = Integer.parseInt(request.getParameter("num"));
        int count = 0;
        for(int i=1; i<=num/2; i++){
            if(num%i == 0){
                count ++ ;
            }
        }
        out.println("<html><body>");
        if(count == 1){
            out.println("<p>The number is prime number</p>");
        }
        else{
            out.println("<p>The number is not prime number</p>");
        }
        out.println("</body></html>");
    }

    public void destroy() {

    }
}