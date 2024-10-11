package Basic.Solid.Engine.Electric;

import Basic.Solid.Engine.Electric.Resource.SpeedController;
import Basic.Solid.Interface.EngineInterface;

/**
 * ElectricEngine
 */
public class ElectricEngine implements EngineInterface {

  private SpeedController speedController;

  public ElectricEngine(SpeedController speedController) {
    this.speedController = speedController;
  }

  @Override
  public void move() {
    speedController.control();
  }
}
