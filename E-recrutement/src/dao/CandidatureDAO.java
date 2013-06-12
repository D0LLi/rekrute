package dao;

import java.util.List;

public interface CandidatureDAO {
	
	public void addCandidatureure(Candidature Candidature);

	public void deleteCandidature(Long id);

	public void updateCandidature();

	public Candidature getCandidatureById(Long id);

	public List<Candidature> getAllCandidatures();


}
