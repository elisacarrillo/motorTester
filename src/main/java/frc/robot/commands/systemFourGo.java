package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.HAL;

//import frc.robot.subsystems.systemOne;

public class systemFourGo extends Command {
  DoubleSupplier sys4;
  //DoubleSupplier turn;
  public systemFourGo(DoubleSupplier sys4) {
    
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    this.sys4 = sys4;
    //this.throttle = throttle;
    requires(HAL.systemfour);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    HAL.systemfour.setSpeed(sys4.getAsDouble());
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
