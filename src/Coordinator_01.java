import java.io.IOException;
import java.util.ArrayList;

public class Coordinator_01 {
	private static Directions actualDirection = Directions.NORTH;
	private static ArrayList<String> instructions;
	
	public static void setDirection(String turningDirection) {
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
	}
	
	public static void walk(int steps) {
		actualDirection.addSteps(steps);
	}
	
	/**
	 * to start the calculation run this method in the main method
	 * @return blocks away from the HQ
	 * @throws IOException
	 */
	public static int calculateWay() throws IOException
	{
		LocalFileReader lfr = new LocalFileReader("directions.txt", ", ");
		
		instructions = lfr.getTokens();
		
		int blocksAway = 0;
		
		for(String instruction : instructions) {
			setDirection(instruction.substring(0, 1));
			walk(Integer.parseInt(instruction.substring((Integer)(1))));
		}		
		blocksAway = (Math.abs(Directions.NORTH.getCount() - Directions.SOUTH.getCount()) + Math.abs(Directions.WEST.getCount() - Directions.EAST.getCount()));
		
		System.out.println(blocksAway);
		return blocksAway; 
	}
}
