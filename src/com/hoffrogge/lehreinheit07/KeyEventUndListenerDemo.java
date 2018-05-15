package com.hoffrogge.lehreinheit07;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class KeyEventUndListenerDemo {

	public static void main(String args[]) {

		JFrame fenster = new JFrame("Key Event und Listener Demo");

		fenster.setSize(800, 200);

		fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		fenster.setLocationRelativeTo(null);

		JLabel textLabel = new JLabel();
		textLabel.setSize(600, 150);

		textLabel.setFont(new Font(Font.SANS_SERIF, Font.PLAIN, 42));

		fenster.add(textLabel);
		fenster.addKeyListener(new DemoKeyListener(textLabel));

		fenster.setVisible(true);
	}
}