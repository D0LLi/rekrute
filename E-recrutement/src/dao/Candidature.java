package dao;

import java.util.Date;

public class Candidature {

	private Long idCandidature;
	private Date date;
	private Candidat candidat;
	private Offre offre;
	private Recruteur recruteur;

	public Long getIdCandidature() {
		return idCandidature;
	}

	public void setIdCandidature(Long idCandidature) {
		this.idCandidature = idCandidature;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Offre getOffre() {
		return offre;
	}

	public void setOffre(Offre offre) {
		this.offre = offre;
	}

	public Recruteur getRecruteur() {
		return recruteur;
	}

	public void setRecruteur(Recruteur recruteur) {
		this.recruteur = recruteur;
	}

	public Candidature(Date date) {
		super();
		this.date = date;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Candidature() {
		super();
		// TODO Auto-generated constructor stub
	}

}
