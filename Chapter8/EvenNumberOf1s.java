package Chapter8;

public class EvenNumberOf1s {
    public static void main(String[] args){
        int[][] matrix = createArray();
        displayMatrix(matrix);
        rowChecker(matrix);
        System.out.println();
        columnChecker(matrix);
    }
    public static int[][] createArray(){
        int[][] result = new int[6][6];
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result[0].length;j++){
                result[i][j] = (int)(Math.random()*2);
            }
        }
        return result;
    }
    public static void rowChecker(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            if(evenNumberOf1sRowChecker(i, matrix))
                System.out.println("Row "+i+" has an even number of 1s");
            else
                System.out.println("Row "+i+" does not have an even number of 1s.");
        }
    }
    public static void columnChecker(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            if(evenNumberOf1sColumnChecker(i, matrix))
                System.out.println("Column "+i+" has an even number of 1s");
            else
                System.out.println("Column "+i+" does not have an even number of 1s.");
        }
    }
    public static boolean evenNumberOf1sRowChecker(int i, int[][] matrix){
        int count = 0;
        boolean isTrue = false;
        String checkString = "";
        for(int j = 0;j<matrix[0].length;j++){
            checkString += matrix[i][j];
            
            if(checkString.charAt(j) == '1'){
                count++;
            }
        }
        if(count%2 == 0){
            isTrue = true;
        }
        
        return isTrue;
    }
    public static boolean evenNumberOf1sColumnChecker(int i, int[][] matrix){
        int count = 0;
        boolean isTrue = false;
        String checkString = "";
        for(int j = 0;j<matrix[0].length;j++){
            checkString += matrix[j][i];
            
            if(checkString.charAt(j) == '1'){
                count++;
            }
        }
        if(count%2 == 0){
            isTrue = true;
        }
        
        return isTrue;
    }
    public static void displayMatrix(int[][] matrix){
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
