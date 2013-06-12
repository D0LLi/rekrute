package dao;

import java.util.List;

import org.hibernate.Session;



public class ExperienceImpl implements ExperienceDAO {

	@Override
	public void addExperience(Experience experience) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		session.save(experience);
		session.getTransaction().commit();

	}

	@Override
	public void deleteExperience(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Experience experience = (Experience) session.load(Experience.class,id);
		session.delete(experience);
		session.getTransaction().commit();

	}

	@Override
	public void updateExperience() {
		// TODO Auto-generated method stub

	}

	@Override
	public Experience getExperienceById(Long id) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Experience experience = (Experience) session.load(Experience.class,id);
		return experience;
		
	}

	@Override
	public List<Experience> getAllExperiences() {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		return session.createQuery("from Experience").list() ;
	}

}
