package ch3exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class HashMapPractice {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        ArrayList<Double> ids = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        String newStudent;

        System.out.println("Enter your students (or ENTER to finish):");

        do {
            newStudent = input.nextLine();

            if (!newStudent.equals("")) {
                students.add(newStudent);
            }

        } while (!newStudent.equals(""));
        for (String student : students) {
            System.out.print("ID number for " + student + ": ");
            Double id = input.nextDouble();
            ids.add(id);
        }
        System.out.println("\nClass roster:");
        double sum = 0.0;

    }

    }
