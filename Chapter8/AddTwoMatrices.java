package Chapter8;

public class AddTwoMatrices {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter number of columns: ");
        int column = input.nextInt();

        double[][] matrix1 = new double[row][column];
        double[][] matrix2 = new double[row][column];
        System.out.println("Enter matrix1: ");
        for(int i = 0;i<matrix1.length;i++){
            for(int j = 0;j<matrix1[0].length;j++){
                matrix1[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter matrix2: ");
        for(int i = 0;i<matrix2.length;i++){
            for(int j = 0;j<matrix2[0].length;j++){
                matrix2[i][j] = input.nextDouble();
            }
        }
        printMatrices(matrix1, matrix2);
        input.close();
    }
    public static double[][] addMatrix(double[][] a, double[][] b){
        double[][] result = new double[a.length][a[0].length];

        for(int row = 0;row<a.length;row++){
            for(int column = 0;column<a[0].length;column++){
                double sum = a[row][column] + b[row][column];
                result[row][column] = sum;
            }
        }
        return result;
    }
    public static void printMatrix(double[][] a){
        for(int i = 0;i<a.length;i++){
            for(int j = 0;j<a[0].length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void printMatrices(double[][] matrix1, double[][] matrix2){
        double[][] result = addMatrix(matrix1, matrix2);
        System.out.println("The matrices are added as follows");
        printMatrix(matrix1);
        System.out.println(" + ");
        printMatrix(matrix2);
        System.out.println(" = ");
        printMatrix(result);
    }
}
