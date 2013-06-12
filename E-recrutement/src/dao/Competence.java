package dao;

public class Competence {
	private Long idCompetence ;
	private String titre ;
	private String sous_titre ;
	private String description ;
	private CV monCV;

	public CV getMonCV() {
		return monCV;
	}
	public void setMonCV(CV monCV) {
		this.monCV = monCV;
	}
	public Competence(String titre, String sous_titre, String description) {
		super();
		this.titre = titre;
		this.sous_titre = sous_titre;
		this.description = description;
	}
	public Competence() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getIdCompetence() {
		return idCompetence;
	}
	public void setIdCompetence(Long idCompetence) {
		this.idCompetence = idCompetence;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getSous_titre() {
		return sous_titre;
	}
	public void setSous_titre(String sous_titre) {
		this.sous_titre = sous_titre;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
