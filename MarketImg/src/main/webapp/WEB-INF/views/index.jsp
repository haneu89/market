<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
h1 {
	text-align: center;
}

fieldset {
	width: 300px;
	margin: 0 auto;
}
</style>
</head>
<body>
	<h1>Market Image Solution</h1>
	<hr>
	<div align="center">
		<img alt="Main Logo" src="http://placehold.it/800x600">
	</div>
	<fieldset>
		<legend>로그인 하세요</legend>
		<%-- <form action="/login.do" method="post">
			<table>
				<tbody>
					<tr>
						<td><label for="id">아이디</label></td>
						<td><input name="id" id="id"></td>
					</tr>
					<tr>
						<td><label for="pw">비밀번호</label></td>
						<td><input type="password" name="pw" id="pw"></td>
					</tr>
					<tr>
					<td rowspan="1">
					<input type="button" value="로그인">
					</td>
					</tr>
				</tbody>
			</table>
		</form> --%>
		<form:form method="post" commandName="member">
			<table>
				<tbody>
					<tr>
						<td><label for="id">아이디</label></td>
						<td><form:input path="userId" /></td>
					</tr>
					<tr>
						<td><label for="pw">비밀번호</label></td>
						<td><form:password path="userPassword" /></td>
					</tr>
					<tr>
						<td rowspan="1"><input type="submit" value="로그인"></td>
					</tr>
				</tbody>
			</table>
		</form:form>
	</fieldset>

</body>
</html>