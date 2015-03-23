package ke.co.greid.models2;

// Generated Mar 23, 2015 5:02:36 PM by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import ke.co.greid.entities.*;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Block.
 * @see ke.co.greid.models2.Block
 * @author Hibernate Tools
 */
@Stateless
public class BlockHome {

	private static final Log log = LogFactory.getLog(BlockHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Block transientInstance) {
		log.debug("persisting Block instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Block persistentInstance) {
		log.debug("removing Block instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Block merge(Block detachedInstance) {
		log.debug("merging Block instance");
		try {
			Block result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Block findById(String id) {
		log.debug("getting Block instance with id: " + id);
		try {
			Block instance = entityManager.find(Block.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
