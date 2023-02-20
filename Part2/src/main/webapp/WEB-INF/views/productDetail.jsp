<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>나는 view에 있다.<br>
bbb로 보내온 값 el ta로 읽기 => ${bbb }<br>
이름 생략해서 보내온 값 => ${integer }<br>
객체 이름없이 전송 => ${productVO.name } 와 ${productVO.price }
</h3>
</body>
</html>