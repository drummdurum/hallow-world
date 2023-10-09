package dice;

public class kop {
    terning t1 = new terning();
    terning t2 = new terning();
    terning t3 = new terning();
    terning t4 = new terning();

    int resualt1;
    int resualt2;
    int resualt3;
    int resualt4;



    void roll(){
        resualt1 = t1.roll();
        resualt2 = t2.roll();
        resualt3 = t3.roll();
        resualt4 = t4.roll();
    }
    int getSum(){
        return resualt1 +resualt2 + resualt3 + resualt4;
    }

    public static void main(String[] args) {
        kop k = new kop();
        k.roll();
        k.getSum();
    }
}
