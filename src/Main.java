import java.io.IOException;

public class Main 
{
	public static void main (String [] args) throws IOException {
		LocalFileReader lfr = new LocalFileReader("directions.txt", ", ");
		System.out.println(lfr.getTokens());
		
		Coordinator crd = new Coordinator();
		crd.setDirection("R");
		crd.walk(5);
	}
}
