package dao;

import java.util.List;

import org.hibernate.Session;



public class CompetenceImpl implements CompetenceDAO {

	@Override
	public void addCompetence(Competence competence) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(competence);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteCompetence(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Competence competence = (Competence) session.load(Competence.class,id);
		session.delete(competence);
		session.getTransaction().commit();
		
		
	}

	@Override
	public void updateCompetence() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Competence getCompetenceById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Competence competence = (Competence) session.load(Competence.class,id);
		return competence;
		
	}

	@Override
	public List<Competence> getAllCompetences() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Competence").list() ;
	}

}
