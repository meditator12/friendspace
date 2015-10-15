<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/css; charset=iso-8859-1">
<style type="text/css"><%@ include file="css/reg.css" %></style>
<script><%@ include file="javascript/regist.js" %></script>
<title>sign-in page</title>
<style>
 
</style>
</head>
<body style="">
<div id= "main">
	<div id= "first" >
		WORLD OF <span style="color:white">HELL666</SPAN> WELCOMES YOU!! 
	</div>
	
	<div id= "second">NEW SINNER SIGNING TO HELL:
		<form name="myForm"  onsubmit="return validateForm()" action="/Devil666/registration" method= "post">
			
			<!--div style="width:600px; float:left;">
				<div style="width:100%; float:left;">
					<div style="width:30%; float:left;"><label for="firstname">First name:</label></div>
					<div style="width:30%; float:left;"><input type="text" name="firstname" value= "" /></div>
					<div style="width:30%; float:left;">sadsad</div>
				</div>
			</div-->
			
			<table align= "center">
				<tr >
					<td><label for="firstname">First name:</label></td>
					<td><input type="text" name="firstname" value= "" /></td>
					<td></td>
				</tr>
				
				<tr>
					<td><label for="lastname">Last name: </label></td>
					<td><input type="text" name="lastname" value= ""><br></td>
					<td></td>
				</tr>
				
				<tr>
					<td><label for="pwd">Password: </label></td>
					<td><input type="password" name="pwd" value=""><br></td>
					<td></td>
				</tr>
				
				<tr>
					<td><label for="cpwd">Confirm Password: </label></td>
					<td><input type="password" name="cpwd" value= ""><br></td>
					<td></td>
				</tr>
				
				<tr>
					<td><label for="male">Gender:</label></td>
					<td><input type="radio" name="sex" id="male" value="male">male
						<label for="female"></label>
						<input type="radio" name="sex" id="female" value="female">female<br></td>
					<td></td>
				</tr>
				
				<tr>
					<td><label for="E-mailid">E-Mail ID: </label></td>
					<td><input type="text" name="E-mailid"><br></td>
					<td></td>
				</tr>
				
				<tr>
					<td>vehicle:</td>
					<td><input type="checkbox" name="vehicle" value="bike">bike
						<input type="checkbox" name="vehicle" value="car">car
						<input type="checkbox" name="vehicle" value="other">other<br>
						
					</td>
					<td></td>
				</tr>
			</table>
			 
			<input type="submit" value="Submit" >
			<a href="file:///C:/Users/user/Desktop/main_page.html">back to hell page</a>
			
		</form>
	</div>
	
	<div id= "third">
		<p> HELL TRADEMARK: ALL RIGHTS RESRVED </p>
	</div>
</div>
</body>
</html>