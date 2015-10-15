<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/css; charset=iso-8859-1">
<style type="text/css"><%@ include file="css/ghar.css" %></style>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js">
</script>
<script><%@ include file="javascript/ghar.js" %></script>
<title>hello world</title>
<style>

</style>
</head>
<body style="">
<div id= "main_page">

	<div id= "top">
	
		<div id= "first">
			<img src="http://th09.deviantart.net/fs71/PRE/f/2011/071/2/2/devil_born_from_flame__by_chevsy-d1qjd9i.jpg" alt="devil" width="66px" height="60px">
		</div>
		<div id= "second">
			<p><font size="5" color="white">DEVIL666!</font></p>
		</div>
		
		<div id= "center-header" >
			<p><font size="5" color="black">"THE DIMPLE ON THE CHIN, THE DEVIL WITHIN"</font></p>
		</div>
		
		<div id= "last">
			<p><font size="4" color="white">WELCOME SINNER !!</font></p>
		</div>
		
		<div id = "lastpart">
			<a href="http://localhost:8080/Devil666/taketo">LOGOUT SINNER</a>
		</div>
	</div>
	
	<div id= "centre">
	
		<div id= "centre-first">
			<img src="http://desktop.freewallpaper4.me/view/original/5904/jesus-and-the-devil.jpg" alt="devil" width="200" height="150">
			<p id= "para">CHANGE AVTAR</p>
			<span>MY <span style="color:red">SINNERS</span> BUDDIES</span></br>
			<span>MY <span style="color:red"> HELL</span> GALLERY</span></br>
			<span>MY <span style="color:red"> HELL</span> VIDEOS</span>
		</div>
		
		<div id= "centre-middle">
			<div id= "wall-post">
				<form action="">
					<input type="button" value="ADD POST">
					<input type="button" value="UPLOAD IMAGE"><br>
				</form>
				<textarea rows="4" cols="60" id="textarea"></textarea>
				<form action="">
					<input type="button" value="POST" id= "post"> 
				</form>
			</div>
			
			<div id= "wall-comments">
				<%= (String) request.getAttribute("postDivs")  %>
				
				<input type="hidden" id="totalCount" value="<%= request.getAttribute("values")%>">
			</div>
		</div>
		
		<div id= "centre-last">
			adsasdas
		</div>
	</div>
		
	
	<div id= "end">
		<p><font size="5" color="black">Hell End - all rights reserved</font></p>
	</div>
	
</div>	
</body>
</html>