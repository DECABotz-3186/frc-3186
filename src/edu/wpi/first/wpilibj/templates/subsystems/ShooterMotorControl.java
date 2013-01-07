/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.command.PIDSubsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author Administrator
 */
public class ShooterMotorControl extends PIDSubsystem {

    private static final double Kp = 0.5;
    private static final double Ki = 0.0;
    private static final double Kd = 0.0;
    private CANJaguar shooterJagTop;
    private CANJaguar shooterJagBottom;
    
    // Initialize your subsystem here
    public ShooterMotorControl() {
        super("ShooterControl", Kp, Ki, Kd);
        Encoder topEncoder = new Encoder(RobotMap.topEncoderChannelA, RobotMap.topEncoderChannelB);
        Encoder bottomEncoder = new Encoder(RobotMap.bottomEncoderChannelA, RobotMap.bottomEncoderChannelB);
                
        try {
                        shooterJagTop = new CANJaguar(RobotMap.shooterJagTopID);
                        shooterJagBottom = new CANJaguar(RobotMap.shooterJagBottomID);
        } catch (CANTimeoutException e) {
            e.printStackTrace();
        }
        // Use these to get going:
        // setSetpoint() -  Sets where the PID controller should move the system
        //                  to
        // enable() - Enables the PID controller.
        enable();
    }
    
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    
    public void setTopMotorSpeed(double speed){
        try {
                shooterJagTop.setX(speed);
        }
        catch (CANTimeoutException e) {
            e.printStackTrace();
        }
    }
    
    
       public void setBottomMotorSpeed(double speed){
        try {
                shooterJagBottom.setX(speed);
        }
        catch (CANTimeoutException e) {
            e.printStackTrace();
        }
        
    }
        
      public void setGunSpeed(double speed)      
        {
            double ratio = 4;
            double bottomMotor = -speed;
            double topMotor = (speed / ratio);            
            
            setTopMotorSpeed(topMotor);
            setBottomMotorSpeed(bottomMotor);
            
            
        }  
       
    protected double returnPIDInput() {
        // Return your input value for the PID loop
        // e.g. a sensor, like a potentiometer:
        // yourPot.getAverageVoltage() / kYourMaxVoltage;
        return 0.0;
    }
    
    protected void usePIDOutput(double output) {
        // Use output to drive your system, like a motor
        // e.g. yourMotor.set(output);
        shooterJagTop.set(output);
        shooterJagBottom.set(output);
    }

}
