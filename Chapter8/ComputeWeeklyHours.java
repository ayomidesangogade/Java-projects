package Chapter8;

public class ComputeWeeklyHours {
    public static void main(String[] args){
        int[][] m = createArray();
        sumRows(m);
    }
    public static int[][] createArray(){
        java.util.Scanner input = new java.util.Scanner(System.in);

        int[][] result = new int[8][7];
        System.out.println("Enter a 8-by-7 matrix of employee's weekly hours: ");
        for(int row = 0; row<result.length;row++){
            for(int column = 0;column<result[0].length;column++){
                result[row][column] = input.nextInt();
            }
        }
        input.close();
        return result;
    }
    public static void sumRows(int[][] m){
        int[] totalHours = new int[m.length];
        int[] employees = new int[m.length];
        for(int row = 0;row<m.length;row++){
            int sum = 0;
            for(int column = 0;column<m[row].length;column++){
                sum += m[row][column];
            }
            totalHours[row] = sum;
            employees[row] = row;
        }
        print(totalHours, employees);
    }
    public static int[] sortLists(int[] totalHours){
        int[] result = totalHours;
        
        for(int i = 0;i<result.length-1;i++){
            int small = i;
            for(int j = i+1;j<result.length;j++){
                if(result[j]<result[small])
                    small = j;
            }
            int temp = result[small]; result[small] = result[i]; result[i] = temp;
        }
        int[] result1 = new int[result.length];
        for(int i = 0, j = result.length-1;i<result.length;i++,j--){
            result1[i] = result[j];
        }
        return result1;
    }
    public static void print(int[] totalHours, int[] employees){
        int[] result = sortLists(totalHours);
        int[] newEmployeesList = new int[employees.length];

        for(int i = 0;i<employees.length;i++){
            for(int j = 0;j<employees.length;j++){
                if(result[i] == totalHours[j])
                    newEmployeesList[i] = employees[j];
            }
        }
        for(int i = 0;i<result.length;i++){
            System.out.println("Employee "+newEmployeesList[i]+" spent total of "+result[i]+" hours in a week.");
        }
    }
}
