package Basic.Solid;

import Basic.Solid.Engine.Electric.Battery;
import Basic.Solid.Engine.Electric.ElectricEngine;
import Basic.Solid.Engine.Electric.Resource.BatteryManagementSystem;
import Basic.Solid.Engine.Electric.Resource.ElectricMotor;
import Basic.Solid.Engine.Electric.Resource.Electron;
import Basic.Solid.Engine.Electric.Resource.SpeedController;
import Basic.Solid.Engine.Petrol.PertrolEngine;
import Basic.Solid.Engine.Petrol.Tank;
import Basic.Solid.Engine.Petrol.Resource.Oil;
import Basic.Solid.Engine.Petrol.Resource.OilPipe;
import Basic.Solid.Engine.Petrol.Resource.Piston;
import Basic.Solid.Interface.EngineInterface;
import Basic.Solid.Interface.StorageInterface;

/**
 * Main
 */
public class Main {

  public static void main(String[] args) {
    // Petrol Car
    OilPipe oilPipe = new OilPipe(); // pipa minyak
    Piston piston = new Piston(); // piston
    EngineInterface petrolEngine = new PertrolEngine(oilPipe, piston); // membuat petro engine
    StorageInterface<Oil> tank = new Tank(); // membuat tanki

    Oil oil = new Oil(); // minyak
    Car<Oil> petrolCar = new Car<Oil>(petrolEngine, tank); // membuat petro car, dengan bahan bakar minyak
    petrolCar.refill(oil);
    petrolCar.accelerate();
    petrolCar.brake();

    // Electric Car
    Electron electron = new Electron();
    BatteryManagementSystem bms = new BatteryManagementSystem();
    ElectricMotor motor = new ElectricMotor();
    SpeedController speedController = new SpeedController(bms, motor);

    StorageInterface<Electron> battery = new Battery(electron);
    EngineInterface electricEngine = new ElectricEngine(speedController);

    Car<Electron> electricCar = new Car<Electron>(electricEngine, battery);
    electricCar.refill(electron);
    electricCar.accelerate(); // Electric car doent have piston
    electricCar.brake();
  }
}
