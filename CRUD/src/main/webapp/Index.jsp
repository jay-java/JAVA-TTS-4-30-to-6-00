<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>
	function check_fname(){
		var f = document.vinform.fname.value;
		var reg = /^[A-Za-z]+$/;
		if(f.trim()==""){
			document.getElementById("errorfname").innerHTML="Please enter your First name";
		}
		else if(!reg.test(f)){
			document.getElementById("errorfname").innerHTML="Please enter only Alphabet";
			
		}else{
			document.getElementById("errorfname").innerHTML="";
		}
	}
	
	function check_lname(){
		var f = document.vinform.lname.value;
		var reg = /^[A-Za-z]+$/;
		if(f.trim()==""){
			document.getElementById("errorlname").innerHTML="Please enter your Last name";
		}
		else if(!reg.test(f)){
			document.getElementById("errorlname").innerHTML="Please enter only Alphabet";
			
		}else{
			document.getElementById("errorlname").innerHTML="";
		}
	}
	
	function check_email(){
		var f = document.vinform.email.value;
		var reg = /^[A-Za-z]+$/;
		if(f.trim()==""){
			document.getElementById("erroremail").innerHTML="Please enter your email";
		}
		else if(!reg.test(f)){
			document.getElementById("erroremail").innerHTML="";
			
		}else{
			document.getElementById("erroremail").innerHTML="";
		}
	}
	
	function check_contact(){
		var f = document.vinform.contact.value;
		var reg = /^[0-9]+$/;
		if(f.trim()==""){
			document.getElementById("errorcontact").innerHTML="Please enter your contact";
		}
		else if(!reg.test(f)){
			document.getElementById("errorcontact").innerHTML="Please enter only Numeric";
			
		}else{
			document.getElementById("errorcontact").innerHTML="";
		}
	}

</script>

</head>
<body>
<script>  
var request=new XMLHttpRequest();  
function searchInfo()
{  
	var name=document.vinform.email.value;  
	var url="AjaxSearch2.jsp?val="+name;  
  	try
  	{  
		request.onreadystatechange=function()
		{  
			if(request.readyState==4)
			{  
				var val=request.responseText;  
				document.getElementById('tops').innerHTML=val;  
			}  
		}  
		request.open("GET",url,true);  
		request.send();  
	}
  	catch(e)
  	{
  		alert("Unable to connect to server");
  	}  
}  
</script>  

<center>
<form action="ActionController" method ="post" name="vinform">
<h1>Registration Form</h1>
	<table>
		<tr>
			<td>Firstname</td>
			<td><input type = "text" name ="fname" onblur="check_fname();"></td>
			<td><span id="errorfname" style="color:red;"></span></td>
		</tr>
		<tr>
			<td>Lastname</td>
			<td><input type = "text" name ="lname" onblur="check_lname();"></td>
			<td><span id="errorlname" style="color:red;"></span></td>
		</tr>
		<tr>
			<td>Email</td>
			<td><input type = "text" name ="email" onblur="searchInfo()" onblur="check_email();"></td>
			<td><span id="tops" style="color:red;"></span> </td>
			<td><span id="erroremail" style="color:red;"></span></td>
		</tr>
		<tr>
			<td>Contact </td>
			<td><input type = "text" name ="contact" onblur="check_contact();"></td>
			<td><span id="errorcontact" style="color:red;"></span></td>
		</tr>
		<tr>
			<td><input type = "Submit" name ="action" value ="Insert"></td>
		</tr>
	</table>
</form>
</center>

</body>
</html>