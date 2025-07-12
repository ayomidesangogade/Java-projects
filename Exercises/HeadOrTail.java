public class HeadOrTail {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int random = (int)(Math.random()*2);
        System.out.print("Enter guess (head or tail): ");
        String guess = input.nextLine();
        String flip = "";
        if(random == 1)
            flip = "head";
        else
            flip = "tail";
        if (guess == flip)
            System.out.println("You are correct.");
        else
            System.out.println("You are incorrect, the correct guess is "+flip);
        input.close();
    }
}
