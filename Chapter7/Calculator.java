package Chapter7;

public class Calculator {
    public static void main(String[] args){
        if(args.length != 3){
            System.out.println("Usage: java Calculator operand1 operator operand2");
            return;
        }

        int result = 0;

        switch(args[1].charAt(0)){
            case '+': result = Integer.parseInt(args[0]) + Integer.parseInt(args[2]); break;
            case '-': result = Integer.parseInt(args[0]) - Integer.parseInt(args[2]); break;
            case '.': result = Integer.parseInt(args[0]) * Integer.parseInt(args[2]); break;
            case '/': result = Integer.parseInt(args[0]) / Integer.parseInt(args[2]); break;
        }

        System.out.println(args[0] + ' ' + args[1] + ' ' + args[2] + " = " + result);
    }
}
