<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registrar Producto</title>
</head>
<body bgcolor="#c5dec9">
<h1 align="center">RegistrarProveedor</h1>

<table align="center" border="2">
<form method ="post" action="ControladorProveedor">
<tr>
<td>nombre</td>
<td><input type="text" name="nombre"></td>
<tr>
<tr>
<td>rasonsocial</td>
<td><input type="text" name="rasonsocial"></td>
<tr>
<tr>
<td>ruc</td>
<td><input type="text" name="ruc"></td>
<tr>
<tr>
<td>email</td>
<td><input type="text" name="email"></td>
<tr>
<tr>
<td>fechaI</td>
<td><input type="date" name="fechaI"></td>
<tr>
<tr>
<td colspan="2" align="center">
<input type="submit" value="registrar"></td>
<tr>
</form>
</table>
</body>
</html>