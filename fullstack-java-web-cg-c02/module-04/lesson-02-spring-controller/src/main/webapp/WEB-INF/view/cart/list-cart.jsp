<%--
  Created by IntelliJ IDEA.
  User: Minh Dao
  Date: 11/14/2022
  Time: 10:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Listing cart</title>
</head>
<body>
<h1>CART</h1>
<p><a href="/products">Back To Products</a></p>
<p>There are ${products.size()} products in this cart.</p>
<table border="1">
  <tr>
    <td>Name</td>
    <td>Quantity</td>
    <td>TotalPrice</td>
    <td>Edit</td>
  </tr>
  <c:forEach var="cart" items="${carts}">
    <tr>
      <td>${cart.getProductName()}</td>
      <td>${cart.getQuantity()}</td>
        <%--      <td><a href="/detail?id=${product.getId()}"> ${product.getName()}</a></td>--%>
      <td><a href="/detail/${cart.getId()}"> ${cart.getProductName()}</a></td>
      <td>${cart.getTotalPrice()}</td>
      <td>
        <button>Remove To cart</button>
      </td>
    </tr>
  </c:forEach>
</table>
</body>
</html>
