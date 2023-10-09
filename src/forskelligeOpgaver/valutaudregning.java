package forskelligeOpgaver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class valutaudregning {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double egnePenge;
       // char valg;
        int valg;

        while(true){
        System.out.println("velkommen til valuta udregning");
        System.out.println("vælg en valuta, ved at bruge et bugstav ");
        System.out.println("1 tast for svenske kroner");
        System.out.println("2 tast for norske kroner");
        System.out.println("3 tast for 1 islanske kroner svare til");
        System.out.println("4 tast for findske mark");
        System.out.println("5 tast for at afslutte programmet");

        //valg = input.next().charAt(0);
        valg  = input.nextInt();
        if(valg >= 6){
            System.out.println("du har skrevet et forkert tal");
            System.out.println("prøv igen");
            System.out.println();
        }
        if (valg == 5) {
            System.out.println("forvel og tak");
            break;
        }

        switch (valg){
            case 1:
                System.out.println("du har valgt svensk");
                double SK = 1.63;
                egnePenge = skrivRigrigt("du skal skrive et tal");
                System.out.println( udregningValuta(egnePenge ,SK)+ " SKKR");
                System.out.println();
                break;
            case 2:
                System.out.println("du har valgt norsk");
                double NO = 1.65;
                egnePenge = skrivRigrigt("du skal skrive et tal");
                System.out.println( udregningValuta(egnePenge ,NO)+ " NOKR");
                System.out.println();
                break;
            case 3:
                System.out.println("du har valg islansk");
                double IS = 19.25;
                egnePenge = skrivRigrigt("du skal skrive et tal");
                System.out.println( udregningValuta(egnePenge , IS)+ " ISKR");
                System.out.println();
                break;
            case 4:
                System.out.println("du har valg Finsk");
                double FI = 1.26;
                egnePenge = skrivRigrigt("du skal skrive et tal");
                System.out.println( udregningValuta(egnePenge , FI)+ " Mark");
                System.out.println();
                break;

        }//swict

        }// while

    }// main

    static double udregningValuta (double a, double b){
        double ud = a *b;
        return ud;

    }

    static double skrivRigrigt (String pro){
        Scanner input= new Scanner(System.in);
        boolean ok = false;
        double engePenge =0;
        do {
            try {
                System.out.println("skriv dit danske beløb");
                engePenge = input.nextDouble();
                ok =true;
            } catch (InputMismatchException e) {
                System.out.println("du har skrevet forkert");
                input.nextLine();
            }
        }while(!ok);
        return engePenge;

    }

}
