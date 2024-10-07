public class FloatingPoint{
  public static void main(String[] args) {
    double x = 92.98; 
    int nx = (int) Math.round(x);
    // Math.round akan mereturn number bertipe long
    // hal tersebut diketahui melalui pesan error,
    // maka dari itu, apabila akan mengassign ke dalam
    // variable bertipe int perlu dicasting
    System.out.println(x);
    System.out.println(nx);
  }
}
