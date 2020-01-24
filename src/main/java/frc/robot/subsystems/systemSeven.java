package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.command.*;
// import edu.wpi.first.wpilibj.command.Subsystem;

// import frc.robot.OI;
// import frc.robot.RobotMap;
import frc.robot.commands.*;


public class systemSeven extends Subsystem {

  public TalonSRX systemSeven = new TalonSRX(11);
 
  @Override
  public void initDefaultCommand() {  
    setDefaultCommand(new systemSevenGo());
  }

  
  public void setSpeed(){
    systemSeven.set(ControlMode.PercentOutput, 0.25);
  }

  // Method that will stop the clock motor when called
  public void stop() {
    systemSeven.set(ControlMode.PercentOutput, 0);
  }

}