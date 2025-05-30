class Staff{
    private String nameOfStaff;
    private final int HOURLYRATE = 30;
    private int hoursWorked;
    
    public void printMessage(){
        System.out.println("Calculating pay...");
    }
    
    public int calculatePay(){
        printMessage();
        int staffPay = hoursWorked*HOURLYRATE;
        if(hoursWorked > 0)
            return staffPay;
        else
            return -1;
    }
    
    public int calculatePay(int bonus, int allowance){
        printMessage();
        if(hoursWorked >0)
            return hoursWorked*HOURLYRATE+bonus+allowance;
        else
            return 0;
    }
    public void setHoursWorked(int hours){
        if(hours > 0)
            hoursWorked = hours;
        else{
            System.out.println("Error: HoursWorked must not be smaller than zero.");
            System.out.println("Error: HoursWorked is not updated.");
        }
    }
    public int getHoursWorked(){
        return hoursWorked;
    }
    public Staff(String name){
        nameOfStaff = name;
        System.out.println("\n"+nameOfStaff);
        System.out.println("---------------");
    }
    public Staff(String firstName, String lastName){
        nameOfStaff = firstName+" "+lastName;
        System.out.println("\n"+nameOfStaff);
        System.out.println("---------------");
    }
}
public class ObjectOrientedDemo {
    public static void main(String[]args){
        Staff staff1 = new Staff("Ayomide", "Sangogade");
        staff1.setHoursWorked(12);
        System.out.println(staff1.calculatePay(1600, 45));
    }
}