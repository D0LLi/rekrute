package metier;

import java.util.List;

import dao.Lettre_motivation;

public interface Lettre_motivationMetier {
	public void addLettre_motivation(Lettre_motivation lettre_motivation);

	public void deleteLettre_motivation(Long id);

	public void updateLettre_motivation();

	public Lettre_motivation getLettre_motivationById(Long id);

	public List<Lettre_motivation> getAllLettre_motivations();


}
