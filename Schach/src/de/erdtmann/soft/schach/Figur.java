package de.erdtmann.soft.schach;

public class Figur {

	private CoColor farbe;
	private String name;
	private int spieler;
	
	private Figur(FigurBuilder builder) {
		this.farbe = builder.farbe;
		this.name = builder.name;
		this.spieler = builder.spieler;
	}
	
	public CoColor getFarbe() {
		return farbe;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSpieler() {
		return spieler;
	}

	public static class FigurBuilder {
		
		private CoColor farbe;
		private String name;
		private int spieler;
		
		public static FigurBuilder builder() {
			return new FigurBuilder();
		}
		
		private FigurBuilder() {}

		public FigurBuilder farbe(CoColor farbe) {
			this.farbe = farbe;
			return this;
		}
		
		public FigurBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public FigurBuilder spieler(int spieler) {
			this.spieler = spieler;
			return this;
		}
		
		public Figur build() {
			return new Figur(this);
		}
	}
}
