package chapter5_java_collection.Homework;
                                                                                         
import java.io.File;                                                                                         
import java.io.FileOutputStream;                                                                             
import java.io.FileInputStream;                                                                             
import java.io.IOException;                                                                                  
import java.io.ObjectOutputStream;                                                                                                   
import java.io.ObjectInputStream;                                                                                                    
import java.util.HashMap;                                                                                                            
import java.util.Iterator;                                                                                                           
                                                                                                                                     
public class StudentSystem {                                                                                                         
  private HashMap<Integer, Student> studentMap;                                                                                      
  private File file = new File("./studentSystem.dat");                                                                               
  private ObjectOutputStream oos;                                                                                                    
  private ObjectInputStream ois;                                                                                                     
                                                                     
  public StudentSystem() throws IOException, ClassNotFoundException {
    this.studentMap = new HashMap<Integer, Student>();                                                                               
                                                                                                                                     
		if(!file.exists()) {                                                                                                               
			file.createNewFile();                                                                                                             
		}else {                                                                                                                            
			ois = new ObjectInputStream(new FileInputStream(file));                                                                           
			this.studentMap = (HashMap<Integer, Student>)ois.readObject();                                                                    
		}                                                                                                                                  
		                                                                                                                                   
		oos = new ObjectOutputStream(new FileOutputStream(file));		                                                                        
  }                                                                                                                                  
                                                                                                                                     
                                                              
  /**                                                         
   * @throws IOException                                      
   */                                                         
  public void writeToFile() throws IOException {                                                                                     
    oos.writeObject(this.studentMap);                                                                                                
    oos.flush();                                                                                                                     
    oos.close();                                                                                                                     
  }                                                                                                                                  
                                                                                                                                     
                                                              
  /**                                                         
   * @throws IOException                                      
   * @throws ClassNotFoundException                           
   */                                                         
  public void printCurFileDat() throws IOException, ClassNotFoundException {                                                         
    this.ois = new ObjectInputStream(new FileInputStream(file));                                                                     
    HashMap<Integer, Student> stuRead = new HashMap<Integer, Student>();                                                             
    stuRead = (HashMap<Integer, Student>)ois.readObject();                                                                           
    ois.close();                                                                                                                     
    Iterator<Integer> it = stuRead.keySet().iterator();                                                                              
    while(it.hasNext()) {                                                                                                            
      Integer key = it.next();                                                                                                       
      String name = stuRead.get(key).getName();                                                                                      
      System.out.println("Key: " + key + " Name: " + name);                                                                           
    }                                                                                                                                                   
  }                                                                                                                                                     
                                                                                                                                                        
  public void addThousandStudent() {                                                                                                                    
    for(int i = 0; i < 1000; i++) {                                                                                                                     
      Student tempStudent = new Student();                                                                                                              
      this.studentMap.put(tempStudent.getId(), tempStudent);                                                                                            
    }                                                                                                                                                   
    System.out.println("Add 1000 Students successfully");                                                                                               
  }                                                                                                                                                     
                                                                                                                                                        
                                                              
  /**                                                         
   * @param args                                              
   * @throws IOException                                      
   * @throws ClassNotFoundException                           
   */                                                         
  public static void main(String[] args) throws IOException, ClassNotFoundException {                                                                   
    StudentSystem studentSystem = new StudentSystem();                                                                                                  
    Student zhangSan = new Student("ZhangSan", 71108501, 80.0);                                                                                         
    Student liSi = new Student("LiSi", 71108502, 79.5);                                                                                                 
    Student wangWu = new Student("WangWu", 71108503, 91.0);                                                                                             
    Student zhaoLiu = new Student("ZhaoLiu", 71108504, 60.0);                                                                                           
    Student sunQi = new Student("SunQi", 71108505, 18.6);                                                                                               
    studentSystem.studentMap.put(71108501, zhangSan);                                                                                                   
    studentSystem.studentMap.put(71108502, liSi);                                                                                                       
    studentSystem.writeToFile();                                                                                                                        
    studentSystem.printCurFileDat();                                                                                                                    
    studentSystem.studentMap.put(71108503, wangWu);                                                                                                     
    studentSystem.studentMap.put(71108504, zhaoLiu);                                                                                                    
    studentSystem.studentMap.put(71108505, sunQi);                                                                                                      
    studentSystem.addThousandStudent();                                                                                                                 
  }                                                                                                                                                     
}                                                                                                                                                       
                                                                                                                                                        