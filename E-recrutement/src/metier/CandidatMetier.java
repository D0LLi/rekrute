package metier;

import java.util.List;

import dao.Candidat;

public interface CandidatMetier {

	public void addCandidat(Candidat candidat);

	public void deleteCandidat(Long id);

	public Candidat getCandidatById(Long id);

	public List<Candidat> getAllCandidats();

	void updateCandidat(Candidat candidat);

}
