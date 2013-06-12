package metier;

import java.util.List;

import dao.Competence;

public interface CompetenceMetier {
	

	public void addCompetence(Competence competence);

	public void deleteCompetence(Long id);

	public void updateCompetence();

	public Competence getCompetenceById(Long id);

	public List<Competence> getAllCompetences();

}
