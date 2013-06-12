package dao;

import java.util.Date;

public class Formation {
	private Long idFormation;
	private Date date_debut;
	private Date date_fin;
	private String lieu;
	private String titre;
	private String description;
	private CV monCV ;

	

	public CV getMonCV() {
		return monCV;
	}

	public void setMonCV(CV monCV) {
		this.monCV = monCV;
	}

	public Formation(Date date_debut, Date date_fin, String lieu, String titre,
			String description) {
		super();
		this.date_debut = date_debut;
		this.date_fin = date_fin;
		this.lieu = lieu;
		this.titre = titre;
		this.description = description;
	}

	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdFormation() {
		return idFormation;
	}

	public void setIdFormation(Long idFormation) {
		this.idFormation = idFormation;
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

	public String getLieu() {
		return lieu;
	}

	public void setLieu(String lieu) {
		this.lieu = lieu;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
