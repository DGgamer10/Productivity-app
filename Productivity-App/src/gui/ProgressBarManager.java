package gui;

import javax.swing.*;

public class ProgressBarManager {
	public static JProgressBar timeBar;
	public static JProgressBar breakBar;
	public static void setUp() {
		timeBar = new JProgressBar(0, Warehouse.timeLimit);
		timeBar.setStringPainted(true);
		timeBar.setString("00:00");
		timeBar.setBounds(100, 50, 550, 50);
		
		breakBar = new JProgressBar(0, Warehouse.breakLimit);
		breakBar.setStringPainted(true);
		breakBar.setString("00:00");
		breakBar.setBounds(100, 100, 550, 50);
		
		Warehouse.c1.add(timeBar);
		Warehouse.c1.add(breakBar);
	}

	public static void update() {
		int secondTime = Warehouse.currentTime;
		int minuteCount = secondTime / 60;
		int secondCount = secondTime % 60;
		
		if (Warehouse.isWorkTime) {
			timeBar.setValue(secondTime);
			timeBar.setString(String.format("%02d:%02d", minuteCount, secondCount));
		} else {
			breakBar.setValue(secondTime);
			breakBar.setString(String.format("%02d:%02d", minuteCount, secondCount));
		}
		Warehouse.window.repaint();
	}
}
