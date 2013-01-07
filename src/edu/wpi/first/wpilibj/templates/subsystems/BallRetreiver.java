/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author jscott1
 */
public class BallRetreiver extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Relay pulleyMotor;
    private boolean pulleyRunning;
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        
    }

    public BallRetreiver() {
        pulleyMotor = new Relay(RobotMap.ballRetreiverSpikechannel, Relay.Direction.kForward);
        stopPulley();
    }
    
    public void startPulley(){
        pulleyMotor.set(Relay.Value.kForward);
        pulleyRunning = true;
    }
    
    public void stopPulley(){
        pulleyMotor.set(Relay.Value.kOff);
        pulleyRunning = false;
    }
    
    public void reversePulley(){
        pulleyMotor.set(Relay.Value.kReverse);
        pulleyRunning = true;
    }
    
    public boolean isRunning(){
        return pulleyRunning;
    }
}
