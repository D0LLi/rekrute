package dao;

import java.util.HashSet;
import java.util.Set;

public class Offre {
	private Long idOffre;
	private String poste;
	private String salaire;
	private String profil;
	private String location;
	private String niveau_experience;
	private String contract;
	private String secteur;
	private String mot_cle;
	private Recruteur recruteur;
	private String description;

	public String getSalaire() {
		return salaire;
	}

	public void setSalaire(String salaire) {
		this.salaire = salaire;
	}

	public String getProfil() {
		return profil;
	}

	public void setProfil(String profil) {
		this.profil = profil;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Recruteur getRecruteur() {
		return recruteur;
	}

	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}

	private Set<Candidature> candidatures = new HashSet<Candidature>();

	public Set<Candidature> getCandidatures() {
		return candidatures;
	}

	public void setCandidatures(Set<Candidature> candidatures) {
		this.candidatures = candidatures;
	}

	public Offre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Offre(String poste, String profil, String location,
			String niveau_experience, String contract,String salaire, String secteur,
			String mot_cle, String description) {
		super();
		this.poste = poste;
		this.profil = profil;
		this.location = location;
		this.niveau_experience = niveau_experience;
		this.contract = contract;
		this.salaire =salaire;
		this.secteur = secteur;
		this.mot_cle = mot_cle;
		this.description = description;
	}

	public Long getIdOffre() {
		return idOffre;
	}

	public void setIdOffre(Long idOffre) {
		this.idOffre = idOffre;
	}

	

	public String getPoste() {
		return poste;
	}

	public void setPoste(String poste) {
		this.poste = poste;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getNiveau_experience() {
		return niveau_experience;
	}

	public void setNiveau_experience(String niveau_experience) {
		this.niveau_experience = niveau_experience;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public String getMot_cle() {
		return mot_cle;
	}

	public void setMot_cle(String mot_cle) {
		this.mot_cle = mot_cle;
	}
}
