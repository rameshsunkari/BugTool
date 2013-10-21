<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Bug Tool</title>
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/common-style.css"/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/cssLayout.css"/>"/>
<link rel="stylesheet" type="text/css" href="<c:url value="resources/css/default.css"/>"/>
<!-- <link rel="stylesheet" type="text/css" href="/BugTool/resources/css/common-style.css" />
<link rel="stylesheet" type="text/css" href="/BugTool/resources/css/cssLayout.css" />
<link rel="stylesheet" type="text/css" href="/BugTool/resources/css/default.css" />
 -->
 </head> 
<body>
<div id="page">

		<div id="top">
			<tiles:insertAttribute name="header" />
		</div>
		<div id="main">
			<div id="left">
				<tiles:insertAttribute name="left" />
			</div>

			<div id="content">
				<tiles:insertAttribute name="content" />
			</div>
		</div>

		<div id="bottom">
			<tiles:insertAttribute name="footer" />
		</div>

	</div>

</body>
</html>