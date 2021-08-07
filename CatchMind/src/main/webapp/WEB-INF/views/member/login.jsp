<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캐치마인드</title>
</head>
<body>
		<table id="logintable">
			<colgroup>
				<col width="15%">
			</colgroup>
			<tr id="idForm">
				<th>ID</th>
				<td>&nbsp;<input type="text" class="text_box" placeholder="ID" id="member_id"/></td>
			</tr>
			<tr id="pwForm">
				<th>PW</th>
				<td>&nbsp;<input type="password" class="text_box" placeholder="Password" id="member_pw"/></td>
			</tr>
			<tr id="login-button">
				<td id="login-button" colspan="2"><input type="button" value="로그인" id="login" onclick="login();"/></td>
			</tr>
			<tr>
				<td colspan="2" align="center" id="loginChk"></td>
			</tr>

		</table>
</body>
</html>