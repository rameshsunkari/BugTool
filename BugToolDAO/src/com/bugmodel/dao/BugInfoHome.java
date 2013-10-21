package com.bugmodel.dao;

// Generated Oct 21, 2013 8:40:16 PM by Hibernate Tools 4.0.0

import static org.hibernate.criterion.Example.create;

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;

import com.bugtool.model.BugInfo;

/**
 * Home object for domain model class BugInfo.
 * @see com.bugmodel.dao.BugInfo
 * @author Hibernate Tools
 */
public class BugInfoHome {

	private static final Log log = LogFactory.getLog(BugInfoHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(BugInfo transientInstance) {
		log.debug("persisting BugInfo instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(BugInfo instance) {
		log.debug("attaching dirty BugInfo instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(BugInfo instance) {
		log.debug("attaching clean BugInfo instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(BugInfo persistentInstance) {
		log.debug("deleting BugInfo instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public BugInfo merge(BugInfo detachedInstance) {
		log.debug("merging BugInfo instance");
		try {
			BugInfo result = (BugInfo) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public BugInfo findById(int id) {
		log.debug("getting BugInfo instance with id: " + id);
		try {
			BugInfo instance = (BugInfo) sessionFactory.getCurrentSession()
					.get("com.bugmodel.dao.BugInfo", id);
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<BugInfo> findByExample(BugInfo instance) {
		log.debug("finding BugInfo instance by example");
		try {
			List<BugInfo> results = (List<BugInfo>) sessionFactory
					.getCurrentSession()
					.createCriteria("com.bugmodel.dao.BugInfo")
					.add(create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
