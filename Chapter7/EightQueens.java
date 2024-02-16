package Chapter7;

public class EightQueens {
    public static void main(String[] args){
        String[] char1 = {" "," "," "," "," "," "," "," "};
        String[] char2 = {" "," "," "," "," "," "," "," "};
        String[] char3 = {" "," "," "," "," "," "," "," "};
        String[] char4 = {" "," "," "," "," "," "," "," "};
        String[] char5 = {" "," "," "," "," "," "," "," "};
        String[] char6 = {" "," "," "," "," "," "," "," "};
        String[] char7 = {" "," "," "," "," "," "," "," "};
        String[] char8 = {" "," "," "," "," "," "," "," "};
        
        int[] list = {0,1,2,3,4,5,6,7};
        assignIndex(char1, list);
        assignIndex(char2, list);
        assignIndex(char3, list);
        assignIndex(char4, list);
        assignIndex(char5, list);
        assignIndex(char6, list);
        assignIndex(char7, list);
        assignIndex(char8, list);
    }
    public static void assignIndex(String[] chars, int[] list){
        int index = random(list);
        chars[index] = "Q";
        for(String item: chars){
            System.out.print(" | "+item);
        }
        System.out.println(" |");
    }
    public static int random(int[] list){
        int randomIndex = (int)(Math.random()*list.length);
        int random = list[randomIndex];
        return random;
    }
}
