package Chapter5;

public class CountVowelsAndConsonants {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter a string: ");
        String string = input.nextLine().toUpperCase();

        int vowels = 0;
        int consonants = 0;
        for(int i = 0; i<= string.length()-1;i++){
            if(string.charAt(i) == 'A'||string.charAt(i) == 'E'||string.charAt(i) == 'I'||string.charAt(i) == 'O'||string.charAt(i) == 'U')
                vowels++;
            else if(string.charAt(i) != ' '&&string.charAt(i)!= 'A'&&string.charAt(i) != 'E'&&string.charAt(i) != 'I'&&string.charAt(i) != 'O'&&string.charAt(i) != 'U')
                consonants++;
        }
        System.out.println("The number of vowels is "+vowels);
        System.out.println("The number of consonants is "+consonants);
        input.close();
    }
}
