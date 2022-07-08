package gui;

import javax.swing.JButton;

public class InputManager {
	private static JButton b1;
	private static JButton b2;
	
	public static void setUp() {
		initializeResources();
		ButtonBehavior.setUp();
		ButtonBehaviorBreak.setUp();
	}
	
	public static void initializeResources() {
		b1 = new JButton();
		b1.setText("Start Timer 20 min");
		b1.setBounds(100, 200, 550, 200);
		Warehouse.c1.add(b1);
		Warehouse.enter = b1;
		
		b2 = new JButton();
		b2.setText("Start Break 10 min");
		b2.setBounds(100, 400, 550, 100);
		Warehouse.c1.add(b2);
		Warehouse.relaxButton = b2;
	}
}
