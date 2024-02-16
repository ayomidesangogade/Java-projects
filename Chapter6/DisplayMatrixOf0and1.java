package Chapter6;

public class DisplayMatrixOf0and1 {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();

        printMatrix(n);
        input.close();
    }
    public static void printMatrix(int n){
        int count = 0;
        for(int i = 1;i<=(n*n);i++){
            int random = (int)(Math.random()*2);
            count++;
            if(count%n == 0)
                System.out.println(random);
            else
                System.out.print(random+" ");
        }
    }
}
