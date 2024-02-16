package Chapter7;

public class RandomNumberChooser {
    public static void main(String[] args){
        displayRandomNumbers(1, 100, 4,8,95,93);
    }
    public static int getRandom(int start, int end, int... numbers){
        int random = (int)(start + Math.random()*(end - start));
        if(!contains(random, numbers))
            return random;
        else
            return 0;
    }
    public static boolean contains(int random, int... numbers){
        for(int i = 0;i<numbers.length;i++){
            if(random == numbers[i])
                return true;
        }
        return false; 
    }
    public static void displayRandomNumbers(int start, int end ,int... numbers){
        for(int i = 0;i<45;i++){
            if((i+1)%15 == 0)
                System.out.printf("%4d\n",getRandom(start, end, numbers));
            else
                System.out.printf("%4d ",getRandom(start, end, numbers));
        }
    }
}
