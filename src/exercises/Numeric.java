package exercises;

import java.util.Scanner;

public class Numeric {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of a rectangle:");
        Double lengthNumeric = input.nextDouble();

        System.out.println("Enter the width of a rectangle:");
        Double widthNumeric = input.nextDouble();

        Double totalNumeric = lengthNumeric * widthNumeric;
        System.out.println("The total area of your rectangle is:" + totalNumeric);
    }
}
