package metier;

import java.util.List;

import dao.Competence;
import dao.CompetenceDAO;

public class CompetenceImplMetier implements CompetenceMetier {
	
	private CompetenceDAO competenceDAO ;

	public void setCompetenceDAO(CompetenceDAO competenceDAO) {
		this.competenceDAO = competenceDAO;
	}

	@Override
	public void addCompetence(Competence competence) {
		competenceDAO.addCompetence(competence);
		
	}

	@Override
	public void deleteCompetence(Long id) {
		competenceDAO.deleteCompetence(id);
		
	}

	@Override
	public void updateCompetence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Competence getCompetenceById(Long id) {
	
		return competenceDAO.getCompetenceById(id);
	}

	@Override
	public List<Competence> getAllCompetences() {
		return competenceDAO.getAllCompetences();
	}

}
