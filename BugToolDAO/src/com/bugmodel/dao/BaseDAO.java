package com.bugmodel.dao;


import java.util.UUID;

import org.hibernate.SessionFactory;


public abstract class BaseDAO<T> {

	private Class<T> entityClass;

	public BaseDAO(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected abstract SessionFactory getSessionFactory();

	public void create(T entity) {
		getSessionFactory().getCurrentSession().persist(entity);
	}

	public void edit(T entity) {
		getSessionFactory().getCurrentSession().merge(entity);
	}

	public void remove(T entity) {
		getSessionFactory().getCurrentSession().delete(entity);
	}

	public T find(java.math.BigDecimal id) {
		return (T) getSessionFactory().getCurrentSession().get(entityClass, id);
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
