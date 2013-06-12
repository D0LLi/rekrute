package metier;

import java.util.List;

import dao.Offre;
import dao.OffreDAO;

public class OffreImplMetier implements OffreMetier {
	
	private OffreDAO offreDAO ;

	public void setOffreDAO(OffreDAO offreDAO) {
		this.offreDAO = offreDAO;
	}

	@Override
	public void addOffre(Offre offre) {
		offreDAO.addOffre(offre);
	}

	@Override
	public void deleteOffre(Long id) {
		offreDAO.deleteOffre(id);

	}

	@Override
	public void updateOffre() {
		// TODO Auto-generated method stub

	}

	@Override
	public Offre getOffreById(Long id) {
		
		return offreDAO.getOffreById(id);
	}

	@Override
	public List<Offre> getAllOffres() {
		
		return offreDAO.getAllOffres();
	}

}
