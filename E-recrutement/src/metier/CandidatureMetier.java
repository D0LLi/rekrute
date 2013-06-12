package metier;

import java.util.List;

import dao.Candidature;

public interface CandidatureMetier {
	public void addCandidatureure(Candidature Candidature);

	public void deleteCandidature(Long id);

	public void updateCandidature();

	public Candidature getCandidatureById(Long id);

	public List<Candidature> getAllCandidatures();


}
