package chapter4_java_io;

import java.io.*;

public class temp {
  public static void main(String[] args) throws IOException{
    FileWriter fis = new FileWriter("temp.txt");
    fis.write("Java score 100!\n");
    fis.write("WJ score 100!");
    fis.flush();
    fis.close();
    FileReader fos = new FileReader("./temp.txt");
    int len = 0;
    while (len != -1) {
      len = fos.read();
      System.out.print((char)len);
    }
    fos.close();
  }
}