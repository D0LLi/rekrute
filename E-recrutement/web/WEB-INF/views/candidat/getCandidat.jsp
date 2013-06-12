<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">


<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<title>CHercher un candidat</title>
</head>
<body>
<form:form action="/candidat/getcandidat.html" method="POST" commandName="candidatModel">

<table>
<tr><td>ID</td><td>NOM</td><td>PRENOM</td><td>TELEPHONE</td><td>ADDRESSE</td><td>Date de naissance</td><td>VILLE</td><td>PAYS</td><td>EMAIL</td></tr>


<tr><td>${candidatModel.idCandidat}</td><td>${candidatModel.nom}</td><td>${candidatModel.prenom}</td><td>${candidatModel.telephone}</td><td>${candidatModel.address}</td><td>${candidatModel.date_de_naissance}</td><td>${candidatModel.ville}</td>
<td>${candidatModel.pays}</td><td>${candidatModel.email}</td></tr>


</table>
<form:input
				type="text" id="form_fonction_actuelle" path="idCandidat" />
				<input type="submit"  value="cherhcer" /></br>
				
</form:form>
</body>
</html>