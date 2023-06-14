<%-- 
    Document   : signup
    Created on : 14 Jun, 2023, 11:16:02 PM
    Author     : DELL
--%>

<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.DriverManager"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="bootstrap.css"> 
        <title>JSP Page</title>
        
     <style>
        .div1
             {
                 background-color: #999999;
                height: 500px;
                width: 50%;
                float: left; 
             } 
             .div2
             {
                background-color: white;
                height: 500px;
                width: 50%;
                float: right;
             }  
        .box
        {
            display: flex;
             position: relative;
                 z-index: 2;
                 box-shadow: 0px 8px 30px  ;
        }
        label
        {
            color: grey;
        }
        u
        {
             color: #ffff33;
        }
        center
        {
            color: white;
        }
         input[type=text]
            {
                border: none;
	        border-bottom: 1px solid #00cc00;
	        background: transparent;
      	        outline: none;
                color: black;
	        height: 25px;
	margin-left: 40px;
	font-size: 16px;
        font-family: serif;
            }
                 input[type=date]
            {
                border: none;
	border-bottom: 1px solid #00cc00;
	background: transparent;
	outline: none;
	height: 25px;
	margin-left: 40px;
	font-size: 16px;
        height: 40px;
            }
            label
            {
                margin-left: 40px;    
            }
             input[type=password]
            {
                border: none;
	border-bottom: 1px solid #00cc00;
	background: transparent;
	outline: none;
        color: black;
	height: 25px;
	margin-left: 40px;
	font-size: 16px;
        font-family: serif;
            }
            
           input[type=submit]
             {
               border: none;
	outline: none;
	height: 40px;
        color: #ffff33;
	font-size: 16px;
	background: #00cc00;
	cursor: pointer;
	border-radius: 20px;
             }   
             input[type=submit]:hover
             {
                 background: #efed40;
	color: #262626;
             }
            </style>
    </head>
    <body >
      
      
        <script src="validation.js"></script>
         <form name="signup" action="Signup" method="post">
        
            <div class="box" style="margin-left:300px ;background: white;width: 50% ;margin-top: 100px;margin-bottom: 100px;height:500px  ">
                <div class="div1">
                    <center>
                        <br><br><br><br><br><br><br><br><br>
                        <h1 Style="color: #ffffff;text-shadow:  2px 3px 6px black;font-family: serif"> <span style="color: #ffff33;background:non">U</span>ser <span style="color: #ffff33;background:non">S</span>ign<span style="color: #ffff33;background:non">U</span>p </h1></center>
                    
                    <center><hr style="height:2px;width: 50px;border:none;color: #ffff33;background-color: #ffff33"><br><br >
                        You are just few seconds away from<br> our World.Just tell us a little<br> information about you.
                    </center>
                </div>
                 <div class="div2"><br>
                     <center> <img src="user.png" class="user"><br><br></center>
                     <span class="user"><i class="fa fa-user"></i></span>
                     <input type="text" name="txt1" placeholder="Enter Uid" onkeypress="javascript:return isAlphanumric(event)">
                     <br><br>
                     <input type="text" name="txt2" placeholder="Enter First Name" onkeypress="javascript:return isString(event)">
                     <br><br>
                     
                    
                     <input type="text" name="txt9" placeholder="Enter Email">
                     <br><br>
                     <input type="text" name="txt6" placeholder="Enter User Name" onkeypress="javascript:return isString">
                     <br><br>
                         <input type="password" name="txt7" placeholder="Enter Password" onkeypress="javascript:return isNumber"><br><br>
                     <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                     <input type="submit" name="btn1" value="SignUp" class="btn btn-success">&nbsp;&nbsp;&nbsp;&nbsp;
                       <input type="submit" name="btn1" value="LogIn" class="btn btn-primary"> &nbsp;&nbsp;&nbsp;&nbsp;
                 </div>
            </div>
         </form>     
    </body>
</html>