package advent_door_04;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

import goods.LocalFileReader;

public class SecuritySequence 
{
	ArrayList<LinkedList<Character>> charBucket = new ArrayList<LinkedList<Character>>();
	
	char [] letters;
	String roomChecksum;
	String numId;
	
	String supposedChecksum;
	int idSum = 0;
	
	public SecuritySequence() throws IOException {
		LocalFileReader lfr = new LocalFileReader("codes-checksums.txt", "");
		String code = lfr.getStringedTokens();
		System.out.println(code);
		String [] separatedCodes = code.split("\n");
		
		for(int i = 0; i < separatedCodes.length; i++) {
			letters = separatedCodes[i].substring(0, separatedCodes[i].length() - 7).replaceAll("[0-9, -]", "").toCharArray();
			numId = separatedCodes[i].replaceAll("\\D", "");
			supposedChecksum = separatedCodes[i].substring(separatedCodes[i].length() - 6, separatedCodes[i].length() - 1);
		}
	}
}
