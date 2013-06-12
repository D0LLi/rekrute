package metier;

import java.util.List;

import dao.Alerte_Recherche;



public interface Alerte_RechercheMetier {
	
	public void addAlerte(Alerte_Recherche alerte);

	public void deleteAlerte(Long id);

	public void updateAlertet();

	public Alerte_Recherche getAlerteById(Long id);

	public List<Alerte_Recherche> getAllAlertes();

}
