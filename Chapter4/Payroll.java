package Chapter4;

public class Payroll {
    public static void main(String[]args){
        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.print("Enter employee’s name: ");
        String name = input.nextLine();
        System.out.print("Enter number of hours worked in a week: ");
        double hours = input.nextDouble();
        System.out.print("Enter hourly pay rate: ");
        double hourlyPay = input.nextDouble();
        System.out.print("Enter federal tax withholding rate: ");
        double federal = input.nextDouble();
        System.out.print("Enter state tax withholding rate: ");
        double state = input.nextDouble();
        System.out.println("\n");
        Pay pay = new Pay(name);
        pay.setNumberOfHours(hours);
        pay.setHourlyPayRate(hourlyPay);
        double grossPay = pay.calculateGrossPay();
        double federalTaxPercent = grossPay*federal;
        double stateTaxPercent = grossPay*state;
        System.out.printf("Gross Pay: $%.2f\n",grossPay);
        System.out.println("Deductions:");
        System.out.printf("%-3sFederal Withholding (%.1f%%): $%.2f\n","",(federal*100),federalTaxPercent);
        System.out.printf("%-3sState Withholding (%.1f%%): $%.2f\n","",(state*100),stateTaxPercent);
        System.out.printf("%-3sTotal Deduction: $%.2f\n","",(federalTaxPercent+stateTaxPercent));
        System.out.printf("Net Pay: $%.2f\n",(grossPay-(federalTaxPercent+stateTaxPercent)));
        input.close();
    }
}

class Pay{
    private double hourlyPayRate;
    private double numberOfHours;
    private String nameOfEmployee;

    public double calculateGrossPay(){
        double grossPay = numberOfHours*hourlyPayRate;
        if(numberOfHours>0){
            return grossPay;
        }
        else
            return 0;
    }
    public void setNumberOfHours(double newNumberOfHours){
        if(newNumberOfHours>0){
            numberOfHours = newNumberOfHours;
            System.out.println("Hours Worked: "+numberOfHours);
        }
        else
            System.out.println("Error: Number of hours cannot be less than zero.");
    }
    public void setHourlyPayRate(double newHourlyPayRate){
        if(newHourlyPayRate>0){
            hourlyPayRate = newHourlyPayRate;
            System.out.printf("Pay Rate: $%.2f\n",hourlyPayRate);
        }
        else
            System.out.println("Error: Hourly pay rate cannot be less than zero.");
    }
    public double getNumberOfHours(){
        return numberOfHours;
    }
    public double getHourlyPayRate(){
        return hourlyPayRate;
    }
    public Pay(String newNameOfEmployee){
        nameOfEmployee = newNameOfEmployee;
        System.out.println("Employee Name: "+nameOfEmployee);
    }
}
