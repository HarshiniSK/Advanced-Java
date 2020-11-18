<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        double basic = Double.parseDouble(request.getParameter("basic"));
        double hra = Double.parseDouble(request.getParameter("hra"));
        double bonus = Double.parseDouble(request.getParameter("bonus"));
        hra = 0.15 * hra;
        bonus = 0.50 * bonus;
        double salary = basic + hra + bonus;
    %>
    <h4>The salary is Rs.<%= salary%></h4>
</body>
</html>
