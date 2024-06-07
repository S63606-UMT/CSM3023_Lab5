<%-- 
    Document   : processTraining
    Created on : 7 Jun 2024, 12:16:44 pm
    Author     : Saiful
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.Date, lab5.com.Register"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration Acknowledgement</title>
    </head>
    <body>
        <h1>Training Registration Acknowledgement</h1>
        <%
            Register reg = new Register();
            reg.setIC_No(request.getParameter("IC_No"));
            reg.setName(request.getParameter("name"));
            reg.setTypeOfTraining(request.getParameter("training"));
            reg.setNoPax(Integer.parseInt(request.getParameter("noPax")));
            reg.setAmountDue(4950);
            
            out.println("IC No: " + reg.getIC_No() + "<br>");
            out.println("Name: " + reg.getName() + "<br>");
            out.println("Type of Training: " + reg.getTypeOfTraining() + "<br>");
            out.println("Number of Pax: " + reg.getNoPax() + "<br>");
            out.println("Student: " + reg.getIsStudent() + "<br>");
            out.println("Amount Due: " + reg.getAmountDue() + "<br>");
        %>
    </body>
</html>
