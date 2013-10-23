package com.bugtool.dao;


import java.util.List;
import java.util.UUID;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Criteria;
import org.hibernate.LockMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Criterion;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public abstract class BaseDAO<T> {

	private static final Log log = LogFactory.getLog(BaseDAO.class);

	private Class<T> entityClass;

	public BaseDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	@Autowired
    private SessionFactory sessionFactory;
 
    public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Session getCurrentSession() {
        return getSessionFactory().getCurrentSession();
    }

	public void create(T entity) {
		getCurrentSession().persist(entity);
	}

	public void edit(T entity) {
		getCurrentSession().merge(entity);
	}

	public void delete(T entity) {
		getCurrentSession().delete(entity);
	}
	
	public void attachDirty(Object entity) {
		getCurrentSession().saveOrUpdate(entity);
	}

	public void attachClean(Object entity) {
		getCurrentSession().lock(entity, LockMode.NONE);
	}


	public T find(Integer id) {
		return (T) getCurrentSession().get(entityClass, id);
	}
	
	public List<T> findByCriteria(Criterion criterion) {
        Criteria criteria = getCurrentSession().createCriteria(entityClass);
        criteria.add(criterion);
        return criteria.list();
    }

	public Class<T> getEntityClass() {
		return entityClass;
	}

	public void setEntityClass(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	public String getGUID() {
		return UUID.randomUUID().toString();
	}

}
