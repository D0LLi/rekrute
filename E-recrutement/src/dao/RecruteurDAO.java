package dao;

import java.util.List;

public interface RecruteurDAO {
	
	public void addRecruteur(Recruteur recruteur);

	public void deleteRecruteur(Long id);

	public void updateRecruteur(Recruteur recruteur);

	public Recruteur getRecruteurById(Long id);

	public List<Recruteur> getAllRecruteurs();

}
