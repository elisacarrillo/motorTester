package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
//import edu.wpi.first.wpilibj.command.*;
// import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.OI;
// import frc.robot.RobotMap;
import frc.robot.commands.*;

public class systemTwo extends Subsystem {

  public TalonSRX systemTwo = new TalonSRX(6);
  @Override
  public void initDefaultCommand() {  
    setDefaultCommand(new systemTwoGo(OI.sys2));
  }


  public void setSpeed(double speed){
    systemTwo.set(ControlMode.PercentOutput, speed);
  }

  // Method that will stop the clock motor when called
  public void stop() {
    systemTwo.set(ControlMode.PercentOutput, 0);
  }

}