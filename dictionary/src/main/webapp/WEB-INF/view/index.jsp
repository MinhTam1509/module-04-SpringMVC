<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Tra cứu từ điển</title>
</head>
<body>
<div style="text-align: center">
    <h1>Tra cứu từ Anh - Việt</h1>
    <form action="/lookup" method="post">
        <input type="text" name="word" placeholder="Nhập từ cần tra">
        <input type="submit" value="Tra cứu">
    </form>
    <div>
        <h2>Kết quả tra cứu:</h2>
        <c:if test="${not empty meaning}">
            <p>${meaning}</p>
        </c:if>
        <c:if test="${empty meaning and not empty findwrong}">
            <p>Không tìm thấy từ "${findwrong}" trong từ điển</p>
        </c:if>
    </div>
</div>
</body>
</html>