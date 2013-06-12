package metier;

import java.util.List;

import dao.Candidat;
import dao.CandidatDAO;

public class CandidatImplMetier implements CandidatMetier{
	private CandidatDAO candidatDAO ;

	public void setCandidatDAO(CandidatDAO candidatDAO) {
		this.candidatDAO = candidatDAO;
	}

	@Override
	public void addCandidat(Candidat candidat) {
		
		candidatDAO.addCandidat(candidat);
		
	}

	@Override
	public void deleteCandidat(Long id) {
		candidatDAO.deleteCandidat(id);
		
	}

	@Override
	public void updateCandidat(Candidat candidat) {
		candidatDAO.updateCandidat(candidat);
		
	}

	@Override
	public Candidat getCandidatById(Long id) {
		
		return candidatDAO.getCandidatById(id);
	}

	@Override
	public List<Candidat> getAllCandidats() {
		
		return candidatDAO.getAllCandidats();
	}

}
