package de.erdtmann.soft.schach;



public class start {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String[][] feld = {{"   "," A "," B "," C "," D "," E "," F "," G "," H "},
							{" 8 "," T "," S "," L "," D "," K "," L "," S "," T "," 8 "},
							{" 7 "," B "," B "," B "," B "," B "," B "," B "," B "," 7 "},
							{" 6 ","   ","   ","   ","   ","   ","   ","   ","   "," 6 "},
							{" 5 ","   ","   ","   ","   ","   ","   ","   ","   "," 5 "},
							{" 4 ","   ","   ","   ","   ","   ","   ","   ","   "," 4 "},
							{" 3 ","   ","   ","   ","   ","   ","   ","   ","   "," 3 "},
							{" 2 "," B "," B "," B "," B "," B "," B "," B "," B "," 2 "},
							{" 1 "," T "," S "," L "," K "," D "," L "," S "," T "," 1 "},
							{"   "," A "," B "," C "," D "," E "," F "," G "," H ","   "}};
		
		for (int i = 0; i < feld.length; i++) {
			for (int j = 0; j < feld[i].length; j++) {
				if (i > 0 && j > 0 && i < feld.length-1 && j < feld[i].length-1 ) {
					if ((i % 2 == 1 && j % 2 == 1) || (i % 2 == 0 && j % 2 == 0)) {
						System.out.print(CoColor.WHITE_BACKGROUND + feld[i][j] + CoColor.RESET);
					}else {
						System.out.print(CoColor.BLACK_BACKGROUND + feld[i][j] + CoColor.RESET);	
					}
					
				}else {
					System.out.print(feld[i][j]);
				}
				
			}
			System.out.println();
		}

	}
}
