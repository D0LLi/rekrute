package controller;

import javax.validation.Valid;

import metier.CandidatMetier;
import metier.OffreMetier;
import metier.RecruteurMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import dao.Candidat;
import dao.Offre;
import dao.Recruteur;

@Controller
public class RecruteurController {

	@Autowired
	RecruteurMetier recruteurtMetier;
	@Autowired
	OffreMetier offreMetier;

	@RequestMapping(value = "/recruteur/getaddrecruteur", method = RequestMethod.GET)
	public String getaddRecruteur(
			@Valid @ModelAttribute("recruteurModel") Recruteur recruteurModel,
			BindingResult result, Model model) {

		return "recruteur/addRecruteur";
	}

	@RequestMapping(value = "/recruteur/addrecruteur", method = RequestMethod.POST)
	public String addRecruteur(
			@Valid @ModelAttribute("recruteurModel") Recruteur recruteurModel,
			BindingResult result, Model model) {
		if (result.hasErrors()) {

			System.out.println(recruteurModel.getNom().toString());
			return "recruteur/addRecruteur";
		}

		recruteurtMetier.addRecruteur(recruteurModel);
		System.out.println("Votre compte est créer avec success !");

		return "redirect:/";

	}

	@RequestMapping(value = "/recruteur/allrecruteur", method = RequestMethod.GET)
	public String AllRecruteur(Model model) {

		model.addAttribute("listRecruteurs",
				recruteurtMetier.getAllRecruteurs());
		return "recruteur/allrecruteur";
	}

	@RequestMapping(value = "/recruteur/deleterecruteur")
	public String deleteRecruteur(Model model, @RequestParam Long idRecruteur) {
		recruteurtMetier.deleteRecruteur(idRecruteur);
		System.out.println("le recruteur séléctionner est supprimer !");
		model.addAttribute("listRecruteurs",
				recruteurtMetier.getAllRecruteurs());
		return "recruteur/allrecruteur";

	}

	@RequestMapping(value = "/recruteur/getupdaterecruteur")
	public ModelAndView updateRecruteur(
			@ModelAttribute("recruteurModel") Recruteur recruteurModel,
			@RequestParam Long idRecruteur) {
		recruteurModel = recruteurtMetier.getRecruteurById(idRecruteur);

		return new ModelAndView("recruteur/updaterecruteur", "recruteurModel",
				recruteurModel);
	}

	@RequestMapping(value = "/recruteur/updaterecruteur")
	public String recruteurUpdated(
			@ModelAttribute("recruteurModel") Recruteur recruteurModel,
			@RequestParam Long idRecruteur, Model model) {
		recruteurtMetier.updateRecruteur(recruteurModel);
		model.addAttribute("listRecruteurs",
				recruteurtMetier.getAllRecruteurs());
		return "recruteur/allrecruteur";
	}

	@RequestMapping(value = "/recruteur/searchform")
	public String getRecruteurSearchForm(@ModelAttribute("recruteurModel") Recruteur recruteurModel) {

		return "recruteur/getRecruteur";

	}

	@RequestMapping(value = "/recruteur/getrecruteur")
	public ModelAndView getRecruteur(
			@ModelAttribute("recruteurModel") Recruteur recruteurModel) {
		System.out.println("Nous avons trouver le candidat !");

		recruteurModel = recruteurtMetier.getRecruteurById(recruteurModel
				.getIdRecruteur());
		return new ModelAndView("recruteur/getRecruteur", "recruteurModel",
				recruteurModel);
	}
	

	@RequestMapping(value = "/recruteur/offre/getaddoffre", method = RequestMethod.GET)
	public String getaddoffreForm(
			@Valid @ModelAttribute("offreModel") Offre offreModel,
			BindingResult result, Model model,@RequestParam Long idRecruteur) {
		
		offreModel.setIdOffre(idRecruteur);
		return "recruteur/offre/addOffre";
	}
	
	@RequestMapping(value = "/recruteur/offre/addoffre", method = RequestMethod.POST)
	public String publishOffre(@Valid @ModelAttribute("offreModel") Offre offreModel,
			BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println("erreur !!!");
			return "trcruteur/offre/addOffre";
		}
		
         Recruteur r = recruteurtMetier.getRecruteurById(offreModel.getIdOffre());
         offreModel.setIdOffre(null);
         offreModel.setRecruteur(r);
         r.getMes_Offres().add(offreModel);
		offreMetier.addOffre(offreModel);
		recruteurtMetier.updateRecruteur(r);
		System.out.println("Votre offre est ajouter  avec success !");

		return "redirect:/";
	}
	
	@RequestMapping(value = "/recruteur/offre/alloffre", method = RequestMethod.GET)
	public String AllOffre(Model model) {

		model.addAttribute("listoffres",
				offreMetier.getAllOffres());
		return "recruteur/offre/alloffre";
	}
	
	@RequestMapping(value = "/recruteur/offre/getmesoffre", method = RequestMethod.GET)
	public String mesOffre(Model model,@RequestParam Long idRecruteur) {
		model.addAttribute("listoffres",
				recruteurtMetier.getRecruteurById(idRecruteur).getMes_Offres());
		
		return "recruteur/offre/mesoffres";
	}
	
}
