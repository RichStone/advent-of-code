import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class LocalFileReader {

	private String text;
	private ArrayList<String> tokens = new ArrayList <String> ();
	
	public LocalFileReader(String filePath) throws IOException {
		File file = new File(filePath);
		Scanner input = new Scanner(file);
		
		while(input.hasNext()) {
			tokens.add(input.next());
		}
		input.close();
	}
	
	public LocalFileReader(String filePath, String delimiter) throws IOException {
		File file = new File(filePath);
		Scanner input = new Scanner(file).useDelimiter(delimiter);
		
		while(input.hasNext()) {
			tokens.add(input.next());
		}
		input.close();
	}
	
	public ArrayList<String> getTokens() {
		return tokens;
	}
}
