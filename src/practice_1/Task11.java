package practice_1;

public class Task11 {
    /**
     * Prints a horizontal or vertical line of the same characters
     * */
    public static void printCharactersLine(int length, boolean isHorizontal, char character) {
        if (isHorizontal) {
            for (int i = 0; i < length; i++) {
                System.out.print(character + " ");
            }
        } else {
            for (int i = 0; i < length; i++) {
                System.out.println(character);
            }
        }
    }

    public static void main(String[] args) {
        printCharactersLine(5, true, '*');
    }
}
