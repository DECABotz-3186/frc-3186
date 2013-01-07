/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author jscott1
 */
public class ShooterFireControl extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Solenoid shooterSolenoid;
    private Solenoid shooterSolenoidReset;
    
    public ShooterFireControl(){
        shooterSolenoid = new Solenoid(RobotMap.shooterSolenoidChannelOne);
        shooterSolenoidReset = new Solenoid(RobotMap.shooterSolenoidChannelTwo);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
       
    }
    
     public void fire() {
         
         shooterSolenoid.set(true);
         shooterSolenoidReset.set(false);

    }

	public void stopFire() {
         shooterSolenoidReset.set(true);
         shooterSolenoid.set(false);
    }
}