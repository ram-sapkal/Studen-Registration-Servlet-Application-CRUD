<%-- 
    Document   : HomePage
    Created on : 9 Dec, 2021, 6:49:41 AM
    Author     : ramja
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Home Page</title>
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
            <form action="HomePaageServlet" meathod="GET">
                <table>
                    <tr><td><h2>Home </h2></td></tr>
                    <tr><td><center><input type="submit" name="btn" value="Sign-In"></center></td></tr>
                    <tr><td><center><input type="submit" name="btn" value="Sign-Up"></center></td></tr>
                </table>
            </form>
        </div>
    </body>
</html>
