// JavaScript Document

function Avg(data)
{
	var numbers = data.split(',');
	if(numbers.length == 10)
	{
	 for(var i=0;i<10;i++)
		{
			if(!(numbers[i] > 0 && numbers[i] <= 100))
				{
				alert("Please enter 10  digits within 1-100");
				return false;
				}
		}
	}
	else
	{
		alert("Please enter 10  digits within 1-100 seperated by commas");
		return false;
	}
	var avg = parseInt(numbers[0],10);
	var maxNum =  parseInt(numbers[0],10);
	for(var i=1;i<10;i++)
	{
		avg +=  parseInt(numbers[i],10)
		if(maxNum < numbers[i])
		{
			maxNum = parseInt(numbers[i],10);
			
		}
	}
	avg = avg/10;
	document.getElementById('avg').innerHTML = avg;
	document.getElementById('max').innerHTML = maxNum;
	
}

function validate()
{
	var name =document.getElementsByName('name').item(0).value;
	var street =document.getElementsByName('address').item(0).value;	
	var city =document.getElementsByName('city').item(0).value;
	var state =document.getElementsByName('state').item(0).value;
	var zip =document.getElementsByName('zipcode').item(0).value;
	var email =document.getElementsByName('email').item(0).value;
	var checkbox =document.getElementsByName('feature');
	var radio =document.getElementsByName('source');
	var errmsg = '';
	if(!name.search(/^[a-zA-Z ]*$/g)==0)
	{
		errmsg += "Name should contain only alphabets; ";
		document.getElementsByName('name').item(0).value = '';
	}
	if(!street.search(/^[a-zA-Z0-9 ]*$/g)==0)
	{
		errmsg += "Street Addres should contain only alphabets and numbers; ";
		document.getElementsByName('address').item(0).value = '';
	}
	if(!city.search(/^[a-zA-Z ]*$/g)==0)
	{
		errmsg += "City should contain only alphabets; ";
		document.getElementsByName('city').item(0).value = '';
		
	}
	if(!state.search(/^[a-zA-Z]*$/g)==0)
	{
		errmsg += "State should contain only alphabets; ";
		document.getElementsByName('state').item(0).value = '';
		
	}
	if(!zip.search(/^[0-9]{1,6}$/g)==0)
	{
		errmsg += "Zipcode should contain only Numbers; ";
		document.getElementsByName('zipcode').item(0).value = '';
		
	}
	if(!email.search(/^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{1,4}$/g)==0)
	{
		errmsg += "Entered email is not of valid format; ";
		document.getElementsByName('email').item(0).value = '';
		
	}
	
	checkedItems=0;
	for(var i =0;i<checkbox.length;i++)
	{
		if(checkbox[i].checked)
		{
			checkedItems++;
		}
	}
	if(checkedItems < 2)
	{
		errmsg += "Select atleast 2 best features about GMU; ";
		
	}
	
	
	isRadio = false;
	for(var i =0;i<radio.length;i++)
	{
		if(radio[i].checked)
		{
			isRadio = true;
		}
	}
	if(!isRadio)
	{
		errmsg += "Select the how did you find out about GMU; ";
		
	}
	if(errmsg.length>1)
	{	
		$(".err").text(errmsg);
		$(".err").dialog({modal:true});
		return false;
	}
	return true;
}
	
	
function setCookie()
{
	var userName = prompt("Enter your name",'');
	if(userName != null && userName != '')
		{
			var date = new Date();
 			date.setTime(date.getTime() + (30*24*60*60*1000));
			document.cookie = "username="+userName+"; expires="+ date.toUTCString()+";";
			welcomeUser();
		}
	else
		alert("No name was entered");
}

function welcomeUser()
{
	var cookie = document.cookie.split(';')[0];

	if(cookie == "")
	{
		setCookie();
	}
	else 
	{   
		if(cookie.split('=')[0] == 'username')
		{
			var userName = cookie.split('=')[1];
			var date = new Date();
			var currentTime = date.toTimeString();
			var hours = currentTime.substring(0,2);
			hours = parseInt(hours,10);
			if( hours > 05 && hours < 12 )
				var greet = "Good Morning "+userName;
			else if( hours >=12 && hours < 17)
		 		var greet = "Good Afternoon "+userName;
			else if( hours >=17 || hours < 05)
				var greet = "Good Evening "+userName;
		 
		alert(greet);
		}
		else
		{
		 setCookie();
		}
	}
}

function zipCheck(zipCode)
{
	$.ajax({
			url:'zipcodes.json',
			type:'POST',
			dataType:'json',
			success: function(response){ 
											for(var i=0;i<4;i++)
											{
												if(parseInt(zipCode,10) == parseInt(response.zipcodes[i].zip,10))
												{
													document.getElementsByName('city').item(0).value = response.zipcodes[i].city;
													document.getElementsByName('state').item(0).value = response.zipcodes[i].state;
												}
											}
										}
	});
}
										

