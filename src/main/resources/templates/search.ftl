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
			height:210px;
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
        </style>
     </head>
    <body>
    <div class="header">
		<h1 class="fac">Search an Entry</h1>
	</div>
	
	<div class="box">
		<center>
        <h2 class="newacc">Search ENTRY</h2>
        	<form action="/search" method="POST">
	            <h3 class="user">Name of Appliance:</h3>
	            <input type="text" name="applianceName" class="fill">
	            <br><br>
	            
	            <input type="submit" value="SEARCH">
        	</form>	
 
        </center>
        </div>
     </body>
</html>