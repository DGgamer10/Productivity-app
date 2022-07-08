package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class ButtonBehavior implements ActionListener {
	
	public static void setUp() {
		Warehouse.enter.addActionListener(new ButtonBehavior());
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Warehouse.isWorkTime = true;
		TimeManager.restartTimer();
		
	}

}
