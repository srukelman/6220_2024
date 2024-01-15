package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants.IntakeConstants;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.TalonSRX;

public class IntakeSubsystem extends SubsystemBase{

    private static IntakeSubsystem intake = null;
    private final TalonSRX intakeDrive;

    //TODO: add breakbeam sensor that senses note

    private IntakeSubsystem(){
        this.intakeDrive = new TalonSRX(IntakeConstants.k_INTAKE_MOTOR_ID);
        this.intakeDrive.setInverted(IntakeConstants.k_INTAKE_INVERTED);
        this.intakeDrive.setNeutralMode(NeutralMode.Brake);
    }

    public static IntakeSubsystem intakeSubsystem(){
        if(intake == null){
            intake = new IntakeSubsystem();
        }
        return intake;
    }

    public void setIntakeSpeed(float speed){
        this.intakeDrive.set(ControlMode.PercentOutput, speed);
    }

    public void stopIntake(){
        this.intakeDrive.set(ControlMode.PercentOutput, 0);
    }

}
