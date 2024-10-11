package Basic.Vehicles;

public class Car {
  private String name;

  public Car(String name){
    this.name = name;
  }

  public void run() {
    System.out.println("Mobil jalan");
  }

  public String getCarName(){
    return this.name;
  }
}
