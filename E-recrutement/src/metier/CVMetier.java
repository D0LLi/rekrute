package metier;

import java.util.List;

import dao.CV;

public interface CVMetier {
	
	public void addCV(CV cv);

	public void deleteCV(Long id);

	public void updateCV();

	public CV getCVById(Long id);

	public List<CV> getAllCVs();

}
