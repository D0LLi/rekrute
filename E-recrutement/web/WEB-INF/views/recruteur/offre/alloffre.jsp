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

<title>La liste des offres</title>
</head>
<body>
	<form:form action="/recruteur/offre/alloffre.html" method="post" >

<table border =1>
<tr><td>ID</td><td>poste</td><td>locatoon</td><td>entreprise</td></tr>

<c:forEach items="${listoffres}" var="offre">
<tr><td>${offre.idOffre}</td><td>${offre.poste}</td><td>${offre.location}</td>
<td>${offre.recruteur.getEntreprise()}</td>
<td><a href="deleterecruteur.html?idRecruteur=${recruteur.idRecruteur}">supprimer</a></td>
<td><a href="getupdaterecruteur.html?idRecruteur=${recruteur.idRecruteur}">modifier</a></td>
<td><a href="offre/getaddoffre.html?idRecruteur=${recruteur.idRecruteur}">publier une offre</a></td>

</tr>
</c:forEach>

</table>
	</form:form>

</body>
</html>