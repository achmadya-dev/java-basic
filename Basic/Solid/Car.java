package Basic.Solid;

import Basic.Solid.Interface.EngineInterface;
import Basic.Solid.Interface.StorageInterface;
import Basic.Solid.Interface.VehicleInterface;

/**
 * Car
 */
public class Car<T> implements VehicleInterface<T> {
  private EngineInterface engine;
  private StorageInterface<T> storage;

  public Car(EngineInterface engine, StorageInterface<T> storage) {
    this.engine = engine;
    this.storage = storage;
  }

  @Override
  public void accelerate() {
    engine.move();
  }

  @Override
  public void brake() {
    System.out.println("the car brakes");
  }

  @Override
  public void refill(T source) {
    storage.fill(source);
  }
}
