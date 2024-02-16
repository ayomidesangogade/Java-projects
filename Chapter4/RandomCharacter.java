package Chapter4;

public class RandomCharacter {
    public static void main(String[]args){
        int random = 65 + (int)(Math.random()*26);
        System.out.println((char)random);
    }
}
