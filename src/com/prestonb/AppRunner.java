package com.prestonb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.prestonb.api.Direction;
import com.prestonb.api.NavigationCommand;
import com.prestonb.snake.Snake;

public class AppRunner {

	private static final String FILE_PATH = "input/input.csv";

	public static void main(String[] args) {
		new AppRunner().run();
	}
	
	public void run() {
//		List<NavigationCommand> navCommands = loadNavCommandsFromCode();
		List<NavigationCommand> navCommands = loadNavCommandsFromFile();
		
		RobotNavigator robotNavigator = new RobotNavigator();
		robotNavigator.setCommandList(navCommands);

//		Snake.start(robotNavigator);
		Snake.start(null);
	}
	
	/**
	 * A hard coded example of how the robot navigation commands should work.
	 * 
	 * @return a list of navigation commands
	 * @see #loadNavCommandsFromFile
	 */
	private List<NavigationCommand> loadNavCommandsFromCode() {
		List<NavigationCommand> navCmdList = new ArrayList<>();
		navCmdList.add(new NavigationCommand(Direction.RIGHT, 4));
		navCmdList.add(new NavigationCommand(Direction.UP, 2));
		navCmdList.add(new NavigationCommand(Direction.RIGHT, 4));
		return navCmdList;
	}
	
	/**
	 * Gets the robot navigation commands from an input file.
	 * 
	 * @return a list of navigation commands
	 */
	private List<NavigationCommand> loadNavCommandsFromFile() {
		List<NavigationCommand> navCmdList = new ArrayList<>();
		FileReader fr = null;
		BufferedReader br = null;
		try {
			fr = new FileReader(FILE_PATH);
			br = new BufferedReader(fr);
			br.readLine(); // Skip the header row
			for (String line = br.readLine(); line != null; line = br.readLine()) {
				String[] data = line.split(",");
				String directionString = data[0];
				String stepsString = data[1];
				Direction direction = Direction.valueOf(directionString);
				int steps = Integer.valueOf(stepsString);
				navCmdList.add(new NavigationCommand(direction, steps));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)
					br.close();
				if (fr != null)
					fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return navCmdList;
	}
}
