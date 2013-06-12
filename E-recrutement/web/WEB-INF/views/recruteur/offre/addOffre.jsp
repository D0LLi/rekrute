<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html xmlns="http://www.w3.org/1999/xhtml">


<head>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />

<title>Ajouter une offre</title>
</head>
<body>

	<form:form action="/recruteur/offre/addoffre.html" method="POST"
		commandName="offreModel">


		<fieldset>
			<legend>Pour publier une offre il faut remplir le formulaire
				suivant</legend>


			<p>
							<form:errors path="*" cssClass="error" />
			
				<form:label path="poste">Poste : </form:label>
				<form:input type="text" id="form_poste" path="poste" />
				<form:input type="hidden" id="form-hidden"  path="idOffre" />
				
				
			</p>
			<p>
				<form:label path="profil">Profil : </form:label>
				<form:input type="text" id="form_profil" path="profil" />
			</p>



			<p>
				<form:label path="location">Location : </form:label>
				<form:input type="text" id="form_location" path="location" />
			</p>
			<p>
				<form:label path="contract">Type de contract : </form:label>
				<form:select id="form_contract" path="contract">
					<option value="ca">CDI</option>
					<option value="us">CDD</option>
					<option value="be">Interim</option>
					<option value="fr">Anapec</option>
				</form:select>
			</p>




			
			<p>
				<form:label path="secteur">Secteur : </form:label>
				<form:select id="form_secteur" path="secteur">
					<option value="info">Informatique</option>
					<option value="telecom">télécommunication</option>
					<option value="btp">Travaux public</option>
					<option value="industrie">industrie</option>
				</form:select>
			</p>
			<p>
				<form:label path="salaire">Salaire : </form:label>
				<form:input type="text" id="form_salaire" path="salaire" />
			</p>
			<p>
				<form:label path="description">Description : </form:label>
				<form:textarea path="description" rows="5" cols="30" />

			</p>



		</fieldset>

		<p>
			<input type="submit" value="valider" /> <input type="reset"
				value="annuler" />
		</p>

	</form:form>

</body>
</html>