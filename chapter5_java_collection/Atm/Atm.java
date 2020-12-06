package chapter5_java_collection.Atm;
                                                          
import java.io.File;
import java.io.IOException;                     
import java.util.Scanner;                                 
                                                          
public class Atm {                                         
  private Scanner sc;                                     
  private int cmd;                                        
  private Bank bank;                                         
                                                             
  public Atm() throws IOException {                          
    this.sc = new Scanner(System.in);                        
    this.bank = new Bank(new File("./atmData.txt"));         
  }                                                          
                                                             
  
  /** 
   * @throws IOException
   */
  public void menu_first() throws IOException{                                 
    System.out.println("Hello, Please log in or register");  
    System.out.println("1.log in");                          
    System.out.println("2.sign up");                         
    System.out.println("3.exit");                            
    cmd = this.sc.nextInt();                                                            
    menu_first_reflect(cmd);                                                            
  }                                                                                     
                                                                                        
  
  /** 
   * @param cmd
   * @throws IOException
   */
  public void menu_first_reflect(int cmd) throws IOException {                                             
    if (cmd == 1) {                                                                     
      System.out.println("Username:");                                                  
      User newUser = new User(sc.next());                                               
      System.out.println("Password:");                                                  
      newUser.setPassword(this.sc.nextInt());                                           
      System.out.println("Log in Successfully");                                        
      this.bank.mapUsers.put(newUser.getUsername(), newUser);                                           
      this.bank.BankClose();                                 
      // this.menu_second();                                                               
    }                                                                                   
                                                                                        
  //   if (cmd == 2) {                                                                     
  //     System.out.println("Set up your username:");                                      
  //     this.user_name = this.sc.next();                                                  
  //     System.out.println("Set up your password:");                                      
  //     this.user_password = this.sc.next();                                              
  //     System.out.println("Hello " + this.user_name + ", you have successfully sign up");
  //     this.menu_first();                                                                
  //   }                                                                                   
  //   if (cmd == 3) {                                                                     
  //     System.out.println("Bye");                                                        
  //   }                                                                                   
  // }                                                                                     
                                                                                        
  // public void menu_second() {                                                           
  //   System.out.println("Hello " + this.user_name + " what do you want do?");            
  //   System.out.println("1. Deposit");                                                   
  //   System.out.println("3. Withdrawal");                                                
  //   System.out.println("3. Query Balance");                                             
  //   System.out.println("4. Return to up index");                                        
  //   this.cmd = this.sc.nextInt();                                                       
  //   menu_second_reflect(this.cmd);                                                      
  // }                                                                                     
                                                                                        
                                                                                        
  // /**                                                                                   
  //  * @param cmd                                                                         
  //  */                                                                                   
  // public void menu_second_reflect(int cmd) {                                            
  //   if (cmd == 1) {                                                                     
  //     System.out.println("Put you money(type the number): ");                           
  //     this.user_money += this.sc.nextInt();                                             
  //     this.menu_second();                                                               
  //   }                                                                                   
                                                                                        
  //   if (cmd == 2) {                                                                     
  //     System.out.println("Withdrawal you money(type the number): ");                    
  //     this.user_money -= this.sc.nextInt();                                             
  //     this.menu_second();                                                               
  //   }                                                                                   
                                                                                        
  //   if (cmd == 3) {                                                                     
  //     System.out.println(this.user_name + " has " + this.user_money);                   
  //     this.menu_second();                                                               
  //   }                                                                                   
                                                                                           
  //   if (cmd == 4) {                                                                     
  //     this.menu_first();                                                                
  //   }                                                                                   
  }                                                                                     
                                                                                           
                                                                                           
  // /**                                                                                   
  //  * @param args[]                                                                      
  //  */                                                                                   
  public static void main(String args[]) {                                                 
	try {                                                              
    Atm atm;                                                        
		atm = new Atm();                                                  
    atm.menu_first();                                                                     
	} catch (IOException e) {                                          
		// TODO Auto-generated catch block                                
		e.printStackTrace();                                              
	}                                                                  
  }                                                                                        
                                                                                           
}                                                                                          
                                                                                           