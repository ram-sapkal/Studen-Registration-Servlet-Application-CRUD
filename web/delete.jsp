<%-- 
    Document   : delete
    Created on : 24 Jan, 2022, 11:15:20 PM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Record</title>
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
        <div class="new">
        <form action="delete" method="get">
            <h1>Delete Record</h1>    
        <div class="center">
            <label for="PRN no.:"><b>PRN no:<sup class="ast">*</sup></b></label>
            <input type="text" name="prn" id="prn" placeholder="Enter PRN no."> 
        </div>
        <br> 
        <div  class="center">
                <input type="submit" name="option" value="Submit"> 
        </div>
        <br/>
        <div  class="center">
                <input type="submit" name="option" value="Back to CRUD operation"> 
        </div>
        <br/>
        <span style="color:green;">${error}</span>
        </form>
        </div>
    </body>
</html>
