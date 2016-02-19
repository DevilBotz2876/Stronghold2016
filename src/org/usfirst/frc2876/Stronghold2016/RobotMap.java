// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc2876.Stronghold2016;

// BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.AnalogAccelerometer;
import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.CounterBase.EncodingType;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.PIDSourceType;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=IMPORTS
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS
    public static CANTalon driveTrainFrontRightTalon;
    public static CANTalon driveTrainRearRightTalon;
    public static CANTalon driveTrainFrontLeftTalon;
    public static CANTalon driveTrainRearLeftTalon;
    public static Encoder driveTrainLeftEncoder;
    public static Encoder driveTrainRightEncoder;
    public static AnalogAccelerometer driveTrainAccel;
    public static CANTalon armCANTalon;
    public static CANTalon intakeLeftTalon;
    public static CANTalon intakeRightTalon;
    public static CANTalon shooterLeftTalon;
    public static CANTalon shooterRightTalon;

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=DECLARATIONS

    public static void init() {
        // BEGIN AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
        driveTrainFrontRightTalon = new CANTalon(4);
        LiveWindow.addActuator("DriveTrain", "FrontRightTalon", driveTrainFrontRightTalon);
        
        driveTrainRearRightTalon = new CANTalon(3);
        LiveWindow.addActuator("DriveTrain", "RearRightTalon", driveTrainRearRightTalon);
        
        driveTrainFrontLeftTalon = new CANTalon(1);
        LiveWindow.addActuator("DriveTrain", "FrontLeftTalon", driveTrainFrontLeftTalon);
        
        driveTrainRearLeftTalon = new CANTalon(2);
        LiveWindow.addActuator("DriveTrain", "RearLeftTalon", driveTrainRearLeftTalon);
        
        driveTrainLeftEncoder = new Encoder(9, 8, false, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "LeftEncoder", driveTrainLeftEncoder);
        driveTrainLeftEncoder.setDistancePerPulse(0.01076);
        driveTrainLeftEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        driveTrainRightEncoder = new Encoder(7, 6, true, EncodingType.k4X);
        LiveWindow.addSensor("DriveTrain", "RightEncoder", driveTrainRightEncoder);
        driveTrainRightEncoder.setDistancePerPulse(0.01076);
        driveTrainRightEncoder.setPIDSourceType(PIDSourceType.kDisplacement);
        driveTrainAccel = new AnalogAccelerometer(0);
        LiveWindow.addSensor("DriveTrain", "Accel", driveTrainAccel);
        driveTrainAccel.setSensitivity(0.0);
        driveTrainAccel.setZero(2.5);
        armCANTalon = new CANTalon(9);
        LiveWindow.addActuator("Arm", "CANTalon", armCANTalon);
        
        intakeLeftTalon = new CANTalon(7);
        LiveWindow.addActuator("Intake", "LeftTalon", intakeLeftTalon);
        
        intakeRightTalon = new CANTalon(8);
        LiveWindow.addActuator("Intake", "RightTalon", intakeRightTalon);
        
        shooterLeftTalon = new CANTalon(5);
        LiveWindow.addActuator("Shooter", "LeftTalon", shooterLeftTalon);
        
        shooterRightTalon = new CANTalon(6);
        LiveWindow.addActuator("Shooter", "RightTalon", shooterRightTalon);
        

    // END AUTOGENERATED CODE, SOURCE=ROBOTBUILDER ID=CONSTRUCTORS
    }
}
