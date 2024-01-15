package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShooterSubsystem extends SubsystemBase{

    private static ShooterSubsystem shooter = null;
    
    private ShooterSubsystem(){
    }

    public static ShooterSubsystem shooterSubsystem(){
        if(shooter == null){
            shooter = new ShooterSubsystem();
        }
        return shooter;
    }
}
