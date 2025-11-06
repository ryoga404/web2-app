<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ログイン</title>
</head>
<body>
<h1>ログイン</h1>

<form action="LoginServlet" method="post"
      onsubmit="this.querySelector('input[type=submit]').disabled = true;">
ユーザ名：<input type="text" name="userName" required><br>
パスワード：<input type="password" name="password" required><br>
<input type="submit" value="ログイン">
</form>

<br><a href="index.jsp">トップへ</a>

</body>
</html>