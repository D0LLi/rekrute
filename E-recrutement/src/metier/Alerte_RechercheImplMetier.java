package metier;

import java.util.List;

import dao.Alerte_Recherche;
import dao.Alerte_RechercheDAO;

public class Alerte_RechercheImplMetier implements Alerte_RechercheMetier {
	
	private Alerte_RechercheDAO alerte_RechercheDAO ;

	public void setAlerte_RechercheDAO(Alerte_RechercheDAO alerte_RechercheDAO) {
		this.alerte_RechercheDAO = alerte_RechercheDAO;
	}

	@Override
	public void addAlerte(Alerte_Recherche alerte) {
		alerte_RechercheDAO.addAlerte(alerte);

	}

	@Override
	public void deleteAlerte(Long id) {
		alerte_RechercheDAO.deleteAlerte(id);

	}

	@Override
	public void updateAlertet() {
		// TODO Auto-generated method stub

	}

	@Override
	public Alerte_Recherche getAlerteById(Long id) {
		
		return alerte_RechercheDAO.getAlerteById(id);
	}

	@Override
	public List<Alerte_Recherche> getAllAlertes() {
		
		return alerte_RechercheDAO.getAllAlertes();
	}

}
