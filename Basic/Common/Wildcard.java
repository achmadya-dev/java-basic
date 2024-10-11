package Basic.Common;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Wildcard {
  public static void main(String[] args) {
    List<String> city = new ArrayList<>();
    city.add("bandung");
    city.add("jakarta");
    city.add("malang");

    print(city);

    Collection<String> planet = new ArrayList<>();
    planet.add("mars");
    planet.add("bumi");
    planet.add("pluto");

    print(planet);
  }

  public static void print(Collection<?> collection) {
    for (Object object : collection) {
      System.out.println(object);
    }
  }
}
