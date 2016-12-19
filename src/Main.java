import com.sun.prism.paint.Stop;

import advent_door_02.NumPad;
import goods.Stopwatch;

public class Main 
{
	public static void main (String [] args) throws Exception {
		Stopwatch.start();
		NumPad np = new NumPad();
		Stopwatch.stop();
	}
}
