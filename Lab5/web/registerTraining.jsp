<%-- 
    Document   : registerTraining
    Created on : 7 Jun 2024, 11:45:34 am
    Author     : Saiful
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register</title>
    </head>
    <body>
        <h1>Register IT Training</h1>
        <form action="processTraining.jsp" method="post">
            <fieldset>
                <legend>Training Registration</legend>
                <table>
                    <tr>
                        <td><label for="IC_No">IC No</label></td>
                        <td><input id="IC_No" name="IC_No" placeholder="E.g. 911210-05-1234"></td>
                    </tr>
                    <tr>
                        <td><label for="name">Name</label></td>
                        <td><input id="name" name="name" placeholder="Enter your name"></td>
                    </tr>
                    <tr>
                        <td><label for="name">Type of Training</label></td>
                        <td>
                            <select name="training" id="training">
                                <option value="c++">C++ Training</option>
                                <option value="java">Java Training</option>
                                <option value="python">Python Training</option>
                                <option value="rust">Rust Training</option>
                            </select>
                        </td>
                    </tr>
                    <tr>
                        <td><label for="noPax">No of Pax</label></td>
                        <td><input id="noPax" name="noPax" placeholder="No of pax"></td>
                    </tr>
                    <tr>
                        <td><label for="student">Student</label></td>
                        <td>
                            <input type="radio" id="isStudent" name="student" value="yes">
                            <label for="isStudent">Yes</label>
                            <input type="radio" id="notStudent" name="student" value="no">
                            <label for="notStudent">No</label>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <input type="submit" value="Submit">
                            <input type="reset" value="Cancel">
                        </td>
                    </tr>
                </table>
            </fieldset>
        </form>
    </body>
</html>
