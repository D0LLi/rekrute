package dao;

import java.util.List;

import org.hibernate.Session;



public class RecruteurImpl implements RecruteurDAO {

	@Override
	public void addRecruteur(Recruteur recruteur) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(recruteur);
		session.getTransaction().commit();

	}

	@Override
	public void deleteRecruteur(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Recruteur recruteur = (Recruteur) session.load(Recruteur.class,id);
		session.delete(recruteur);
		
		session.getTransaction().commit();

	}

	

	@Override
	public Recruteur getRecruteurById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Recruteur recruteur = (Recruteur) session.load(Recruteur.class,id);
		return recruteur;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Recruteur> getAllRecruteurs() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Recruteur").list() ;
	}

	@Override
	public void  updateRecruteur(Recruteur recruteur) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Recruteur recruteurupdated = (Recruteur)session.load(Recruteur.class,recruteur.getIdRecruteur());
		recruteurupdated = recruteur ;
		session.update(recruteurupdated);
		session.getTransaction().commit();
		
		
	}

}
