<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <h4>Button is Generated!</h4>
    <%
        String w = request.getParameter("w")+"px";
        String h =request.getParameter("h")+"px";
        String t = request.getParameter("t");
    %>
    <style>
        .custom{
            width: <%= w%>;
            height: <%= h%>;
        }
    </style>
    <button class="custom"><%= t%></button>
</body>
</html>