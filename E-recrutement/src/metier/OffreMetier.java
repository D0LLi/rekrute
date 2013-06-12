package metier;

import java.util.List;

import dao.Offre;

public interface OffreMetier {
	
	public void addOffre(Offre offre);

	public void deleteOffre(Long id);

	public void updateOffre();

	public Offre getOffreById(Long id);

	public List<Offre> getAllOffres();


}
