import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class OnlineFileReader {

	private String wholeText;
	
	public OnlineFileReader(String url) throws IOException 
	{
		URL urlObj = new URL(url);

		BufferedReader in = new BufferedReader(new InputStreamReader(urlObj.openStream()));
		
		String inputLine;
        while ((inputLine = in.readLine()) != null)
            System.out.println(inputLine);
        in.close();
        
		wholeText = urlObj.toString();
	}
	
	public String getText() {
		return wholeText;
	}
}
