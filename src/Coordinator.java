import java.util.ArrayList;

import apple.laf.JRSUIConstants.Direction;

public class Coordinator {
	private static Directions actualDirection = Directions.NORTH;
	private static ArrayList<String> instructions;
	
	public static void setDirection(String turningDirection) {
		System.out.println(turningDirection);
		System.out.println(actualDirection);
		int directionIndex;
		if(turningDirection.equals("R")) {
			directionIndex = 1;
		} 
		else {
			directionIndex = -1;
		}
		
		int actualDirectionIndex = actualDirection.ordinal();
		int newDirection = actualDirectionIndex + directionIndex;
		if(newDirection == -1) {
			newDirection = 3;
		}
		else if(newDirection == 4) {
			newDirection = 0;
		}
		
		actualDirection = Directions.values()[newDirection];
		System.out.println(" after change " + actualDirection);
	}
	
	public static void walk(int steps) {
		System.out.println(steps);
		actualDirection.addSteps(steps);
	}
	
	public static int calculateWay(ArrayList<String> newInstructions) {
		instructions = newInstructions;
		int blocksAway = 0;
		
		for(String instruction : instructions) {
			setDirection(instruction.substring(0, 1));
			walk(Integer.parseInt(instruction.substring((Integer)(1))));
		}
		
		System.out.println("North: " + Directions.NORTH.getCount() + " East: " + Directions.EAST.getCount());
		
		blocksAway = (Math.abs(Directions.NORTH.getCount() - Directions.SOUTH.getCount()) + Math.abs(Directions.WEST.getCount() - Directions.EAST.getCount()));
		System.out.println(blocksAway);
		return blocksAway; 
	}
}
