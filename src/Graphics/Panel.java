package Graphics;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javafx.scene.media.Media;

public class Panel extends JPanel {

	private JButton playButton, pauseButton, stopButton;
	
	//THe song
	private String songFile = "test_sound.mp3";
	Media

	public Panel() {
		// TODO Auto-generated constructor stub
		initComponents();

		/** Use a Layout Manager **/
		GridBagLayout gbl = new GridBagLayout();
		setLayout(gbl);
		

		add(playButton);
		add(pauseButton);
		add(stopButton);
	}

	private void initComponents() {
		playButton = new JButton("Play");
		pauseButton = new JButton("Pause");
		stopButton = new JButton("Stop");
		

	}

}
