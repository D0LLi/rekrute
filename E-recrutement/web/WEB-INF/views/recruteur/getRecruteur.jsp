<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">


<head>
<style>

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<title>rechrcher</title>
</head>
<body>
<form:form action="/recruteur/getrecruteur.html" method="POST" commandName="recruteurModel">

<table border =1>
<tr><td>ID</td><td>entreprise</td><td>responsable</td><td>TELEPHONE</td><td>ADDRESSE</td><td>secteur</td><td>EMAIL</td></tr>

<tr><td>${recruteurModel.idRecruteur}</td>
<td>${recruteurModel.entreprise}</td>
<td>${recruteurModel.prenom}</td>
<td>${recruteurModel.telephone}</td>
<td>${recruteurModel.address}</td>
<td>${recruteurModel.secteur}</td>
<td>${recruteurModel.email}</td></tr>


</table>
	
	
	<form:input
				type="text" id="form_id" path="idRecruteur" />
				<input type="submit"  value="cherhcer" /></br>
				
</form:form>

</body>
</html>