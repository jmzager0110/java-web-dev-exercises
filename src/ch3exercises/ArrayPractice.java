package ch3exercises;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ArrayPractice {
    public static void main(String[] args) {
        int[] integerArray = {1, 1, 2, 3, 5, 8};
        for (int j : integerArray){
            System.out.println(j);
        }
        for (int i = 0; i < integerArray.length; i++){
            if (integerArray[i]%2!=0){
                System.out.println(integerArray[i]);
            }
        }



    }



}
