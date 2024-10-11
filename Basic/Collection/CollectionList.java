package Basic.Collection;

import java.util.List;
import java.util.ArrayList;

public class CollectionList {
  public static void main(String[] args) {
    List<String> planets = new ArrayList<>();

    planets.add("mars");
    planets.add("bumi");

    System.out.println("print planet: ");
    for (int i = 0; i < planets.size(); i++) {
      System.out.println(planets.get(i));
    }
  }
}
