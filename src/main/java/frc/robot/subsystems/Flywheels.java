package frc.robot.subsystems;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.motorcontrol.Talon;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj2.command.Commands;
import frc.robot.RobotMap;

public class Flywheels extends SubsystemBase {

    Talon flywheelMotor = new Talon(RobotMap.FLYWHEEL_MOTOR_CAN_ID);

    // PID controller for flywheel speed regulation
    PIDController flywheelPID = new PIDController(0.1, 0.0, 0.0);
    // Define flywheel states with associated RPM values
    public enum FlywheelState {
        OFF (0),
        IDLE (RobotMap.FLYWHEEL_RPM_IDLE),
        SHOOT (RobotMap.FLYWHEEL_RPM_SHOOT),
        FERRY (RobotMap.FLYWHEEL_RPM_FERRY),
        PLOT (RobotMap.FLYWHEEL_RPM_PLOT);

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
    public FlywheelState currentState = FlywheelState.IDLE;


    @Override
    public void periodic() {
        super.periodic();
    }  void setState(FlywheelState state) {
        currentState = state;
        // Additional logic to set motor speeds based on state can be added here
    }

    public Command Shoot() {
        // Command to set flywheels to SHOOT state
        return Commands.startEnd(() -> setState(FlywheelState.SHOOT), () -> setState(FlywheelState.IDLE)).withName("Shoot Command");
    }
    
    public Command Ferry() {
        // Command to set flywheels to FERRY state
        return Commands.startEnd(() -> setState(FlywheelState.FERRY), () -> setState(FlywheelState.IDLE)).withName("Ferry Command");
        
    }

    public Command Plot() {
        // Command to set flywheels to PLOT state
        return Commands.startEnd(() -> setState(FlywheelState.PLOT), () -> setState(FlywheelState.IDLE)).withName("PLOT");
    }
    
    public Command Stop() {
        // Command to stop the flywheels
        return Commands.startEnd(() -> setState(FlywheelState.OFF), () -> {}).withName("Stop Flywheels Command");
    }



    
}
