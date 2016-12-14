package advent_door_02;

import goods.Directions;

public class NumPadGraph 
{
	private final static int VERTS = 9;
	private static int vertsCount = 0;
	private static Vertex[] vertexList;
	private static int adjMat[][];
	
	public static void start() {
		vertexList = new Vertex[VERTS];
		adjMat = new int[VERTS][VERTS];
		
		//initialize adjacency matrix
		for(int j = 0; j < VERTS; j++)
			for(int k = 0; k < VERTS; k++)
				adjMat[j][k] = 0;
		
		vertexList [vertsCount++] = new Vertex("1");
		vertexList [vertsCount++] = new Vertex("2");
		vertexList [vertsCount++] = new Vertex("3");
		vertexList [vertsCount++] = new Vertex("4");
		vertexList [vertsCount++] = new Vertex("5");
		vertexList [vertsCount++] = new Vertex("6");
		vertexList [vertsCount++] = new Vertex("7");
		vertexList [vertsCount++] = new Vertex("8");
		vertexList [vertsCount++] = new Vertex("9");
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
}