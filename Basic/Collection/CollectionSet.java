package Basic.Collection;

import java.util.List;
import java.util.Set;
import java.util.HashSet;

public class CollectionSet {
  public static void main(String[] args) {
    Set<String> planets = new HashSet<>();

    planets.add("bumi");
    planets.add("pluto");
    planets.add("mars");

    for (String planet : planets) {
      System.out.println(planet);
    }
  }
}
