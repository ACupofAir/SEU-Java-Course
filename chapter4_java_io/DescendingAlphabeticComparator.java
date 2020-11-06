package chapter4_java_io;

import java.io.File;
import java.util.Comparator;
                 
public class DescendingAlphabeticComparator implements Comparator<File> {
  public int compare(File f1, File f2) {
    return - f1.toString().toUpperCase().compareTo(f2.toString().toUpperCase());
  }                                                                           
}                                                                             
                                                                              