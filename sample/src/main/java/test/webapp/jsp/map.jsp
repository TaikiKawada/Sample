<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.HashMap" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    <%
    //マップにJSP、PHP,ASP.NETというキーを追加
    HashMap<String,String>map=new HashMap<String,String>();
    map.put("JSP","JavaServer Pages");
    map.put("PHP","PHP:Hypertext Preprocessor");
    map.put("ASP.NET","Active Server Page.NET");
    //出来上がったマップをページ属性mapsにセット
    pageContext.setAttribute("maps",map);
    %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Coreタグライブラリ</title>
</head>
<body>
<ul>
<c:forEach var="item" items="${maps}">
	<li>${item.key}:${item.value}</li>
</c:forEach>
</ul>
</body>
</html>