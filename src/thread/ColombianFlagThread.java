package thread;

import model.ColombianFlag;
import model.ColorFlag;

public class ColombianFlagThread extends Thread{
	
	private final static String ESC = "\u001b[";
	private ColombianFlag cf;
	private ColorFlag colorF;
	private int positionHorizontalInit;
	private int positionVertical;
	private int positionHorizontalMAXByColor;
	private int sleep;

	public ColombianFlagThread(ColombianFlag cf,int positionHorizontalInit,int positionVertical, int positionHorizontalMAXByColor, int sleep, ColorFlag colorF){
		this.cf = cf;
		this.positionHorizontalInit = positionHorizontalInit;
		this.positionVertical = positionVertical;
		this.positionHorizontalMAXByColor  = positionHorizontalMAXByColor;
		this.sleep = sleep;
		this.colorF = colorF; 
	}
	
	@Override
    public void run(){
        printTheColorsOfTheFlag();
    }
	
	public synchronized void printTheColorsOfTheFlag() {
		for(int i = positionHorizontalInit; i < cf.getVERTICALMAX(); i++) {
			for(int j = positionVertical; j < positionHorizontalMAXByColor; j++) {
				System.out.print(ESC+(i)+"G"+ESC+(j)+"d"+cf.printFlag(colorF));
				try {
					Thread.sleep(sleep);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
}
