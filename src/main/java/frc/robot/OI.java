package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import java.util.function.DoubleSupplier;

import frc.robot.commands.*;
import frc.robot.ninjaLib.Gamepad;
import frc.robot.subsystems.*;



/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

public class OI {
  //// CREATING BUTTONS
  // One type of button is a joystick button which is any button on a joystick.
  // You create one by telling it which joystick it's on and which button number it is.
  // Joystick stick = new Joystick(port);
  // Button button = new JoystickButton(stick, buttonNumber);

  // There are a few additional built in buttons you can use. Additionally,
  // by subclassing Button you can create custom triggers and bind those to
  // commands the same as any other Button.

  //// TRIGGERING COMMANDS WITH BUTTONS
  // Once you have a button, it's trivial to bind it to a button in one of
  // three ways:

  // Start the command when the button is pressed and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whileHeld(new ExampleCommand());

  // Run the command while the button is being held down and interrupt it once
  // the button is released.
  // button.whileHeld(new ExampleCommand());

  // Start the command when the button is released and let it run the command
  // until it is finished as determined by it's isFinished method.
  // button.whenReleased(new ExampleCommand());

   /////////////////////
  // XBOX CONTROLLER //
  /////////////////////

  // Define the name of the controller and the port which it is assinged to
  public static Gamepad driver = new Gamepad(0);
  //public static Joystick clockJS = new Joystick(1);
  
  // DRIVE
  public static DoubleSupplier sys1 = () -> (driver.getRightX()*.8);
  public static DoubleSupplier sys2 = () -> (driver.getLeftY()*.8); 
  public static DoubleSupplier sys3 = () -> (driver.getLeftTrigger()*.8);
  public static DoubleSupplier sys4 = () -> (driver.getRightTrigger()*.8);

  // CLOCK CONTROLS
  //public static DoubleSupplier clock = () -> clockJS.getY(); 
  public static Button sys5 = new JoystickButton(driver, Gamepad.BUTTON_A);
  public static Button sys6 = new JoystickButton(driver, Gamepad.BUTTON_B);
  public static Button sys7 = new JoystickButton(driver, Gamepad.BUTTON_X);
  public static Button sys8 = new JoystickButton(driver, Gamepad.BUTTON_Y);

  // Above all you've done is given a name to the button.
  // Below is where you will tell that button what to do.
  public OI(){

    //sys5.whileHeld(new systemFiveGo());
    sys5.whileHeld(new systemFiveGo());

    sys6.whileHeld(new systemSixGo());
    sys7.whileHeld(new systemSevenGo());
    sys8.whileHeld(new systemEightGo());



    //sys5.whileHeld(new systemFiveGo(OI.sys5));
  // twelve.whileHeld(new SetClock(Clock.ClockPreset.YES));
  // three.whileHeld(new SetClock(Clock.ClockPreset.PRESET));
  // six.whileHeld(new SetClock(Clock.ClockPreset.FOUR));
  // nine.whileHeld(new SetClock(Clock.ClockPreset.SIX));
  }
}
