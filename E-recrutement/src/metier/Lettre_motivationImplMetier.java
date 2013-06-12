package metier;

import java.util.List;

import dao.Lettre_motivation;
import dao.Lettre_motivationDAO;

public class Lettre_motivationImplMetier implements Lettre_motivationMetier {
	
    private 	Lettre_motivationDAO lettre_motivationDAO ;

	public void setLettre_motivationDAO(Lettre_motivationDAO lettre_motivationDAO) {
		this.lettre_motivationDAO = lettre_motivationDAO;
	}

	@Override
	public void addLettre_motivation(Lettre_motivation lettre_motivation) {
		lettre_motivationDAO.addLettre_motivation(lettre_motivation);		
	}

	@Override
	public void deleteLettre_motivation(Long id) {
		lettre_motivationDAO.deleteLettre_motivation(id);
		
	}

	@Override
	public void updateLettre_motivation() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Lettre_motivation getLettre_motivationById(Long id) {
		
		return lettre_motivationDAO.getLettre_motivationById(id);
	}

	@Override
	public List<Lettre_motivation> getAllLettre_motivations() {
		
		return lettre_motivationDAO.getAllLettre_motivations();
	}
	
	

}
