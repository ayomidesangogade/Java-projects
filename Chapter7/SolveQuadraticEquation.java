package Chapter7;

public class SolveQuadraticEquation {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        double[] eqn = new double[3];
        double[] roots = new double[2];
        System.out.print("Enter coefficients: ");
        for(int i = 0;i<eqn.length;i++){
            eqn[i] = input.nextDouble();
        }
        input.close();
        displaySolutions(eqn, roots);
    }
    public static double discriminant(double[] eqn){
        double discriminant = Math.pow(eqn[1],2) - 4*eqn[0]*eqn[2];
        return discriminant;
    }
    public static void equalRoots(double[] eqn, double[] roots){
            double root = -eqn[1]/(2*eqn[0]);
            System.out.println("The roots of the quadratic equation are "+root+" and "+root);
    }
    public static void complexRoots(){
        System.out.println("The roots of the quadratic equation are complex.");
    }
    public static int solveQuadratic(double[] eqn, double[] roots){
        if(discriminant(eqn) > 0){
            roots[0] = (-eqn[1] + Math.sqrt(discriminant(eqn)))/(2*eqn[0]);
            roots[1] = (-eqn[1] - Math.sqrt(discriminant(eqn)))/(2*eqn[0]);
        }
        return roots.length;
    }
    public static void displayRealRoots(double[] eqn, double[] roots){
        System.out.println("The number of real roots are "+solveQuadratic(eqn, roots));
        System.out.print("The real roots are: ");
        for(double root: roots)
            System.out.print(root+" ");
    }
    public static void displaySolutions(double[] eqn, double[] roots){
        if(discriminant(eqn) > 0){
            solveQuadratic(eqn, roots);
            displayRealRoots(eqn, roots);
        }
        else if(discriminant(eqn) == 0)
            equalRoots(eqn, roots);
        else
            complexRoots();
    }
}
