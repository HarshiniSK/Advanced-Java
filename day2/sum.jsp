<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ include file="sum.html"%>
    <%
        out.println("<br>");
        int a = Integer.parseInt(request.getParameter("a"));
        int sum = 0;
        for(int i=0;i<=a;i++){
            sum+=i;
        }
        out.println("<br>"+"The sum till "+a+" is "+sum);
    %>
</body>
</html>