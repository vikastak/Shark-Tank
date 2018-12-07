<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SharkTank</title>
<h1 align="center">SHARK TANK REGISTRATION FORM</h1>
</head>
<body>
<form action="" method="post">
ROW          :   <input type="text" placeholder="Enter row" name="row"/><br><br>
SEASON       :   <input type="text" placeholder="Enter no of season" name="season"/><br><br>
NO IN SERIES :   <input type="text" placeholder="Enter no in series" name="series"/><br><br>
COMPANY NAME :   <input type="text" placeholder="Name of the company" name="company"/><br><br>
DEAL         :   \<select name="deal">
<option>Yes</option>
<option>NO</option>
</select><br><br>
INDUSTRY     :<input type="text" placeholder="Enter name of the industry" name="industry"/><br><br>
ENTERPRENEUR GENDER:<select name="gender">
<option>Male</option>
<option>Female</option>
</select><br><br>
AMOUNT       :<input type="text" placeholder="Enter amount" name="amount"/><br><br>
EQUITY       :<input type="text" placeholder="Enter equity %" name="equity"/><br><br>
          <input type="submit" value="Registration">
</form>
</body>
</html>