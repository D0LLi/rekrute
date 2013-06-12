package dao;

import java.util.Date;

public class Experience {
	private Long idExperience;
	private Date date_debut;
	private Date date_fin;
	private String entreprise;
	private String type;
	private String description;
	private CV monCV;

	


	public CV getMonCV() {
		return monCV;
	}



	public void setMonCV(CV monCV) {
		this.monCV = monCV;
	}



	public Experience(Date date_debut, Date date_fin, String entreprise,
			String type, String description) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.entreprise = entreprise;
		this.type = type;
		this.description = description;
	}



	public Experience() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdExperience() {
		return idExperience;
	}

	public void setIdExperience(Long idExperience) {
		this.idExperience = idExperience;
	}

	public Date getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}

	public Date getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}

	public String getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(String entreprise) {
		this.entreprise = entreprise;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
