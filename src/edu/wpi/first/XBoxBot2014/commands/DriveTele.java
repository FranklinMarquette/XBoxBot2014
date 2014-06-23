/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.XBoxBot2014.commands;

import edu.wpi.first.XBoxBot2014.OI;
import edu.wpi.first.wpilibj.Joystick;

/**
 *
 * @author FrankyMonez
 */
public class DriveTele extends CommandBase {
    
    OI frank = new OI();
    
    public DriveTele() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        chassis.setSpeed(1);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        chassis.driveTele(oi.stick.getRawAxis(2), oi.stick.getRawAxis(5));
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
