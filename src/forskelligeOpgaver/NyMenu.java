package forskelligeOpgaver;

import java.awt.*;
import java.util.Scanner;

public class NyMenu {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        java.util.Scanner tasEtTal = new java.util.Scanner(System.in);
        double egnePenge;

        while (true){
            System.out.println(" ");

            System.out.println("1 " + "tast" + "nr 1 " + "for svenske kroner" + " 1,63 dkk");
            System.out.println("2 " +"tast " + "nr 2 " + "for norske kroner 1,65 dkk");
            System.out.println("3 " + "tast " + "nr 3 " + "for 1 islanske kroner svare til 19,25 dkk");
            System.out.println("4 " + "tast " + "nr 4 " + "for findske mark 1,26 dkk");
            System.out.println("5 "+ "tast nr 5 for at afslutte programmet");


            int valg = scanner.nextInt();

            switch (valg){
                case 1:
                    System.out.println("du har valg svenske kroner ");
                    System.out.println("skriv hvilket beløb som skal blive til svenske kr: ");
                    egnePenge = scanner.nextDouble();
                    double svensk = egnePenge * 1.63;
                    System.out.println("du har: " + svensk + "svenske kr");
                    break;
                case 2:
                    System.out.println("du har valg norske kroner ");
                    System.out.println("skriv hvilket beløb som skal blive til norske kr: ");
                    egnePenge = scanner.nextDouble();
                    double norske = egnePenge * 1.65;
                    System.out.println("du har: " + norske + " norkse kr");
                    break;
                case 3:
                    System.out.println("du har valg islandske kroner ");
                    System.out.println("skriv hvilket beløb som skal blive til islalandske kr: ");
                    egnePenge = scanner.nextDouble();
                    double islandske = egnePenge * 19.25;
                    System.out.println("du har: " + islandske + " islandske kr");
                    break;
                case 4:
                    System.out.println("du har valg finske mark ");
                    System.out.println("skriv hvilket beløb som skal blive til finske mark: ");
                    egnePenge = scanner.nextDouble();
                    double finsk = egnePenge * 1.26;
                    System.out.println("du har: " + finsk + " finske mark");
                    break;
                case 5:
                    System.out.println("Nu afslutter programmet");
                    System.exit(0);
                default:
                    System.out.println("ugyldigt svar, skriv et tal mellem 1 0g 5.");
                    System.out.println(" alt efter hvilken funktion du skal bruge");
                    break;
            }
        }


    }


}
