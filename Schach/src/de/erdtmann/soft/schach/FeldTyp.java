package de.erdtmann.soft.schach;

public enum FeldTyp {

	RAND("rand"), FELD("feld");

	private String name;

	FeldTyp(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return name;
	}
}
