import java.math.BigInteger;
import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    BigInteger A, B;
    Scanner in = new Scanner(System.in);
    A = in.nextBigInteger();
    B = in.nextBigInteger();
    System.out.println(A.add(B));
    System.out.println(A.multiply(B));
 }
}
