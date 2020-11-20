<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Q5</title>
</head>

<body>
    <h3>Customers who purchased pencil but not pen</h3>
    <%@ page import = "java.io.*,java.util.*" %>
        <%@ page import="java.sql.*" %>
            <%

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
        con.close();
    } catch (Exception e) {
        e.printStackTrace();
        out.println(e.getLocalizedMessage());
    }
    %>
</body>

</html>