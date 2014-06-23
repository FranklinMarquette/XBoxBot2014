/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.XBoxBot2014.subsystems;

import edu.wpi.first.XBoxBot2014.RobotMap;
import edu.wpi.first.XBoxBot2014.commands.FireStop;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author FrankyMonezz
 */
public class FIREMotor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    SpeedController motor = new Talon(RobotMap.FIREPort);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new FireStop());
    }
   
    
    public void forwards(){
        motor.set(-1);
    }
    
    public void backwards(){
        motor.set(1);
    }
    
    public void stop(){
        motor.set(0);
    }
}
