package dao;

import java.util.List;

import org.hibernate.Session;



public class Alerte_RechercheImpl implements Alerte_RechercheDAO {

	@Override
	public void addAlerte(Alerte_Recherche alerte) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(alerte);
		session.getTransaction().commit();
		
	}

	@Override
	public void deleteAlerte(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Alerte_Recherche alerte = (Alerte_Recherche) session.load(Alerte_Recherche.class,id);
		session.delete(alerte);
		session.getTransaction().commit();
		
	}

	@Override
	public void updateAlertet() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Alerte_Recherche getAlerteById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Alerte_Recherche alerte = (Alerte_Recherche) session.load(Alerte_Recherche.class,id);
		return alerte;
		
	}

	@Override
	public List<Alerte_Recherche> getAllAlertes() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Alerte_Recherche").list() ;
	}



}
