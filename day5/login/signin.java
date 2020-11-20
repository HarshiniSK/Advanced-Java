
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class signin extends HttpServlet {

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
            out.println("<p>Trying to login...</p>");
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/advjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {
                String u = "";
                String p = "";
                boolean flag = false;
        		java.sql.Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from users");
                while(rs.next()){
                    u = rs.getString(1);
                    p = rs.getString(2);
                    if(u.equals(username) && p.equals(password)){
                        out.println("<p>Logged In as "+username+"</p>");
                        flag = true;
                        break;
                    }
                    else{
                        if(u.equals(username)){
                            if(!p.equals(password)){
                                out.println("<p>Incorrect Password</p>");
                                flag = true;
                                break;
                            }
                        }
                    }
                }
                if(!flag){
                    out.println("<p>User not available! Please check your details!</p>");
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
