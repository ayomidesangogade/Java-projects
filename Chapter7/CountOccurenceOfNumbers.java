package Chapter7;

public class CountOccurenceOfNumbers {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] list = new double[50];

        System.out.println("Enter zero to stop accepting numbers");
        System.out.print("Enter the integers between 1 and 100: ");
        int i = 0;
        double number = 1;
        while(number != 0){
            number = input.nextDouble();
            if(number > 100 || number < 1 && number != 0){
                System.out.println("Error: number must be less than 100 or greater than equal to 1.");
                System.exit(1);
            }
            list[i] = number;
            i++;
        }
        printCount(list);
        input.close();
    }
    public static int countNumbers(double num ,double[] list){
        int count = 0;

        for(int j = 0;j<list.length;j++){
            if(num != 0){
                if(num == list[j])
                    count++;
            }
        }
        return count;
    }
    public static void printCount(double[] list){
        double [] result = new double[list.length];

        int index = 0;
        for(int i = 0; i<list.length;i++){
            boolean isDuplicate = false;

            for(int j = 0;j<index;j++){
                if(list[i] == result[j]){
                    isDuplicate = true;
                    break;
                }
            }

            if(!isDuplicate){
                result[index] = list[i];
                index++;
            }
        }
        java.util.Arrays.parallelSort(result);

        for(int i = 0; i<result.length;i++){
            if(result[i] != 0){
                if(countNumbers(result[i], list) <= 1)
                    System.out.println(result[i]+" occurs "+countNumbers(result[i], list)+" time");
                else
                    System.out.println(result[i]+" occurs "+countNumbers(result[i], list)+" times");
            }
        }
    }
}

