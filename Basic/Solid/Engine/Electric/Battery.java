package Basic.Solid.Engine.Electric;

import Basic.Solid.Engine.Electric.Resource.Electron;
import Basic.Solid.Interface.StorageInterface;

/**
 * Battery
 */
public class Battery implements StorageInterface<Electron> {
  private Electron electron;

  public Battery(Electron electron) {
    this.electron = electron;
  }

  @Override
  public void fill(Electron source) {

  }

  @Override
  public Electron getSource() {
    return electron;
  }
}
