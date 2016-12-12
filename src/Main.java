import java.io.IOException;

public class Main 
{
	public static void main (String [] args) throws IOException {
		LocalFileReader lfr = new LocalFileReader("directions.txt", ", ");
		Coordinator.calculateWay(lfr.getTokens());
	}
}
