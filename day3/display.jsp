<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        int a = 10;
        out.println("The value is "+a);
    %>

    <h1>Displayed inside header tag:</h1> 
    <h1><%= a%></h1>
</body>
</html>