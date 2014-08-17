<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@ taglib prefix="s" uri="/struts-tags"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<s:form action="app/applogs2_upload" method="POST"
		enctype="multipart/form-data">
		<s:file label="File (1)" name="upload" />
		<s:file label="File (2)" name="upload" />
		<s:file label="FIle (3)" name="upload" />
		<s:submit />
	</s:form>
</body>
</html>