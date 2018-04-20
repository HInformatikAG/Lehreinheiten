package com.hoffrogge.lehreinheit04;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

@SuppressWarnings("serial")
public class Fenster extends JFrame {

	private JLabel label;
	private JComponent komponente;

	/* Konstruktor */
	public Fenster() {

		Container fensterInhalt = getContentPane();
		fensterInhalt.setLayout(new BorderLayout());

		Border leererRahmen = BorderFactory.createEmptyBorder(5, 5, 5, 5);

		label = new JLabel();
		komponente = new JPanel();

		label.setHorizontalAlignment(SwingConstants.CENTER);

		label.setBorder(leererRahmen);

		fensterInhalt.add(label, BorderLayout.PAGE_START);
		fensterInhalt.add(komponente, BorderLayout.CENTER);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(new Dimension(220, 260));
	}

	/* Getter und Setter */
	public JLabel getLabel() {
		return label;
	}

	public void setLabel(JLabel label) {
		this.label = label;
	}

	/* Methoden */
	public void fuegeKomponenteHinzu(JComponent komponente) {

		remove(komponente);
		this.komponente = komponente;

		getContentPane().add(komponente, BorderLayout.CENTER);
	}

	public void maleFenster() {

		/* Kleiner Trick, um das Fenster in der Mitte des Bildschirms anzuzeigen */
		setLocationRelativeTo(null);

		setVisible(true);
	}
}