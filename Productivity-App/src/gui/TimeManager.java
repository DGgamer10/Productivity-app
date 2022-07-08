package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Timer;
public class TimeManager {
	public static void setUp() {
		Timer t = new Timer(1000, new MaidenlessBehavior());
		t.stop();
		setUpTimeLimits();
		Warehouse.timeRunner = t;
	}
	
	public static void setUpTimeLimits() {
		int workMins = 20;
		int workSecs = workMins * 60;
		int breakMins = 5;
		int breakSecs = 60 * breakMins;
		Warehouse.timeLimit = workSecs;
		Warehouse.breakLimit = breakSecs;
	}
	
	public static void restartTimer() {
		Timer t = Warehouse.timeRunner;
		Warehouse.enter.setVisible(false);
		Warehouse.relaxButton.setVisible(false);
		t.start();
		Warehouse.currentTime = 0;
	}
	
	public static void stopTimer() {
		Warehouse.enter.setVisible(true);
		Warehouse.relaxButton.setVisible(true);
		Timer t = Warehouse.timeRunner;
		t.stop();
		Warehouse.window.toFront();
	}
	
	public static void checkTime() {
		int currentTime = Warehouse.currentTime;
		int timeLimit;
		if (Warehouse.isWorkTime) {
			timeLimit = Warehouse.timeLimit;
		} else {
			timeLimit = Warehouse.breakLimit;
		}
		if(currentTime >= timeLimit) {
			stopTimer();
		}
		ProgressBarManager.update();
	}
}
class MaidenlessBehavior implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		Warehouse.currentTime++;
		TimeManager.checkTime();
	}
	
}
