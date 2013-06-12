package dao;

import java.util.List;

public interface ExperienceDAO {
	
	public void addExperience(Experience experience);

	public void deleteExperience(Long id);

	public void updateExperience();

	public Experience getExperienceById(Long id);

	public List<Experience> getAllExperiences();


}
