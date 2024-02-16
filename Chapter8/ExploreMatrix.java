package Chapter8;

public class ExploreMatrix {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter the size for the matrix: ");
        int n = input.nextInt();
        int[][] list = createArray(n);
        printMatrix(list);
        rowChecker(list);
        columnChecker(list);
        majorDiagonalChecker(list);
        subDiagonalChecker(list);
        input.close();
    }
    public static int[][] createArray(int n){
        int[][] result = new int[n][n];
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result[0].length;j++){
                result[i][j] = (int)(Math.random()*2);
            }
        }
        return result;
    }
    public static void rowChecker(int[][] list){
        int rowIndexOne = 0;
        int rowIndexZero = 0;
        boolean isTrueOne = false;
        boolean isTrueZero = false;
        for(int i = 0;i<list.length;i++){
            String checkString = "";
            for(int j = 0;j<list[0].length;j++){
                checkString += list[i][j];
            }
            if(checker(checkString) && checkString.charAt(0) == '1'){
                rowIndexOne = i;
                isTrueOne = true;
            }
            if(checker(checkString) && checkString.charAt(0) == '0'){
                rowIndexZero = i;
                isTrueZero = true;
            }
        }
        if(isTrueOne || isTrueZero){
            if(isTrueZero)
                System.out.println("All 0s on row "+(rowIndexZero+1));
            else
                System.out.println("No 0s on a row");

            if(isTrueOne)
                System.out.println("All 1s on row "+(rowIndexOne+1));
            else
                System.out.println("No 1s on a row");
        }
        else
            System.out.println("No same numbers on a row");
    }
    public static void columnChecker(int[][] list){
        int columnIndexOne = 0;
        int columnIndexZero = 0;
        boolean isTrueOne = false;
        boolean isTrueZero = false;
        for(int i = 0;i<list[0].length;i++){
            String checkString = "";
            for(int j = 0;j<list.length;j++){
                checkString += list[j][i];
            }
            if(checker(checkString) && checkString.charAt(0) == '1'){
                columnIndexOne = i;
                isTrueOne = true;
            }
            if(checker(checkString) && checkString.charAt(0) == '0'){
                columnIndexZero = i;
                isTrueZero = true;
            }
        }
        if(isTrueOne || isTrueZero){
            if(isTrueZero)
                System.out.println("All 0s on column "+(columnIndexZero+1));
            else
                System.out.println("No 0s on a column");

            if(isTrueOne)
                System.out.println("All 1s on column "+(columnIndexOne+1));
            else
                System.out.println("No 1s on a column");
        }
        else
            System.out.println("No same numbers on a column");
    }
    public static void majorDiagonalChecker(int[][] list){
        boolean isTrueOne = false;
        boolean isTrueZero = false;
        String checkString = "";
        for(int i = 0;i<list.length;i++){
            checkString += list[i][i];
        }
        if(checker(checkString) && checkString.charAt(0) == '1')
            isTrueOne = true;
        
        if(checker(checkString) && checkString.charAt(0) == '0')
            isTrueZero = true;
        
        if(isTrueZero)
            System.out.println("All 0s on the major diagonal");
        else if(isTrueOne)
            System.out.println("All 1s on the major diagonal");
        else
            System.out.println("No same numbers on the major diagonal");
    }
    public static void subDiagonalChecker(int[][] list){
        boolean isTrueOne = false;
        boolean isTrueZero = false;
        String checkString = "";
        for(int i = 0, j = list.length-1;i<list.length;i++,j--){
            checkString += list[i][j];
        }
        if(checker(checkString) && checkString.charAt(0) == '1')
            isTrueOne = true;
        
        if(checker(checkString) && checkString.charAt(0) == '0')
            isTrueZero = true;
        
        if(isTrueZero)
            System.out.println("All 0s on the sub-diagonal");
        else if(isTrueOne)
            System.out.println("All 1s on the sub-diagonal");
        else
            System.out.println("No same numbers on the sub-diagonal");
    }
    public static boolean checker(String checkString){
        int i = 0;
        int count = 0;
        while(i<checkString.length()-1 && checkString.charAt(i) == checkString.charAt(i+1)){
            count++;
            i++;
        }
        if((count+1) == checkString.length())
            return true;
        else
            return false;
    }
    public static void printMatrix(int[][] list){
        for(int i = 0;i<list.length;i++){
            for(int j = 0;j<list.length;j++){
                System.out.print(list[i][j]+" ");
            }
            System.out.println();
        }
    }
}
