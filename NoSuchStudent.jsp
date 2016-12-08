<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="utf-8"%>
    <jsp:useBean id='cData' scope='session' class='comm.DataBean'/>
   
<html>			<!-- PAURAV SURENDRA G01003778-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Student Details</title>
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
	<h1>Student Details</h1><br/>
    <div>
    <p>Sorry, No student with that ID</p>
    
    </div>
</div>
<div class="err" style="display:none"></div>
 
</body> 
<div class="logo">
  	<a href="https://www2.gmu.edu/" target="_blank"><img src="Images/GMU_logo.jpg"></a>
</div>
</html>
