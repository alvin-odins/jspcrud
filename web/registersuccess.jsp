<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.PreparedStatement" %><%--
  Created by IntelliJ IDEA.
  User: AlvinOdins
  Date: 10/28/2016
  Time: 2:16 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.sql.*" %>
<html>
<head>
    <c:import url="header.jsp">
        <c:param name="title" value="RegisterSuccess" />
    </c:import>
</head>
<body>

    <h3>Congratulations, new record updates</h3>
    <p>
        Find below details of the new student registrations
    </p>

    <hr>

    <table border="1px">

        <th>First Name</th>
        <th>Middle Name</th>
        <th>Last Name</th>
        <th>Email ID</th>
        <th>Contact Number</th>
        <th>Date of Birth</th>
        <th>Gender</th>
        <th>Semester Option</th>
        <!--<th>Sports Activities</th>
        <th>Photo</th>-->
        <tr>
           <c:forEach items="${studentList}" var="student">
               <td><c:out value="${student.firstName}"></c:out></td>
               <td><c:out value="${student.middleName}"></c:out></td>
               <td><c:out value="${student.lastName}"></c:out></td>
               <td><c:out value="${student.email}"></c:out></td>
               <td><c:out value="${student.cno}"></c:out></td>
               <td><c:out value="${student.dob}"></c:out></td>
               <td><c:out value="${student.gender}"></c:out></td>
               <td><c:out value="${student.semType}"></c:out></td>
               <%--<td><c:out value="${student.activity}"></c:out></td>
               <td><c:out value="${student.image}"></c:out></td>--%>
           </c:forEach>
        </tr>
    </table>

</body>
</html>
