package Graphics;

import java.awt.Dimension;

import javax.swing.JFrame;

public class Frame extends 	JFrame{
	
	public static final int WIDTH = 640, HEIGHT = 480;
	private final String TITLE = "Playlist";
	
	public Frame() {
		// TODO Auto-generated constructor stub
		setTitle(TITLE);
		setSize(new Dimension(WIDTH, HEIGHT));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);//place in the center
		add(new Panel());
		setVisible(true);
	}

}
