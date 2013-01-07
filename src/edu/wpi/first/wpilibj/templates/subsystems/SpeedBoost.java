/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DisableSpeedBoost;

/**
 *
 * @author jscott1
 */
public class SpeedBoost extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    private Solenoid startTurbo;
    private Solenoid stopTurbo;

    public SpeedBoost() {
      startTurbo = new Solenoid(RobotMap.boosterSolenoidChannelOne);
       stopTurbo = new Solenoid(RobotMap.boosterSolenoidChannelTwo);
    }

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
        setDefaultCommand(new DisableSpeedBoost());
    }

    public void startBoost() {
        startTurbo.set(true);
        stopTurbo.set(false);
    }

    public void stopBoost() {
        startTurbo.set(false);
        stopTurbo.set(true);
    }
}
