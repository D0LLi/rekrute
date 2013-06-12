package dao;

import java.util.List;

import org.hibernate.Session;



public class FormationImpl implements FormationDAO {

	@Override
	public void addFormation(Formation formation) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(formation);
		session.getTransaction().commit();

	}

	@Override
	public void deleteFormation(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Formation formation = (Formation) session.load(Formation.class,id);
		session.delete(formation);
		session.getTransaction().commit();

	}

	@Override
	public void updateFormation() {
		// TODO Auto-generated method stub

	}

	@Override
	public Formation getFormationById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Formation formation = (Formation) session.load(Formation.class,id);
		return formation;
		
	}

	@Override
	public List<Formation> getAllFormations() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Formation").list() ;
	}

}
