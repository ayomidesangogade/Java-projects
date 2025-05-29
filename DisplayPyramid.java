import java.util.Scanner;
public class DisplayPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Enter number of lines: ");
        int num = input.nextInt();
        int space = num;
        int count = 1;
        for (int k = 1; k <= num; k++){
        for (int i = 0; i <= space; i++){
            System.out.print("  ");
        }
        for (int i = count; i >= 1; i--){
            System.out.print(i + " ");
        }
            for (int i = 2; i <=count; i++) {
                System.out.print(i + " ");
            }    
        System.out.print("\n");
        space--;    
        count++;    
    }
}
}    
    