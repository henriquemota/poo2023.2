package gui;

import javax.swing.JFrame;

public class BaseFrame extends JFrame {
	
	public BaseFrame() {
		this.setSize(800,600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public BaseFrame(String title) {
		this.setSize(800,600);
		this.setTitle(title);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
