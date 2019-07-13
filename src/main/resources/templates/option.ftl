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
         .logcol{
			    color: white;
			    background: black;
			    margin-left: 605px;
			    height: 46px;
			    width: 202px;
			    margin-top: 60px;
			    font-size: larger;
			    font-family: cursive;
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
		.table{
			border: 1px solid black;
			margin-left: 240px;
		    margin-top: 90px;
		    padding: 10px;
		}
        .row{
        	    border-bottom: 1px solid black;
			    padding: 7px;
			    border-right: 1px solid black;
        }
        .row1{
        		border-bottom: 1px solid black;
			    padding: 7px;
        }
        .entry{
        	    text-align: center;
			    padding: 5px;
			    border-right: 1px solid black;
        }
        .entry1{
        		text-align: center;
			    padding: 5px;
        }
        .back{
			color: white;
			background: #d1c0c0;
			position: relative;
    left: 329px;
    top: 210px; 
		}	
        
        </style>
     </head>
    <body>
        <div class="header">
		<h1 class="fac">Select an Action</h1>
	</div>
    	
    <table class="table">
            <tr>
            	
                <th class="row">Appliance Name</th>
                <th class="row">Appliance Specifications</th>
                <th class="row">Appliance Service Date</th>
                <th class="row">Appliance Warranty Date</th>
                <th class="row">Price</th>
                <th class="row">Action1</th>
                <th class="row1">Action2</th>
                
            </tr>

            <#list appliances as appliance>
                <tr>
                	
                    <td class="entry">${appliance.applianceName}</td>
                    <td class="entry">${appliance.applianceSpec}</td>
                    <td class="entry">${appliance.applianceService}</td>
                    <td class="entry">${appliance.applianceWarranty}</td>
                    <td class="entry">${appliance.appliancePrice}</td>
                    <td class="entry1"><a href="/home/editAppliance/${appliance.id}">EDIT</a></td>
                    <td class="entry1"><a href="/home/deleteAppliance/${appliance.id}">DELETE</a></td>
                </tr>
            </#list>
        </table>
    	<table>
			<tr>
			
			<td>
				<form action="/home/add" method="GET">
    			<input type="submit" value="Add Appliance" class="logcol">
    			</form>
			</td>
			<td><form action="">
    	<input type="submit" value="BACK" class="back"></td>
    	</form>
			
			</tr>
	</table>
    </body>
</html>