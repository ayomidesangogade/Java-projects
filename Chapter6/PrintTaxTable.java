package Chapter6;

public class PrintTaxTable {
    public static void main(String[]args){
        System.out.println("Taxable Income\tSingle\tMarried Joint or Qualifying Widow(er)\tMarried Seperate\tHead of House hold");
        for(int i = 50000; i<=60000;i+=50){
            System.out.printf("%d\t\t%d\t\t%d\t\t\t\t%d\t\t\t\t%d\n",i,Math.round(computeTax(0, i)),Math.round(computeTax(1, i)),Math.round(computeTax(2, i)),Math.round(computeTax(3, i)));
        }
    }
    public static double computeTax(int status, double taxableIncome){
        double tax = 0;
        if (status == 0){
            if(taxableIncome <= 8350)
                tax = taxableIncome*0.10;
            else if(taxableIncome >= 8351 && taxableIncome<= 33950)
                tax = (8350*0.10) + (taxableIncome-8350)*0.15;
            else if(taxableIncome >= 33951 && taxableIncome<=82250)
                tax = (8350*0.10)+(33950-8350)*0.15+(taxableIncome-33950)*0.25;
            else if (taxableIncome>=82251&&taxableIncome<=171550)
                tax =  (8350*0.10)+(33950-8350)*0.15+(82250-33950)*0.25+(taxableIncome-82250)*0.28;
            else if (taxableIncome>=171551&&taxableIncome<=372950)
                tax =  (8350*0.10)+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(taxableIncome-171550)*0.33;
            else if (taxableIncome>=372951)
                tax =  (8350*0.10)+(33950-8350)*0.15+(82250-33950)*0.25+(171550-82250)*0.28+(372950-171550)*0.33+(taxableIncome-372950)*0.35;
            else
                tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (taxableIncome - 372950) * 0.35;
        }
        else if (status == 1){
            if (taxableIncome <= 16700)
                tax = taxableIncome*0.10;
            else if(taxableIncome >= 16701 && taxableIncome<= 67900)
                tax = (16700*0.10) + (taxableIncome-16700)*0.15;
            else if(taxableIncome >= 67901 && taxableIncome<=137050)
                tax = (16700*0.10)+(67900-16700)*0.15+(taxableIncome-67900)*0.25;
            else if (taxableIncome>=137051&&taxableIncome<=208850)
                tax =  (16700*0.10)+(67900-16700)*0.15+(137050-67900)*0.25+(taxableIncome-137050)*0.28;
            else if (taxableIncome>=208851&&taxableIncome<=372950)
                tax =  (16700*0.10)+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(taxableIncome-208850)*0.33;
            else if (taxableIncome>=372951)
                tax =  (16700*0.10)+(67900-16700)*0.15+(137050-67900)*0.25+(208850-137050)*0.28+(372950-208850)*0.33+(taxableIncome-372950)*0.35;
        }
        else if (status == 2){
            if(taxableIncome <= 8350)
                tax = taxableIncome*0.10;
            else if(taxableIncome >= 8351 && taxableIncome<= 33950)
                tax = (8350*0.10) + (taxableIncome-8350)*0.15;
            else if(taxableIncome >= 33951 && taxableIncome<=68525)
                tax = (8350*0.10)+(33950-8350)*0.15+(taxableIncome-33950)*0.25;
            else if (taxableIncome>=68526&&taxableIncome<=104425)
                tax =  (8350*0.10)+(33950-8350)*0.15+(68525-33950)*0.25+(taxableIncome-68525)*0.28;
            else if (taxableIncome>=104426&&taxableIncome<=186475)
                tax =  (8350*0.10)+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(taxableIncome-104425)*0.33;
            else if (taxableIncome>=186476)
                tax =  (8350*0.10)+(33950-8350)*0.15+(68525-33950)*0.25+(104425-68525)*0.28+(186475-104425)*0.33+(taxableIncome-186475)*0.35;
        }
        else if (status == 3){
            if(taxableIncome <= 11950)
                tax = taxableIncome*0.10;
            else if(taxableIncome >= 11951 && taxableIncome<= 45500)
                tax = (11950*0.10) + (taxableIncome-11950)*0.15;
            else if(taxableIncome >= 45501 && taxableIncome<=117450)
                tax = (11950*0.10)+(45500-11950)*0.15+(taxableIncome-45500)*0.25;
            else if (taxableIncome>=117451&&taxableIncome<=190200)
                tax =  (11950*0.10)+(45500-11950)*0.15+(117450-45500)*0.25+(taxableIncome-117450)*0.28;
            else if (taxableIncome>=190201&&taxableIncome<=372950)
                tax = (11950*0.10)+(45500-11950)*0.15+(117450-45500)*0.25 +(190200-117450)*0.28+(taxableIncome-190200)*0.33;
            else if (taxableIncome>=372951)
                tax = (11950*0.10)+(45500-11950)*0.15+(117450-45500)*0.25 +(190200-117450)*0.28 +(372950-190200)*0.33+(taxableIncome-372950)*0.35;
        }
        else{
            return 0;
        }
        return tax;
    }
}
