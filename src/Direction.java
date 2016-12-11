
public enum Direction {
	NORTH, EAST, SOUTH, WEST;
	
	private int count = 0;
	
	public void addSteps(int steps) {
		count += steps;
	}
	
	public int getCount() {
		return count;
	}
}
