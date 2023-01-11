package exercise_3;

/**
 * ASCII Table
 *
 * Write a program which prints the ASCII table on screen. Research, what the ASCII table is and how to format it.
 *
 * Hints:
 * Which characters are part of the ASCII table? 0-127 oder 0-255?
 * Read more about ASCII: https://en.wikipedia.org/wiki/ASCII
 *
 * Bonus exercise:
 * Also print the haxadecimal value of ever character.
 */
public class AsciiTablePrinter {
    public static void main(String[] args) {
        System.out.print("   ");
        // print table header row
        for (int i = 0; i < 8; i++) {
            System.out.printf("%2s ", i);
        }
        System.out.println();

        // print tables header column
        for (int i = 0; i < 16; i++) {
            System.out.printf("%2s ", i);
            // walk through each row
            for (int j = 0; j < 8; j++) {
                int position = i * 8 + j;
                //cast position to character value
                char c = (char) position;
                //overwrite character in case of non-printable values (< 32)
                if (position < 32) {
                    c = '.';
                }
                System.out.printf("%2s ", c);
            }
            System.out.println(); // line breaK
        }
    }
}