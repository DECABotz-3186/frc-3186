/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.TwoStickDrive;

/**
 *
 * @author Administrator
 */
public class DriveTrain extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private RobotDrive drive;


    public DriveTrain() {
        CANJaguar frontLeft;
        CANJaguar backLeft;
        CANJaguar frontRight;
        CANJaguar backRight;

        try {
            frontLeft = new CANJaguar(RobotMap.frontLeftJagID);
            backLeft = new CANJaguar(RobotMap.backLeftJagID);
            frontRight = new CANJaguar(RobotMap.frontRightJagID);
            backRight = new CANJaguar(RobotMap.backRightJagID);
            drive = new RobotDrive(frontLeft, backLeft, frontRight, backRight);
            drive.setSafetyEnabled(false);
           

        } catch (CANTimeoutException e) {
            e.printStackTrace();
        }
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new TwoStickDrive());
    }

    public void tankDrive(double leftStick, double rightStick) {
        drive.tankDrive(leftStick, rightStick);
    }
    
    public void timedDrive(double speed, int time){
         drive.drive(speed, 0);
        Timer.delay(time);
        drive.drive(0,0);
    }
    
    public void updateStatus(){
       
    }
        

}
