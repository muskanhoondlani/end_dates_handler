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
        
        </style>
     </head>
    <body>
        <div class="header">
		<h1 class="fac">Select an Action</h1>
	</div>
    	
    <table class="table">
            <tr>
            	
                <th class="row">Vehicle Name</th>
                <th class="row">Vehicle Specifications</th>
                <th class="row">Vehicle Service Date</th>
                <th class="row">Vehicle Insurance Date</th>
                <th class="row">Price</th>
                <th class="row">Action1</th>
                <th class="row1">Action2</th>
                
            </tr>

            <#list vehicles as vehicle>
                <tr>
                	
                    <td class="entry">${vehicle.vehicleName}</td>
                    <td class="entry">${vehicle.vehicleSpec}</td>
                    <td class="entry">${vehicle.vehicleService}</td>
                    <td class="entry">${vehicle.vehicleInsurance}</td>
                    <td class="entry">${vehicle.vehiclePrice}</td>
                    <td class="entry1"><a href="./editVehicle/${vehicle.id}">EDIT</a></td>
                    <td class="entry1"><a href="./deleteVehicle/${vehicle.id}">DELETE</a></td>
                </tr>
            </#list>
        </table>
    	<table>
			<tr>
			
			<td>
				<form action="/addvehicle" method="GET">
    			<input type="submit" value="Add Vehicle" class="logcol">
    			</form>
			</td>
			
			
			</tr>
	</table>
    </body>
</html>