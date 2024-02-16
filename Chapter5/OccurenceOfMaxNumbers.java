package Chapter5;

public class OccurenceOfMaxNumbers {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int [] myList = new int[100];
        int countMax = 0;
        int integer = 1;
        int max = integer;
        int i = 0;
        while(integer != 0){
            System.out.print("Enter numbers: ");
            integer = input.nextInt();
            i++;
            myList[i] = integer;
            if(integer == 0)
                break;
            
            if(integer > max){
                max = integer;
            }
        }
        for(int j = 0; j<myList.length; j++){
            if(max == myList[j])
                countMax++;
        }
        System.out.println("The largest number is "+max);
        System.out.println("The occurrence count of the largest number is "+countMax);

        input.close();
    }
}
