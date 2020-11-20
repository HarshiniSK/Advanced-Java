import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class productSearch extends HttpServlet {

    public void init() throws ServletException {
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);   
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String type = request.getParameter("option");
        try {
            out.println("<html><body>");
            out.println("Searching...");
            boolean flag = false;
    		Connection con = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		con = DriverManager.getConnection("jdbc:mysql://localhost/advjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
    		try {
        		java.sql.Statement stmt=con.createStatement();  
                ResultSet rs=stmt.executeQuery("select * from products");
                switch (type){
                    case "id":
                        int id = Integer.parseInt(request.getParameter("text"));
                        while(rs.next()){
                            if(id == rs.getInt(1)){
                                out.println("<p>Item ID: "+rs.getInt(1)+"</p>");
                                out.println("<p>Item Name: "+rs.getString(2)+"</p>");
                                out.println("<p>Item Price: "+rs.getInt(3)+"</p>");
                                flag = true;
                            }
                        }
                        break;

                        case "name":
                        String name = request.getParameter("text");
                        while(rs.next()){
                            if(name.equals(rs.getString(2))){
                                out.println("<p>Item ID: "+rs.getInt(1)+"</p>");
                                out.println("<p>Item Name: "+rs.getString(2)+"</p>");
                                out.println("<p>Item Price: "+rs.getInt(3)+"</p>");
                                flag = true;
                            }
                        }
                        break;

                        case "price":
                        int price = Integer.parseInt(request.getParameter("text"));
                        while(rs.next()){
                            if(price == rs.getInt(3)){
                                out.println("<p>Item ID: "+rs.getInt(1)+"</p>");
                                out.println("<p>Item Name: "+rs.getString(2)+"</p>");
                                out.println("<p>Item Price: "+rs.getInt(3)+"</p>");
                                flag = true;
                            }
                        }
                        break;
                }
                if(!flag){
                    out.println("<p>Item Not Available!</p>");
                }
        			
			} catch (Exception e) {
				// TODO: handle exception
			}
    		finally {
                out.print("<p>End of Search!</p>");
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
