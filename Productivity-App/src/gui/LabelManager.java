package gui;

import javax.swing.JLabel;


public class LabelManager {
	
	public static void setUp() {
		JLabel message = new JLabel("");
		int x = 250;
		int y = 100;
		int width = 250;
		int height = 30;
		message.setBounds(x,y,width,height);
		Warehouse.c1.add(message);
		Warehouse.message = message;
	}
}
