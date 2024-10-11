package Basic.Exception;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class CheckedException {
  public static void main(String[] args) {
    try {
      File file = new File("read.txt");
      FileReader reader = new FileReader(file);
      System.out.println("file successfully readed");
    } catch (IOException e) {
      System.out.println("error file not found");
    }
  }
}
