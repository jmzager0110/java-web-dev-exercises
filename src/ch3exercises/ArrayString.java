package ch3exercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayString {
    public static void main(String[] args) {

        String arrString = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = arrString.split(" ");
        System.out.println(Arrays.toString(words));
        String[] sentences = arrString.split("\\.");
        System.out.println(Arrays.toString(sentences));

    }

}