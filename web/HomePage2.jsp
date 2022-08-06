<%-- 
    Document   : HomePage2
    Created on : 24 Jan, 2022, 8:44:36 PM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page 2</title>
        <style>
             .center {
  text-align: center;   
  margin: auto;
  width: 50%;
  border: 3px solid green;
  padding: 10px;}
        </style>    
    </head>
    <body>
        <form action="HomePage2" method="Get">
            <br/><br/><br/><br/><br/><br/>
            <div  class="center">
                <h1>Perform CRUD Operation</h1>
                <br/><br/>
                <input type="submit" name="option" value="Add New Student">&emsp;
                <input type="submit" name="option" value="Update">&emsp;
                <input type="submit" name="option" value="Delete">&emsp;
                <input type="submit" name="option" value="Fetch Recod"><br/><br/>
                <input type="submit" name="option" value="Back to Homepage">
            </div>
        </form>
    </body>
</html>
