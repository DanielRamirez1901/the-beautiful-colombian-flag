package ui;

import model.*;
import thread.ColombianFlagThread;

public class ColombianFlagUI {
	
    public final static String ESC   = "\u001b[";
    public final static String RESET = "\u001B[0m";
    
	public static void main (String[] ColombianFlag) throws InterruptedException {
		ColombianFlag cf = new ColombianFlag();
		ColombianFlagThread thread1 = new ColombianFlagThread(cf, 0, 0 , 6 ,5,ColorFlag.YELLOW);
		ColombianFlagThread thread2 = new ColombianFlagThread(cf, 0, 6 , 9 ,80,ColorFlag.BLUE);
		ColombianFlagThread thread3 = new ColombianFlagThread(cf, 0, 9 , 12 ,100,ColorFlag.RED);
		System.out.print(ESC+"2J");
		thread1.start();
		thread2.start();
		thread3.start();
		thread1.join();
		thread2.join();
		thread3.join();
        System.out.print(RESET);
	}
	
}
