package advent_door_02;

import java.util.ArrayList;
import java.util.HashMap;

import goods.Directions;

public class Button 
{	
	private String name;
	//references to adjacent buttons
	public Button north, east, south, west;
	
	public Button(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() 
	{
		return (name);
	}
	
	public String printDirections() 
	{
		String directions = "\n Button's " + this.name + " neighbors are: ";
		
		if(north != null) {
			directions += "north: " + north.toString() + " | ";
		}
		if(east != null) {
			directions += "east: " + east.toString() + " | ";		
		}
		if(south != null) {
			directions += "south: " + south.toString() + " | ";
		}
		if(west != null) {
			directions += "west: " + west.toString() + " | ";
		}
		return directions;
	}
}