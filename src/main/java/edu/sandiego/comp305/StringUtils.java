package edu.sandiego.comp305;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(final String stringToReverse){
        final StringBuilder reversedString = new StringBuilder();

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString.append(stringToReverse.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main(final String[] args){
        System.out.print(reverseString(args[0]));
    }

}
