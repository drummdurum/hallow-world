package dice;

import java.util.Random;

public class terning {

    Random random = new Random();
    int roll(){
        return random.nextInt(6)+1;
    }

    public static void main(String[] args) {
        terning d1 = new terning();

    }
}


