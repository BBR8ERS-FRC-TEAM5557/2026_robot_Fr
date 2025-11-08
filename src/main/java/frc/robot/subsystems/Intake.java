package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Intake extends SubsystemBase {
    
    public enum IntakeState {
        OFF (0),
        INTAKE (500),
        OUTTAKE (-500);

        private int rpm;
        private IntakeState (int rpm) {
            this.rpm = rpm;
    
    }
}
