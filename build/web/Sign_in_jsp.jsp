<%-- 
    Document   : Sign_in_jsp
    Created on : 9 Dec, 2021, 7:32:36 AM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Sign-In Page</title>
        <style>
            body{padding-top: 150px;
                 padding-left: 500px;  }
            td{padding: 10px;}
            div{
                align-content:center; 
                width:45%;
                border :1px solid black;
                border-radius: 5px;
                background-color: white;
            }
        </style>        
    </head>
    <body>
        <div align="center">
            <form action="Sign_in_Servlet" meathod="GET">
                <table>
                    <tr><td><h2>Sign-In Form</h2></td></tr>
                    <tr><td><center>Phone no : <input type="text" name="uname" placeholder="Enter Username"></center></td></tr>
                    <tr><td><center>Password : <input type="password" name="pass" placeholder="Enter Password"></center></td></tr>
                    <tr><td><center><input type="submit" name="btnSINsubmit" value="Submit"></center></td></tr>
                </table>
            </form>
        </div>
    </body>
</html>
