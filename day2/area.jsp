<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        double r = Double.parseDouble(request.getParameter("input"));
        double area = 3.14*r*r;
        out.println("You entered the radius:"+r);
        out.println("<br>");
        out.println("The area is:"+area);
    %>
</body>
</html>