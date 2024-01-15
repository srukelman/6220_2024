package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ArmSubsystem extends SubsystemBase{

    private static ArmSubsystem arm = null;

    private ArmSubsystem(){

    }

    public static ArmSubsystem armSubsystem(){
        if(arm == null){
            arm = new ArmSubsystem();
        }
        return arm;
    }

}