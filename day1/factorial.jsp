<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%
        int number = 5;
        long fact = 1;
        for(int i = 1; i <= number; i++){
        fact = fact * i;
        }
        out.println("Factorial of "+number+" is: "+fact);
    %>
</body>
</html>