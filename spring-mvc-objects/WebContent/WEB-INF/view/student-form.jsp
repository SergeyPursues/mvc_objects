<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>Student List</title>
</head>

<body>

	<table>
		<tr> 
			<th>First Name</th>
			<th>Last Name</th>
			<th>Country</th>
			<th>Hobby</th>
			<th>Favorite Language</th>
			<th>Favorite Number</th>
		</tr>
		<c:forEach items="${studentList}" var="object">
    	<tr>
        	<td>${object.firstName}</td>
        	<td>${object.lastName}</td>
        	<td>${object.country}</td>
        	<td>${object.hobby}</td>
        	<td>${object.favoriteLanguage}</td>
        	<td>${object.favoriteNumber}</td>
    	</tr>
		</c:forEach>
	</table>
		

</body>

</html>
