<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ユーザ登録</title>
</head>
<body>
<h1>ユーザ登録</h1>

<form action="UserRegisterServlet" method="post"
      onsubmit="this.querySelector('input[type=submit]').disabled = true;">
ユーザ名：<input type="text" name="userName" required><br>
メールアドレス：<input type="email" name="mailAddress" required><br>
<input type="submit" value="登録">
</form>

<br><a href="index.jsp">トップへ</a>

</body>
</html>