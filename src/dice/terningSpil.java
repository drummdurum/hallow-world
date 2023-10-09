package dice;

public class terningSpil {
    spiller p1 = new spiller("bjarke");
    spiller p2 = new spiller("martin");
    spiller p3 = new spiller("cindy");
    spiller p4 = new spiller("markus");

    void play() {
        System.out.println(p1.name + "\t"+ "\t "+p2.name+"\t "+p3.name + "\t"+p4.name);
        int t = 0;
    while (p1.points <100 && p2.points <100) {
        p1.turn();
        p2.turn();
        p3.turn();
        p4.turn();
        System.out.println(p1.points + "\t"+"\t"+"\t" + p2.points +"\t"+"\t"+ "\t"+ p3.points + "\t"+ "\t" + p4.points );
        t++;
        System.out.println("antal tur "+ t);
    }
    if ( p1.points > p2.points && p1.points > p3.points && p1.points > p4.points ){
        System.out.println(p1.name +" har flest point ");
    } else if ( p4.points > p2.points && p4.points > p3.points && p4.points > p1.points ) {
        System.out.println(p4.name + " har flest point");
    } else if ( p3.points > p2.points && p3.points > p4.points && p3.points > p1.points ) {
        System.out.println(p3.name + " har flest point");
    }else System.out.println(p2.name + " har flest point");
    }

    public static void main(String[] args) {
        terningSpil udfør = new terningSpil();
        udfør.play();


    }
}