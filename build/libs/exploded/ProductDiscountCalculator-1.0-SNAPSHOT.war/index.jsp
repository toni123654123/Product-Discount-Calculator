<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 29/10/2020
  Time: 4:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<form action="/display" method="POST">
    <input type="text" name="description" placeholder="Product Description" /><br />
    <input type="text" name="price" placeholder="List Price" /><br />
    <input type="text" name="percent" placeholder="Discount Percent" /><br />
    <button type="submit">Calculator</button>
</form>
</body>
</html>
