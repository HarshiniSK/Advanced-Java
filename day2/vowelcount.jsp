<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>
    <%@ include file="vowelcount.html"%>
    <%
        out.println("<br>");
        String str = request.getParameter("str").toLowerCase();
        int l = str.length();
        int count =0;
        for(int i=0;i<l;i++){
            char x = str.charAt(i);
                if(x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u'){
                    count ++;
                    continue;
                }
            
        }
        out.println("<br>"+"The number of vowels is "+count);
    %>
</body>
</html>