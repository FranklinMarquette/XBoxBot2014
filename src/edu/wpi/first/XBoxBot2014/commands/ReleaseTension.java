/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.XBoxBot2014.commands;

/**
 *
 * @author FrankyMonezz
 */
public class ReleaseTension extends CommandBase {
    
    public ReleaseTension() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(armmotor);
        setTimeout(2.4);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        armmotor.backwards();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();                    
    }

    // Called once after isFinished returns true
    protected void end() {
        armmotor.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        end();
    }
}
