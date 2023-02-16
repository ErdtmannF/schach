package de.erdtmann.soft.schach;

import java.util.List;

public class Spiel {

	private List figuren;
	private String[][] spielfeld;

	public Spiel() {
		initSpielfeld();
	}

	private void initSpielfeld() {
		spielfeld = new String[10][10];
		
		spielfeld[0][0] = "  ";
		spielfeld[0][1] = " A ";
		spielfeld[0][2] = " B ";
		spielfeld[0][3] = " C ";
		spielfeld[0][4] = " D ";
		spielfeld[0][5] = " E ";
		spielfeld[0][6] = " F ";
		spielfeld[0][7] = " G ";
		spielfeld[0][8] = " H ";
		spielfeld[0][9] = "  ";
		spielfeld[9][0] = "  ";
		spielfeld[9][1] = " A ";
		spielfeld[9][2] = " B ";
		spielfeld[9][3] = " C ";
		spielfeld[9][4] = " D ";
		spielfeld[9][5] = " E ";
		spielfeld[9][6] = " F ";
		spielfeld[9][7] = " G ";
		spielfeld[9][8] = " H ";
		spielfeld[9][9] = "  ";
		
		spielfeld[1][0] = " 1 ";
		spielfeld[2][0] = " 2 ";
		spielfeld[3][0] = " 3 ";
		spielfeld[4][0] = " 4 ";
		spielfeld[5][0] = " 5 ";
		spielfeld[6][0] = " 6 ";
		spielfeld[7][0] = " 7 ";
		spielfeld[8][0] = " 8 ";
		
		spielfeld[1][9] = " 1 ";
		spielfeld[2][9] = " 2 ";
		spielfeld[3][9] = " 3 ";
		spielfeld[4][9] = " 4 ";
		spielfeld[5][9] = " 5 ";
		spielfeld[6][9] = " 6 ";
		spielfeld[7][9] = " 7 ";
		spielfeld[8][9] = " 8 ";
		
//		spielfeld={{"   "," A "," B "," C "," D "," E "," F "," G "," H "},
//					{" 8 "," T "," S "," L "," D "," K "," L "," S "," T "," 8 "},
//					{" 7 "," B "," B "," B "," B "," B "," B "," B "," B "," 7 "},
//					{" 6 ","   ","   ","   ","   ","   ","   ","   ","   "," 6 "},
//					{" 5 ","   ","   ","   ","   ","   ","   ","   ","   "," 5 "},
//					{" 4 ","   ","   ","   ","   ","   ","   ","   ","   "," 4 "},
//					{" 3 ","   ","   ","   ","   ","   ","   ","   ","   "," 3 "},
//					{" 2 "," B "," B "," B "," B "," B "," B "," B "," B "," 2 "},
//					{" 1 "," T "," S "," L "," K "," D "," L "," S "," T "," 1 "},
//					{"   "," A "," B "," C "," D "," E "," F "," G "," H ","   "}};

		for (int i = 0; i < spielfeld.length; i++) {
			for (int j = 0; j < spielfeld[i].length; j++) {
				System.out.print(spielfeld[i][j]);
//				if (i > 0 && j > 0 && i < spielfeld.length - 1 && j < spielfeld[i].length - 1) {
//					if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
//						System.out.print(CoColor.WHITE_BACKGROUND + feld[i][j] + CoColor.RESET);
//					} else {
//						System.out.print(CoColor.BLACK_BACKGROUND + feld[i][j] + CoColor.RESET);
//					}

//				} else {
//					System.out.print(spielfeld[i][j].);
//				}

			}
			System.out.println();
		}

	}

}
