package de.logicline.splash.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaQuery;

/**
 * Generic Abstract Superclass for all DAOs encapsulates basic DB Operations in
 * order to omit boilerplate code
 * 
 * @param <T>
 */
public abstract class AbstractDaoImpl<T> implements AbstractDao<T> {

	@PersistenceContext
	EntityManager em;

	private Class<T> entityClass;

	public AbstractDaoImpl(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#findAll()
	 */
	@Override
	public List<T> findAll() {
		CriteriaQuery<T> cq = getEntityManager().getCriteriaBuilder()
				.createQuery(entityClass);
		cq.select(cq.from(entityClass));
		return getEntityManager().createQuery(cq).getResultList();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#find(java.lang.Object)
	 */
	@Override
	public T find(Object id) {
		return getEntityManager().find(entityClass, id);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#remove(T)
	 */
	@Override
	public void remove(T entity) {
		getEntityManager().remove(getEntityManager().merge(entity));
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#remove(T)
	 */

	public void remove(List<T> entityList) {
		for (T entity : entityList) {
			getEntityManager().remove(getEntityManager().merge(entity));
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#edit(T)
	 */

	public T edit(T entity) {
		return getEntityManager().merge(entity);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#create(T)
	 */
	@Override
	public void create(T entity) {
		getEntityManager().persist(entity);
	}

	@Override
	public void create(List<T> entityList) {
		for (T entity : entityList) {
			getEntityManager().persist(entity);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see de.logicline.splash.dao.AbstractDao#getEntityManager()
	 */
	@Override
	public EntityManager getEntityManager() {
		return em;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * de.logicline.splash.dao.AbstractDao#setEntityManager(javax.persistence
	 * .EntityManager)
	 */
	@Override
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

}
