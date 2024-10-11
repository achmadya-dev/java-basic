package Basic.Vehicles;

import java.util.Scanner;

import Basic.Vehicles.Car;

public class Main {
  public static void main(String[] args) {
    System.out.println("Hello world");

    Car car = new Car("lambo");
    car.run();
    String carName = car.getCarName();

    System.out.println(carName);

    System.out.println();

    char[] astring = { 'a', 'b', 'c', 'd', 'e' };

    System.out.println(astring);

    String bstring = new String(astring);

    System.out.println(bstring);

    // panjang string
    String panjangString = "Hello world";
    System.out.println(panjangString.length());

    // index ke-n dari string
    String indexString = "Hello world";
    System.out.println(indexString.charAt(2));

    // Scanner input output

    System.out.println();
    System.out.println();
    System.out.println();

    // System.out.println("Program untuk memasukan input output");
    // System.out.print("Masukan nama: ");
    //
    // String nama;
    // int umur;
    //
    // Scanner scanner = new Scanner(System.in);
    // nama = scanner.nextLine();
    //
    // System.out.print("Masukan umur: ");
    // umur = scanner.nextInt();
    //
    // System.out.println("Nama kamu " + nama + " umur kamu " + umur);

    // Array
    int[] numbers = new int[] { 1, 2, 3, 4, 5 };

    System.out.println(numbers[3]);

    int[] fixedArr = new int[5];
    fixedArr[0] = 1;
    fixedArr[2] = 3;
    // fixedArr[6] = 6; // error

    System.out.println(fixedArr[2]);

    for (int i = 0; i < numbers.length; i++) {
      System.out.println(numbers[i]);
    }
  }
}
