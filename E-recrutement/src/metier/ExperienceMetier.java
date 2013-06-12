package metier;

import java.util.List;

import dao.Experience;

public interface ExperienceMetier {

	public void addExperience(Experience experience);

	public void deleteExperience(Long id);

	public void updateExperience();

	public Experience getExperienceById(Long id);

	public List<Experience> getAllExperiences();
}
