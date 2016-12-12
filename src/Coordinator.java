import java.util.ArrayList;

public class Coordinator {
	private Direction actualDirection = Direction.NORTH;
	private ArrayList<String> instructions;
	
	public void setDirection(String turningDirection) {
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
		
		actualDirection = Direction.values()[newDirection];
		System.out.println(" after change " + actualDirection);
	}
	
	public void walk(int steps) {
		actualDirection.addSteps(steps);
	}
	
	public Coordinator(ArrayList<String> instructions) {
		this.instructions = instructions;
	}
	
	public int calculateWay() {
		int blocksAway = 0;
		
		return blocksAway; 
	}
}
