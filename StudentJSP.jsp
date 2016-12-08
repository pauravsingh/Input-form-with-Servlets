<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    
<html>			<!-- PAURAV SURENDRA G01003778-->
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>STUDENT DETAIL</title>
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
    <div class="formTable" align="center">
    <table class="formtable" align="center">
    <form action="#" method="POST" autocomplete="on">
    
       	<tr class="field" align="center"><td>STUDENT ID</td></tr>
        <tr align="center"><td>${sData.student_id}</td></tr>
        
        <tr class="field" align="center"><td>NAME</td></tr>
        <tr align="center"><td>${sData.student_name}</td></tr>
    
    	<tr class="field" align="center"><td>STREET ADDRESS</td></tr>
        <tr align="center"><td>${sData.student_address}</td></tr>
    
    	<tr class="field" align="center"><td>CITY</td></tr>
        <tr align="center"><td>${sData.student_city}</td></tr>
    
    	<tr class="field" align="center"><td>STATE</td></tr>
        <tr align="center"><td>${sData.student_state}</td></tr>
    
    	<tr class="field" align="center"><td>ZIPCODE</td></tr>
        <tr align="center"><td>${sData.student_zipcode}<br/><br/><br/></td></tr>
    
    	<tr class="field" align="center"><td>PHONE NUMBER</td></tr>
        <tr align="center"><td>${sData.student_phone}</td></tr>
    
    	<tr class="field" align="center"><td>EMAIL ID</td></tr>
        <tr align="center"><td>${sData.student_email}</td></tr>
    
    	<tr class="field" align="center"><td>URL</td></tr>
        <tr align="center"><td>${sData.student_url}</td></tr>
    
    	<tr class="field" align="center"><td>DATE OF VISIT</td></tr>
        <tr align="center"><td>${sData.student_date}</td></tr>
    
    	<tr class="field" align="center"><td>BEST FEATURES </td></tr>
        <tr align="center"><td>${sData.gmu_features}</td></tr>
   
    	<tr class="field" align="center"><td>FOUND COLLEGE VIA</td></tr>
        <tr align="center"><td>${sData.student_source}<br/><br/><br/></tr>
    
    	<tr class="field" align="center"><td>GRAD DATE</td></tr>
        <tr align="center"><td>${sData.student_grad}</td></tr>
    
    	<tr class="field" align="center"><td>RECOMMEND COLLEGE</td></tr>
        <tr align="center"><td>${sData.student_recom}</td></tr>
    
    	<tr class="field" align="center"><td>ANY COMMENTS</tr>
    	<tr align="center"><td>${sData.student_comments}</td></tr>
    
       </form>
   </table> 
 </div>
</div>
<div class="err" style="display:none"></div>
 
</body> 
<div class="logo">
  	<a href="https://www2.gmu.edu/" target="_blank"><img src="Images/GMU_logo.jpg"></a>
</div>
</html>
