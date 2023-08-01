<%--
  Created by IntelliJ IDEA.
  User: shjne
  Date: 6/15/2023
  Time: 2:02 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div style="text-align: center">
    <h1>Ứng dụng chuyển đổi tiền tệ</h1>
    <form action="/convertUTV" method="post">

        <%--    <label id="exchangeRate">tỉ giá muốn đổi:</label>--%>
        <%--    <input type="number" name="exchangeRate" step="0.01" required><br>--%>
        <p>Từ USD sang VND</p>
        <label id="vndAmount"></label>
        <input type="number" name="vndAmount" step="0.01" required><br>
        <button type="submit">Quy đổi</button>

    </form>
    <p>Giá sau quy đổi(vnd): ${vndAmount}</p>

    <br>

    <form action="/convertVTU" method="post">

        <p>Từ VND sang USD</p>
        <label id="usdAmount"></label>
        <input type="number" name="usdAmount" step="0.01" required><br>
        <button type="submit">Quy đổi</button>

    </form>
    <p>Giá sau quy đổi(usd): ${usdAmount}</p>

    <br>

    <form action="/convert" method="post">

        <%--    <label id="exchangeRate">tỉ giá muốn đổi:</label>--%>
        <%--    <input type="number" name="exchangeRate" step="0.01" required><br>--%>
        <p>Tỉ giá muốn quy đổi</p>
        <label id="exchangeRate"></label>
        <input type="number" name="exchangeRate" step="0.01" required><br>

        <p>Giá muốn quy đổi</p>
        <label id="Amount"></label>
        <input type="number" name="Amount" step="0.01" required><br>
        <button type="submit">Quy đổi</button>

    </form>
    <p>Giá sau quy đổi: ${Amount}</p>
</div>
</body>
</html>
