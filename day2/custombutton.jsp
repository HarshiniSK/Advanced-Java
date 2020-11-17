<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        String w = request.getParameter("w")+"px";
        String h = request.getParameter("h")+"px";
        String btn = "<button style="+"'"+"width:"+w+";height:"+h+";'>Custom Button</button>";
        out.println(btn);
    %>
</body>
</html>