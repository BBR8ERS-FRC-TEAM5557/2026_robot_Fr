package frc.robot;

/**
 * Centralized map for hardware IDs and ports.
 * Add CAN IDs, PWM ports, DIO channels, etc. here to keep usage consistent.
 */
public final class RobotMap {

    // CAN IDs
    public static final int FLYWHEEL_MOTOR_CAN_ID = 1;

    // Flywheel speed targets (RPM)
    public static final int FLYWHEEL_RPM_IDLE = 500;
    public static final int FLYWHEEL_RPM_SHOOT = 750;
    public static final int FLYWHEEL_RPM_FERRY = 1000;
    public static final int FLYWHEEL_RPM_PLOT = 1250;

    private RobotMap() {
        // Prevent instantiation
    }
}
