package poker;

import java.util.ArrayList;
import java.util.Collections;

public class poker2 {

    public static void main(String[] args) {
        ArrayList<Kort> deck = new ArrayList<>();

        String[] kulørs = {"H", "S", "K", "R"};
        int[] værdier = {2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14};

        for (String kulør : kulørs) {
            for (int værdi : værdier) {
              Kort SPkort = new Kort(kulør, værdi);
                deck.add(SPkort);
                System.out.println(SPkort);
            }
        }
        Collections.shuffle(deck);

        int nummerKort = 5;
/*
        System.out.println("Trukne kort:");
        for (int i = 0; i < nummerKort; i++) {
            Kort trækKort = deck.get(i);
            System.out.println(trækKort);
  */

    }

        class pokerSpiller {
            String navn;

        }

        static class Kort {
            String kulør;
            int værdi;

            Kort(String a, int b) {
                String kulør = a;
                int værdi = b;

            }

            public int getVærdi() {
                return værdi;
            }

            public String getKulør() {
                return kulør;
            }

            @Override
            public String toString() {
                return kulør + " af " + værdi;
            }
        }


    }