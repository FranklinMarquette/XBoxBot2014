
package edu.wpi.first.XBoxBot2014;

import edu.wpi.first.XBoxBot2014.subsystems.XBox;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.XBoxBot2014.commands.ArmLauncher;
import edu.wpi.first.XBoxBot2014.commands.ArmStop;
import edu.wpi.first.XBoxBot2014.commands.FIRE;
import edu.wpi.first.XBoxBot2014.commands.ForksDown;
import edu.wpi.first.XBoxBot2014.commands.ForksStop;
import edu.wpi.first.XBoxBot2014.commands.ForksUp;
import edu.wpi.first.XBoxBot2014.commands.ManualPullSpring;
import edu.wpi.first.XBoxBot2014.commands.ManualReleaseSpring;
import edu.wpi.first.XBoxBot2014.commands.ManualStop;
import edu.wpi.first.XBoxBot2014.commands.ReleaseTension;
/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // Another type of button you can create is a DigitalIOButton, which is
    // a button or switch hooked up to the cypress module. These are useful if
    // you want to build a customized operator interface.
    // Button button = new DigitalIOButton(1);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
    
    public XBox joystick = new XBox(1);
    
    private Button fire = new JoystickButton(joystick, XBox.LB_BUTTON);
    private Button releaseTension = new JoystickButton(joystick, XBox.B_BUTTON);
    private Button armLauncher = new JoystickButton(joystick, XBox.A_BUTTON);
    private Button armStop = new JoystickButton(joystick, XBox.A_BUTTON);
    private Button releaseManual = new JoystickButton(joystick, XBox.BACK_BUTTON);
    private Button armStop2 = new JoystickButton(joystick, XBox.BACK_BUTTON);
    private Button forksUp = new JoystickButton(joystick, XBox.X_BUTTON);
    private Button forksStop = new JoystickButton(joystick, XBox.X_BUTTON);
    private Button forksDown = new JoystickButton(joystick, XBox.Y_BUTTON);
    private Button forksStop2 = new JoystickButton(joystick,XBox.Y_BUTTON);
    private Button manualPull = new JoystickButton(joystick, XBox.START_BUTTON);
    private Button manualStop = new JoystickButton(joystick, XBox.START_BUTTON);
    private Button manualRelease = new JoystickButton(joystick, XBox.RB_BUTTON);
    private Button manualStop2 = new JoystickButton(joystick, XBox.RB_BUTTON);

public OI() {
    
        armLauncher.whenPressed(new ArmLauncher());
        armStop.whenReleased(new ArmStop());
        armStop2.whenReleased(new ArmStop());
        releaseTension.whenPressed(new ReleaseTension());
        releaseManual.whenPressed(new ReleaseTension());//change to ReleaseTension()
        forksUp.whenPressed(new ForksUp());
        forksDown.whenPressed(new ForksDown());
        forksStop.whenReleased(new ForksStop());
        forksStop2.whenReleased(new ForksStop());
        fire.whenPressed(new FIRE());
        manualPull.whenPressed(new ManualPullSpring());
        manualStop.whenReleased(new ManualStop());
        manualRelease.whenPressed(new ManualReleaseSpring());
        manualStop2.whenReleased(new ManualStop());
        
}
        
}
        
        