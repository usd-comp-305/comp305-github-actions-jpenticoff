package edu.sandiego.comp305;

public class StringUtils {

    static String reverseString(String stringToReverse){
        StringBuilder reversedString = new StringBuilder();

        for (int i = stringToReverse.length() - 1; i >= 0; i--) {
            reversedString.append(stringToReverse.charAt(i));
        }

        return reversedString.toString();
    }

    public static void main(String[] args){
        System.out.print(reverseString(args[0]));
    }

}
