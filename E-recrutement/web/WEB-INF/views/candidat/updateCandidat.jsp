<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">


<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<title>modifier le candidat Candidat</title>
</head>
<body>
  	<form:form action="/candidat/updatecandidat.html"   method="POST" commandName="candidatModel">
 

	<fieldset>
		<legend>Informations personnelles</legend>
		<p>
			<form:label path="nom">Nom : </form:label> <form:input type="text"	id="form_lastpath" path="nom"  />
			 <form:input type="hidden"	id="form_lastpath" path="idCandidat"  />  
				<form:errors path="nom" cssClass="error" />
				
		</p>
		<p>
			<form:label path="prenom">Prénom : </form:label> <form:input type="text"
				id="form_firstpath" path="prenom" /> 
		</p>



		<form:label path="date_de_naissance">Date de naissance : </form:label> <form:input
			type="text" id="form_birthday" path="date_de_naissance" />
		<p>
			<form:label path="telephone">Téléphone : </form:label> <form:input type="text"
				id="form_telephone" path="telephone" />
		</p>
		<p>
			<form:label path="address">Adresse : </form:label> <form:input type="text"
				id="form_address" path="address"/>
		</p>



		<p>
			<form:label path="ville">Ville : </form:label> <form:input type="text"
				id="form_city" path="ville" />
		</p>
		<p>
			<form:label path="pays">Pays : </form:label> <form:select id="form_country"
				path="pays">
				<option value="ca">Maroc</option>
				<option value="us">États-Unis</option>
				<option value="be">Belgique</option>
				<option value="fr">France</option>
			</form:select>
		</p>
		

	</fieldset>

	<fieldset>
		<legend>Compte</legend>
		<p>
			<form:label path="email">Email : </form:label> <form:input type="text"
				id="form_email" path="email" />
		</p>

		<p>
			<form:label path="password">Mot de passe : </form:label> <form:input type="password"
				id="form_password" path="password" />
		</p>
	
		
		<p>
			<form:label path="fonction_actuelle">Fonction actuelle : </form:label> <form:input
				type="text" id="form_fonction_actuelle" path="fonction_actuelle" />
		</p>
		<p>
			<form:label path="pretention_salariale">Prétentions salariales : </form:label> <form:input
				type="text" id="form_pretention_salariale" path="pretention_salariale" />
		</p>


	</fieldset>

	<p>
		<input type="submit"  value="enregister les modifications" /> <input
			type="reset" value="annuler" />
	</p>
	
	</form:form>


</body>
</html>