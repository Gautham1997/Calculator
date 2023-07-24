<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>CALCULATOR</title>
</head>
<body>
<h1 align="center" >Calculator</h1>
<br/><br/><br/>
    <form action="/calculator" method="post" align="center">
       First Number: <input type="number" name="n1" /><br>
        <br/><br/>
       Second Number: <input type="number" name="n2"  /><br>
        <br/><br/>
        <select name="operation">
            <option value="add">Add</option>
            <option value="subtract">Subtract</option>
            <option value="multiply">Multiply</option>
            <option value="divide">Divide</option>
        </select>
        <br/><br>
        <input type="submit" value="submit" />
    </form>

  <% if (request.getAttribute("error") != null) { %>
        <br/><br> <p align="center" ><%= request.getAttribute("error") %></p>
    <% } %>
    
   <%  if (request.getAttribute("result")!= null) {%>
      <br/><br>  <h2 align="center">Result: ${result}</h2>
       
    <%} %>
</body>
</html>