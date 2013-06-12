package dao;

import java.util.List;

import org.hibernate.Session;



public class Lettre_motivationImpl implements Lettre_motivationDAO {

	@Override
	public void addLettre_motivation(Lettre_motivation lettre_motivation) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(lettre_motivation);
		session.getTransaction().commit();
	}

	@Override
	public void deleteLettre_motivation(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Lettre_motivation lettre_motivation = (Lettre_motivation) session.load(Lettre_motivation.class,id);
        session.delete(lettre_motivation);
        session.getTransaction().commit();
	}

	@Override
	public void updateLettre_motivation() {
		// TODO Auto-generated method stub

	}

	@Override
	public Lettre_motivation getLettre_motivationById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Lettre_motivation lettre_motivation = (Lettre_motivation) session.load(Lettre_motivation.class,id);
		return lettre_motivation;
		
	}

	@Override
	public List<Lettre_motivation> getAllLettre_motivations() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Lettre_motivation").list() ;
	}

}
