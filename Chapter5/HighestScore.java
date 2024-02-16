package Chapter5;

public class HighestScore{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int number = input.nextInt();
        int i = 0;
        String [] namesList = new String[number];
        int [] scoresList = new int[number];
        int max = scoresList[0];
        String nameOfHighestScore = "";
        while(i<number){
            System.out.print("Enter the name of student: ");
            namesList[i] = input.next();
            System.out.print("Enter "+namesList[i]+"' score: ");
            scoresList[i] = input.nextInt();
            
            if(scoresList[i] > max){
                nameOfHighestScore = namesList[i];
                max = scoresList[i];
            }
            i++;
        }
        System.out.println(nameOfHighestScore+" got the highest score "+max);
        input.close();
    }
}