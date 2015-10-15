<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
  $("button").click(function(){
    $.post("/Devil666/ex",{
        name:"Donald Duck",
        city:"Duckburg"
      },function(data){
    		$('#message').text(data);
    });
  });
});
</script>
</head>
<body>
<button>Send an HTTP POST request to a page and get the result back</button>
<div id="message"></div>
</body>
</html>