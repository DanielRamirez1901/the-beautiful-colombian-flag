package model;

public class ColombianFlag {
	private final String YELLOW_COLOR =  "\u001b[43m";
	private final String BLUE_COLOR = "\u001b[44m";
	private final String RED_COLOR = "\u001b[41m";
	private final int VERTICALMAX = 60;
	private String flag;
	public ColombianFlag() {
		
	}	
	public String printFlag(ColorFlag color) {
		switch (color) {
		case YELLOW:
			flag = YELLOW_COLOR + " ";
			break;
		case BLUE:
			flag = BLUE_COLOR + " ";
			break;
		case RED:
			flag = RED_COLOR + " ";
			break;
		}
		return flag;
	}
	public int getVERTICALMAX() {
		return VERTICALMAX;
	}
}
