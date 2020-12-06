package chapter5_java_collection.AtmTeacher;
                                                     
import java.io.*;                                    
import java.util.*;                                  
                                                     
public class Bank {                                  
                                                     
	private HashMap<String, User> users;                
	private String bankName;                                 
	private File file = new File("./bank.dat");              
	private ObjectInputStream ois;                           
	private ObjectOutputStream oos;                          
                                                          
	public Bank(String bankname) throws IOException, ClassNotFoundException{
		this.bankName = bankname;		                             
		if(!file.exists()) {                                    
			file.createNewFile();                                  
			this.users = new HashMap<String, User>();              
		}else {                                                 
			ois = new ObjectInputStream(new FileInputStream(file));
			this.users = (HashMap<String, User>)ois.readObject();  
		}                                                       
		                                                        
		oos = new ObjectOutputStream(new FileOutputStream(file));		
	}                                                        
                                                          
                                                          
	
	/** 
	 * @return String
	 */
	public String getBankName() {                            
		return bankName;                                        
	}                                                        
                                                          
	
	/** 
	 * @param bankName
	 */
	public void setBankName(String bankName) {               
		this.bankName = bankName;                               
	}                                                        
                                                          
	
	/** 
	 * @return HashMap<String, User>
	 */
	public HashMap<String, User> getUsers() {                
		return users;                                           
	}                                                        
                                                          
	/**                                                      
	 * @param name                                           
	 *            : the name of the new user;                
	 * @param password                                       
	 *            : the password of the new user;            
	 * @return the newly-created user, or null if the user is already existed.
	 *                                                       
	 */                                                      
	public User createNewUser(String name, String password) {
		if (!existedUserName(name)) {                           
			User newuser = new User(name, password);               
			this.users.put(name, newuser);                         
			return newuser;                                        
		}else return null;			                                   
	}                                                        
                                                          
	/**                                                      
	 * @param name                                           
	 * @return true if there is an existed user with the same name, or false
	 *         otherwise;                                    
	 */                                                      
	private boolean existedUserName(String name) {           
		if(this.users.containsKey(name)) {                      
			return true;                                           
		}else return false;                                     
	}                                                        
                                                          
	/**                                                      
	 * @param name                                           
	 * @param password                                       
	 * @return the user if both name and password are correct, or null if no such user
	 *         or wrong password                             
	 */                                                      
	public User getUser(String name, String password) {      
		User user = this.users.get(name);                       
		if(user!=null && user.getPassword().equals(password)) return user;
		else return null;                                       
	}                                                        
                                                          
	/**                                                      
	 * @param user                                           
	 * @param amount                                         
	 * @return 1 for a successful deposit, -1 for a failed deposit
	 */                                                      
	public void deposit(User user, int amount) {             
		user.setBalance(user.getBalance() + amount);	           
	}                                                        
                                                          
	/**                                                      
	 * @param user                                           
	 * @param amount                                         
	 * @return 1 for a successful withdrawal, -1 for a failed withdrawal
	 */                                                      
	public int withdrawal(User user, int amount) {           
		if(user.getBalance() >= amount) {                       
			user.setBalance(user.getBalance() - amount);           
			return 1;                                              
		}else return -1;                                        
	}                                                        
                                                          
	/**                                                      
	 * @param user                                           
	 * @return the balance of the user, or -1 if no such user
	 */                                                      
	public int query(User user) {                            
		return user.getBalance();                               
	}                                                        
	                                                         
	
	/** 
	 * @throws IOException
	 */
	public void save() throws IOException {                  
		this.oos.writeObject(this.users);                       
	}                                                        
}                                                         
                                                          