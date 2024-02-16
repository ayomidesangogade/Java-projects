package Chapter7;

public class Pick4Cards {
    public static void main(String[] args){
        int[] deck = new int[52];
        String[] ranks = {"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};

        for(int i = 0;i<deck.length;i++)
            deck[i] = i;
        random(deck);
        print(ranks, deck);
    }
    public static int random(int[] deck){
        int temp = 0;
        for(int i = 0;i<deck.length;i++){
            int j = (int)(Math.random()*deck.length);
            temp = deck[i]; deck[i] = deck[j]; deck[j] = temp;
        }
        return temp;
    }
    public static void print(String[] ranks, int[] deck){
        int picks = 0;
        while(picks < 1000000){
            int sum = sum(ranks, deck);

            if(sum == 24){
                System.out.println("Picks: ");
                break;
            }
            picks++;
        }
        System.out.println(picks);
    }
    public static int sum(String[] ranks, int[] deck){
        int sum = 0;
        String[] result = rankChooser(ranks, deck);
        for(String card: result){
            if(card.equals("Ace"))
                sum += 1;
            else if(card.equals("King"))
                sum += 13;
            else if(card.equals("Queen"))
                sum += 12;
            else if(card.equals("Jack"))
                sum += 11;
            else
                sum+=0;
        }
        return sum;
    }
    public static String[] rankChooser(String[] ranks, int[] deck){
        String[] result = new String[4];
        for(int i = 0;i<4;i++){
            result[i] = ranks[deck[i] % 13];
        }
        return result;
    }
}
