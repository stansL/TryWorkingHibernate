package ke.co.greid.models2;

// Generated Mar 23, 2015 5:02:36 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ke.co.greid.entities.*;

/**
 * Home object for domain model class Chapter.
 * @see ke.co.greid.models2.Chapter
 * @author Hibernate Tools
 */
@Stateless
public class ChapterHome {

	private static final Log log = LogFactory.getLog(ChapterHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Chapter transientInstance) {
		log.debug("persisting Chapter instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Chapter persistentInstance) {
		log.debug("removing Chapter instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Chapter merge(Chapter detachedInstance) {
		log.debug("merging Chapter instance");
		try {
			Chapter result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Chapter findById(int id) {
		log.debug("getting Chapter instance with id: " + id);
		try {
			Chapter instance = entityManager.find(Chapter.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
