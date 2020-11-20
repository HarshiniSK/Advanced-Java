import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class signup extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);   
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        try {
            out.println("<html><body>");
            out.println("<p>Trying to create new user...</p>");
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/advjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {

                java.sql.Statement stmt=con.createStatement();
                String u = "";
                String p = "";
                boolean flag = false;  
                ResultSet rs=stmt.executeQuery("select * from users");
                while(rs.next()){
                    u = rs.getString(1);
                    p = rs.getString(2);
                    if(u.equals(username)){
                        out.println("<p>User already exists...</p>");
                        flag = true;
                        break;
                    }
                }
                if(!flag){
                    int l = password.length();
                    if(l >= 6){
                        int a=stmt.executeUpdate("insert into users values('"+username+"','"+password+"');");
                        out.println("<p>New User: "+username+" is created...</p>");
                    }
                    else{
                        out.print("<p>The password should be greater than six characters!");
                    }
                }  
        		
        			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
                out.println("</body></html>");
				con.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
    }

    public void destroy() {

    }
}
