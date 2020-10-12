//package bank;
import java.util.Scanner;

public class Atm {
  private Scanner sc;
  private String user_name;
  private int user_money;
  private int cmd;
  public String user_password;

  public Atm() {
    this.sc = new Scanner(System.in);
    this.user_money = 0;
  }

  public void menu_first() {
    System.out.println("Hello, Please log in or register");
    System.out.println("1.log in");
    System.out.println("2.sign up");
    System.out.println("3.exit");
    cmd = this.sc.nextInt();
    menu_first_reflect(cmd);
  }

  public void menu_first_reflect(int cmd) {
    if(cmd == 1) {
      System.out.println("Username:");
      this.user_name = sc.next();
      System.out.println("Password:");
      this.user_password = this.sc.next();
      System.out.println("Log in Successfully");
      this.menu_second();
    }

    if(cmd == 2) {
      System.out.println("Set up your username:");
      this.user_name = this.sc.next();
      System.out.println("Set up your password:");
      this.user_password = this.sc.next();
      System.out.println("Hello "+this.user_name+ ", you have successfully sign up");
      this.menu_first();
    }
     if(cmd == 3) {
      System.out.println("Bye");
     }
  }

  public void menu_second() {
      System.out.println("Hello "+this.user_name+ " what do you want do?");
      System.out.println("1. Deposit");
      System.out.println("2. Withdrawal");
      System.out.println("3. Query Balance");
      System.out.println("4. Return to up index");
      this.cmd = this.sc.nextInt();
      menu_second_reflect(this.cmd);
  }

  public void menu_second_reflect(int cmd) {
    if(cmd == 1) {
      System.out.println("Put you money(type the number): ");
      this.user_money += this.sc.nextInt();
      this.menu_second();
    }

    if(cmd == 2) {
      System.out.println("Withdrawal you money(type the number): ");
      this.user_money -= this.sc.nextInt();
      this.menu_second();
    }

    if(cmd == 3) {
      System.out.println(this.user_name + " has " + this.user_money);
      this.menu_second();
    }
    
    if(cmd == 4) {
      this.menu_first();
    }
  }


  public static void main(String args[]) {
    Atm user = new Atm();
    user.menu_first();
  }

}
