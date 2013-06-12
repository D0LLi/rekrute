package dao;

import java.util.List;

public interface Alerte_RechercheDAO {
	
	public void addAlerte(Alerte_Recherche alerte);

	public void deleteAlerte(Long id);

	public void updateAlertet();

	public Alerte_Recherche getAlerteById(Long id);

	public List<Alerte_Recherche> getAllAlertes();

}
