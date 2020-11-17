<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        int num1, num2, num3, result, temp;
        num1 = 60;
        num2 = 45;
        num3 = 72;
        temp = num1 < num2 ? num1:num2;
        result = num3 < temp ? num3:temp;
        out.println("Smallest Number is: "+result);
    %>
</body>
</html>