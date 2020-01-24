package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.ControlMode;
// import com.ctre.phoenix.motorcontrol.NeutralMode;
// import com.ctre.phoenix.motorcontrol.FeedbackDevice;

import edu.wpi.first.wpilibj.command.Subsystem;
// import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
// import edu.wpi.first.wpilibj.command.*;
// import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.commands.systemSixGo;

// import frc.robot.OI;
// import frc.robot.RobotMap;
// import frc.robot.commands.*;


public class systemSix extends Subsystem {

  public TalonSRX systemSix = new TalonSRX(10);


  @Override
  public void initDefaultCommand() {  
    setDefaultCommand(new systemSixGo());
  }


  public void setSpeed(){
    systemSix.set(ControlMode.PercentOutput, 0.25);
  }

  public void stop() {
    systemSix.set(ControlMode.PercentOutput, 0);
  }

}