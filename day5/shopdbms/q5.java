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
        out.println("<html><body>");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = null;
            con = DriverManager.getConnection("jdbc:mysql://localhost/advjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
            
            java.sql.Statement stmt = con.createStatement();
            out.println("<table>");
            out.println("<tr><th>Customer ID</th><th>Customer Name</th><th>Customer Phone Number</th><th>Customer Address</th></tr>");
            ResultSet res = stmt.executeQuery("select * from customers where id not in (SELECT cid FROM `invoice` where pid=1) and id in (SELECT cid FROM `invoice` where pid=2)");
            while (res.next()) {
                out.println("<tr><td>"+res.getInt(1) +"</td><td>"+ " " + res.getString(2) +"</td>"+ "<td>"+res.getLong(3)+"</td>" +"<td>"+res.getString(4)+"</td>"+"</tr>");
            }
            out.println("</table");
            out.println("</body></html>");
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            out.println(e.getLocalizedMessage());
        }
    

    }

    public void destroy() {

    }
}