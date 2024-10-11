package Basic.Solid.Engine.Petrol;

import Basic.Solid.Engine.Petrol.Resource.Energy;
import Basic.Solid.Engine.Petrol.Resource.Oil;
import Basic.Solid.Engine.Petrol.Resource.OilPipe;
import Basic.Solid.Engine.Petrol.Resource.Piston;
import Basic.Solid.Interface.EngineInterface;

/**
 * PertrolEngine
 */
public class PertrolEngine implements EngineInterface {
  private OilPipe oilPipe;
  private Piston piston;

  public PertrolEngine(OilPipe oilPipe, Piston piston) {
    this.oilPipe = oilPipe;
    this.piston = piston;
  }

  @Override
  public void move() {
    Oil oil = this.oilPipe.suckOil();
    Energy energy = oil.burn();
    energy.push(this.piston);
  }
}
