package com.hoffrogge.lehreinheit06;

public class Schueler {

	private String name;
	private int anwesenheitsStunden;

	public Schueler(String name, int anwesenheitsStunden) {
		this.name = name;
		this.anwesenheitsStunden = anwesenheitsStunden;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAnwesenheitsStunden() {
		return anwesenheitsStunden;
	}

	public void setAnwesenheitsStunden(int anwesenheitsStunden) {
		this.anwesenheitsStunden = anwesenheitsStunden;
	}

}