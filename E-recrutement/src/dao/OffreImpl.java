package dao;

import java.util.List;

import org.hibernate.Session;



public class OffreImpl implements OffreDAO {

	@Override
	public void addOffre(Offre offre) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(offre);
		session.getTransaction().commit();

	}

	@Override
	public void deleteOffre(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Offre offre = (Offre) session.load(Offre.class,id);
		session.delete(offre);
		session.getTransaction().commit();
	}

	@Override
	public void updateOffre() {
		// TODO Auto-generated method stub

	}

	@Override
	public Offre getOffreById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Offre offre = (Offre) session.load(Offre.class,id);
		return offre;
		
	}

	@Override
	public List<Offre> getAllOffres() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Offre").list() ;
	}

}
