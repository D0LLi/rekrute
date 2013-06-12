package dao;

import java.util.HashSet;
import java.util.Set;

public class Recruteur {
	private Long idRecruteur;
	private String nom;
	private String Prenom;
	private String entreprise;
	private String telephone;
	private String address;
	private String email;
	private String pays;
	private String ville;
	private String password;
	private String secteur;
	private String siteweb;
	private String description;
	private Set<Offre> mes_Offres = new HashSet<Offre>();
	private Set<Candidature> candidatures = new HashSet<Candidature>();

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Set<Candidature> getCandidatures() {
		return candidatures;
	}

	public void setCandidatures(Set<Candidature> candidatures) {
		this.candidatures = candidatures;
	}

	public Set<Offre> getMes_Offres() {
		return mes_Offres;
	}

	public void setMes_Offres(Set<Offre> mes_Offres) {
		this.mes_Offres = mes_Offres;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public Recruteur(String nom, String prenom, String entreprise,
			String telephone, String address, String email, String pays,
			String ville, String password, String secteur, String siteweb,
			String description) {
		super();
		this.nom = nom;
		Prenom = prenom;
		this.entreprise = entreprise;
		this.telephone = telephone;
		this.address = address;
		this.email = email;
		this.pays = pays;
		this.ville = ville;
		this.password = password;
		this.secteur = secteur;
		this.siteweb = siteweb;
		this.description = description;
	}

	public Recruteur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdRecruteur() {
		return idRecruteur;
	}

	public void setIdRecruteur(Long idRecruteur) {
		this.idRecruteur = idRecruteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return Prenom;
	}

	public void setPrenom(String prenom) {
		Prenom = prenom;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecteur() {
		return secteur;
	}

	public void setSecteur(String secteur) {
		this.secteur = secteur;
	}

	public String getSiteweb() {
		return siteweb;
	}

	public void setSiteweb(String siteweb) {
		this.siteweb = siteweb;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
