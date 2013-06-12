package metier;

import java.util.List;

import dao.Formation;

public interface FormationMetier {

	public void addFormation(Formation formation);

	public void deleteFormation(Long id);

	public void updateFormation();

	public Formation getFormationById(Long id);

	public List<Formation> getAllFormations();
}
