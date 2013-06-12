package dao;

import java.util.List;

public interface FormationDAO {
	public void addFormation(Formation formation);

	public void deleteFormation(Long id);

	public void updateFormation();

	public Formation getFormationById(Long id);

	public List<Formation> getAllFormations();

}
