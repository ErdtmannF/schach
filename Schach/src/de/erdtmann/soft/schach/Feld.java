package de.erdtmann.soft.schach;


public class Feld {

	private FeldTyp typ;
	private Figur figur;
	private CoColor hintergrund;
	private String name;

	public Feld(FeldBuilder builder) {
		this.typ = builder.typ;
		this.figur = builder.figur;
		this.hintergrund = builder.hintergrund;
		this.name = builder.name;
	}

	public static class FeldBuilder {

		private FeldTyp typ;
		private Figur figur;
		private CoColor hintergrund;
		private String name;

		public static FeldBuilder builder() {
			return new FeldBuilder();
		}

		private FeldBuilder() {	}

		public FeldBuilder typ(FeldTyp typ) {
			this.typ = typ;
			return this;
		}
		
		public FeldBuilder figur(Figur figur) {
			this.figur = figur;
			return this;
		}

		public FeldBuilder hintergrund(CoColor hintergrund) {
			this.hintergrund = hintergrund;
			return this;
		}
		
		public FeldBuilder name(String name) {
			this.name = name;
			return this;
		}
		public Feld build() {
			return new Feld(this);
		}
	}
}
