import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String car1,car2,car3,car4;
    int i = 0;
    Scanner scan = new Scanner(System.in);
    while (i < 2) {
      car1 = scan.next();
      car2 = scan.next();
      car3 = scan.next();
      car4 = scan.next();

      if((Double.parseDouble(car1+car2+car3+car4) - 999999) % 5 == 0){
        System.out.println("Jalan");
      } else {
        System.out.println("Berhenti");
      }
      i++;
    }
  }
}
