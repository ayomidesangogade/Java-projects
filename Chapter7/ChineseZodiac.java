package Chapter7;

import java.util.Scanner;
public class ChineseZodiac{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter year: ");
        int year = input.nextInt();
        printAnimal(year);
        input.close();
    }
    public static void printAnimal(int year){
        String[] animal = {"monkey","rooster","dog","pig","rat","ox","tiger","rabbit","dragon","snake","horse","sheep"};
        switch(year%12){
            case 0:
                System.out.println(animal[0]);
                break;
            case 1:
                System.out.println(animal[1]);
                break;
            case 2:
                System.out.println(animal[2]);
                break;
            case 3:
                System.out.println(animal[3]);
                break;
            case 4:
                System.out.println(animal[4]);
                break;
            case 5:
                System.out.println(animal[5]);
                break;
            case 6:
                System.out.println(animal[6]);
                break;
            case 7:
                System.out.println(animal[7]);
                break;
            case 8:
                System.out.println(animal[8]);
                break;
            case 9:
                System.out.println(animal[9]);
                break;
            case 10:
                System.out.println(animal[10]);
                break;
            case 11:
                System.out.println(animal[11]);
                break;
        }
    }
}
