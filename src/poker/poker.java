package poker;

import java.util.ArrayList;
import java.util.Collections;

public class poker {
    public static void main(String[] args) {
        pokerApp udfør = new pokerApp();
    }
}

class pokerApp {
    Deck d1 = new Deck();

    pokerApp() {
        Player p1 =new Player("hans");
        Player p2 = new Player("joe");
        int antal = Deck.deck.size();
        System.out.println("deck size: "+antal);

        // player 1 udskrift
        ArrayList<Kort> hjerterP1 = p1.findHjerter();
        ArrayList<Kort> sparkortP1 = p1.findspar();
        System.out.println(p1.playerName +" har så mange hjerte "+ hjerterP1.size()+ " antal");
        System.out.println(p1.playerName+ " har så mange spar " +sparkortP1.size()+" antal");
        Kort findHøjsteKortP1 = p1.findHøjestKort();
        System.out.println(p1.playerName + " højste kort er "+ p1.findHøjestKort());
        ArrayList<Kort> findParp1 = p1.findPar();
        System.out.println(findParp1);
        System.out.println();


        //player 2 udskrift
        ArrayList<Kort> findParp2 = p2.findPar();
        System.out.println(findParp2);
        Kort findHøjsteKortP2 = p2.findHøjestKort();
        System.out.println(p2.playerName + " højste kort er "+ p2.findHøjestKort());
        System.out.println();


        // udførelse
        if  (findHøjsteKortP1.værdi < findHøjsteKortP2.værdi){
            System.out.println(p2.playerName+ " har det højste kort!");
        }else if (findHøjsteKortP2.værdi < findHøjsteKortP1.værdi){
            System.out.println(p1.playerName + " har det højste kort!");
        }else System.out.println("i har lige højste kort!");

    }

}
class Player {
    ArrayList<Kort> hand = dealHand(5);
    String playerName;

    Player(String name) {
        playerName = name;
        ArrayList<Kort> playHand = hand;
        System.out.println(name + " har hand: " + hand);
    }

    public static ArrayList<Kort> dealHand(int numberOfCards) {
        ArrayList<Kort> handCards = new ArrayList<>();
        for (int i = 0; i < numberOfCards; i++) {
            Kort kort = Deck.getKort();
            handCards.add(kort);
        }
        return handCards;
    }
    public ArrayList<Kort> findHjerter(){
        ArrayList<Kort> hjerteKort = new ArrayList<>();
        for(Kort kort : hand){
            if("hjerte".equals(kort.kulør)){
                hjerteKort.add(kort);
            }
        }
        return hjerteKort;
    }
    public ArrayList<Kort> findspar() {
        ArrayList<Kort> sparKort = new ArrayList<>();
        for (Kort kort : hand) {
            if ("spar".equals(kort.kulør)) {
                sparKort.add(kort);
            }
        }
        return sparKort;
    }
    public ArrayList<Kort> findPar(){
        ArrayList<Kort> par = new ArrayList<>();
        for (int i=0; i < hand.size(); i++){
            for (int j = i +1; j < hand.size(); j++){
                Kort kort1 = hand.get(i);
                Kort kort2 = hand.get(j);

                if (kort1.værdi == kort2.værdi && !par.contains(kort1)){
                    par.add(kort1);
                    par.add(kort2);
                }else;
            }
        }
        return par;
    }

    public Kort findHøjestKort(){
        Kort højsteKort = hand.get(0);
        for (Kort kort : hand){
            if (kort.værdi >højsteKort.værdi){
                højsteKort.værdi = kort.værdi;
                højsteKort = kort;
            }
        }
        return højsteKort;
    }


}
class Deck {
    static ArrayList<Kort> deck = new ArrayList<>(52);
    String[] kulør = {"hjerte", "spar", "klør", "ruder"};
    int[] kortVærdi = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

    Deck() {
        makeDeck();
    }

    private void makeDeck() {
        for (String kul : kulør) {
            for (int vær : kortVærdi) {
                Kort kortet = new Kort(kul, vær);
                deck.add(kortet);
            }
        }
        Collections.shuffle(deck);
    }

    public static Kort getKort() {
        if (!deck.isEmpty()) {
            Kort kort = deck.get(0);
            deck.remove(0);
            return kort;
        }
        return null;
    }

}
class Kort {
    String kulør;
    int værdi;

    Kort(String a, int b) {
        kulør = a;
        værdi = b;

    }


    @Override
    public String toString() {
        return kulør + " " + værdi;
    }

}