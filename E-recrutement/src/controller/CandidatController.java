package controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import metier.CandidatMetier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import validator.FormValidator;

import dao.Candidat;

@Controller
public class CandidatController {


	@Autowired
	CandidatMetier candidatMetier;

	FormValidator validator = new FormValidator();

	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
	SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	dateFormat.setLenient(false);
	webDataBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
	}
	

	@RequestMapping(value = "/candidat/indexcandidat")
	public String espaceCandidat(
			@ModelAttribute("candidatModel") Candidat candidatModel) {

		System.out.println("chargement de la liste des candidats !");

		return "candidat/getCandidat";

	}

	@RequestMapping(value = "/candidat/getaddcandidat", method = RequestMethod.GET)
	public String getaddCandidat(
			@ModelAttribute("candidatModel") Candidat candidatModel,ModelMap model) {
		
		Map<String,String> civility = new LinkedHashMap<String,String>();
		civility.put("Mr", "Mr");
		civility.put("Mme", "Mme");
		civility.put("Mlle", "Mlle");
		
		model.put("civilityList", civility);

		Map<String,String> city = new LinkedHashMap<String,String>();
		city.put("AGADIR", "Agadir");
		city.put("HOUCEIMA", "Houceima");
		city.put("ASILA", "Asila");
		city.put("BEN GUERIR", "Ben guerir");
		city.put("BERKANE", "Berkane");
		city.put("CASABLANCA", "Casablanca");
		city.put("NADOR", "Nador");
		city.put("OUJDA", "Oujda");
		city.put("TETOUAN", "Tetouan");
		city.put("TAZA", "Taza");
		city.put("TANGER", "Tanger");
		city.put("SALE", "Salé");
		city.put("RABAT", "Rabat");
		city.put("FES", "Fès");

	
		model.put("cityList", city);
 
 

		Map<String,String> country = new LinkedHashMap<String,String>();
		country.put("US", "United Stated");
		country.put("CHINA", "China");
		country.put("SG", "Singapore");
		country.put("MY", "Malaysia");
		country.put("egy", "Egypte");

		model.put("countryList", country);
 

		return "candidat/addCandidat";
	}

	@RequestMapping(value = "/candidat/addcandidat", method = RequestMethod.POST)
	public String addCandidat(
			@Valid @ModelAttribute("candidatModel") Candidat candidatModel,
			BindingResult result, Model model) {
		validator.validate(candidatModel, result);

		if (result.hasErrors()) {

			return "candidat/addCandidat";
		}

		candidatMetier.addCandidat(candidatModel);
		System.out.println("Votre compte est créer avec success !");

		return "redirect:/";

	}

	@RequestMapping(value = "/candidat/getupdatecandidat")
	public ModelAndView updateCandidat(
			@ModelAttribute("candidatModel") Candidat candidatModel,
			@RequestParam Long idCandidat) {
		candidatModel = candidatMetier.getCandidatById(idCandidat);

		return new ModelAndView("candidat/updateCandidat", "candidatModel",
				candidatModel);
	}

	@RequestMapping(value = "/candidat/updatecandidat")
	public String candidatUpdated(
			@ModelAttribute("candidatModel") Candidat candidatModel,
			@RequestParam Long idCandidat) {
		candidatMetier.updateCandidat(candidatModel);

		return "redirect:/";
	}

	@RequestMapping(value = "/candidat/deletecandidat")
	public String deleteCandidat(Model model, @RequestParam Long idCandidat) {
		candidatMetier.deleteCandidat(idCandidat);
		System.out.println("le candidat séléctionner est supprimer !");

		model.addAttribute("listCandidats", candidatMetier.getAllCandidats());
		return "candidat/AllCandidat";

	}

	@RequestMapping(value = "/candidat/getcandidat")
	public ModelAndView getCandidat(
			@ModelAttribute("candidatModel") Candidat candidatModel) {
		System.out.println("Nous avons trouver le candidat !");

		candidatModel = candidatMetier.getCandidatById(candidatModel
				.getIdCandidat());
		return new ModelAndView("candidat/getCandidat", "candidatModel",
				candidatModel);
	}

	@RequestMapping(value = "/candidat/allcandidat", method = RequestMethod.GET)
	public String AllCandidat(Model model) {

		model.addAttribute("listCandidats", candidatMetier.getAllCandidats());
		return "candidat/AllCandidat";
	}
	
	

}
