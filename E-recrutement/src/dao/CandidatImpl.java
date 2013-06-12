package dao;

import java.util.List;

import org.hibernate.Session;



public class CandidatImpl implements CandidatDAO {
	
	public void init(){
		System.out.println("Initalisationxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
	}

	@Override
	public void addCandidat(Candidat candidat) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(candidat);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteCandidat(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Candidat candidat = (Candidat) session.load(Candidat.class,id);
		session.delete(candidat);
		session.getTransaction().commit();
		
	}

	@Override
	public void updateCandidat(Candidat candidat) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Candidat candidatupdated = (Candidat) session.load(Candidat.class,candidat.getIdCandidat());
		candidatupdated = candidat ;
		session.update(candidatupdated);
		session.getTransaction().commit();
		

		
	}



	@Override
	public Candidat getCandidatById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	
		Candidat candidat = (Candidat) session.load(Candidat.class,id);
		return candidat;
		
	
	}

	@Override
	public List<Candidat> getAllCandidats() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
	
		return session.createQuery("from Candidat").list() ;
	
	}

}
