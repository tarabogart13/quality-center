package de.logicline.splash.utils;

/** 
 * 
 * UserService is part of the model in the MVC pattern
 * It is handling the business logic, is between controller and Persistence layer
 * 
 */
public class StringUtilMethods {
	
	
	/**
	 * check to see if s string is a number
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNumeric(String str)
	{
	    for (char c : str.toCharArray())
	    {
	        if (!Character.isDigit(c)) return false;
	    }
	    return true;
	}
}
