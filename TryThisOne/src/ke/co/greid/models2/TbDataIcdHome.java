package ke.co.greid.models2;

// Generated Mar 23, 2015 5:02:36 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import ke.co.greid.entities.*;

/**
 * Home object for domain model class TbDataIcd.
 * @see ke.co.greid.models2.TbDataIcd
 * @author Hibernate Tools
 */
@Stateless
public class TbDataIcdHome {

	private static final Log log = LogFactory.getLog(TbDataIcdHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(TbDataIcd transientInstance) {
		log.debug("persisting TbDataIcd instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(TbDataIcd persistentInstance) {
		log.debug("removing TbDataIcd instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public TbDataIcd merge(TbDataIcd detachedInstance) {
		log.debug("merging TbDataIcd instance");
		try {
			TbDataIcd result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public TbDataIcd findById(TbDataIcdId id) {
		log.debug("getting TbDataIcd instance with id: " + id);
		try {
			TbDataIcd instance = entityManager.find(TbDataIcd.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
