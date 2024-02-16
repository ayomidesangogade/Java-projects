package Chapter8;

public class ColumnSorting {
    public static void main(String[] args){
        double[][] matrix = getArray();
        System.out.println();
        printMatrix(matrix);
    }
    public static double[][] getArray(){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[][] result = new double[3][3];

        System.out.println("Enter a 3-by-3 matrix row by row:");
        for(int i = 0;i<result.length;i++){
            for(int j = 0;j<result[0].length;j++){
                result[i][j] = input.nextDouble();
            }
        }
        input.close();
        return result;
    }
    public static double[][] sortColumns(double[][] m){
        double[][] newArray = new double[m.length][m[0].length];
        for(int i = 0;i<m.length;i++){
            double[] result = new double[m[0].length];
            for(int j = 0;j<m.length;j++){
                result[j] = m[j][i];
            }
            java.util.Arrays.sort(result);
            for(int k = 0;k<m.length;k++){
                newArray[k][i] = result[k];
            }
        }
        return newArray;
    }
    public static void printMatrix(double[][] m){
        double[][] result = sortColumns(m);
        System.out.println("The column-sorted array is");
        for(int i = 0;i<m.length;i++){
            for(int j = 0;j<m[0].length;j++){
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}
