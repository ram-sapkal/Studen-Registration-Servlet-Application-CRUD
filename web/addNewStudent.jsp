<%-- 
    Document   : addNewStudent
    Created on : 24 Jan, 2022, 8:54:30 PM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Add New Student</title>
        <style>
            .new{
               
                border: 3px solid green;
            }
             .center {
  text-align: center;   
  margin: auto;
  width: 50%;
  padding: 10px;
}
        </style>
    </head>
    <body>
           
        <form action="AddNewStudent" method="Get">
            <div class="new">    
        <div class="body">  
            <div class="center"><h1>Add New Student Details</h1></div>    
        <div class="center">
            <label for="PRN no.:"><b>PRN no:<sup class="ast">*</sup></b></label>
            <input type="text" name="prn" id="prn" placeholder="PRN"> 
        </div>
        <br>    
        <div class="center">
            <label for="name"><b>Full Name:<sup class="ast">*</sup></b></label>
            <input type="text" name="Name" id="name" placeholder="FULL NAME"> 
        </div>
        <br>
            <div class="center" >
                <label for="email1"><b>Email: </b></label>
                <input type="email" name="myEmail" id="email1">
            </div>
            <br>
            <div  class="center">
                <label for="gender1"><b>Gender:<sup class="ast">*</sup></b></label>
                <input type="text" name="myGender" > 
            </div>
            <br>
            <div  class="center">
                <label for="dateofbirth"><b>Date of Birth :<sup class="ast">*</sup> </b></label>
                <input type="date" name="mydob" id="dateofbirth">
            </div>
            <br>
            <div class="center">
                <label for="phone_no"><b>Phone no.:<sup class="ast">*</sup> </b></label>
                <input type="number" name="phone no" id="phone1">
            </div>
            <br>
            
            <div  class="center">
                <input type="submit" name="option" value="Submit"> <input type="reset" value="Reset"> 
                <input type="submit" name="option" value="Back to Home Page">
            </div>
            <br/>
            <center><span style="color:green;">${error}</span></center>
        </div>  
     </div>           
     </form> 
    </body>
</html>
