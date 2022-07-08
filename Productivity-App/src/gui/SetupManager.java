package gui;

public class SetupManager {
	
	public static void setUpAll() {
		WindowManager.setUp();
		TimeManager.setUp();
		LabelManager.setUp();
		InputManager.setUp();
		ProgressBarManager.setUp();
		WindowManager.unblind();
	}
}
