<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Q2</title>
</head>

<body>
    <h3>Products That Are Not Sold</h3>
    <br>
    <%@ page import = "java.io.*,java.util.*" %>
        <%@ page import="java.sql.*" %>
            <%

    try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = null;
        con = DriverManager.getConnection("jdbc:mysql://localhost/advjava?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
        
        java.sql.Statement stmt = con.createStatement();
        out.println("<table>");
                
            out.println("<tr><th>Product ID</th><th>Product Name</th><th>Product Price</th></tr>");
        ResultSet res = stmt.executeQuery("SELECT * from products where id not in (select pid from invoice)");
        while (res.next()) {
            out.println("<tr><td>"+res.getInt(1) +"</td><td>"+ " " + res.getString(2) +"</td>"+ "<td>"+res.getInt(3)+"</td>" +" "+"</tr>");
        }
        out.println("</table>");
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        out.println(e.getLocalizedMessage());



    }
    
    %>
</body>

</html>