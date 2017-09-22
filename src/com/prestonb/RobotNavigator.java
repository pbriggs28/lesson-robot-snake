package com.prestonb;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import com.prestonb.api.Direction;
import com.prestonb.api.DirectionResolver;
import com.prestonb.api.NavigationCommand;

public class RobotNavigator implements DirectionResolver {
	private Queue<NavigationCommand> commandList;
	private NavigationCommand currentCommand = null;

	/**
	 * TODO: Add javadoc about returning null
	 */
	@Override
	public Direction nextDirection() {
		while(currentCommand.getSteps() == 0) {
			// We have reached the end of this command's steps. Get the next command
			currentCommand = commandList.poll();
			if(currentCommand == null) {
				// We have reached the end of the command list, signal this by returning null
				return null;
			}
		}
		
		// Get the direction to move and decrement the number of steps, 
		// signaling we have already completed this step
		Direction direction = currentCommand.getDirection(); 
		currentCommand.setSteps(currentCommand.getSteps() - 1);
		
		return direction;
	}

	public void setCommandList(Collection<NavigationCommand> commandList) {
		this.commandList = new LinkedList<>(commandList);
		currentCommand = this.commandList.poll();
	}

}
