import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*;

class DrawingFrame extends JFrame implements WindowListener {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

	    JFrame frame = new JFrame("Drawing Program");
	    frame.setDefaultCloseOperation(3);
	
	    DrawingPanel panel = new DrawingPanel();
	    
	    frame.add(panel);
		frame.setSize(1920,1080);
	    
		FileIO fileio = new FileIO(panel);

	    frame.pack();
	    frame.setVisible( true );

		fileio.readQueueData();
		fileio.readStackData();


	}


	@Override
	public void windowOpened(WindowEvent e) {

	}


	@Override
	public void windowClosing(WindowEvent e) {

	}

	@Override
	public void windowClosed(WindowEvent e) {

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}
}