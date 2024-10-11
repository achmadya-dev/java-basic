package Basic.Solid.Interface;

/**
 * StorageInterface
 */
public interface StorageInterface<T> {

  public void fill(T source);

  public T getSource();
}
