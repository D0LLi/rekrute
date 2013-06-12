package metier;

import java.util.List;

import dao.Experience;
import dao.ExperienceDAO;

public class ExperienceImplMetier implements ExperienceMetier {
   
	private ExperienceDAO ExperienceDAO ;
	
	

	public void setExperienceDAO(ExperienceDAO experienceDAO) {
		ExperienceDAO = experienceDAO;
	}

	@Override
	public void addExperience(Experience experience) {
		ExperienceDAO.addExperience(experience);		
	}

	@Override
	public void deleteExperience(Long id) {
		ExperienceDAO.deleteExperience(id);		
	}

	@Override
	public void updateExperience() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Experience getExperienceById(Long id) {
		return ExperienceDAO.getExperienceById(id);
	}

	@Override
	public List<Experience> getAllExperiences() {
		return ExperienceDAO.getAllExperiences();
	}

}
