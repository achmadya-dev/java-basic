import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    // Initial
    Scanner scan = new Scanner(System.in);
    String s;

    // input and split
    System.out.print("Masukkan kata: ");
    s = scan.nextLine();
    scan.close();
    String[] splits = s.split("[^a-z|A-z]+");
    
    System.out.println(splits.length);
    for(String z : splits){
    	System.out.println(z);
    }
  }
}
