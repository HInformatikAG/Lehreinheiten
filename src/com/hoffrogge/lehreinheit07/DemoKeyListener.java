package com.hoffrogge.lehreinheit07;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;

public class DemoKeyListener implements KeyListener {

	private JLabel textLabel;

	public DemoKeyListener(JLabel textLabel) {
		this.textLabel = textLabel;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		gebeTasteAus(e, "gedrückt");

		/* Mit der Esc-Taste das Programm beenden */
		if (KeyEvent.VK_ESCAPE == e.getKeyCode())
			System.exit(0);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		gebeTasteAus(e, "losgelassen");
	}

	private void gebeTasteAus(KeyEvent e, String eventArt) {
		textLabel.setText("Taste " + e.getKeyChar() + " " + eventArt);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// nichts machen
	}
}