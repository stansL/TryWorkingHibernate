package ke.co.greid.models2;

// Generated Mar 23, 2015 5:02:36 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ke.co.greid.entities.*;

/**
 * Home object for domain model class Student.
 * @see ke.co.greid.models2.Student
 * @author Hibernate Tools
 */
@Stateless
public class StudentHome {

	private static final Log log = LogFactory.getLog(StudentHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Student transientInstance) {
		log.debug("persisting Student instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Student persistentInstance) {
		log.debug("removing Student instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Student merge(Student detachedInstance) {
		log.debug("merging Student instance");
		try {
			Student result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Student findById(Integer id) {
		log.debug("getting Student instance with id: " + id);
		try {
			Student instance = entityManager.find(Student.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			System.out.println(re.getMessage());
			throw re;
		}
	}
}
