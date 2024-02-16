package Chapter4;

public class PlateNumber {
    public static void main(String[]args){
        int randUppercase1 = (int)(65 + (Math.random()*26));
        int randUppercase2 = (int)(65 + (Math.random()*26));
        int randUppercase3 = (int)(65 + (Math.random()*26));
        int randomNumber = (int)(1000 + (Math.random()*10000));
        String randomNumberString = randomNumber + "";
        System.out.println("Plate number: "+(char)randUppercase1+""+(char)randUppercase2+""+(char)randUppercase3+""+randomNumberString);
    }
}
