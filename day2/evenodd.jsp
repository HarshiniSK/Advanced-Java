<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ include file="evenodd.html"%>
    <%
        out.println("<br>");
        int num = Integer.parseInt(request.getParameter("num"));
        if(num%2==0){
            out.println("<br>"+num+" is an even number");
        }
        else{
            out.println("<br>"+num+" is an odd number");
        }
    %>
</body>
</html>