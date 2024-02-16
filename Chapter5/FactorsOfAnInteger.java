package Chapter5;

public class FactorsOfAnInteger {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = input.nextInt();

        for(int i = 2; i<integer;i++){
            if(integer % i == 0){
                if(isPrime(i)){
                    System.out.println(i);
                }
            }
        }
        // while(integer % 2 == 0){
        //     System.out.println(2);
        //     integer = integer / 2;
        //     int number = (int)(Math.sqrt(integer)+1);
        //     for(int i = 3; i<number; i+=2){
        //         while(integer%i == 0){
        //             System.out.println(i);
        //             integer = integer / i;
        //         }
        //         if(integer>2)
        //             System.out.println(integer);
        //     }
        // }
        input.close();
    }
    public static boolean isPrime(int i){
        int j = 2;
        while(j<i && i % 2 != 0){
            j++;
        }
        if(i == j)
            return true;
        else
            return false;
    }
}
