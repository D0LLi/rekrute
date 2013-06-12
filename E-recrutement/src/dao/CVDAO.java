package dao;

import java.util.List;

public interface CVDAO {
	
	public void addCV(CV cv);

	public void deleteCV(Long id);

	public void updateCV();

	public CV getCVById(Long id);

	public List<CV> getAllCVs();


}
