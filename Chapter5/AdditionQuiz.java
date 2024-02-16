package Chapter5;

public class AdditionQuiz{
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num1 = 1+(int)(Math.random()*15);
        int num2 = 1+(int)(Math.random()*15);
        System.out.print("What is "+num1+" + "+num2+"? ");
        int answer = input.nextInt();

        while(num1 + num2 != answer){
            System.out.print("Wrong answer. Try again. What is "+num1+" + "+num2+"? ");
            answer = input.nextInt();
        }
        System.out.println("You got it!");
        input.close();
    }
}