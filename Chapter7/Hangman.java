package Chapter7;

public class Hangman {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        String[] words = {"write","nigeria","canada","portugal","that","dog","emeka","program","play"};
        random(words);
        int random = (int)(Math.random()*words.length);
        String choice = words[random];
        
        int count = 0;
        String replaced = "";
        for(int i = 0;i<choice.length();i++){
            replaced += "*";
        }
        char continueLoop = 'y';
        int miss = 0;
        char letter = '0';
        while(continueLoop == 'y'){
            System.out.print("(Guess) Enter a letter in word "+replaced+" > ");
            letter = input.nextLine().charAt(0);
            if(Checker.checker(letter, choice)){
                int index = choice.indexOf(letter);
                if(Checker.thirdChecker(choice, replaced, letter))
                    System.out.println(letter+" is already in the word.");
                else if(Checker.secondChecker(letter, replaced) && letter == choice.charAt(choice.indexOf(letter,index+1))){
                    String first = replacedString(replaced, letter, choice.indexOf(letter,index+1));
                    String temp = replaced; replaced = first; first = temp;
                    count++;
                }
                else if(Checker.checker(letter, choice) && letter == choice.charAt(index)){
                    String first = replacedString(replaced, letter, index);
                    String temp = replaced; replaced = first; first = temp;
                    count++;
                }
            }
            else{
                System.out.println(letter+" is not in the word");
                miss++;
            }
            if(Checker.checker(letter, choice) && (count == choice.length())){
                finalStatement(choice, miss);
                miss = 0;
                System.out.println("Do you want to guess another word? Enter y or n> ");
                continueLoop = Character.toLowerCase(input.nextLine().charAt(0));
                count = 0;
                int newRandom = (int)(Math.random()*words.length);
                String newChoice = words[newRandom];
                String temp = choice; choice = newChoice; newChoice = temp;
                String second = replaced(choice);
                temp = replaced; replaced = second; second = temp;
            }
        }
        input.close();
    }
    public static void random(String[] words){
        for(int i = 0;i<words.length;i++){
            int j = (int)(Math.random()*words.length);
            String temp = words[i]; words[i] = words[j]; words[j] = temp;
        }
    }
    public static void finalStatement(String choice, int miss){
        if(miss <= 1)
            System.out.println("The word is "+choice+". You missed "+miss+" time.");
        else
            System.out.println("The word is "+choice+". You missed "+miss+" times.");
    }
    public static String replacedString(String replaced, char letter, int index){
        char[] chars = new char[replaced.length()];
        for(int i = 0;i<chars.length;i++){
           chars[i] = replaced.charAt(i);
        }
        chars[index] = letter;
        String newString = "";
        for(int j = 0;j<chars.length;j++){
            newString += chars[j];
        }
        return newString;
    }
    public static String replaced(String choice){
        String replaced = "";
        for(int i = 0;i<choice.length();i++){
            replaced += "*";
        }
        return replaced;
    }
}