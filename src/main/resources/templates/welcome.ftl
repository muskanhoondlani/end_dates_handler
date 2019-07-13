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
        .wel{
			height:170px;
			width:80%;
			margin-left:125px;
			background:#d1c0c0;
			margin-top:30px;
			box-shadow: 0 0 9px gray;	
		 }
		 .heading{
		 	    margin-left: 75px;
			    font-size: 44px;
			    font-family: initial;
			    padding-top: 37px;
		 }
		 .tag{
		 	    margin-left: 611px;
			    font-size: large;
			    font-family: monospace;
			    padding-top: 16px;
			    color: sienna;
		 }
		 .logcol{
			color: white;
			background: black;
			margin-left: 504px;
		    height: 97px;
		    width: 330px;
		    margin-top: 49px;
		    font-size: larger;
		    font-family: cursive; 
		    
		 }
		 .select{
		 	text-align: center;
		    font-size: xx-large;
		    font-weight: 500;
		    font-family: monospace;
		    margin-top: 42px;
		 }
        
        .back{
			color: white;
			background: #d1c0c0;
			float: right;
		    margin-top: 150px;
    		margin-right: 112px; 
		}	
        </style>
    </head>
    <body>
    	<div class="wel">
    		<h1 class="heading">Welcome to End Dates Handler ${user.fullName}</h1>
    		<p class="tag">Reminds you dates, before they expire.</p>     
    	</div>

    	<p class="select">Select an Option</p>
    	<td><form action="/home/option" method="post">
    	<input type="submit" value="Appliances" class="logcol"></td>
    	</form>
    	<td><form action="">
    	<input type="submit" value="BACK" class="back"></td>
    	</form>
    </body>
</html>