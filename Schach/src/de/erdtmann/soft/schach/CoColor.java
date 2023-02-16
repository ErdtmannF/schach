package de.erdtmann.soft.schach;

enum CoColor {
    //CoColor end string, color reset
    RESET("\u001B[0m"),

    BLACK("\u001B[30m"),
    RED("\u001B[31m"),	
    GREEN("\u001B[32m"),	
    YELLOW("\u001B[33m"),	
    BLUE("\u001B[34m"),	
    PURPLE("\u001B[35m"),	
    CYAN("\u001B[36m"),	
    WHITE("\u001B[37m"),	
    
    BLACK_BACKGROUND("\u001B[40m"),
    RED_BACKGROUND("\u001B[41m"),
    GREEN_BACKGROUND("\u001B[42m"),
    YELLOW_BACKGROUND("\u001B[43m"),
    BLUE_BACKGROUND("\u001B[44m"),
    PURPLE_BACKGROUND("\u001B[45m"),
    CYAN_BACKGROUND("\u001B[46m"),
    WHITE_BACKGROUND("\u001B[47m");
                  	       
    // Bold
//    BLACK_BOLD("\033[1;30m"),   // BLACK
//    RED_BOLD("\033[1;31m"),     // RED
//    GREEN_BOLD("\033[1;32m"),   // GREEN
//    YELLOW_BOLD("\033[1;33m"),  // YELLOW
//    BLUE_BOLD("\033[1;34m"),    // BLUE
//    MAGENTA_BOLD("\033[1;35m"), // MAGENTA
//    CYAN_BOLD("\033[1;36m"),    // CYAN
//    WHITE_BOLD("\033[1;37m"),   // WHITE

    // Underline
//    BLACK_UNDERLINED("\033[4;30m"),     // BLACK
//    RED_UNDERLINED("\033[4;31m"),       // RED
//    GREEN_UNDERLINED("\033[4;32m"),     // GREEN
//    YELLOW_UNDERLINED("\033[4;33m"),    // YELLOW
//    BLUE_UNDERLINED("\033[4;34m"),      // BLUE
//    MAGENTA_UNDERLINED("\033[4;35m"),   // MAGENTA
//    CYAN_UNDERLINED("\033[4;36m"),      // CYAN
//    WHITE_UNDERLINED("\033[4;37m"),     // WHITE


    // High Intensity
//    BLACK_BRIGHT("\033[0;90m"),     // BLACK
//    RED_BRIGHT("\033[0;91m"),       // RED
//    GREEN_BRIGHT("\033[0;92m"),     // GREEN
//    YELLOW_BRIGHT("\033[0;93m"),    // YELLOW
//    BLUE_BRIGHT("\033[0;94m"),      // BLUE
//    MAGENTA_BRIGHT("\033[0;95m"),   // MAGENTA
//    CYAN_BRIGHT("\033[0;96m"),      // CYAN
//    WHITE_BRIGHT("\033[0;97m"),     // WHITE

    // Bold High Intensity
//    BLACK_BOLD_BRIGHT("\033[1;90m"),    // BLACK
//    RED_BOLD_BRIGHT("\033[1;91m"),      // RED
//    GREEN_BOLD_BRIGHT("\033[1;92m"),    // GREEN
//    YELLOW_BOLD_BRIGHT("\033[1;93m"),   // YELLOW
//    BLUE_BOLD_BRIGHT("\033[1;94m"),     // BLUE
//    MAGENTA_BOLD_BRIGHT("\033[1;95m"),  // MAGENTA
//    CYAN_BOLD_BRIGHT("\033[1;96m"),     // CYAN
//    WHITE_BOLD_BRIGHT("\033[1;97m"),    // WHITE

    // High Intensity backgrounds
//    BLACK_BACKGROUND_BRIGHT("\033[0;100m"),     // BLACK
//    RED_BACKGROUND_BRIGHT("\033[0;101m"),       // RED
//    GREEN_BACKGROUND_BRIGHT("\033[0;102m"),     // GREEN
//    YELLOW_BACKGROUND_BRIGHT("\033[0;103m"),    // YELLOW
//    BLUE_BACKGROUND_BRIGHT("\033[0;104m"),      // BLUE
//    MAGENTA_BACKGROUND_BRIGHT("\033[0;105m"),   // MAGENTA
//    CYAN_BACKGROUND_BRIGHT("\033[0;106m"),      // CYAN
//    WHITE_BACKGROUND_BRIGHT("\033[0;107m");     // WHITE

    private final String code;

    CoColor(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return code;
    }
}