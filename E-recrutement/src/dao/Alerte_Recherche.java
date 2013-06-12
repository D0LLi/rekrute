package dao;

public class Alerte_Recherche {
	private Long idAlerte;
	private String titre;
	private String description;
	private Candidat candidat;

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Alerte_Recherche(String titre, String description) {
		super();
		this.titre = titre;
		this.description = description;
	}

	public Alerte_Recherche() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getIdAlerte() {
		return idAlerte;
	}

	public void setIdAlerte(Long idAlerte) {
		this.idAlerte = idAlerte;
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
