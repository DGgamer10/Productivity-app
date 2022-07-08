package gui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

/**
 * Used to store references to every resource in the project.
 * @author Dimitri Lyon
 *
 */
public class Warehouse {
	
	public static JFrame window;
	public static JPanel c1;
	public static JButton enter;
	public static JButton relaxButton;
	public static JTextField timeInput;
	public static Timer timeRunner;
	public static JLabel message;
	
	public static boolean isWorkTime;
	
	public static int timeLimit;
	public static int currentTime = 0;
	
	public static int breakLimit;
}
