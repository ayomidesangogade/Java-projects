package Exercises;

import java.util.Scanner;
public class HighestScore {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int number = input.nextInt();
        String[] stuName = new String[number];
        int[] scores = new int[number];
        for (int i = 0; i<number; i++){
            System.out.print("Enter your name: ");
            String name = input.nextLine();
            stuName[i] = name;
        }
        for (int k = 0; k<number;k++) {
            System.out.print("Enter "+stuName[k]+"'s score: ");
            int score = input.nextInt();
            scores[k] = score;
        }
        int max = scores[0];
        int index = 0;
        // int secondMax = scores[0];
        for (int j = 1;j<scores.length;j++) {
            if (scores[j] > max) {
                max = scores[j];
                index = j;
            }
        }
        System.out.print(stuName[index] +" has the highest score of " + scores[index]);
        input.close();
    }
}

