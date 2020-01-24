package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.TalonSRX;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

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

public class systemThree extends Subsystem {

  public VictorSPX systemThree = new VictorSPX(7);

  public void setSpeed(double speed){
    systemThree.set(ControlMode.PercentOutput, speed);
  }

  @Override
  public void initDefaultCommand() {  
    setDefaultCommand(new systemThreeGo(OI.sys3));
  }

  



  public void stop() {
    systemThree.set(ControlMode.PercentOutput, 0);
  }

}