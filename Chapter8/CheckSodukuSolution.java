package Chapter8;

public class CheckSodukuSolution {
    public static void main(String[] args){
        int[][] grid = readASolution();
        System.out.println(isValid(grid) ? "Valid solution" :"Invalid solution");
    }
    public static int[][] readASolution(){
        java.util.Scanner input = new java.util.Scanner(System.in);

        System.out.println("Enter a Soduku puzzle solution: ");
        int[][] grid = new int[9][9];
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                grid[i][j] = input.nextInt();
            }
        }
        input.close();
        return grid;
    }
    public static boolean isValid(int[][] grid){
        for(int i = 0;i<9;i++){
            for(int j = 0;j<9;j++){
                if(grid[i][j] < 1 || grid[i][j] > 9 || !isValid(i, j, grid))
                    return false;
            }
        }
        return true;
    }
    public static boolean isValid(int i, int j, int[][] grid){
        for (int column = 0; column < 9; column++)
            if (column != j && grid[i][column] == grid[i][j])
                return false;

        for (int row = 0; row < 9; row++)
            if (row != i && grid[row][j] == grid[i][j])
                return false;


        for (int row = (i / 3) * 3; row < (i / 3) * 3 + 3; row++){
            for (int col = (j / 3) * 3; col < (j / 3) * 3 + 3; col++){
                if (!(row == i && col == j) && grid[row][col] == grid[i][j])
                    return false;
            }
        }
        return true;
    }
}
