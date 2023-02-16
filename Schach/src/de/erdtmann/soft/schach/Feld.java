package de.erdtmann.soft.schach;


public class Feld {

	private FeldTyp typ;
	private Figur figur;
	private CoColor hintergrund;

	private Feld(FeldBuilder builder) {
		this.typ = builder.typ;
		this.figur = builder.figur;
		this.hintergrund = builder.hintergrund;
	}

	public FeldTyp getTyp() {
		return this.typ;
	}
	
	public Figur getFigur() {
		return this.figur;
	}

	public CoColor getHintergrund() {
		return this.hintergrund;
	}

	public static class FeldBuilder {

		private FeldTyp typ;
		private Figur figur;
		private CoColor hintergrund;

		public static FeldBuilder builder() {
			return new FeldBuilder();
		}

		private FeldBuilder() {
		}

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
		
		public Feld build() {
			return new Feld(this);
		}
	}
}
