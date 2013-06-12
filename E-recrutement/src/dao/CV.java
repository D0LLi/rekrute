package dao;

import java.util.HashSet;
import java.util.Set;

public class CV {

	private Long idCV;
	private Candidat candidat = new Candidat();
	private String divers;
	
	private Set<Experience> experiences = new HashSet<Experience>();
	private Set<Formation> formations = new HashSet<Formation>();
	private Set<Competence> competences = new HashSet<Competence>();
	

	public CV(String divers) {
		super();
		this.divers = divers;
	}

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public String getDivers() {
		return divers;
	}

	public void setDivers(String divers) {
		this.divers = divers;
	}



	public Set<Experience> getExperiences() {
		return experiences;
	}

	public void setExperiences(Set<Experience> experiences) {
		this.experiences = experiences;
	}

	public Set<Formation> getFormations() {
		return formations;
	}

	public void setFormations(Set<Formation> formations) {
		this.formations = formations;
	}

	public Set<Competence> getCompetences() {
		return competences;
	}

	public void setCompetences(Set<Competence> competences) {
		this.competences = competences;
	}

	public CV(Long idCV) {
		super();
		this.idCV = idCV;
	}

	public Long getIdCV() {
		return idCV;
	}

	public void setIdCV(Long idCV) {
		this.idCV = idCV;
	}

	public CV() {
		super();
		// TODO Auto-generated constructor stub
	}
}
