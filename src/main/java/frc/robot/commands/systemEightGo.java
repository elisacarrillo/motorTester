package frc.robot.commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj.command.Command;

import frc.robot.HAL;

//import frc.robot.subsystems.systemOne;

public class systemEightGo extends Command {
  DoubleSupplier systemMan;
  boolean manual;
  //DoubleSupplier turn;
  public systemEightGo() {
    
    // Use requires() here to declare subsystem dependencies
    // eg. requires(chassis);
    //this.systemMan = systemMan;
    //this.throttle = throttle;
    requires(HAL.systemeight);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    HAL.systemeight.setSpeed();
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
