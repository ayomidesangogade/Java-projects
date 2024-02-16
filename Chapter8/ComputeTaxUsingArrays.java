package Chapter8;

public class ComputeTaxUsingArrays {
    public static void main(String[] args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("(0-single filer, 1-married jointly or qualifying widow(er), 2-married separately, 3-head of household) Enter the filing status: ");
        int status = input.nextInt();

        System.out.print("Enter the taxable income: ");
        double income = input.nextDouble();

        double[] rates = {0.10, 0.15, 0.25, 0.28, 0.33, 0.35};
        int[][] brackets = {
            {8350, 33950, 82250, 171550, 372950},
            {16700, 67900, 137050, 20885, 372950},
            {8350, 33950, 68525, 104425, 186475}, 
            {11950, 45500, 117450, 190200, 372950}
            };
        // Single filer
        double tax = 0;
        if(status == 0){
            if(income <= brackets[0][0])
                tax = income*rates[0];
            else if(income >= brackets[0][0] && income<= brackets[0][1])
                tax = (brackets[0][0]*rates[0]) + (income-brackets[0][0])*rates[1];
            else if(income >= 33951 && income<=brackets[0][2])
                tax = (brackets[0][0]*rates[0])+(brackets[0][1]-brackets[0][0])*rates[1]+(income-brackets[0][1])*rates[2];
            else if (income>=82251&&income<=brackets[0][3])
                tax =  (brackets[0][0]*rates[0])+(brackets[0][1]-brackets[0][0])*rates[1]+(brackets[0][2]-brackets[0][1])*rates[2]+(income-brackets[0][2])*rates[3];
            else if (income>=171551&&income<=brackets[0][4])
                tax =  (brackets[0][0]*rates[0])+(brackets[0][1]-brackets[0][0])*rates[1]+(brackets[0][2]-brackets[0][1])*rates[2]+(brackets[0][3]-brackets[0][2])*rates[3]+(income-brackets[0][3])*rates[4];
            else if (income>=372951)
                tax =  (brackets[0][0]*rates[0])+(brackets[0][1]-brackets[0][0])*rates[1]+(brackets[0][2]-brackets[0][1])*rates[2]+(brackets[0][3]-brackets[0][2])*rates[3]+(brackets[0][4]-brackets[0][3])*rates[4]+(income-brackets[0][4])*rates[5];
            else
                tax = brackets[0][0]*rates[0]+(brackets[0][1]-brackets[0][0])*rates[1]+(brackets[0][2]-brackets[0][1]) * rates[2] + (brackets[0][3] - brackets[0][2]) * rates[3] + (brackets[0][4] - brackets[0][3]) * rates[4] + (income - brackets[0][4]) * rates[5];
        }
        
        input.close();
    }
}
