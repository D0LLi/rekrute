package metier;

import java.util.List;

import dao.Recruteur;

public interface RecruteurMetier {
	public void addRecruteur(Recruteur recruteur);

	public void deleteRecruteur(Long id);

	public void updateRecruteur(Recruteur recruteur);

	public Recruteur getRecruteurById(Long id);

	public List<Recruteur> getAllRecruteurs();

}
