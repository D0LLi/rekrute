package dao;

import java.util.List;

public interface CompetenceDAO {
	
	
	public void addCompetence(Competence competence);

	public void deleteCompetence(Long id);

	public void updateCompetence();

	public Competence getCompetenceById(Long id);

	public List<Competence> getAllCompetences();
}
