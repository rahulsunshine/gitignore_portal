<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
<!-- <h2>$(errorMsg)</h2> -->
<!-- 	<form action="reg" method="post"> -->

	<form action="reg" method="post">

		Eid : <input type="text" name="id" placeholder="enter eid">
		<br><br>

		Name : <input type="text" name="name" placeholder="enter name">
		<br><br>

		Department : <input type="text" name="department" placeholder="enter department">
		<br><br>
<!-- 		Project : <input type="text" name="project" placeholder="enter project">
		<br><br> -->
<!-- 		Location : <input type="text" name="location" placeholder="enter location"> -->
		
		Location : <select type="text" name="location" placeholder="enter location">
			<option>PUNE SEZ QUBIX</option>
			<option>PUNE DTA-BANER</option>
			<option>PUNE SEZ NALANDA</option>
			<option>HYDRABAD</option>
			<option>CHENNAI DTA - GLOBAL INFOCITY</option>
			<option>COIMBATORE</option>
			<option>BANGLORE</option>
		</select>		
		<br><br>

		Suggestion_Category : <select type="text" name="suggestion_Category" placeholder="enter suggestion_Category">
			<option>PROJECT_RELATED</option>
			<option>INNOVATION</option>
			<option>CULTURE</option>
		</select>
		<br><br>

		Suggestion_Description : <input type="text" name="suggestion_Description" placeholder="enter suggestion description">
		<br><br>

		<button type="submit" value="Submit">Submit</button>
	
<!-- <input type="submit" value="Submit"> -->
	</form>
</body>
</html>