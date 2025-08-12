package Exercises;

import java.util.Scanner;

public class OlevelResult {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // this takes in the number of courses
        System.out.print("Enter the number of courses: ");
        int numberCourses = input.nextInt();

        // Create an array to store the scores.
        int[] scores = new int[numberCourses];

        // this takes scores for each course.
        for (int i = 0; i < numberCourses; i++) {
            System.out.print("Enter score for course " + (i + 1) + ": ");
            scores[i] = input.nextInt();
        }

        // this loops through the scores and calculate the grades.
        for (int i = 0; i < numberCourses; i++) {
            int score = scores[i];
            String grade = calculateGrade(score);
            System.out.println("Course " + (i + 1) + ": " + grade);
        }
        input.close();
    }

    // Function to calculate the grade based on the score.
    public static String calculateGrade(int score) {
        if (score >= 75) {
            return "A1";
        } else if (score >= 70) {
            return "B2";
        } else if (score >= 65) {
            return "B3";
        } else if (score >= 60) {
            return "C4";
        } else if (score >= 55) {
            return "C5";
        } else if (score >= 50) {
            return "C6";
        } else if (score >= 45) {
            return "D7";
        } else if (score >= 40) {
            return "E8";
        } else {
            return "F9";
        }
    }
}
