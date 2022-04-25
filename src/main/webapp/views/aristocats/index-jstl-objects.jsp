<%@ page language="java" contentType="text/html; charset=UTF-8" %>
<%@page import="java.util.Map" %>
<%@page import="java.util.List" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
  <head>
  <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  <title>Aristocats in Tomcat</title>
  </head>
  <body>
    <h1>All of our Cats in JSTL with Objects</h1>

       <c:forEach items="${requestScope.aristocats}" var="cat">
          <h2><c:out value="${cat.firstName} ${cat.lastName}" /></h2>
          <img src=<c:out value="${cat.photoUrl}" />/>
        </c:forEach>

  </body>
</html>