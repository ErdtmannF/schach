package de.erdtmann.soft.schach;

public class Figur {

	private int[][] position;
	private CoColor farbe;
	private CoColor hintergrund;
	private String name;
	private int spieler;
	
	private Figur(FigurBuilder builder) {
		this.position = builder.position;
		this.farbe = builder.farbe;
		this.hintergrund = builder.hintergrund;
		this.name = builder.name;
		this.spieler = builder.spieler;
	}
	
	public int[][] getPosition() {
		return position;
	}
	
	public CoColor getFarbe() {
		return farbe;
	}
	
	public CoColor getHintergrund() {
		return hintergrund;
	}
	
	public String getName() {
		return name;
	}
	
	public int getSpieler() {
		return spieler;
	}

	public static class FigurBuilder {
		
		private int[][] position;
		private CoColor farbe;
		private CoColor hintergrund;
		private String name;
		private int spieler;

		public FigurBuilder(int[][] position, CoColor farbe, CoColor hintergrund, String name, int spieler) {
			this.position = position;
			this.farbe = farbe;
			this.hintergrund = hintergrund;
			this.name = name;
			this.spieler = spieler;
		}
		
		public FigurBuilder withPosition(int[][] position) {
			this.position = position;
			return this;
		}
		
		public FigurBuilder withFarbe(CoColor farbe) {
			this.farbe = farbe;
			return this;
		}
		
		public FigurBuilder withHintergrund(CoColor hintergrund) {
			this.hintergrund = hintergrund;
			return this;
		}
		
		public FigurBuilder withName(String name) {
			this.name = name;
			return this;
		}
		
		public FigurBuilder withSpieler(int spieler) {
			this.spieler = spieler;
			return this;
		}
		
		public Figur build() {
			Figur figur =  new Figur(this);
			return figur;
		}
	}
}
