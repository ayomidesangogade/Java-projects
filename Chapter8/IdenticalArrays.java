package Chapter8;

public class IdenticalArrays {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        int[][] m1 = new int[3][3];
        System.out.print("Enter list1: ");
        for(int i = 0;i<m1.length;i++){
            for(int j = 0;j<m1[0].length;j++){
                m1[i][j] = input.nextInt();
            }
        }
        int[][] m2 = new int[3][3];
        System.out.print("Enter list2: ");
        for(int i = 0;i<m2.length;i++){
            for(int j = 0;j<m2[0].length;j++){
                m2[i][j] = input.nextInt();
            }
        }
        System.out.println((equals(m1, m2)) ? "The two arrays are identical" : "The two arrays are not identical");
        input.close();
    }
    public static boolean checker(int value, int[][] m2){
        for(int i = 0;i<m2.length;i++){
            for(int j = 0;j<m2[0].length;j++){
                if(value == m2[i][j])
                    return true;
            }
        }
        return false;
    }
    public static boolean equals(int[][] m1, int[][] m2){
        int count = 0;
        for(int i = 0;i<m1.length;i++){
            for(int j = 0;j<m1[0].length;j++){
                if(checker(m1[i][j], m2))
                    count++;
            }
        }
        if(count == (m1.length*m2.length))
            return true;
        else
            return false;
    }
}
