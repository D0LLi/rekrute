package metier;

import java.util.List;

import dao.Recruteur;
import dao.RecruteurDAO;

public class RecruteurImplMetier implements RecruteurMetier {
	
	private RecruteurDAO recruteurDAO ;

	public void setRecruteurDAO(RecruteurDAO recruteurDAO) {
		this.recruteurDAO = recruteurDAO;
	}

	@Override
	public void addRecruteur(Recruteur recruteur) {
		recruteurDAO.addRecruteur(recruteur);
		
	}

	@Override
	public void deleteRecruteur(Long id) {
		recruteurDAO.deleteRecruteur(id);
		
	}


	@Override
	public Recruteur getRecruteurById(Long id) {
		return recruteurDAO.getRecruteurById(id);
	}

	@Override
	public List<Recruteur> getAllRecruteurs() {
		
		return recruteurDAO.getAllRecruteurs();
	}

	@Override
	public void updateRecruteur(Recruteur recruteur) {
		recruteurDAO.updateRecruteur(recruteur);
		
	}

}
