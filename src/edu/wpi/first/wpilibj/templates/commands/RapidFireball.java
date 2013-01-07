/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author jscott1
 */
public class RapidFireball extends CommandGroup {

    public RapidFireball() {
        addSequential(new Fireball());
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        addSequential(new ResetFireball());
    }
}
