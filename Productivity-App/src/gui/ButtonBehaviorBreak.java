package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ButtonBehaviorBreak implements ActionListener {
	
	public static void setUp() {
		Warehouse.relaxButton.addActionListener(new ButtonBehaviorBreak());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Warehouse.isWorkTime = false;
		TimeManager.restartTimer();
		
	}

}
