package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Flywheels extends SubsystemBase {
    PIDController flywheelPID = new PIDController(0.1, 0.0, 0.0);
    // Define flywheel states with associated RPM values
    public enum FlywheelState {
        OFF (0),
        IDLE (500),
        SHOOT (750),
        FERRY (1000);

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
    
    

    
}
