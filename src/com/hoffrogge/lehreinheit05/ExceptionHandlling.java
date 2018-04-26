package com.hoffrogge.lehreinheit05;

import java.io.File;
import java.io.IOException;

public class ExceptionHandlling {

	public void erstelleDatei() {

		File file = new File("test.txt");

		try {

			file.createNewFile();

		} catch (IOException e) {
			System.err.println("Fehler! Die Datei konnte nicht erstellt werden!");
		}
	}
}