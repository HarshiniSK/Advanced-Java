<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ include file="leapyear.html"%>
    <%
        out.println("<br>");
        int year = Integer.parseInt(request.getParameter("year"));
        if(year%4==0){
            out.println("<br>"+year+" is a leap year");
        }
        else{
            out.println("<br>"+year+" is not a leap year");
        }
    %>
</body>
</html>