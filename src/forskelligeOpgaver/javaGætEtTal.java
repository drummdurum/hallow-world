package forskelligeOpgaver;

import java.util.Random;
import java.util.Scanner;

public class javaGætEtTal {

    public static void main(String[] args) {
        // en start text
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Velkommen til jeg gætter dit tal");
        System.out.println("tænk på et tal mellem 1 og 100");
        int lav = 1;
        int høj = 100;
        int gæt;
        int antalGæt = 0;


        do {
            gæt = (lav + høj) / 2;
            System.out.println("er tallet " + gæt + " skriv ja, højere eller lavere ");
            String svar = inputScanner.nextLine().toLowerCase();
            antalGæt++;

            if (svar.equals("ja")) {
                System.out.println("jeg gættet rigtigt");
                System.out.println("forsøg brugt " +antalGæt );
            break;
            }
            else if (svar.equals("lavere")) {
                høj = gæt - 1;

            } else if (svar.equals("højere")){
                lav = gæt + 1;
        }else
                System.out.println("du har skrevet forkert, skriv ja, højere eller lavere");
        }while(true);
        inputScanner.close();


    }


}
