package Basic.Solid.Interface;

/**
 * Vehicle
 */
public interface VehicleInterface<T> {
  public void accelerate();

  public void brake();

  public void refill(T source);
}
