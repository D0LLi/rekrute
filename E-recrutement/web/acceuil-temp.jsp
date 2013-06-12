<?xml version='1.0' encoding='UTF-8' ?>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml"
      xmlns:h="http://java.sun.com/jsf/html"
       xmlns:p="http://primefaces.org/ui"
       xmlns:f="http://java.sun.com/jsf/core"
       xmlns:ui="http://java.sun.com/jsf/facelets">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Business Website, XHTML CSS Template, Web Design, Free Download" />
<meta name="description" content="Business Website - Free CSS Template, Free XHTML CSS Design Layout" />
<link href="templatemo_style.css" rel="stylesheet" type="text/css" />
<script language="javascript" type="text/javascript">

function clearText(field)
{
    if (field.defaultValue == field.value) field.value = '';
    else if (field.value == '') field.value = field.defaultValue;
}
</script>
    <h:head>
        <title>Gestion recrutement</title>
    </h:head>
    <h:body>
        <div id="templatemo_container">    
    	<div id="templatemo_header">
        	<div id="templatemo_logo">
            	<div id="templatemo_site_logo">
                	<span class="big">R</span>ECRUTE<span class="green"><span class="big"> P</span>LANET</span>
                </div>
                <div id="templatemo_site_slogan">
                	Trouver un emploi ou Recruter rapidement
              </div>
            </div>
        	<div id="templatemo_header_right">
            	     <br></br>  <br></br> 
                
                <div id="templatemo_menu">
                	<div class="templaetmo_menu_item about">
                    	<h1 class="menu_text"><a href="espace_candidat_internaute.xhtml">ESPACE CANDIDAT</a></h1>
                        <div class="menu_description">
                       Voir et postuler à des emplois 
                        
                        </div>
                    </div>
                    <div class="templaetmo_menu_item organization">
                    	<h1 class="menu_text"><a href="espace_recruteur.xhtml">ESPACE EMPLOYEUR</a></h1>
                        <div class="menu_description">
                        	Publier des offres et recruter
                        </div>
                    </div>
                    <div class="templaetmo_menu_item projects">
                    	<h1 class="menu_text"><a href="offres.xhtml">OFFRES D'EMPOLI</a></h1>
                        <div class="menu_description">
                        	Consulter , chercher une offre 
                        </div>
                    </div>
                    <div class="templaetmo_menu_item faq">
                    	<h1 class="menu_text"><a href="Autentification.xhtml">INSCRIPTION</a></h1>
                        <div class="menu_description">
                        	S'inscrire
                       </div>
                    </div>
                </div>
            </div>
        </div>
            
               <div id="templatemo_content_area">
        	<div id="templatemo_left_section">
            	<div class="templatemo_section_2">
                	<div class="templatemo_section_2_left">
                    	<img src="images/templatemo_home.png" alt="free template" />
                        <a href="index.xhtml">ACCEUIL</a>
                    </div>
                    <div class="templatemo_section_2_right">
                    	<img src="images/templatemo_contact.png" alt="css template" />
                        <a href="contact.xhtml">CONTACT</a>
                    </div>
                </div>
            	<div class="templatemo_section_1">
                    
                    <div class="templatemo_h_line"></div>
                                            <h1>Connexion</h1>
                        
                        
                        <h2>Entrer votre email et votre mot de passe : </h2>
               
                        <h:form>
               
                  
    
      <p:panel >  
            
       
           
            <p:outputLabel for="input" value="Email: " />  
            <p:inputText id="input" required="true"  label="input"  value="#{InternauteMB.login}" onfocus="clearText(this)" onblur="clearText(this)"/>
 <p:message  id ="jdjd" for="input"   display="text"/>  
   
           
    <p:outputLabel for="nonFeedback" value=" Mot de passe: " />  
    <p:password id="nonFeedback" value="#{InternauteMB.pass}" label="nonFeedback"  required="true" />

   
    <p:message for="nonFeedback"  id="mama" display="text"/>  
    
    
    <br></br> <br></br>
    
       
                          
                            <p:commandButton id="errorButton" value="Connexion"   ajax="false"   action="#{InternauteMB.connecter()}" update="panel" 
                                     style=" font-size:  small"   /> 
                            <p:commandButton value="Annuler" type="reset"  style=" font-size:  small"  />
               </p:panel>
                        </h:form>
                        <br></br>
                         <br></br>

                	
                    <div class="templatemo_h_line">
                    </div>
                    <h1>Offre à la UNE </h1>
                    <h2>Team Manager Senior</h2>
                    <p>RH CALL CENTER, spécialisé dans le recrutement des métiers de l'Offshoring au Maroc....</p>
                    <p>Missions : Sous la responsabilité du Call Center Manager vos missions principales sont : - Accompagnement des nouvelles recrues -Supervis... </p>
                    <div class="templatemo_readmore">
                    	<a href="#">Lire tout</a>
                    </div>
                    <div class="cleaner"></div>
                    
                    <div class="templatemo_h_line_2">
                    </div>
                    
                    <h2>Assistants Commerciaux B to B </h2>
                    <p> RH CALL CENTER, spécialisé dans le recrutement des métiers de l'Offshoring au Maroc. Groupe européen, leader en réduction des coûts </p>
                    <p> Vous êtes en charge d’un portefeuille de prospects sur une zone géographique en France. Vous contactez des interlocuteurs de haut nive... </p>
                    
                    <div class="templatemo_readmore">
                    	<a href="#" target="_parent">Lire tout</a>                    </div>
                  <div class="cleaner"></div>
                    
                    
                  
                    
                    <div class="cleaner"></div>
                
                </div>
            </div><!-- End Of left -->
            
            <div id="templatemo_right_section">
            	<div class="templatemo_h_line">
                </div>
              
                  <h1> Recruteurs... </h1>
                    <img src="images/espace recruteurs2.jpg"  alt="recruteur" border="2"/>


                    <p><h2>Vous souhaitez recruter facilement et gratuitement vos collaborateurs , Notre site vous propose un dépot d'offre d'emploi avec affichage complet de vos coordonnées . Votre annonce sera diffusée une fois le formulaire rempli. Vous êtes ainsi visible par les candidats qui postulent directement à votre offre d'emploi selon vos critères. Notre objectif étant d’offrir un maximum de visibilité aux offres d'emploi de nos recruteurs.</h2></p>
                     <br></br>
                    <ul class="category_list">
                        <h2> <p><li><a href="Autentification.xhtml"> Créer mon profil RECRUTEUR</a></li></p></h2>
                      
                    </ul> 
                    <br></br>  <br></br>  
                    <div class="templatemo_h_line">
                    </div>
                    <h1> Candidats... </h1>
                    
                    <img src="images/hh.jpg"  alt="candidat" border="2" height="103" width="147"/>

 
                    <p><h2>Contactez des centaines de recruteurs,Tableau de bord de suivi de vos candidatures, Gestion de votre sélection d'offres d'emploi,Suivez votre correspondance avec les recruteurs. Publiez votre CV en 3 minutes . Les recruteurs peuvent accéder et consulter votre CV . Laissez les recruteurs vous chercher ! </h2></p>
 <br></br><ul class="category_list">
                        <h2> <p><li><a href="Autentification.xhtml"> Créer mon profil CANDIDAT</a></li></p></h2>
                      
                    </ul>
 <br></br>  <br></br>  
                    
                    <div class="cleaner"></div>

                    <div class="templatemo_h_line">
                    </div>
                    
                    <h1>Vous Pouvez aussi ... </h1>
                     <img src="images/dpot doffre.jpg"  alt="découvrir le site" border="2" height="125" width="147"/>
 
                    <ul class="category_list">
                        <h2> <p><li><a href="Offres.xhtml"> Consulter les offres publiées</a></li></p></h2>
                        <h2> <p>  <li><a href="Cv.xhtml"> Chercher dans la Cvthèque</a></li></p></h2>
                    <h2> <p>  <li><a href="Autentification.xhtml"> Devenir membre du site </a></li></p></h2>
                    </ul>
                </div><!-- End Of Right -->
            
            <div class="cleaner"></div>
        </div><!-- End Of Content area --> 
            
            
        </div>
        <div id="templatemo_footer">Copyright © 2013 | PLANET SOFT </div>
    
    </h:body>

    
  
</html>
