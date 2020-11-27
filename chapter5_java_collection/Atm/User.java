package chapter5_java_collection.Atm;
                                                      
public class User {
  private String username;
  private int password;
  private int deposit;

  public User(String username) {
    this.username = username;
  }

  
  /** 
   * @return String
   */
  public String getUsername() {
    return username;
  }

  
  /** 
   * @param username
   */
  public void setUsername(String username) {
    this.username = username;
  }                                                   
                                                      
  
  /** 
   * @return int
   */
  public int getPassword() {                          
    return password;                                  
  }                                                   
                                                      
  
  /** 
   * @param password
   */
  public void setPassword(int password) {             
    this.password = password;                         
  }                                                   

  
  /** 
   * @return int
   */
  public int getDeposit() {
    return deposit;
  }
  
  
  /** 
   * @param deposit
   */
  public void setDeposit(int deposit) {
    this.deposit = deposit;
  }
  
} 
  