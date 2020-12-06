package chapter5_java_collection.AtmTeacher;

import java.io.Serializable;                
                                            
public class User implements Serializable{  
                                            
	private String name;                       
	private String password;                   
	private int balance;                       
                                            
	public User(String name, String password) {
		this.name = name;                         
		this.password = password;                 
		this.balance = 0;                         
	}                                          
                                            
	
	/** 
	 * @return String
	 */
	public String getName() {                  
		return name;                              
	}                                          
                                            
	
	/** 
	 * @param name
	 */
	public void setName(String name) {         
		this.name = name;                         
	}                                          
                                            
	
	/** 
	 * @return String
	 */
	public String getPassword() {              
		return password;                          
	}                                          
                                            
	
	/** 
	 * @param password
	 */
	public void setPassword(String password) { 
		this.password = password;                 
	}                                          
                                            
	
	/** 
	 * @return int
	 */
	public int getBalance() {                  
		return balance;                           
	}                                          
                                            
	
	/** 
	 * @param balance
	 */
	public void setBalance(int balance) {      
		this.balance = balance;                   
	}                                          
                                            
}                                           
                                            