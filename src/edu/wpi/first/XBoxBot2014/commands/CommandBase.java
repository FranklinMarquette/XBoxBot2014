package edu.wpi.first.XBoxBot2014.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.XBoxBot2014.OI;
import edu.wpi.first.XBoxBot2014.subsystems.ArmMotor;
import edu.wpi.first.XBoxBot2014.subsystems.BlockerMotor;
import edu.wpi.first.XBoxBot2014.subsystems.Chassis;
import edu.wpi.first.XBoxBot2014.subsystems.FIREMotor;
import edu.wpi.first.XBoxBot2014.subsystems.ForkMotor;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 * @author Author
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    // Create a single static instance of all of your subsystems
    public static FIREMotor firemotor = new FIREMotor();
    public static Chassis chassis = new Chassis();
    public static ArmMotor armmotor = new ArmMotor();
    public static ForkMotor forkmotor = new ForkMotor();
    public static BlockerMotor blockermotor = new BlockerMotor();


    public static void init() {
        // This MUST be here. If the OI creates Commands (which it very likely
        // will), constructing it during the construction of CommandBase (from
        // which commands extend), subsystems are not guaranteed to be
        // yet. Thus, their requires() statements may grab null pointers. Bad
        // news. Don't move it.
        oi = new OI();

        // Show what command your subsystem is running on the SmartDashboard
        SmartDashboard.putData(armmotor);
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
