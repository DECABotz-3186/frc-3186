package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.templates.commands.*;

public class OI {
    // Process operator interface input here.

    Joystick leftJoyStick = new Joystick(RobotMap.leftJoystickID);
    Joystick rightJoyStick = new Joystick(RobotMap.rightJoystickID);
    
   
    Button boosterButton = new JoystickButton(leftJoyStick,RobotMap.speedBoosterButtonID);
    Button shootButton = new JoystickButton(rightJoyStick,RobotMap.shooterButtonID);
    Button ballRetreiverButton = new JoystickButton(leftJoyStick, RobotMap.ballRetreiverButtonID);
    Button reverseRetreiverButton = new JoystickButton(leftJoyStick, RobotMap.reverseRetreiverButtonID);
    
    public double getLeftStick() {
        return leftJoyStick.getY();
    }

    public double getRightStick() {
        return rightJoyStick.getY();
    }
    
    public double getLeftThrottle()
    {
        return leftJoyStick.getThrottle();
    }
    
    public double getRightThrottle()
    {
        return rightJoyStick.getThrottle();
    }
    
    public OI(){
        boosterButton.whenPressed(new EnableSpeedBoost());
        boosterButton.whenReleased(new DisableSpeedBoost());
        shootButton.whenPressed(new Fireball());
	shootButton.whileHeld(new RapidFireball());
	shootButton.whenReleased(new ResetFireball());
        ballRetreiverButton.whenPressed(new ToggleBallRetreiver());
        reverseRetreiverButton.whenPressed(new UnjamBallRetriever());
    }
}
