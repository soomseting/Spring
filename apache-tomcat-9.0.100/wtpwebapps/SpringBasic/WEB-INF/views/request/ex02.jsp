<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>ex02</h3>
	
	<form action="param" method="post">
		id: <input type="text" name ="id"><br>
		pw: <input type="password" name ="pw"><br>
		name: <input type="text" name ="name"><br>
		분야:
		<input type="checkbox" name="inter" value="자바">
		<input type="checkbox" name="inter" value="jsp">
		<input type="checkbox" name="inter" value="spring"><br>
		
		<input type="submit" value="파라미터값 받기">
	</form>
</body>
</html>