import java.util.Scanner;

public class Strings {
	public static void main(String[] args) {
		String first, second, output;
		Scanner scanner = new Scanner(System.in);
		
		// Input
		System.out.print("Enter First String: ");
		first = scanner.nextLine().toLowerCase();
		System.out.print("Enter Second String: ");
		second = scanner.nextLine().toLowerCase();
		
		
		// Output 1
		System.out.println(first.length() + second.length());
		
		// Output 2
		if(first.compareTo(second) > 0) {
			System.out.println("Yes");
		}else{
			System.out.println("No");
		};
		
		// Output 3
		output = first.substring(0,1).toUpperCase() +
				first.substring(1) + " " +
				second.substring(0,1).toUpperCase()+
				second.substring(1);
		System.out.println(output);
	}
}
