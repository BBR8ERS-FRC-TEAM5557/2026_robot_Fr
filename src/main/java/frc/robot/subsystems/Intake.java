package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    // PID controller for intake motor speed regulation
    PIDController intakePID = new PIDController(0.1, 0.0, 0.0);
    // Define intake states with associated RPM values
    public enum IntakeState {
        OFF (0),
        IDLE (200),
        INTAKE (500),
        OUTTAKE (500);

        private int rpm;
        // Constructor to initialize the RPM value for each state
        private IntakeState (int rpm) {
            this.rpm = rpm;
    
    }
    // Getter method to retrieve the RPM value
    public int getRPM() {
        return rpm;
    }
 }
public IntakeState currentState = IntakeState.IDLE;

@Override
public void periodic() {
    super.periodic();
}  void setState(IntakeState state) {
    currentState = state;
    // Additional logic to set motor speeds based on state can be added here
}


}