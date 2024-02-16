package Chapter5;

public class AdditionRevised {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int i = 0;
        int numRight = 0;
        String output = "";
        long startTime = System.currentTimeMillis();
        while(i < 10){
            int num1 = 1+(int)(Math.random()*15);
            int num2 = 1+(int)(Math.random()*15);
            System.out.print("What is "+num1+" + "+num2+"? ");
            int answer = input.nextInt();
            if(num1 + num2 == answer){
                System.out.println("You are correct.");
                numRight++;
            }
            else
                System.out.println("You are wrong.");
            output += (num1 + num2 == answer) ? "\n"+num1+" + "+num2+" = "+answer+" Correct" : "\n"+num1+" + "+num2+" = "+answer+" Wrong";
            i++;
        }
        long endTime = System.currentTimeMillis();
        System.out.println(output);
        System.out.println("");
        System.out.println("You got "+numRight+" out of "+i);
        System.out.println("You finished the test in "+(endTime - startTime)/1000+" seconds");
        input.close();
    }
}
