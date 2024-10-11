package Basic.Collection.Map;

public class Planet {
  private String name;
  private int mass;

  public Planet(String name, int mass) {
    this.name = name;
    this.mass = mass;
  }

  @Override
  public String toString() {
    return "Planet " + name + " usia " + mass;
  }
}
