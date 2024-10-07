import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
 		double Gaji = 500000;
		double bonus;   
    Scanner input = new Scanner(System.in);
    int i = 0;

	  while (i < 2) {
		  System.out.print("Penjualan: ");
		  int item = input.nextInt();
		  
		  System.out.println("Item yang terjual: " + item );
		  if(item >= 40){
			  bonus = 50000 * 0.25;
			  System.out.println("Bonus: " + (int)bonus);
			  System.out.println("Total Gaji: " + (int)((bonus * item) + Gaji));
		  }
		  else if (item > 80 ){
			  bonus = 50000 * 0.35;
			  System.out.println("bonus: " + (int)bonus);
			  System.out.println("Total Gaji: " + (int)((bonus * item) + Gaji));
		  }
		  else if (item < 15){
			  bonus = 50000 * 0.15;
			  item = 15 - item;
			  System.out.println("Pemotongan: " + (int)bonus);
			  System.out.println("Total Gaji: " + (int)(Gaji - (bonus * item)));
		  }
		  else {
			  bonus = 50000 * 0.1 ;
			  System.out.println("Total gaji: " + (int)((bonus * item) + Gaji));
		  }

		  System.out.println(" ");
		  i++;
	  }
	}
}
