package frc.robot;

/**
 * Centralized map for hardware IDs and ports.
 * Add CAN IDs, PWM ports, DIO channels, etc. here to keep usage consistent.
 */
public final class RobotMap {

    public final class FlywheelConstants {
    // CAN ID for the flywheel motor 
    public static final int FLYWHEEL_MOTOR_CAN_ID = 0;

    // Flywheel RPM settings
    public static final int FLYWHEEL_RPM_IDLE = 250;
    public static final int FLYWHEEL_RPM_SHOOT = 750;
    public static final int FLYWHEEL_RPM_FERRY = 1000;
    }




   



    private RobotMap() {
        // Prevent instantiation
    }
}
