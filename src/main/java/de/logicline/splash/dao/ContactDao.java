package de.logicline.splash.dao;

import java.util.List;

import de.logicline.splash.model.ContactEntity;
 
/** 
 * DAOs used to access Contacts 
 *
 */
public interface ContactDao extends AbstractDao<ContactEntity> {

	/**
	 * load contact via the associated userid
	 * 
	 * @param userId
	 * @return
	 */
	public ContactEntity getContactByUserId(String userId);

	/**
	 * load contact using last name
	 * 
	 * @param name
	 * @return
	 */
	public List<ContactEntity> findByName(String name);

}
