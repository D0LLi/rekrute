package dao;

import java.util.List;

import org.hibernate.Session;



public class CandidatureImpl implements CandidatureDAO {

	@Override
	public void addCandidatureure(Candidature candidature) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(candidature);
		session.getTransaction().commit();

	}

	@Override
	public void deleteCandidature(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Candidature candidature = (Candidature) session.load(Candidature.class,id);
		session.delete(candidature);
		session.getTransaction().commit();


	}

	@Override
	public void updateCandidature() {
		// TODO Auto-generated method stub

	}

	@Override
	public Candidature getCandidatureById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Candidature candidature = (Candidature) session.load(Candidature.class,id);
		return candidature;
		
	}

	@Override
	public List<Candidature> getAllCandidatures() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Candidature").list() ;
	}

	
}
