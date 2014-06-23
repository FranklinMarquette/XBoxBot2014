/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.XBoxBot2014.subsystems;

import edu.wpi.first.XBoxBot2014.RobotMap;
import edu.wpi.first.XBoxBot2014.commands.ForksStop;
import edu.wpi.first.wpilibj.Jaguar;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author FrankyMonezz
 */
public class ForkMotor extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    SpeedController motor = new Jaguar(RobotMap.forkMotorPort);

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new ForksStop());
    }
    
    public void up() {
        motor.set(.75);
    }
    
    public void down() {
        motor.set(-.75);
    }
    
    public void stop(){
        motor.set(0);
    }
}
