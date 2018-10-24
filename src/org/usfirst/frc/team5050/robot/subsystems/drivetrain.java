package org.usfirst.frc.team5050.robot.subsystems;

import edu.wpi.first.wpilibj.*;
import org.usfirst.frc.team5050.robot.commands.*;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


import org.usfirst.frc.team5050.robot.RobotMap;

/**
 *
 */
public class drivetrain extends Subsystem {
	private DifferentialDrive drivetrain = new DifferentialDrive(RobotMap.left, RobotMap.right);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	
	
	@Override
    public void initDefaultCommand() {
        setDefaultCommand(new ArcadeDrive());
    }
    
	public void TeleopDrive(Joystick driver) {
		drivetrain.arcadeDrive(driver.getY() * -1, driver.getX());
	}
	
	public void Stop() {
		drivetrain.arcadeDrive(0, 0);
	}
}

