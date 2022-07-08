package gui;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class WindowManager {

	public static void setUp() {
		initializeFrame();
	}
	
	public static void initializeFrame() {
		//TODO Randomize Title
		JFrame window = new JFrame("Maidenless Behavior Manager");
		JPanel card = new JPanel();
		//Set layout that lets me set coordinates and isn't stupid
		card.setLayout(null);
		
		window.setBounds(500,200,750,600);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Warehouse.c1 = card;
		window.add(card);
		Warehouse.window = window;
	}
	
	public static void unblind() {
		Warehouse.window.setVisible(true);
	}
}
