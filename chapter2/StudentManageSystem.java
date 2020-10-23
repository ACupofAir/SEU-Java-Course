package chapter2;
import java.util.Scanner;     
                              
public class StudentManageSystem {
                                        
    Scanner sc = new Scanner(System.in);
    Student[] students;                 
    int index = 0;                      
    int cmd;                            
    int cmd_second;                     
                                        
    public StudentManageSystem() {      
        students = new Student[50];     
    }                                   
                                        
    public void showMenu() {            
        System.out.println("Please select: ");
        System.out.println("1. Create a new student");
        System.out.println("2. Modify an existed student");
        System.out.println("3. Show statistics"); 
        System.out.println("4. Quit");  
        cmd = this.sc.nextInt();        
    }                                   
                                        
    public void createNewStudent() {    
        System.out.println("Cin the new student's name");
        this.students[index] = new Student();
        this.students[index].setName(this.sc.next());
        System.out.println("Cin the new student's age");
        students[index].setAge(this.sc.nextInt());
        System.out.println("Cin the new student's score");
        students[index].setScore(this.sc.nextInt());
        index++;                        
        System.out.println("Successfully created a new student.");
        showMenu();                     
    }                                   
                                        
    // public void  modifyExistedStudent() {
                                        
    // }                                
                                        
    public void showStatistics() {      
        System.out.println("Please choose a method: ");
        System.out.println("1. Average");
        System.out.println("2. Max");   
        System.out.println("3. Min");   
        System.out.println("4. Return");
        cmd_second = this.sc.nextInt(); 
        if(cmd_second == 1) {           
            this.showAverage();         
        } else if(cmd_second == 2) {           
            this.showMax();             
        } else if(cmd_second == 3) {           
            this.showMin();             
        }                               
        this.showMenu();                    
    }                                       
                                            
    public void showAverage() {             
        int sum = 0;                         
        for(int i = 0; i < index; i++){      
            sum += students[i].getScore();   
        }                                    
        System.out.println("The average of the students is " + sum/index);
        System.out.println();                
    }                                        
                                             
    public void showMax() {                  
        int max = 0;                         
        for(int i = 0; i < index; i++) {      
            if(this.students[i].getScore() > max) {
                max = this.students[i].getScore();
            }                                 
        }                                     
        System.out.println("The highest of the socre is " + max);
        System.out.println();                 
    }                                         
                                              
    public void showMin() {                   
        int min = this.students[0].getScore();
        for(int i = 0; i < index; i++) {      
            if(this.students[i].getScore() < min) {
                min = this.students[i].getScore();
            }                                 
        }                                     
        System.out.println("The lowest of the socre is " + min);
        System.out.println();                 
    }                                         
                                              
    public static void main(String args[]) {  
        StudentManageSystem A = new StudentManageSystem();
        A.showMenu();                         
        while(A.cmd != 4) {                   
            switch (A.cmd) {                  
                case 1:                       
                    A.createNewStudent();     
                    break;                    
                                              
                case 3:                       
                    A.showStatistics();       
                    break;                    
                                              
                default:                      
                    throw new RuntimeException("Please input a correct number");
                                              
            }                                 
                                              
        }                                     
    }                                         
}                                             