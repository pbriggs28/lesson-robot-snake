package com.prestonb.api;

public class NavigationCommand {

	private Direction direction;
	private int steps;
	
	public NavigationCommand(Direction direction, int steps) {
		this.direction = direction;
		this.steps = steps;
	}
	
	public Direction getDirection() {
		return direction;
	}
	public void setDirection(Direction direction) {
		this.direction = direction;
	}
	public int getSteps() {
		return steps;
	}
	public void setSteps(int steps) {
		this.steps = steps;
	}
}
