package Chapter8;

public class ConnectFours {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        String[][] dots = {{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""},{"","","","","","",""}};
        rowChecker(dots);
        printGrid(dots);
        input.close();
    }
    public static void rowChecker(String[][] dots){
        for(int i = 0;i<dots.length;i++){
            System.out.println(rowChecker(dots[i],"Y"));
        }
    }
    public static int listChecker(String[] list, String colour){
        int index = 0;
        String in = "";
        for(int i = 0;i<list.length;i++){
            for(int j = 0;j<index;j++){
                if(list[i].charAt(0) == colour.charAt(0) && list[i] == list[j]){
                    in += j;
                    break;
                } 
            }
            index++;
        }
        String charIn = in.charAt(0) + "";
        int b = Integer.parseInt(charIn);
        int count = 0;
        while(b<list.length && list[b] == list[b+1]){
            count++;
            b++;
        }
        return count+1;
    }
    public static boolean rowChecker(String[] list, String colour){
        if(listChecker(list, colour) == 4)
            return true;
        else
            return false;
    }
    public static void printGrid(String[][] dots){
        for(int i = 0;i<dots.length;i++){
            for(int j = 0;j<dots[0].length;j++){
                System.out.print("| "+dots[i][j]);
            }
            System.out.println("|");
        }
        System.out.println("----------------");
    }
}
