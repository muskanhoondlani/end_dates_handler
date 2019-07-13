<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>DatesHandler</title>
        <link href="/css/main.css" rel="stylesheet">
        <script src="/js/main.js"></script>
         <style>
        *{
			margin: 0px;
		 }
        .header{
			height: 90px;
			background: #ada2a2;
		}

		.fac{
 			color: white;
			font-family: sans-serif;
			font-size: 38px;
			margin-top: 23px;
			margin-left: 144px;
			width: 500px;
			float: left;
			cursor: pointer;

		}
		.box{
			height:400px;
			margin-top:150px;
			background: linear-gradient(to top, #686464,#ede6e6);
   			width: 40%;
  		    margin-left:400px;
  		    line-height:15px;
  		    box-shadow: 0 0 9px gray;
		}
		
		.newacc{
			color:black;
			margin-top: -85px;
		    padding-bottom: 44px;
		    padding-top: 34px;
		    font-size: xx-large;
		    letter-spacing: 1px
		}
		.fill{
		left:60px;
	    position: relative;
    	bottom: 15px;
    	height: 15px;
    	width: 161px;
		}
		
		.user{
			margin-right:260px;
		}
		.button{
			position: relative;
		    left: 100px;
		    bottom: 21px;
		}
	
        </style>
     </head>
    <body>
    <div class="header">
		<h1 class="fac">Add an Entry</h1>
	</div>
	<div class="box">
		<center>
        <h2 class="newacc">NEW ENTRY</h2>
        <#if appliance?? >
	        Your submitted data<br>
	        User name: ${appliance.applianceName}<br>
	        First name: ${appliance.applianceSpec}<br>
	        Last name: ${appliance.applianceService}<br>
	        Gender: ${appliance.applianceWarranty}<br>
	        Password: ${appliance.appliancePrice}<br>
        <#else>
        	<form action="/appliance/add" method="POST">
	            <h3 class="user">Name of Appliance:</h3>
	            <input type="text" name="applianceName" class="fill">
	            <br><br>
	            
	            <h3 class="user">Specifications:</h3>
	            <input type="text" name="applianceSpec" class="fill">
	            <br><br>
	            <h3 class="user">Service Date:</h3>
	            <input type="date" name="applianceService" class="fill">
	            <br><br>
	             <h3 class="user">Warranty ends on:</h3>
	            <input type="date" name="applianceWarranty" class="fill">
	            <br><br>
	             <h3 class="user">Price:</h3>
	            <input type="text" name="appliancePrice" class="fill">
	            <br><br>
	            <input type="submit" value="ADD">
        	</form>	
        	<form action="/option" method="post">
    			<input type="submit" value="BACK" class="button">
    		</form>
        </#if>
        </center>
        </div>
     </body>
</html>