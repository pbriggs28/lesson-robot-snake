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
		List<NavigationCommand> navCommands = loadNavCommands();
		
		RobotNavigator robotNavigator = new RobotNavigator();
		robotNavigator.setCommandList(navCommands);
		
		Snake.start(robotNavigator);
	}
	
	private List<NavigationCommand> loadNavCommands() {
		List<NavigationCommand> navCmdList = new ArrayList<>();
		navCmdList.add(new NavigationCommand(Direction.RIGHT, 4));
		navCmdList.add(new NavigationCommand(Direction.UP, 2));
		navCmdList.add(new NavigationCommand(Direction.RIGHT, 4));
		
		return navCmdList;
	}
}
