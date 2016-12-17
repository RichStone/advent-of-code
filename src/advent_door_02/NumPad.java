package advent_door_02;

import java.io.IOException;
import java.util.ArrayList;
import goods.LocalFileReader;

public class NumPad
{
	Button currBtn;
	ArrayList<String> instructions;

	Button one = new Button("one");
	Button two = new Button("two");
	Button three = new Button("three");
	Button four = new Button("four");
	Button five = new Button("five");
	Button six = new Button("six");
	Button seven = new Button("seven");
	Button eight = new Button("eight");
	Button nine = new Button("nine");

	public NumPad() {
		connectButtons();
		try {
			LocalFileReader lfr = new LocalFileReader("codeTaps.txt", "");
			instructions = lfr.getTokens();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(instructions.get(0));
	}
	
	public static void calculateCode() 
	{
		
	}
	
	public void connectButtons() {
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
		
		six.east = five;
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
	public void printAllButtonConnections() {
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
