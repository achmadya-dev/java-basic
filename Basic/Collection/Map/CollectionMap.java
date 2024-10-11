package Basic.Collection.Map;

import java.util.HashMap;
import java.util.Map;

import Basic.Collection.Map.Planet;

public class CollectionMap {
  public static void main(String[] args) {
    Map<String, Planet> planets = new HashMap<>();

    planets.put("1", new Planet("bumi", 22));
    planets.put("2", new Planet("pluto", 33));

    System.out.println("print planet");

    for (String key : planets.keySet()) {
      System.out.println(planets.get(key));
    }

  }
}
