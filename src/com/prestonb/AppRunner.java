package com.prestonb;

import java.util.ArrayList;
import java.util.List;

import com.prestonb.api.Direction;
import com.prestonb.api.NavigationCommand;
import com.prestonb.snake.Snake;

public class AppRunner {

	public static void main(String[] args) {
		new AppRunner().run();
	}
	
	public void run() {
		// Switch the comments on these two lines to switch between loading from
		// raw code (wrong approach) to loading from an input file (correct approach)
		// You will need to complete the method loadNavCommandsFromFile() for this to work
		
		List<NavigationCommand> navCommands = loadNavCommandsFromCode();
//		List<NavigationCommand> navCommands = loadNavCommandsFromFile();
		
		
		
		RobotNavigator robotNavigator = new RobotNavigator();
		robotNavigator.setCommandList(navCommands);
		
		Snake.start(robotNavigator);
	}
	
	/**
	 * This is just a hard coded example to show you how this should work.
	 * Populate the {@link #loadNavCommandsFromFile()} method and change the
	 * comments above to get this working from an input file.
	 * 
	 * @return
	 */
	private List<NavigationCommand> loadNavCommandsFromCode() {
		List<NavigationCommand> navCmdList = new ArrayList<>();
		navCmdList.add(new NavigationCommand(Direction.RIGHT, 4));
		navCmdList.add(new NavigationCommand(Direction.UP, 2));
		navCmdList.add(new NavigationCommand(Direction.RIGHT, 4));
		
		return navCmdList;
	}
	
	/**
	 * Finish this method so it gets the robot navigation commands from an input
	 * file.
	 * 
	 * @return
	 */
	private List<NavigationCommand> loadNavCommandsFromFile() {
		List<NavigationCommand> navCmdList = new ArrayList<>();
		return navCmdList;
	}
}
