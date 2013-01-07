/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

/**
 *
 * @author jscott1
 */
public class ToggleBallRetreiver extends CommandBase {

    public ToggleBallRetreiver() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(ballretreiver);
    }

    // Called just before this Command runs the first time
    protected void initialize() {



        if (ballretreiver.isRunning()) {
            ballretreiver.stopPulley();
        } else {
            ballretreiver.startPulley();
        }
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
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
    }
}
