package de.logicline.splash.dao;

import java.util.List;

import javax.persistence.EntityManager;

/**
 * 
 * Parent of all DAOs (Data access object)
 * provides some common generic functionality to all its child DAOs
 * basically CRUD functions 
 *
 */
public interface AbstractDao<T> {

	/**
	 * Generic findAll method
	 * 
	 * @return
	 */
	public abstract List<T> findAll();

	/**
	 * Generic find By PrimaryKey
	 * 
	 * @param id
	 * @return
	 */
	public abstract T find(Object id);

	/**
	 * Generic remove
	 * 
	 * @param entity
	 */
	public abstract void remove(T entity);

	public void remove(List<T> entityList);

	/**
	 * generic update, will not make the passed reference part of persistence
	 * context
	 */
	public abstract T edit(T entity);

	/**
	 * 
	 * @param entity
	 */
	public abstract void create(T entity);

	public void create(List<T> entityList);

	public abstract EntityManager getEntityManager();

	public abstract void setEntityManager(EntityManager em);

}
