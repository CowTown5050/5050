package org.usfirst.frc.team5050.robot.commands;

import org.usfirst.frc.team5050.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Cease extends Command {

    public Cease() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
       	requires(Robot.Climber);
        }

        // Called just before this Command runs the first time
        protected void initialize() {
        }

        // Called repeatedly when this Command is scheduled to run
        protected void execute() {
        	Robot.Climber.cease();
        }

        // Make this return true when this Command no longer needs to run execute()
        protected boolean isFinished() {
            return false;
        }

        // Called once after isFinished returns true
        protected void end() {
        }

        // Called when another command which requires one or more of the same
        // subsystems is scheduled to run
        protected void interrupted() {
        }
    }
