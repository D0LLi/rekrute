package dao;

import java.util.List;

public interface CandidatDAO {

	public void addCandidat(Candidat candidat);

	public void deleteCandidat(Long id);

	public Candidat getCandidatById(Long id);

	public List<Candidat> getAllCandidats();

	void updateCandidat(Candidat candidat);

}
