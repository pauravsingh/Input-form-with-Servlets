<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
<%@ page import="java.util.ArrayList" %>

<html>			<!-- PAURAV SURENDRA G01003778-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>THANK YOU</title>
<link rel="stylesheet" href="css/styles.css" type="text/css">
<link rel="stylesheet" href="css/jquery-ui.css" type="text/css">
<script src="js/jquery.js" type="text/javascript"></script>
<script src="js/jquery-ui.js" type="text/javascript"></script>
<script src="js/survey.js" type="text/javascript"></script>

							
</head>

<body>

<a href="index.html" style="text-decoration:none">
<div class="header" align="center">
	<h2>GEORGE MASON UNIVERSITY</h2>
	<h2>COMPUTER SCIENCE DEPARTMENT</h2>
</div></a>
<div align="right" onClick="setCookie()" style="text-decoration:underline; cursor:pointer; color:#00F">Change Username</div>

<div class="content">
	<h1> SURVEY</h1><br/>
    <div>
    <p>Your data has been saved. <br/>
    	Congrats! You won two movie tickets<br/>
    	Mean = ${cData.mean} <br/>
    	Standard Deviation = ${cData.deviation} 
    </p>
     <% ArrayList<Integer> list = (ArrayList<Integer>)session.getAttribute("list"); %> 
    <ol>
    <% for(Integer sid : list) 
    {
    	out.print("<li><a href=\'/642Assignment/SurveyServelet?id="+sid.intValue()+"\'>"+sid.intValue()+"</a></li>");
    }
     %>
     </ol>
    </div>
</div>
<div class="err" style="display:none"></div>
 
</body> 
<div class="logo">
  	<a href="https://www2.gmu.edu/" target="_blank"><img src="Images/GMU_logo.jpg"></a>
</div>
</html>
