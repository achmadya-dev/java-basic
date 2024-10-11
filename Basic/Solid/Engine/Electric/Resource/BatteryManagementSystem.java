package Basic.Solid.Engine.Electric.Resource;

import Basic.Solid.Engine.Electric.Battery;

/**
 * BatteryManagementSystem
 */
public class BatteryManagementSystem {

  public Battery getBattery() {
    return new Battery(new Electron());
  }
}
