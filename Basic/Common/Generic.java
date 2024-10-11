package Basic.Common;

import java.util.ArrayList;
import java.util.Collection;

public class Generic {
  public static void main(String[] args) {
    Object[] objectA = new Object[100];
    Collection<Object> objectC = new ArrayList<>();

    arrayToCollection(objectA, objectC);

    String[] stringA = new String[100];
    Collection<String> stringC = new ArrayList<>();

    arrayToCollection(stringA, stringC);
  }

  public static <T> void arrayToCollection(T[] a, Collection<T> c) {
    for (T object : a) {
      c.add(object);
    }
  }
}
