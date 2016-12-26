package goods;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class LocalFileReader 
{
	private ArrayList<String> tokens = new ArrayList <String> ();
	private String stringedTokens = null;
	
	/**
	 * 
	 * @param filePath
	 * @throws IOException
	 */
	public LocalFileReader(String filePath) throws IOException 
	{
		File file = new File(filePath);
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			tokens.add(input.next());
		}
		input.close();
	}
	
	public LocalFileReader(String filePath, String delimiter) throws IOException 
	{
		File file = new File(filePath);
		Scanner input = new Scanner(file).useDelimiter(delimiter);
		
		while(input.hasNext()) {
			tokens.add(input.next());
		}
		input.close();
	}
	
	public ArrayList<String> getTokens() 
	{
		return tokens;
	}
	
	/**
	 * @return all tokens from arrayList in a single String
	 */
	private String tokensToString() 
	{
		if(tokens.size() != 0) {
			Iterator<String> it = tokens.iterator();
			while(it.hasNext()) {
				stringedTokens += it.next();
			}
			return stringedTokens;
		}
		else {
			return null;
		}
	}
	
	public String getStringedTokens() {
		if(stringedTokens == null) {
			tokensToString();
		}
		return stringedTokens;
	}
}
