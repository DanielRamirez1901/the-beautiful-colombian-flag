package ui;

import model.ColombianFlag;
import thread.ColombianFlagThread;

public class ColombianFlagUI {
	private final static String RESET = "\u001B[";
	private final String yellowColor =  "\u001B[43m";
	private final String blueColor = "\u001B[44m";
	private final String redColor = "\u001B[41m";
	private int numberOfColorsInFlag = 3;
	
	public static void main (String[] ColombianFlag) throws InterruptedException {
		

		ColombianFlagUI cfui = new ColombianFlagUI();
		ColombianFlag cf = new ColombianFlag(1);
		ColombianFlagThread thread1 = new ColombianFlagThread(cf, cfui, 20);
		ColombianFlagThread thread2 = new ColombianFlagThread(cf, cfui, 20);
		ColombianFlagThread thread3 = new ColombianFlagThread(cf, cfui, 20);
		thread1.start();
		thread2.start();
		thread3.start();
		
		thread1.join();
		thread2.join();
		thread3.join();
		
	}
}
