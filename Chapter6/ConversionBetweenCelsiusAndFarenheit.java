package Chapter6;

public class ConversionBetweenCelsiusAndFarenheit {
    public static void main(String[]args){
        System.out.println("Celsius\tFahrenheit\t|\tFahrenheit\tCelsius");
        System.out.println("-------------------------------------------------------");
        for(double i = 40, j = 120; i >= 31 && j >= 30; i--, j-=10){
            System.out.printf("%.1f\t\t%.1f\t|\t%.1f\t\t%.2f\n",i,celsiusToFahrenheit(i),j,fahrenheitToCelsius(j));
        }
    }
    public static double celsiusToFahrenheit(double celsius){
        double fahrenheit = (9.0 / 5) * celsius + 32;
        return fahrenheit;
    }
    public static double fahrenheitToCelsius(double fahrenheit){
        double celsius = (5.0 / 9) * (fahrenheit - 32);
        return celsius;
    }
}
