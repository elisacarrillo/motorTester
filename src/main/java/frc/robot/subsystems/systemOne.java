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
//import frc.robot.commands.*;
import frc.robot.commands.systemOneGo;


public class systemOne extends Subsystem {

  public TalonSRX systemOne = new TalonSRX(5);

 

  public void setSpeed(double speed){
    systemOne.set(ControlMode.PercentOutput, speed);
  }
  @Override
  public void initDefaultCommand() {  
    setDefaultCommand(new systemOneGo(OI.sys1));
  }

  // Method that will stop the clock motor when called
  public void stop() {
    systemOne.set(ControlMode.PercentOutput, 0);
  }

}