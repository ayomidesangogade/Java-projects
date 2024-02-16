package Chapter8;

public class FindTheFlippedCell {
    public static void main(String[] args){
        System.out.println("NOTE: Enter a matrix of 0s and 1s only");
        int[][] matrix = createArray();
        printStatement(matrix);
    }
    public static int[][] createArray(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[][] result = new int[6][6];
        System.out.println("Enter a 6-by-6 matrix row by row: ");
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result[0].length;j++){
                result[i][j] = input.nextInt();
            }
        }
        input.close();
        return result;
    }
    public static void printStatement(int[][] matrix){
        int count = 0;
        for(int i = 0;i<matrix.length;i++){
            if(EvenNumberOf1s.evenNumberOf1sColumnChecker(i,matrix) && EvenNumberOf1s.evenNumberOf1sRowChecker(i,matrix))
                count++;
        }
        if(count == matrix.length)
            System.out.println("No flipped cell.");
        else
            System.out.println("The flipped cell is at ("+evenNumberOf1sRowChecker(matrix)+", "+evenNumberOf1sColumnChecker(matrix)+")");
    }
    public static int evenNumberOf1sRowChecker(int[][] matrix){
        int indexRow = 0;
        for(int i = 0;i<matrix.length;i++){
            String checkString = "";
            int count = 0;
            for(int j = 0;j<matrix[0].length;j++){
                checkString += matrix[i][j];

                if(checkString.charAt(j) == '1')
                    count++;
            }
            if(count%2 != 0){
                indexRow = i;
                break;
            }
        }
        return indexRow;
    }
    public static int evenNumberOf1sColumnChecker(int[][] matrix){
        int indexColumn = 0;
        for(int j = 0;j<matrix[0].length;j++){
            String checkString = "";
            int count = 0;
            for(int i = 0;i<matrix.length;i++){
                checkString += matrix[i][j];

                if(checkString.charAt(i) == '1')
                    count++;
            }
            if(count%2 != 0){
                indexColumn = j;
                break;
            }
        }
        return indexColumn;
    }
}
