<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 로그인</title>
</head>
<body>
	<h1>학생 로그인</h1>
	<form action = "student/login" method = "post"> 
<!-- post: .로그인은 안보여야 함 -->
<!-- ctrl+shift+ c 주석처리 -->
	ID <input type = "text" name ="studentId"><br>
	PW <input type = "password" name = "studentPw"><br>
	<input type = "submit" value="로그인"><br>
	</form>

</body>
</html>