package dao;

import java.util.List;

import org.hibernate.Session;



public class CVImpl implements CVDAO {

	@Override
	public void addCV(CV cv) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(cv);
		session.getTransaction().commit();

	}

	@Override
	public void deleteCV(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		CV cv = (CV) session.load(CV.class,id);
		session.delete(cv);
		session.getTransaction().commit();

	}

	@Override
	public void updateCV() {
		// TODO Auto-generated method stub

	}

	@Override
	public CV getCVById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		CV cv = (CV) session.load(CV.class,id);
		return cv;
		
	}

	@Override
	public List<CV> getAllCVs() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from CV").list() ;
	}

}
