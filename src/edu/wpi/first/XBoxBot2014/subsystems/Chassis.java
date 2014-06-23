/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.XBoxBot2014.subsystems;

import edu.wpi.first.XBoxBot2014.OI;
import edu.wpi.first.XBoxBot2014.RobotMap;
import edu.wpi.first.XBoxBot2014.commands.DriveTele;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author FrankyMonezz
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive;
    
    OI oi = new OI();

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTele());
    }
    
    public Chassis(){
        drive = new RobotDrive(RobotMap.leftMotorPort, RobotMap.rightMotorPort);
        drive.setSafetyEnabled(false);
    }
    
    public void driveTele(double leftValue, double rightValue){
        drive.tankDrive(leftValue, rightValue);
    }
    
    public void setSpeed(double speed){
        drive.setMaxOutput(speed);
    }
     
    public void driveAuton(double speed, double turnRate)
{
	drive.arcadeDrive(speed, turnRate);
}

    
}