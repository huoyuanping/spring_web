<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
	.data {
	 	width:5%;
	}
	.ml{
		width:5%;
	}
	.sk{
		width:5%;
	}
</style>
</head>
<body>
	
		<form action="GoodServlet" method="get">
			
			<input type="text" name="myName" value="${myName}">
			<input type="submit" value="搜索">
		</form>
		
        
	<div>
		<table class="MainArea_Content" align="center" cellspacing="0" cellpadding="0" border=1>
			<!-- 表头-->
			<thead>
				<tr align="center" valign="middle" id="TableTitle">
					<td>商品编号</td>
					<td>商品名称</td>
					<td>商品分类</td>
					<td>商品所在地</td>
					<td>单价</td>
					<td>图片路径</td>
					<td>商品描述</td>
					
				</tr>
			</thead >
			<!--显示数据列表 -->
			<tbody id="TableData">
				<c:forEach var="tmp" items="${goodsList}">
					<tr align="center" >
						<td class="data">${pageScope.tmp.id}</td>
						<td class="ne">${pageScope.tmp.name}</td>
						<td class="ml">${pageScope.tmp.model}</td>
						<td class="sk">${pageScope.tmp.stock}</td>
						<td class="pe">${pageScope.tmp.price}</td>
						<td class="im"><img src="${pageContext.request.contextPath}/${pageScope.tmp.imagepath}"></td>
						<td class="dp">${pageScope.tmp.descp}</td>
					</tr>
				</c:forEach>
			
				
			</tbody>
		</table>
	</div>
</body>
</html>