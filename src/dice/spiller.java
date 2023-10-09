package dice;

public class spiller {
    String name;
    kop k = new kop();
    int points = 0;

    spiller (String a){
        name =a;
    }

    void turn(){
        k.roll();
        points = points+k.getSum();
    }

    public static void main(String[] args) {
        spiller p1 = new spiller("ole");
        while (p1.points < 100){
            p1.turn();
            System.out.println(p1.points);
        }
    }
}
