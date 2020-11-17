<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ include file="tenmultiples.html"%>
    <%
        out.println("<br>");
        int num = Integer.parseInt(request.getParameter("num"));
        out.println("You entered: "+num);
        out.println("<br>");
        out.println("The first 10 multiples are:");
        for(int i=1;i<=10;i++){
            out.println("<p>"+num*i+"</p>");   
        }
    %>
</body>
</html>