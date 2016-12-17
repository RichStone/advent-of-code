package advent_door_02;

import java.io.IOException;
import java.util.ArrayList;
import goods.LocalFileReader;

public class NumPad
{
	Button currBtn;
	ArrayList<String> instructions;
	ArrayList<Button> code = new ArrayList();

	Button one = new Button("one");
	Button two = new Button("two");
	Button three = new Button("three");
	Button four = new Button("four");
	Button five = new Button("five");
	Button six = new Button("six");
	Button seven = new Button("seven");
	Button eight = new Button("eight");
	Button nine = new Button("nine");

	public NumPad() 
	{
		connectButtons();
		
		//get the instructions
		try {
			LocalFileReader lfr = new LocalFileReader("codeTaps.txt", "\n");
			instructions = lfr.getTokens();
		} catch (IOException e) {
			e.printStackTrace();
		}
		calculateCode();
		printCode();
	}
	
	public void calculateCode() 
	{
		for(String sequence : instructions) {
			for(int i = 0; i < sequence.length(); i++) {
				if(sequence.substring(i, i+1).equals("L")) {
					if(currBtn.west != null) {
						currBtn = currBtn.west;
					}
				} 
				else if(sequence.substring(i, i+1).equals("R")) {
					if(currBtn.east != null) {
						currBtn = currBtn.east;
					}
				}
				else if(sequence.substring(i, i+1).equals("D")) {
					if(currBtn.south != null) {
						currBtn = currBtn.south;
					}		
				}	
				else if(sequence.substring(i, i+1).equals("U")) {
					if(currBtn.north != null) {
						currBtn = currBtn.north;
					}
				}
				if(i == sequence.length() - 1) {
					code.add(currBtn);
				}
			}
		}
	}
	
	public void printCode() {
		for(Button btn : code) {
			System.out.print(btn.toString() + " - ");
		}
	}
	
	public void connectButtons() 
	{
		one.east = two;
		one.south = four;
		
		two.west = one;
		two.east = three;
		two.south = five;
		
		three.south = six;
		three.west = two;
		
		four.north = one;
		four.south = seven;
		four.east = five;
		
		five.north = two;
		five.east = six;
		five.west = four;
		five.south = eight;
		
		six.west = five;
		six.north = three;
		six.south = nine;
		
		seven.north = four;
		seven.east = eight;
		
		eight.north = five;
		eight.west = seven;
		eight.east = nine;
		
		nine.north = six;
		nine.west = eight;
		
		currBtn = five;
	}
	
	//* test connections */
	public void printAllButtonConnections() 
	{
		System.out.println(one.printDirections());
		System.out.println(two.printDirections());
		System.out.println(three.printDirections());
		System.out.println(four.printDirections());
		System.out.println(five.printDirections());
		System.out.println(six.printDirections());
		System.out.println(seven.printDirections());
		System.out.println(eight.printDirections());
		System.out.println(nine.printDirections());
	}
}
