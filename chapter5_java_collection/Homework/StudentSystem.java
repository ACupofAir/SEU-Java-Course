package chapter5_java_collection.Homework;
                                                              
import java.io.File;                                           
import java.util.HashMap;                                      
                                                               
public class StudentSystem {                                   
                                                               
  private HashMap<Integer, Student> studentMap;                    
  private File file = new File("./studentSystem.dat");            
  public StudentSystem() {                      
    studentMap = new HashMap<Integer, Student>();    
  }                                                  
                                                               
  public static void main(String[] args) {                     
    StudentSystem studentSystem = new StudentSystem();                                          
    Student zhangSan = new Student("ZhangSan", 71108501, 80.0);
    Student liSi = new Student("LiSi", 71108502, 79.5);        
    Student wangWu = new Student("WangWu", 71108503, 91.0);    
    Student zhaoLiu = new Student("ZhaoLiu", 71108504, 60.0);  
    Student sunQi = new Student("SunQi", 71108505, 18.6);      
    studentSystem.studentMap.put(71108501, zhangSan);
  }                                                            
}                                                              
                                                               