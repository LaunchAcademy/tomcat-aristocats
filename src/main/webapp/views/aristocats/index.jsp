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
    <h1>All of our Cats</h1>

    <%
      List<Map<String,String>> cats = (List)request.getAttribute("aristocats");
      for(Map<String,String> cat: cats) {
    %>
      <h2> <%=cat.get("firstName")%> <%=cat.get("lastName")%> </h2>
      <img src=<%=cat.get("photoUrl") %> />
    <% } %>
  </body>
</html>