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

<title>La liste des candidats</title>
</head>
<body>
	<form:form action="/candidat/allcandidat.html" method="post" >

<table border =1>
<tr><td>ID</td><td>NOM</td><td>PRENOM</td><td>TELEPHONE</td><td>ADDRESSE</td><td>Date de naissance</td><td>EMAIL</td><td>Options</td></tr>

<c:forEach items="${listCandidats}" var="candidat">
<tr><td>${candidat.idCandidat}</td><td>${candidat.nom}</td><td>${candidat.prenom}</td><td>${candidat.telephone}</td><td>${candidat.address}</td><td>${candidat.date_de_naissance}</td>
<td>${candidat.email}</td><td><a href="deletecandidat.html?idCandidat=${candidat.idCandidat}">supprimer</a></td><td><a href="getupdatecandidat.html?idCandidat=${candidat.idCandidat}">modifier</a></td></tr>
</c:forEach>

</table>
	</form:form>

</body>
</html>