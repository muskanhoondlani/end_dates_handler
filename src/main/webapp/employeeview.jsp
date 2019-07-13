<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Submitted Employee Information</h2>
    <table>
        <tr>
            <td>Name :</td>
            <td>${username}</td>
        </tr>
        <tr>
            <td>ID :</td>
            <td>${id}</td>
        </tr>
        <tr>
            <td>First Name :</td>
            <td>${firstname}</td>
        </tr>
        <tr>
            <td>Last Name :</td>
            <td>${lastname}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${age}</td>
        </tr>
    </table>

</body>
</html>