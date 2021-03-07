<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">



<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
<!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
        <![endif]-->
<title>Registration Page</title>
<link
	href="C:\Users\hemanth\Desktop/registration/assets/css/bootstrap.css"
	rel="stylesheet" />
<link
	href="C:\Users\hemanth\Desktop/registration/assets/css/font-awesome.min.css"
	rel="stylesheet" />
<link href="C:\Users\hemanth\Desktop/registration/assets/css/style.css"
	rel="stylesheet" />
<link href='http://fonts.googleapis.com/css?family=Open+Sans'
	rel='stylesheet' type='text/css' />

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">


<script>
function alphaMatch(alpha)
{ 
    var letters = /^[A-Za-z_ ]+$/;
    
   if(document.getElementById(alpha).value.match(letters))                         /* Alphabet Match */        
    {
       return ;
    }

    else
    {
     	if (document.getElementById(alpha).value === "")
		  {
			     return;
      }
    	else 
      {
        	alert('Use alphabet characters only');
          document.getElementById(alpha).value = "";
          document.getElementById(alpha).focus();
      }
    }
}

function Year(year)
{ 
    var letters = /^(\d{1,2})\/(\d{1,2})\/(\d{2,4})$/;
    

    if(document.getElementById(year).value.match(letters))                          /* Year Range - 1900 to 2099*/                      
    {
       return ;
    }

    else
    {
      if (document.getElementById(year).value === "")
    {
      return;
      
    }
    else
        {
          alert('Invalid Year');
          document.getElementById(year).value = "";
          document.getElementById(year).focus();
        }
    }
}



function Paragraph(para)
{ 
    var letters = /^([\s\.]?[a-zA-Z]+)+$/;
    

    if(document.getElementById(para).value.match(letters))                       /*  Paragraph */                
    {
       return ;
    }

    else
    {
      if (document.getElementById(para).value === "")
      {
      return;
      }
      else
      {
          alert('Wrong Format');
          document.getElementById(para).value = "";
          document.getElementById(para).focus();
      }
    }
}



function Address(address)
{ 
     var letters = /^[#.0-9a-zA-Z\s,-]+$/;
  if(document.getElementById(address).value.match(letters))                          /* Address */
   {
       return ;
   }
   else
   {
      if (document.getElementById(address).value === "")
      {
        return;
      }
      else
      {
        alert('Wrong address format');
        document.getElementById(address).value = "";
        document.getElementById(address).focus();
      }
   }
}







function PinCode(pincode)
{
  var pin = /^[1-9][0-9]{5}$/;;

  if(document.getElementById(pincode).value.match(pin))                                /* Pin code */
  {
      return;
  }

  else
  {
    if (document.getElementById(pincode).value === "")
    {
      return;    
    }
    else
    {
       alert("Not a valid Pin");
       document.getElementById(pincode).value = "";
       document.getElementById(pincode).focus();
    }
  }
}



function DotSpace(dotspace)
{
  var pin = /^([\s\.]?[a-zA-Z]+)+$/;

  if(document.getElementById(dotspace).value.match(pin))                               /* Dots and Spaces */ 
  {
      return;
  }

  else
  {
    if (document.getElementById(dotspace).value === "")
    {
      return;    
    }
    else
    {
       alert("Incorrect format");
       document.getElementById(dotspace).value = "";
       document.getElementById(dotspace).focus();
    }
  }
}



function Marks(marks)
{
 
  if (document.getElementById(marks).value === "")
  {
      return;    
  }

  else if(isNaN(document.getElementById(marks).value))                                          /* Marks */
  {
    alert("Not a Number");
    document.getElementById(marks).value = "";
    document.getElementById(marks).focus();
  }

  else if((document.getElementById(marks).value > 100) ||  (document.getElementById(marks).value <= 0))                               
  {
      alert("Not within the range 1-100");
      document.getElementById(marks).value = "";
      document.getElementById(marks).focus();
  }
}

function dateFunction(dat)                                                                   /* Date Onload Function */
{
  document.getElementById(dat).valueAsDate = new Date();
</script>
<!-- jQuery library -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>



</head>



<body>
<script>
function alphaMatch(alpha)
{ 
    var letters = /^[A-Za-z_ ]+$/;
    
   if(document.getElementById(alpha).value.match(letters))                         /* Alphabet Match */        
    {
       return ;
    }

    else
    {
     	if (document.getElementById(alpha).value === "")
		  {
			     return;
      }
    	else 
      {
        	alert('Use alphabet characters only');
          document.getElementById(alpha).value = "";
          document.getElementById(alpha).focus();
      }
    }
}


function Phone(num)
{
  var phoneno = /^\d{10}$/;

  if(document.getElementById(num).value.match(phoneno))                                 /* Phone Number */
  {
      return true;
  }

  else
  {
    if(document.getElementById(num).value === "")
    {
        return;
    }
    else  
    {
      alert("Not a valid Phone Number");
      document.getElementById(num).value = "";
      document.getElementById(num).focus();
    }
  }
}
</script>

	<div class="container">
		<div class="jumbotron">
			<div class="row text-center pad-top ">
				<div class="col-md-12">
					<img src="http://www.chg.res.in/images/CHG%20LOGO.png"
						class="img-rounded" height="200" width="500">
					<h3>
						<b>APPLICATION FORM</b>
					</h3>
					<h4>
						<b>M.Sc in Human Disease Genetics</b>
					</h4>
					<h6>(Degree to be awarded by Mysore University)</h6>
				</div>
			</div>
		</div>




		<div class="row  pad-top">

			<div
				class="col-md-12 col-md-offset-0 col-sm-20 col-sm-offset-1 col-xs-10 col-xs-offset-1">

				<div class="panel panel-default">
					<div class="panel-heading text-center">
						<strong> Student Registration </strong>
					</div>
					<div class="panel-body">
						<form action="Class" method="Post" enctype="multipart/form-data">
							<br />
							<div class="form-group input-group">
								<span class="input-group-addon"><b>Full Name*</b></span> 
								<input type="text" class="form-control" name="Name" id="Name" onblur = "alphamatch('Name')">
</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Date of Birth*</b></span>
								<div class="col-10">
									<input class="form-control" type="date" name="DOB" id="DOB"
										onblur="year('DOB')" required>
								</div>
							</div>


							<div class="form-group input-group">
								<span class="input-group-addon"><b>Gender*</b></span> &emsp; <input
									type="radio" class="form-check-input" name="Gender" id="Gender"
									value="Male" required>Male &emsp; <input type="radio"
									class="form-check-input" name="Gender" id="Gender"
									value="Female" required>Female
							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Category*</b></span> &emsp; <input
									type="radio" class="form-check-input" name="Category"
									id="Category" value="General" required>General &ensp; <input
									type="radio" class="form-check-input" name="Category"
									id="Category" value="SC/ST/OBC" required>SC/ST/OBC <br />(Certificate
								to be provided for SC/ST/OBC)
							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Address 1*</b></span>
								<textarea class="form-control" name="Address" id="Address"
									rows="3" placeholder="Permanent Address" required></textarea>
							</div>



							<div class="form-group input-group">
								<span class="input-group-addon"><b>City*</b></span> <input
									type="text" class="form-control" name="City" id="City"
									onblur="alphaMatch('City')" required />
							</div>



							<div class="form-group input-group">
								<span class="input-group-addon"><b>Pin Code*</b></span> <input
									type="number" class="form-control" name="PinCode" id="PinCode"
									onblur="Pincode('Pincode')" required />
							</div>



							<div class="form-group input-group">
								<span class="input-group-addon"><b>State*</b></span> <select
									class="form-control" name="State" id="State">
									<option value="">------------Select State------------</option>
									<option value="Andaman and Nicobar Islands">Andaman
										and Nicobar Islands</option>
									<option value="Andhra Pradesh">Andhra Pradesh</option>
									<option value="Arunachal Pradesh">Arunachal Pradesh</option>
									<option value="Assam">Assam</option>
									<option value="Bihar">Bihar</option>
									<option value="Chandigarh">Chandigarh</option>
									<option value="Chhattisgarh">Chhattisgarh</option>
									<option value="Dadra and Nagar Haveli">Dadra and Nagar
										Haveli</option>
									<option value="Daman and Diu">Daman and Diu</option>
									<option value="Delhi">Delhi</option>
									<option value="Goa">Goa</option>
									<option value="Gujarat">Gujarat</option>
									<option value="Haryana">Haryana</option>
									<option value="Himachal Pradesh">Himachal Pradesh</option>
									<option value="Jammu and Kashmir">Jammu and Kashmir</option>
									<option value="Jharkhand">Jharkhand</option>
									<option value="Karnataka">Karnataka</option>
									<option value="Kerala">Kerala</option>
									<option value="Lakshadweep">Lakshadweep</option>
									<option value="Madhya Pradesh">Madhya Pradesh</option>
									<option value="Maharashtra">Maharashtra</option>
									<option value="Manipur">Manipur</option>
									<option value="Meghalaya">Meghalaya</option>
									<option value="Mizoram">Mizoram</option>
									<option value="Nagaland">Nagaland</option>
									<option value="Orissa">Orissa</option>
									<option value="Pondicherry">Pondicherry</option>
									<option value="Punjab">Punjab</option>
									<option value="Rajasthan">Rajasthan</option>
									<option value="Sikkim">Sikkim</option>
									<option value="Tamil Nadu">Tamil Nadu</option>
									<option value="Tripura">Tripura</option>
									<option value="Uttaranchal">Uttaranchal</option>
									<option value="Uttar Pradesh">Uttar Pradesh</option>
									<option value="West Bengal">West Bengal</option>
								</select>
							</div>






							<div class="form-group input-group">
								<span class="input-group-addon"><b>Country*</b></span> <input
									type="text" class="form-control" name="Country" id="Country"
									onblur="alphaMatch('Name')" required />
							</div>



							<div class="form-group input-group">
								<span class="input-group-addon"><b>Address 2</b></span>
								<textarea class="form-control" name="CAddress" id="CAddress"
									rows="3" placeholder="Correspondance Address"></textarea>
							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Mobile No.*</b></span> <input
									type="number" class="form-control" name="Mobile" id="Mobile"
									placeholder="10-digit Number" onblur="Phone('Mobile')" required />
							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>E-Mail*</b></span> <input
									type="email" class="form-control" name="Mail" id="Mail"
									placeholder="abc@example.com" required />
							</div>



							<div class="form-group input-group">
								<span class="input-group-addon"><b>Exam Date*</b></span> <select
									class="form-control" name="ExamDate" id="ExamDate">
									<option>1</option>
									<option>2</option>
									<option>3</option>
									<option>4</option>
								</select>
							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Interview Process*</b></span>
								&emsp;<input type="radio" class="btn btn-info" name="Interview"
									id="Interview" value="In Person" data-toggle="collapse"
									data-target="#DD" required />In Person &emsp;<input
									type="radio" class="btn btn-info" name="Interview"
									id="Interview" value="Through Skype" data-toggle="collapse"
									data-target="#Skype" required />Through Skype
								<div id="Skype" class="panel-collapse collapse">
									<div class="form-group input-group">
										<span class="input-group-addon"><b>Skype-ID</b></span> <input
											type="text" class="form-control" name="SkypeID" id="SkypeID" />
									</div>
								</div>
							</div>



							<!-- <select class="form-control" name="Interview" id="Interview" >
    					<option>In Person?</option>
    					<option>Through Skype?</option>
  					</select>
					</div>


					<div class="form-group input-group">
                                        <span class="input-group-addon"><b>Skype-ID</b></span>
                                        <input type="text" class="form-control" name="SkypeID" id="SkypeID" />
                                        </div> -->



							<div class="form-group input-group">
								<span class="input-group-addon"><b>Hostel
										Accomodation*</b></span>&emsp; <input type="radio"
									class="form-check-input" name="Hostel" id="Hostel" value="Yes"
									required>Yes &emsp; <input type="radio"
									class="form-check-input" name="Hostel" id="Hostel" value="No"
									required>No
							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>NRI/Foreign
										Student*</b></span>&emsp; <input type="radio" class="form-check-input"
									name="NRI" id="NRI" value="Yes" required>Yes &emsp; <input
									type="radio" class="form-check-input" name="NRI" id="NRI"
									value="No" required>No <br /> (If yes, please attach
								supporting documents)
							</div>



							<div class="form-group input-group">
								<span class="input-group-addon"><b>Academic Details*</b></span>
								<table class="table table-striped">
									<thead>
										<tr>
											<th>Sl No.</th>
											<th>Examination</th>
											<th>Name of the Institution</th>
											<th>Board</th>
											<th>Percentage</th>
											<th>Year of Passing</th>
										</tr>
									</thead>
									<tbody>
										<tr>
											<td>1</td>
											<td>SSLC/Class X</td>
											<td><input type="text" class="form-control"
												name="SSLC_OrgiName" maxlength="30" id="SSLC_OrgiName"
												required /></td>
											<td><input type="text" class="form-control"
												name="SSLC_Board" maxlength="30" id="SSLC_Board" required /></td>
											<td><input type="text" class="form-control"
												name="SSLC_Percentage" maxlength="30" id="SSLC_Percentage"
												required /></td>
											<td><input type="number" class="form-control"
												name="SSLC_YOP" maxlength="30" id="SSLC_YOP" required /></td>
										</tr>
										<tr>
											<td>2</td>
											<td>HSC/PUC/Class XII</td>
											<td><input type="text" class="form-control"
												name="PUC_OrgiName" maxlength="30" id="PUC_OrgiName"
												required /></td>
											<td><input type="text" class="form-control"
												name="PUC_Board" maxlength="30" id="PUC_Board" required /></td>
											<td><input type="text" class="form-control"
												name="PUC_Percentage" maxlength="30" id="PUC_Percentage"
												required /></td>
											<td><input type="number" class="form-control"
												name="PUC_YOP" maxlength="30" id="PUC_YOP" required /></td>
										</tr>

										<tr>
											<td>3</td>
											<td>Graduation</td>
											<td><input type="text" class="form-control"
												name="Grad_OrgiName" maxlength="30" id="Grad_OrgiName"
												required /></td>
											<td><input type="text" class="form-control"
												name="Grad_Board" maxlength="30" id="Grad_Board" required /></td>
											<td><input type="text" class="form-control"
												name="Grad_Percentage" maxlength="30" id="Grad_Percentage"
												required /></td>
											<td><input type="number" class="form-control"
												name="Grad_YOP" maxlength="30" id="Grad_YOP" required /></td>
										</tr>

										<tr>
											<td>4</td>
											<td>Any Other Exam</td>
											<td><input type="text" class="form-control"
												name="Other_OrgiName" id="Other_OrgiName" /></td>
											<td><input type="text" class="form-control"
												name="Other_Board" id="Other_Board" /></td>
											<td><input type="text" class="form-control"
												name="Other_Percentage" id="Other_Percentage" /></td>
											<td><input type="number" class="form-control"
												name="Other_YOP" id="Other_YOP" /></td>
										</tr>
									</tbody>
								</table>
							</div>


							<div class="form-group input-group">
								<span class="input-group-addon"><b>Work Experience*</b></span> <input
									type="radio" class="btn btn-info" name="Experience" value="Yes"
									data-toggle="collapse" data-target="#Yes" required />Yes
								<div id="Yes" class="panel-collapse collapse">
									<table class="table table-striped">
										<thead>
											<tr>
												<th>Sl No.</th>
												<th>Name of Organisation</th>
												<th>Designation</th>
												<th>Period Of Service</th>

											</tr>
										</thead>
										<tbody>
											<tr>
												<td>1</td>
												<td><input type="text" class="form-control"
													name="Orgi1" maxlength="30" id="Orgi1" /></td>
												<td><input type="text" class="form-control"
													name="Designation1" maxlength="30" id="Designation1" /></td>
												<td><input type="text" class="form-control" name="POS1"
													maxlength="30" id="POS1" /></td>
											</tr>

											<tr>
												<td>2</td>
												<td><input type="text" class="form-control"
													name="Orgi2" maxlength="30" id="Orgi2" /></td>
												<td><input type="text" class="form-control"
													name="Designation2" maxlength="30" id="Designation2" /></td>
												<td><input type="text" class="form-control" name="POS2"
													maxlength="30" id="POS2" /></td>
											</tr>


											<tr>
												<td>3</td>
												<td><input type="text" class="form-control"
													name="Orgi3" maxlength="30" id="Orgi3" /></td>
												<td><input type="text" class="form-control"
													name="Designation3" maxlength="30" id="Designation3" /></td>
												<td><input type="text" class="form-control" name="POS3"
													maxlength="30" id="POS3" /></td>
											</tr>
									</table>
									</tbody>
									</table>
								</div>


								<input type="radio" class="btn btn-info" value="No"
									name="Experience" required />No
							</div>
							<!-- <input type="radio" class="form-check-input" name="Experience" id="Experience" value="No"  >No
<br/>
 -->

							<!-- <table class="table table-striped">
    <thead>
      <tr>
        <th>Sl No.</th>
        <th>Name of Organisation</th>
        <th>Designation</th>
        <th>Period Of Service</th>
        
</tr>
    </thead>
    <tbody>
     <tr>
<td>1</td>
<td><input type="text" class="form-control"name="Orgi1" maxlength="30" id="Orgi1" /></td>
<td><input type="text" class="form-control"name="Designation1" maxlength="30" id="Designation1" /></td>
<td><input type="text" class="form-control"name="POS1" maxlength="30" id="POS1" /></td>
</tr>

<tr>
<td>2</td>
<td><input type="text" class="form-control"name="Orgi2" maxlength="30" id="Orgi2"/></td>
<td><input type="text" class="form-control"name="Designation2" maxlength="30" id="Designation2"/></td>
<td><input type="text" class="form-control"name="POS2" maxlength="30" id="POS2"/></td>
</tr>


<tr>
<td>3</td>
<td><input type="text" class="form-control"name="Orgi3" maxlength="30" id="Orgi3"/></td>
<td><input type="text" class="form-control"name="Designation3" maxlength="30" id="Designation3"/></td>
<td><input type="text" class="form-control"name="POS3" maxlength="30" id="POS3"/></td>
</tr>
</table>
    </tbody>
  </table>
</div> -->




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Name And Address
										of the <br /> Academic Institution Last attended*
								</b></span>
								<textarea class="form-control" name="NA_LastAttended"
									id="NA_LastAttended" rows="3"
									placeholder="Institution Name and Address" required></textarea>
							</div>


							<div class="form-group input-group">
								<span class="input-group-addon"><b>Source from where
										you first learned <br />about CHG's M.Sc. admissions*
								</b></span> &emsp; <input type="radio" class="form-check-input"
									name="Source" id="Source" value="CurrentScience" required />Current
								Science &emsp; <input type="radio" class="form-check-input"
									name="Source" id="Source" value="CHG_Website" required />CHG
								Website &emsp; <input type="radio" class="form-check-input"
									name="Source" id="Source" value="CHG_Poster" required />CHG
								Poster &emsp; <br /> &emsp; <input type="radio"
									class="form-check-input" name="Source" id="Source"
									value="Newspaper" required />Newspaper &emsp; <input
									type="radio" class="form-check-input" name="Source" id="Source"
									value="Other" required />Other &emsp;

							</div>




							<div class="form-group input-group">
								<span class="input-group-addon"><b>Payment Mode*</b></span> <input
									type="radio" class="btn btn-info" name="Mode" value="DD"
									data-toggle="collapse" data-target="#DD" required />DD
								<div id="DD" class="panel-collapse collapse">
									<div class="form-group input-group">
										<span class="input-group-addon"><b>DD Information*</b></span>
										<table class="table table-striped">
											<thead>
												<tr>
													<th>DD No.</th>
													<th>Name of Bank and Branch</th>
													<th>DD Issue Date</th>
													<th>DD Amount</th>
												<tr>
													<td><input type="text" class="form-control"
														name="DDNo" id="DDNo" /></td>
													<td><input type="text" class="form-control"
														name="BankBranch" id="BankBranch" /></td>
													<td><input type="date" class="form-control"
														name="DDIssueDate" id="DDIssueDate"></td>
													<td><input type="number" class="form-control"
														name="DDAmount" id="DDAmount" /></td>
												</tr>
											</tbody>
										</table>
									</div>
								</div>


								<input type="radio" class="btn btn-info" name="Mode"
									value="NEFT" data-toggle="collapse" data-target="#NEFT"
									required />NEFT
								<div id="NEFT" class="panel-collapse collapse">
									<p>A/c No.:3006101003072</p>
									<p>IFSC Code: CNRB0003006</p>
								</div>

							</div>





							<!-- <select class="form-control" name="Mode" id="Mode" >
<option value="">------------Select Mode------------</option>
<option value="DD" data-toggle="collapse" data-target="#dd">DD</option>
<option value="NEFT">NEFT</option>
<option value="Cash">Cash</option>
</select>
</div> -->




							<!-- <button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">DD</button>
  <div id="demo" class="collapse in">
   <div class="form-group input-group">
<span class="input-group-addon"><b>DD Information*</b></span>
<table class="table table-striped">
    <thead>
      <tr>
        <th>DD No.</th>
        <th>Name of Bank and Branch</th>
        <th>DD Issue Date</th>
        <th>DD Amount</th>
<tr>
<td><input type="text" class="form-control"name="DDNo" id="DDNo"/></td>
<td><input type="text" class="form-control"name="BankBranch" id="BankBranch"/></td>

<td><input type="date" class="form-control"  name="DDIssueDate" id="DDIssueDate"></td>
<td><input type="text" class="form-control"name="DDAmount" id="DDAmount"/></td>
</tr>
    </tbody>
  </table>
</div>
</div>
  </div> 
  

<button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">DD</button>
<button type="button" class="btn btn-info" data-toggle="collapse" data-target="#demo">DD</button>
 -->

							<!-- <div id="dd" class="collapse">
<div class="form-group input-group">
<span class="input-group-addon"><b>DD Information*</b></span>
<table class="table table-striped">
    <thead>
      <tr>
        <th>DD No.</th>
        <th>Name of Bank and Branch</th>
        <th>DD Issue Date</th>
        <th>DD Amount</th>
<tr>
<td><input type="text" class="form-control"name="DDNo" id="DDNo"/></td>
<td><input type="text" class="form-control"name="BankBranch" id="BankBranch"/></td>

<td><input type="date" class="form-control"  name="DDIssueDate" id="DDIssueDate"></td>
<td><input type="text" class="form-control"name="DDAmount" id="DDAmount"/></td>
</tr>
    </tbody>
  </table>
</div>
</div>
</div> -->




							<div class="form-group input-group">
								<span class="input-group-addon"> <b>Applicant's
										Photo*</b></span> <input type="file" class="form-control-file"
									name="Photo" id="Photo" required />
							</div>


							<!-- <div class="form-group input-group">
  <span class="input-group-addon"> <b>Category Certificate</b></span> 
   <input type="file" class="form-control-file" name="CCertificate" id="CCertificate" />
   </div>

<div class="form-group input-group">
 <span class="input-group-addon"> <b>NRI Certificate</b></span> 
   <input type="file" class="form-control-file" name="NRICertificate" id="NRICertificate" />
   </div> -->

							<br />

							<div class='wrapper text-center'>
								<div class="form-check input-group">
									<label class="form-check-label">&emsp;&emsp; <input
										type="checkbox" class="form-check-input" name="Declaration"
										id="Declaration" required /> I have carefully read the
										instructions and hereby agree to abide by the decision of the
										CHG authorities regarding my selection for the course. I
										certify that the particulars given by me in this application
										form are true to the best of my knowledge and belief.
									</label>
								</div>
							</div>
							<br />




							<div class='wrapper text-center'>
								<button type="submit" class="btn btn-primary">Submit</button>

								<button type="reset" class="btn btn-danger">Reset</button>
							</div>









						</form>
					</div>

				</div>
			</div>


		</div>
	</div>



	<script src="assets/plugins/jquery-1.10.2.js"></script>
	<script src="assets/plugins/bootstrap.js"></script>



</body>
</html>