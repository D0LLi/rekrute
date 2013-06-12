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

<title>La liste des recruteurs</title>
</head>
<body>
	<form:form action="/recruteur/allrecruteur.html" method="post" >

<table border =1>
<tr><td>ID</td><td>entreprise</td><td>responsable</td><td>TELEPHONE</td><td>ADDRESSE</td><td>secteur</td><td>EMAIL</td><td>Options</td></tr>

<c:forEach items="${listRecruteurs}" var="recruteur">
<tr><td>${recruteur.idRecruteur}</td><td>${recruteur.entreprise}</td><td>${recruteur.prenom}</td><td>${recruteur.telephone}</td><td>${recruteur.address}</td><td>${recruteur.secteur}</td>
<td>${recruteur.email}</td>
<td><a href="deleterecruteur.html?idRecruteur=${recruteur.idRecruteur}">supprimer</a></td>
<td><a href="getupdaterecruteur.html?idRecruteur=${recruteur.idRecruteur}">modifier</a></td>
<td><a href="offre/getaddoffre.html?idRecruteur=${recruteur.idRecruteur}">publier une offre</a></td>
<td><a href="offre/getmesoffre.html?idRecruteur=${recruteur.idRecruteur}">mes offres</a></td>


</tr>
</c:forEach>

</table>
	</form:form>

</body>
</html>