package chapter5_java_collection.Atm;
                                                                         
import java.util.HashMap;                                                
import java.util.*;                                                                                  
import java.io.*;                                                                                    
                                                                                                     
public class Bank {                                                                                  
  public HashMap<String, User> mapUsers;                                                             
  private ObjectInputStream objectInputStream;                                                       
  private ObjectOutputStream objectOutputStream;                                                     
                                                                                                     
  public Bank(File file) throws IOException {                                                              
    createFile(file);                                                         
                                                                                                     
    objectInputStream = new ObjectInputStream(new FileInputStream(file));                        
    objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));                     
                                                                                                     
  }                                                                                                  
                                                                                                     
  
  /** 
   * @param file
   * @throws IOException
   */
  public static void createFile(File file) throws IOException {                                      
    if(!file.exists() || file.isDirectory()) {                                                      
      file.createNewFile();                                                                         
    }                                                                                               
  }                                                                                                  
                                                                                                     
  
  /** 
   * @throws IOException
   */
  public void BankClose() throws IOException {                                                          
    Iterator<String> it = mapUsers.keySet().iterator();                                                 
    while(it.hasNext()) {                                                                               
      String userName = it.next();                                                                      
      objectOutputStream.writeObject(mapUsers.get(userName));                                                      
    }                                                                                                   
  }                                                                                                     
                                                                                                        
  // public void addUser(String newUserName) {                                                          
  //   mapUsers.put(newUserName, new User(newUserName));                                                
  // }                                                                                                  
}                                                                                                       
                                                                                                        