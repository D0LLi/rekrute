package dao;

import java.util.List;

public interface OffreDAO {
	
	public void addOffre(Offre offre);

	public void deleteOffre(Long id);

	public void updateOffre();

	public Offre getOffreById(Long id);

	public List<Offre> getAllOffres();

}
