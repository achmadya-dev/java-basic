package Basic.Solid.Engine.Electric.Resource;

import Basic.Solid.Engine.Electric.Battery;

/**
 * SpeedController
 */
public class SpeedController {

  private BatteryManagementSystem bms;
  private ElectricMotor motor;

  public SpeedController(BatteryManagementSystem bms, ElectricMotor motor) {
    this.bms = bms;
    this.motor = motor;
  }

  public void control() {
    Battery battery = bms.getBattery();
    motor.rotate(battery);
  }
}
