<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>     

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<sf:form modelAttribute="user">
		
		<table border="1">
			<tr>
				<td>Fname: </td>
				<td> <sf:input id="txtFname" path="Fname"/> </td>
			</tr>
			<tr>
				<td>EmailId: </td>
				<td> <sf:input id="txtEmailId" path="emailId"/> </td>
			</tr>
			<tr>
				<td>MobNo: </td>
				<td><sf:input id="txtMobNo" path="MobNo"/> </td> 
			</tr>
			<tr>
				<td>Address: </td>
				<td><sf:input id="txtAddress" path="Address"/> </td>
			</tr>
			<tr>
				<td>Password: </td>
				<td><sf:input id="txtPassword" path="Password"/> </td>
			</tr>
			<tr>
				<td>Cpassword: </td>
				<td><sf:input id="txtCpassword" path="cpassword"/> </td>
			</tr>
			<tr>
				<td colspan="2">
					<input type="submit" value="Register Me" />
				</td>
			</tr>
		</table>
		
	</sf:form>
	
	<br/>
	
	
	<c:if test="${not empty listUser}">
		
		<table border="1">
			
			<thead>
				<tr>
					<th>Fname</th>
					<th>EmailId</th>
					<th>MobNo</th>
					<th>Address</th>
					<th>Password</th>
					<th>Cpassword</th>
				</tr>
			</thead>
			<c:forEach var="user" items="${listUser }">
				
				<tr>
					<td>${user.Fname }</td>
					<td>${user.EmailId }</td>
					<td>${user.MobNo }</td>
					<td>${user.Address }</td>
					<td>${user.Password }</td>
					<td>${user.Cpassword }</td>
				</tr>
				
			</c:forEach>
			
			
		</table>
		
	</c:if>
	
		

</body>
</html>


