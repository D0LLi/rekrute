package dao;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class Candidat {
	private Long idCandidat;
	private String civilite ;
	public String getCivilite() {
		return civilite;
	}

	public void setCivilite(String civilite) {
		this.civilite = civilite;
	}

	@NotEmpty(message = "Le champ Nom est obligatoire")
	private String nom;
	@NotEmpty(message = "Le champ Prenom est obligatoire")
	private String prenom;
	@NotEmpty(message = "Le champ Email est obligatoire")
	@Email(message = "Adresse e-mail non valide!")
	private String email;
	private String address;
	private Date date_de_naissance;
	private String pays;
	private String ville;
	@Length(max = 10, min = 10, message = "le numero de telephone non valide")
	@NumberFormat(style = Style.NUMBER)
	private String telephone;
	@Length(min = 6, message = "Le mot de passe doit faire 6 caractères au minimum!")
	private String password;
	@NotEmpty(message = "Retaper le mot de passe")
	private String confirmPassword;
	@NotEmpty(message = "Retaper votre email")
	private String confirmEmail ;

	public String getConfirmEmail() {
		return confirmEmail;
	}

	public void setConfirmEmail(String confirmEmail) {
		this.confirmEmail = confirmEmail;
	}

	private String fonction_actuelle;
	private String disponibilite;
	private String pretention_salariale;

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public Date getDate_de_naissance() {
		return date_de_naissance;
	}

	public void setDate_de_naissance(Date date_de_naissance) {
		this.date_de_naissance = date_de_naissance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	private CV monCV;
	private Set<Lettre_motivation> lettres_motivation = new HashSet<Lettre_motivation>();
	private Set<Candidature> candidatures = new HashSet<Candidature>();
	private Set<Alerte_Recherche> alerte_Recherche = new HashSet<Alerte_Recherche>();

	public String getDisponibilite() {
		return disponibilite;
	}

	public void setDisponibilite(String disponibilite) {
		this.disponibilite = disponibilite;
	}

	public String getPretention_salariale() {
		return pretention_salariale;
	}

	public void setPretention_salariale(String pretention_salariale) {
		this.pretention_salariale = pretention_salariale;
	}

	public Set<Alerte_Recherche> getAlerte_Recherche() {
		return alerte_Recherche;
	}

	public void setAlerte_Recherche(Set<Alerte_Recherche> alerte_Recherche) {
		this.alerte_Recherche = alerte_Recherche;
	}

	public Set<Candidature> getCandidatures() {
		return candidatures;
	}

	public void setCandidatures(Set<Candidature> candidatures) {
		this.candidatures = candidatures;
	}

	public Set<Lettre_motivation> getLettres_motivation() {
		return lettres_motivation;
	}

	public void setLettres_motivation(Set<Lettre_motivation> lettres_motivation) {
		this.lettres_motivation = lettres_motivation;
	}

	public String getFonction_actuelle() {
		return fonction_actuelle;
	}

	public void setFonction_actuelle(String fonction_actuelle) {
		this.fonction_actuelle = fonction_actuelle;
	}

	public Long getIdCandidat() {
		return idCandidat;
	}

	public void setIdCandidat(Long idCandidat) {
		this.idCandidat = idCandidat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
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

	// constructeur sans argument

	public Candidat() {
		super();

	}

	public CV getMonCV() {
		return monCV;
	}

	public void setMonCV(CV monCV) {
		this.monCV = monCV;
	}

	public Candidat(String civilite,String nom, String prenom, String email, String address,
			Date date_de_naissance, String pays, String ville,
			String telephone, String password, String fonction_actuelle,
			String disponibilite, String pretention_salariale, CV monCV,
			Set<Lettre_motivation> lettres_motivation,
			Set<Candidature> candidatures,
			Set<Alerte_Recherche> alerte_Recherche) {
		super();
		this.civilite=civilite;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.address = address;
		this.date_de_naissance = date_de_naissance;
		this.pays = pays;
		this.ville = ville;
		this.telephone = telephone;
		this.password = password;
		this.fonction_actuelle = fonction_actuelle;
		this.disponibilite = disponibilite;
		this.pretention_salariale = pretention_salariale;
		this.monCV = monCV;
		this.lettres_motivation = lettres_motivation;
		this.candidatures = candidatures;
		this.alerte_Recherche = alerte_Recherche;
	}

}
