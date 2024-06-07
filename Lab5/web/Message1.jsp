<%-- 
    Document   : Message1
    Created on : 7 Jun 2024, 11:29:27 am
    Author     : Saiful
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page language="java"%>
<%@page info="Using JSP Standard Action to call Javabeans"%>
<%@page import="java.util.Date, lab5.com.Message"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Scriptlet</title>
    </head>
    <body>
        <h1>Using JSP Scriptlet to call JavaBeans</h1>
        <%
            Message objMsg = new Message();
            objMsg.setMsg("Welcome to CSM3023 course...,!");
            out.println("<p>" + objMsg.getMsg() + "</p>");
            out.println("<p>Current date is " + new java.util.Date() + "</p>");
        %>
    </body>
</html>
