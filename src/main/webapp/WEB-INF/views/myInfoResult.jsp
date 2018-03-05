<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	이름 : ${myInfo.name }<br>
	키 : ${myInfo.height }<br>
	몸무게 : ${myInfo.weight }<br>
	<c:forEach var="item" items="${myInfo.hobbys }">
		취미 : ${item }<br>
	</c:forEach>
	비만도 : ${myInfo.info }
</body>
</html>