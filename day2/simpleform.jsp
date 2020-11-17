<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        int n1 = Integer.parseInt(request.getParameter("input1"));
        int n2 = Integer.parseInt(request.getParameter("input2"));
        out.println("Number 1: "+n1);
        out.println("<br>");
        out.println("Number 2: "+n2);
        out.println("<br>");
        int max = n1>n2 ? n1 : n2;
        out.println("The maximum number is "+max);
    %>
</body>
</html>