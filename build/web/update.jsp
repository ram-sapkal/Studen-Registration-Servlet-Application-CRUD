<%-- 
    Document   : update
    Created on : 24 Jan, 2022, 11:15:07 PM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Record</title>
                <style>
             .new {
  text-align: center;   
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;}
        </style>  
    </head>
    <body>
        <form action="Update" method="Get">
        <div class="new">
            
            <table>
                <tr><td><br/></td></tr>
                <tr><td><center><h1>Update Record</h1></center></td></tr>
                <tr><td><br/><br/></td></tr> 
                <tr><td>Student PRN: <input type="text" name="prnno" class="val" placeholder="Enter Prn no."></td></tr>
                <tr><td><br/><br/></td></tr>
                <tr><td>
                           Choose to Update : 
                           <select name="field">
                                    <option value="name">Name</option> 
                                    <option value="email">E-mail</option> 
                                    <option value="gender">Gender</option> 
                                    <option value="dob">Date Of Birth</option> 
                                    <option value="phnum">Phone Number</option> 
                           </select>
                </td></tr>
                <tr><td><br/><br/></td></tr>
                <tr><td>Enter Value: <input type="text" name="val" class="val" placeholder="Enter Value"></td></tr>
                <tr><td><br/><br/></td></tr>
                <tr><td><input type="submit" name="option" value="Update"></td> </tr>
                <tr><td><input type="submit" name="option" value="Back to CRUD operation"></td></tr>
                <tr><td><br/><br/></td></tr>
                <tr><td><span style="color:green;">${error}</span></td></tr>
            </table>
            
        </div>
        </form>
    </body>
</html>
