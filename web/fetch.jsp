<%-- 
    Document   : fetch
    Created on : 24 Jan, 2022, 11:15:32 PM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Fetch Details</title>
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
        <form action="fetch" method="get">
            <br/>
            <h1>Fetch Record</h1>
                    <div class="center">
                        <br/><br/>
            <label for="PRN no.:"><b>PRN no:<sup class="ast">*</sup></b></label>
            <input type="text" name="prn" id="prn" placeholder="PRN"> 
        </div>
        <br> 
            <div  class="center">
                <input type="submit" name="option" value="Submit"> 
            </div>
            <br/>
        </form>
        </div>    
    </body>
</html>
