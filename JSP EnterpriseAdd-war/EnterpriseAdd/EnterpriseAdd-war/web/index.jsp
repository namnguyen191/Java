<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator Page</title>
    </head>
    <body>
        <form action="CalculatorServlet" method="post">
            Number 1 : <input type="number" name="num1"><br>
            Number 2 : <input type="number" name="num2"><br>
            <input type="submit" name="submit" value="Add">
        </form>
    </body>
</html>
