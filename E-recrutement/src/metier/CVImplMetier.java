package metier;

import java.util.List;

import dao.CV;
import dao.CVDAO;

public class CVImplMetier implements CVMetier {

	  private CVDAO cvdao ;
	public void setCvdao(CVDAO cvdao) {
		this.cvdao = cvdao;
	}

	@Override
	public void addCV(CV cv) {
		cvdao.addCV(cv);
	}

	@Override
	public void deleteCV(Long id) {
		cvdao.deleteCV(id);
	}

	@Override
	public void updateCV() {
		// TODO Auto-generated method stub

	}

	@Override
	public CV getCVById(Long id) {
		return cvdao.getCVById(id);
	}

	@Override
	public List<CV> getAllCVs() {
		return cvdao.getAllCVs();
	}

}
