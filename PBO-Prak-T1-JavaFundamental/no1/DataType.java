import java.util.Scanner;

public class DataType {
	public static void main(String[] args) {
		double number;
		
		Scanner scanner = new Scanner(System.in);

		while (true) {
			System.out.print("Enter Number: ");
			number = scanner.nextDouble();

			if (number == 0) {
				System.out.println("program selesai");
				break;
			}
			
			if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
				System.out.println(String.format("%.0f", number) + " Number can be fitted in: ");
			}
			
			if(number >= Byte.MIN_VALUE && number <= Byte.MAX_VALUE) {
				System.out.println("byte");
			}
			
			if(number >= Short.MIN_VALUE && number <= Short.MAX_VALUE) {
				System.out.println("short");
			}
			
			if(number >= Integer.MIN_VALUE && number <= Integer.MAX_VALUE) {
				System.out.println("int");
			}
			
			if(number >= Long.MIN_VALUE && number <= Long.MAX_VALUE) {
				System.out.println("long");
			}else {
				System.out.println(String.format("%.0f", number) + " can't be fitted anywhere");
			}	
		}
	}
}
