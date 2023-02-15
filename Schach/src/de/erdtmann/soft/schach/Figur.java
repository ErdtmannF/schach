package de.erdtmann.soft.schach;

public class Figur {

	private int[][] position;
	private CoColor farbe;
	private CoColor hintergrund;
	private String name;
	private int spieler;
	
	public int[][] getPosition() {
		return position;
	}
	public void setPosition(int[][] position) {
		this.position = position;
	}
	public CoColor getFarbe() {
		return farbe;
	}
	public void setFarbe(CoColor farbe) {
		this.farbe = farbe;
	}
	public CoColor getHintergrund() {
		return hintergrund;
	}
	public void setHintergrund(CoColor hintergrund) {
		this.hintergrund = hintergrund;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSpieler() {
		return spieler;
	}
	public void setSpieler(int spieler) {
		this.spieler = spieler;
	}

	
}
