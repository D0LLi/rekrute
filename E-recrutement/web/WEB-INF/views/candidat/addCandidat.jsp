<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html xmlns="http://www.w3.org/1999/xhtml">


<head>
 <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.9.1.js"></script>
  <script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-ui-1.10.3.custom.js"></script>
 
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/jquery-ui-1.10.3.custom.css" />
 
<script>
  $(function() {
    $( "#birthday" ).datepicker();
  });
  </script>

<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css" />


<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<title>Créer mon Espace Candidat</title>
</head>
<body>
	<form:form action="/candidat/addcandidat.html" method="POST"
		commandName="candidatModel">


		<fieldset>
			<legend>Informations personnelles</legend>


			<p>
				<form:label path="civilite">Civilité  : </form:label>
				<form:select path="civilite">
					<form:options items="${civilityList}" />
				</form:select>
			</p>



			<p>
				<form:label path="nom">Nom : </form:label>
				<form:input type="text" id="form_lastpath" path="nom" />
				<form:errors path="nom" cssClass="error" />


			</p>
			<p>
				<form:label path="prenom">Prénom : </form:label>
				<form:input type="text" id="form_firstpath" path="prenom" />
				<form:errors path="prenom" cssClass="error" />

			</p>



			<form:label path="date_de_naissance">Date de naissance : </form:label>
			<form:input type="text" id="birthday" path="date_de_naissance" />
			<p>
				<form:label path="telephone">Téléphone : </form:label>
				<form:input type="text" id="form_telephone" path="telephone" />
				<form:errors path="telephone" cssClass="error" />

			</p>
			<p>
				<form:label path="address">Adresse : </form:label>
				<form:input type="text" id="form_address" path="address" />
			</p>



			<p>
				<form:label path="ville">Ville : </form:label>

				<form:select path="ville">
					<form:option value="NONE" label="--- ville ---" />

					<form:options items="${cityList}" />
				</form:select>

			</p>
			


		</fieldset>

		<fieldset>
			<legend>Compte</legend>
			<p>
				<form:label path="email">Email : </form:label>
				<form:input type="text" id="form_email" path="email" />
				<form:errors path="email" cssClass="error" />

			</p>
			<p>
				<form:label path="confirmEmail">Confirmation Email : </form:label>
				<form:input type="text" id="form_email" path="confirmEmail" />
				<form:errors path="confirmEmail" cssClass="error" />

			</p>
			

			<p>
				<form:label path="password">Mot de passe : </form:label>
				<form:input type="password" id="form_password" path="password" />
				<td><form:errors path="password" cssClass="error" />
			</p>
			<p>
				<form:label path="confirmPassword">confirmer le mot de passe : </form:label>
				<form:input type="password" id="form_password"
					path="confirmPassword" />

				<td><form:errors path="confirmPassword" cssClass="error" />
			</p>





		</fieldset>

		<p>
			<input type="submit" value="valider" /> <input type="reset"
				value="annuler" />
		</p>

	</form:form>


</body>
</html>