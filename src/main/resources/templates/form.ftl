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
			height: 107px;
			background: #686464;
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
		
		.tab{
	
			float: right;
			margin-top: 23px;
			margin-right: 122px;
			color: white;
			font-family: sans-serif;
			font-size: 15px;
			
		}
		.fix{
			height:23px;
			width:175px;
		}
		
		.logcol{
			color: white;
			background: #d1c0c0; 
		}
		
		.box{
			height:450px;
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
			margin-left:42px;
		    position: relative;
	    	bottom: 15px
		}
		
		.user{
			margin-right:260px;
		}
		.forgot{
			color: white;
			background: #d1c0c0;	
			height: 17px;
		    font-size: 10px;
		}
		.error{
			color: red;
			text-align: center;
		    padding-top: 112px;
		    font-size: large;
		    font-weight: bolder;
		    padding-left: 434px;
		}
		.radio{
			position: relative;
   		 	bottom: 12px;
    		left: 18px;
		}
		.gender{
			position: relative;
    		left: 19px;
    		bottom: 13px;
		}
		.sign{
			color: white;
		    background: #d1c0c0;
		    position: relative;
		    top: 313px;
		    right: 483px;
		    padding: 7px;
		    text-decoration: none;
		    font-family: auto;
		    font-weight: 600;
		    text-shadow: 0.5px 0.5px steelblue; 
		}
		.first{
			margin: 97px;
		   font-size: 53px;
		    color: teal;
		    padding-left: 40px;
		    letter-spacing: 0.5px;
		    text-shadow: 0.5px 0.5px lightskyblue;
		    text-align: center;
		}
		.second{
			position: relative;
		    bottom: 65px;
		    font-family: monospace;
		    font-weight: lighter;
		    color: turquoise;
		    text-shadow: 0.5px 0.5px brown;
		    text-align: center;
		}
		.third{
			padding-left: 538px;
		    position: relative;
		    bottom: 25px;
		    font-size: x-large;
		    color: unset;
		}
		
		</style>
    </head>
    <body>
    <div class="header">
		<h1 class="fac">End Dates Handler</h1>
		<form action="/home/login" method="post">
		<table class="tab">
			<tr>
				<td>Username</td>
   			    <td>Password</td>
			</tr>

			<tr>
				<td class="fix"><input type="text" name="userName" required="required"></td>
				<td><input type="password" name="password" required="required"></td>
				<td><input type="submit" name="" value="Login" class="logcol" ></td>
				<td><a href="/signup/getsaveuser"  class="sign">Sign up</a></td>
			</tr>
			
		</table>
		</form>
		
		<div class="error">
		<tr >
				${(error)!}
		</tr>
		</div>
		
	</div>
	
    <div>
    <h1 class="first">Hello, new to End Dates Handler?</h1>
    <h2 class="second">No need to worry, make an account and get started!</h2>
    <h2 class="third">Click here!! </h2>
    </div>  
        
    </body>
</html>
