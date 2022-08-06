<%-- 
    Document   : data_base_jsp
    Created on : 3 Jan, 2022, 5:31:19 PM
    Author     : sarthak
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Form</title>
          <style>
 .center {
  text-align: center;   
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;
}
      </style>
    </head>
    <body>
        <form action="database" method="Get">
        <div class="body">   
        <div class="center">
            <h1>Create Admin</h1>
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
            
            <div class="center">
                <label for="password"><b>Password.:<sup class="ast">*</sup> </b></label>
                <input type="text" name="password" id="password">
            </div>
            <br>
            
            <div  class="center">
                <input type="submit" name="option" value="Submit"> <input type="reset" value="Reset">
                <input type="submit" name="option" value="Back to Login">
                <span style="color:green;">${error}</span>
            </div>
            <br/>
            
        </div>    
     </form>  
    </body>
</html>
