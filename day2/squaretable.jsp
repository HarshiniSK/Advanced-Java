<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    <style>
        .row1{
            background-color: aqua;
        }
        .row2{
            background-color: #ffcccb;
        }
    </style>
</head>
<body>
    <table>
        <tr>
            <th class="row1">Num1</th>
            <th class="row2">Num2</th>
        </tr>
        <%
            for(int i=1;i<=5;i++){
                out.println("<tr>");
                    out.println("<td class=\"row1\">"+i+"</td><td class=\"row2\">"+i*i+"</td>");
            }
        %>
    </table>
</body>
</html>
