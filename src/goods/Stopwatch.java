package goods;

public class Stopwatch {
	private static long startTime;
	
	public static void start() {
		startTime = System.currentTimeMillis();
		System.out.println("Start stopwatch");
	}
	
	public static long stop() {
		if(startTime != 0) {
			long stopTime = System.currentTimeMillis();
			long elapsedTime = stopTime - startTime;
			System.out.println("\nTime measured: " + (elapsedTime/1000.0) + " Sek.");
			return elapsedTime;
		}
		System.out.println("Start the stopwatch!");
		return -1;
	}
}
