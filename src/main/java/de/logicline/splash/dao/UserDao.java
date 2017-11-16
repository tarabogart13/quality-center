package de.logicline.splash.dao;

import de.logicline.splash.model.UserEntity;

/** 
 * DAOs used to access the User 
 *
 */
public interface UserDao extends AbstractDao<UserEntity> {

	/**
	 * load userid by its sec token
	 * 
	 * @param token
	 * @return
	 */
	public String getUserId(String token);

	/**
	 * load user by its sec token
	 * @param token
	 * @return
	 */
	public UserEntity getUser(String token);

	/**
	 * load user by its username
	 * 
	 * @param username
	 * @return
	 */
	public UserEntity getUserByName(String username);

}
