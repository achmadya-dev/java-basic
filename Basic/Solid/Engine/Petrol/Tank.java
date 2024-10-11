package Basic.Solid.Engine.Petrol;

import Basic.Solid.Engine.Petrol.Resource.Oil;
import Basic.Solid.Interface.StorageInterface;

/**
 * Tank
 */
public class Tank implements StorageInterface<Oil> {
  private Oil oil;

  @Override
  public void fill(Oil source) {
    this.oil = source;
  }

  @Override
  public Oil getSource() {
    return oil;
  }
}
