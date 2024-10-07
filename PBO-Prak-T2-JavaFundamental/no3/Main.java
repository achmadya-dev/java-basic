import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    String input = null;
    String operator = null;
    int firstNumner, secondNumber;
    Scanner scan = new Scanner(System.in);
    
    int i = 0;
    while (i < 3) {
      System.out.print("Masukan perhitungan: ");
      input = scan.nextLine();
      
      String[] split = input.split(" ");
      operator = split[1];
      firstNumner = Integer.parseInt(split[0]);
      secondNumber = Integer.parseInt(split[2]);

      if (firstNumner > 1000 || secondNumber > 1000) {
        System.out.println("Out of range");
        scan.close();
        return;
      }

      switch (operator) {
        case "+":
          System.out.println(firstNumner + secondNumber);  
          break;

        case "-":
          System.out.println(firstNumner - secondNumber);
          break;

        case "*":
          System.out.println(firstNumner * secondNumber);
          break;

        case "/":
          System.out.println(firstNumner / secondNumber);
          break;

        case "%":
          System.out.println(firstNumner % secondNumber);
          break;

        default:
          System.out.println("Input salah");
          break;
      }
      i++;
    }
  }
}
