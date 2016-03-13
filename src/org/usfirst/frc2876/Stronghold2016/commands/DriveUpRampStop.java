// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2876.Stronghold2016.commands;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;



import org.usfirst.frc2876.Stronghold2016.Robot;

/**
 *
 */
public class DriveUpRampStop extends Command {

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    private double m_distance;
    private double m_speed;
 
    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_DECLARATIONS
    
    private boolean startCross;

    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
    public DriveUpRampStop(double distance, double speed) {

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTOR
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
//        m_distance = Math.abs(distance);
        m_speed = speed;

        // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=VARIABLE_SETTING
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
        requires(Robot.driveTrain);

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=REQUIRES
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	startCross = false;
    	Robot.driveTrain.resetEncoders();
    	Robot.navX.zeroYaw();
    	Robot.driveTrain.turnController.setSetpoint(0);
    	Robot.driveTrain.turnController.enable();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        // Idea is to detect when we start going up ramp.  Once that
        // happens we want to continue applying power to drive to keep
        // robot from rolling back. Stop doesn't mean stop this
        // command or set drive motor to zero, means set motor to just
        // enough to keep from rolling down ramp.

    	Robot.driveTrain.myRobot.arcadeDrive(m_speed, -Robot.driveTrain.turnController.get(), true);

        // have we started going up the ramp?
    	if (startCross == false) {
            // not yet so check if we have.
            startCross = Robot.driveTrain.isCrossingDefense();
    	} else {
            // we have started up the ramp so now apply less power to
            // drive train.
            Robot.driveTrain.myRobot.arcadeDrive(.2, -Robot.driveTrain.turnController.get(), true);

            // Another(aka better) way to do this would be to use pid
            // controller for distance, set it so setpoint is zero,
            // and let it adjust drivetrain so robot doesn't move.
            // But that's more complicated. First try just finding a
            // motor speed that will keep robot from rolling down
            // ramp.
    	}
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
        end();
    }
}
