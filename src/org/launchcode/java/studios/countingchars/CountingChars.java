package org.launchcode.java.studios.countingchars;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> charCounts = new HashMap<>();
        String myString = "If the product of two terms is zero then common sense says at least one of the two " +
                "terms has to be zero to start with. So if you move all the terms over to one side, you can put " +
                "the quadratics into a form that can be factored allowing that side of the equation to equal zero. " +
                "Once you’ve done that, it’s pretty straightforward from there.";
        char[] charactersInString = myString.toCharArray();
        for (char character: charactersInString) {
            if (charCounts.containsKey(character)) {
                charCounts.put(character, charCounts.get(character));
            } else {
                charCounts.put(character, 1);
            }
        } System.out.println(charCounts);

    }
}
