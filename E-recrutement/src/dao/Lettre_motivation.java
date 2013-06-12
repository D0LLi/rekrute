package dao;

public class Lettre_motivation {
	private Long idLettre;
	private String titre;
	private String contenu;
	private Candidat candidat;

	public Candidat getCandidat() {
		return candidat;
	}

	public void setCandidat(Candidat candidat) {
		this.candidat = candidat;
	}

	public Long getIdLettre() {
		return idLettre;
	}

	public void setIdLettre(Long idLettre) {
		this.idLettre = idLettre;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getContenu() {
		return contenu;
	}

	public void setContenu(String contenu) {
		this.contenu = contenu;
	}

	public Lettre_motivation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lettre_motivation(String titre, String contenu) {
		super();
		this.titre = titre;
		this.contenu = contenu;
	}

}
