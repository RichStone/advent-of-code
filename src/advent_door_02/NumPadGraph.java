package advent_door_02;

import goods.Directions;

public class NumPadGraph 
{
	
	
	public static void start() {
		
	}
	
	private static class Vertex
	{
		private String name;
		
		private Vertex(String name) {
			this.name = name;
		}
		
		@Override
		public String toString() {
			return name;
		}
	}
	
	private static class Edges {
		private char id;
		//every node has up to 4 edges to an adjacent node
		private Directions d1 = null;
		private Directions d2 = null;
		private Directions d3 = null;
		private Directions d4 = null;
		
		private Edges(char id, boolean north, boolean east, boolean south, boolean west) 
		{
			this.id = id;
			
			if(north)
				d1 = Directions.NORTH;
			if(east)
				d1 = Directions.EAST;
			if(south)
				d1 = Directions.SOUTH;
			if(west)
				d1 = Directions.WEST;
		}
		
		@Override
		public String toString() {
			return Character.toString(id);
		}
	}
	
	
}