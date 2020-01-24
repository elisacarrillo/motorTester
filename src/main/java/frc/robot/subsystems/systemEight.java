package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.command.*;
// import edu.wpi.first.wpilibj.command.Subsystem;

import frc.robot.OI;
// import frc.robot.RobotMap;
import frc.robot.commands.*;


public class systemEight extends Subsystem {

  public TalonSRX systemEight = new TalonSRX(12);


  @Override
  public void initDefaultCommand() {  
    // setDefaultCommand(new SetClock(OI.clockManual));
    setDefaultCommand(new systemEightGo());
  }

  public void setSpeed(){
    systemEight.set(ControlMode.PercentOutput, 0.25);
  }

  // Method that will stop the clock motor when called
  public void stop() {
    systemEight.set(ControlMode.PercentOutput, 0);
  }

}