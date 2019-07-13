<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <title>DatesHandler</title>
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
		    padding-left: 510px;
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
		
		</style>
    </head>
    <body>
<div class="box">
		<center>
        <h2 class="newacc">Sign Up</h2>
        
        	<form action="/test/signup" method="post">
	            <h3 class="user">User Name:</h3>
	            <input type="text" name="userNameSignup" class="fill">
	            <br><br>
	            
	            <h3 class="user">First name:</h3>
	            <input type="text" name="firstName" class="fill">
	            <br><br>
	            <h3 class="user"> Last name:</h3>
	            <input type="text" name="lastName" class="fill">
	            <br><br>
	            
	            <h3 class="user">Email:</h3>
	            <input type="email" name="email" class="fill">
	            <br><br>
	             <h3 class="user">Password:</h3>
	            <input type="password" name="passwordSignup" class="fill">
	            <br><br>
	            <input type="submit" value="Sign Up">
	            <div class="error">
					<tr >
						${(message)!}
					</tr>
				</div>
        	</form>
        </center>
        </div>
  
    </body>
</html>
