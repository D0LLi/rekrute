package metier;

import java.util.List;

import dao.Formation;
import dao.FormationDAO;

public class FormationImplMetier implements FormationMetier {
	
	private FormationDAO formationDAO ;

	public void setFormationDAO(FormationDAO formationDAO) {
		this.formationDAO = formationDAO;
	}

	@Override
	public void addFormation(Formation formation) {
		formationDAO.addFormation(formation);
	}

	@Override
	public void deleteFormation(Long id) {
		formationDAO.deleteFormation(id);
	}

	@Override
	public void updateFormation() {
		// TODO Auto-generated method stub

	}

	@Override
	public Formation getFormationById(Long id) {
		return formationDAO.getFormationById(id);
	}

	@Override
	public List<Formation> getAllFormations() {
		
		return formationDAO.getAllFormations();
	}

}
