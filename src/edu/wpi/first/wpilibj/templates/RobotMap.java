package edu.wpi.first.wpilibj.templates;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static final int leftMotor = 1;
    // public static final int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static final int rangefinderPort = 1;
    // public static final int rangefinderModule = 1;
    
    public static final int leftJoystickID = 1,
                            rightJoystickID = 2,
                            frontLeftJagID = 2,
                            backLeftJagID = 3,
                            frontRightJagID = 4,
                            backRightJagID = 5,
                            shooterJagTopID = 6,
                            shooterJagBottomID = 7,
                            compressorRelaySlot = 2,
                            compressorRelayChannel = 1,
                            boosterSolenoidChannelOne = 1,
                            boosterSolenoidChannelTwo = 2,
                            shooterSolenoidChannelOne = 3,
                            shooterSolenoidChannelTwo = 4,
                            speedBoosterButtonID = 2,
                            shooterButtonID = 1,
                            ballRetreiverButtonID = 2,
                            reverseRetreiverButtonID = 3,
                            ballRetreiverSpikechannel = 2,
                            topEncoderChannelA = 0,
                            topEncoderChannelB = 0,
                            bottomEncoderChannelA = 0,
                            bottomEncoderChannelB = 0,
                            encoderCPR = 360,
                            shooterMotorsRPM = 3600;
                                                        
}
