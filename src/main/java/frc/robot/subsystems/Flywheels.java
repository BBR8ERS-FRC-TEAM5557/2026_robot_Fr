package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.RobotMap.FlywheelConstants;

public class Flywheels extends SubsystemBase {

    private static final int Flywheelmotor = FlywheelConstants.FLYWHEEL_MOTOR_CAN_ID;
        Talon Flywheel = new Talon (Flywheelmotor);

        // PID controller for flywheel speed regulation
    PIDController flywheelPID = new PIDController(0.1, 0.0, 0.0);
    // Define flywheel states with associated RPM values
    public enum FlywheelState {
        OFF (0),
        IDLE (FlywheelConstants.FLYWHEEL_RPM_IDLE),
        SHOOT (FlywheelConstants.FLYWHEEL_RPM_SHOOT),
        FERRY (FlywheelConstants.FLYWHEEL_RPM_FERRY);

        private int rpm;
        // Constructor to initialize the RPM value for each state
        private FlywheelState(int rpm) {
            this.rpm = rpm;
            
        }
        // Getter method to retrieve the RPM value
        public int getRPM() {
            return rpm;
        }
    

    }
    public FlywheelState currentState = FlywheelState.OFF;


    @Override
    public void periodic() {
        super.periodic();
    }  void setState(FlywheelState state) {
        currentState = state;
        // Additional logic to set motor speeds based on state can be added here
    }

    public Command Shoot() {
        // Command to set flywheels to SHOOT state
        return startEnd(() -> setState(FlywheelState.SHOOT), () -> setState(FlywheelState.IDLE)).withName("Shoot Command");
    }
    
    public Command Ferry() {
        // Command to set flywheels to FERRY state
        return startEnd(() -> setState(FlywheelState.FERRY), () -> setState(FlywheelState.IDLE)).withName("Ferry Command");
        
    }

    public Command Stop() {
        // Command to stop the flywheels
        return startEnd(() -> setState(FlywheelState.OFF), () -> {}).withName("Stop Flywheels Command");
    }
    
    
    



    
}
