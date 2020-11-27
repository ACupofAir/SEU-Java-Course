package chapter5_java_collection.AtmTeacher;
                                           
import java.io.IOException;                
import java.util.Scanner;                  
                                           
public class ATM {                         
                                           
	private Bank bank;                        
	private Scanner sc;                       
	private User currentUser;                 
                                           
	public ATM(String bankname) throws ClassNotFoundException, IOException {
		bank = new Bank(bankname);               
		sc = new Scanner(System.in);             
		currentUser = null;                      
	}                                         
                                           
	public Bank getBank() {                   
		return bank;                             
	}                                         
                                           
	public void userMenu() {                  
		System.out.println("Welcome, please sign up or log in: ");
		System.out.println("1. sign up;");       
		System.out.println("2. log in;");        
		System.out.println("3. exit;");          
	}                                         
                                           
	public void nameMenu() {                  
		System.out.println("Please input your name: ");
	}                                         
                                           
	public void passwordMenu() {              
		System.out.println("Please input your password: ");
	}                                         
                                           
	public void transactionMenu() {           
		System.out.println("Welcome " + currentUser.getName() + ", please select your transaction: ");
		System.out.println("1. deposit");        
		System.out.println("2. withdrawal");     
		System.out.println("3. query");          
		System.out.println("4. log out");        
	}                                         
                                           
	public void amountForDepositMenu() {      
		System.out.println("Please input the amount to deposit:");
	}                                         
                                           
	public void amountForWithdrawalMenu() {   
		System.out.println("Please input the amount to withdrawal:");
	}                                         
                                           
	public void showMenu() throws IOException {
		int selection = 0;                       
		int amount = 0;                          
		User result = null;                      
		String name = null;                      
		String password = null;                  
		while (true) {                           
			userMenu();                             
			selection = sc.nextInt();               
			switch (selection) {                    
			case 3:                                 
				bank.save();                           
				System.out.println("Bye!");            
				return;                                
			case 1:                                 
				nameMenu();                            
				name = sc.next();                      
				passwordMenu();                        
				password = sc.next();                  
				result = bank.createNewUser(name, password);
				if (result == null) {                  
					System.out.println("Sorry, this user already existed.");
					continue;                             
				} else {                               
					currentUser = result;                 
					System.out.println("Welcome, " + currentUser.getName() + "!");
					break;                                
				}                                      
			case 2:                                 
				while (true) {                         
					nameMenu();                           
					name = sc.next();                     
					passwordMenu();                       
					password = sc.next();                 
					result = bank.getUser(name, password);
					if (result == null) {                 
						System.out.println("Sorry, wrong name or wrong password. Please input again.");
						continue;                            
					} else {                              
						currentUser = result;                
						while (true) {                       
							transactionMenu();                  
							selection = sc.nextInt();           
							switch (selection) {                
							case 1:                             
								amountForDepositMenu();            
								amount = sc.nextInt();             
								bank.deposit(currentUser, amount); 
								continue;                          
							case 2:                             
								amountForWithdrawalMenu();         
								amount = sc.nextInt();             
								if(bank.withdrawal(currentUser, amount)==-1) {
									System.out.println("No enough money.");
								}                                  
								continue;                          
							case 3:                             
								System.out.println("The balance of " + currentUser.getName()
										+ " is " + currentUser.getBalance());
								continue;        
							case 4:           
								System.out.println("Bye!");
							}                 
							break;            
						}                           
						break;                      
					}                            
				}                             
			}                              
		}                               
	}                                
                                  
	public static void main(String[] args) {
		try{                            
			ATM atm = new ATM("CoSE Bank");
			atm.showMenu();                
			atm.sc.close();                
		}catch(Exception e) {           
			e.printStackTrace();           
		}                               
	}                                
}                                 
                                  