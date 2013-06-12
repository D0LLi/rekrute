package metier;

import java.util.List;

import dao.Candidature;
import dao.CandidatureDAO;

public class CandidatureImplMetier implements CandidatureMetier {
	
	private CandidatureDAO candidatureDAO ;

	public void setCandidatureDAO(CandidatureDAO candidatureDAO) {
		this.candidatureDAO = candidatureDAO;
	}

	@Override
	public void addCandidatureure(Candidature Candidature) {
		candidatureDAO.addCandidatureure(Candidature);
		
	}

	@Override
	public void deleteCandidature(Long id) {
		candidatureDAO.deleteCandidature(id);
		
	}

	@Override
	public void updateCandidature() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Candidature getCandidatureById(Long id) {
		
		return candidatureDAO.getCandidatureById(id);
	}

	@Override
	public List<Candidature> getAllCandidatures() {
		
		return candidatureDAO.getAllCandidatures();
	}

}
