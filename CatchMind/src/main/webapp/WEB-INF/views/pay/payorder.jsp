<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>캐치마인드</title>
</head>
<body>

	<div style="width: 200px; height: 150px; float: left;">
		<form action="insertpay.do" method="post" class="payForm">
			<div class="idForm">
				<h1>결제</h1>
			</div>
			<div>
				<div class="passForm">
					<input name="pay_id" value="${Ldto.member_id}" class="id"
						readonly="readonly" />
				</div>
				<div>
					<p>게임 구매가</p>
					<input name="pay_price" value="10000" class="price"
						readonly="readonly" />
				</div>
			</div>
			<input type="submit" value="결제" class="btn" />
		</form>
	</div>
</body>
</html>