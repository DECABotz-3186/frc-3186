/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;

/**
 *
 * @author jscott1
 */
public class CompressorSystem extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    private Compressor compressor;
    
    public CompressorSystem(){
        
        compressor = new Compressor(RobotMap.compressorRelaySlot,RobotMap.compressorRelayChannel);

        compressor.start();
    }
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
