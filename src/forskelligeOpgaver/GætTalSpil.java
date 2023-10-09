package forskelligeOpgaver;

import java.util.Scanner;

public class GætTalSpil {

        public static void main(String[] args) {
            Scanner inputScanner = new Scanner(System.in);

            System.out.println("Velkommen til Gæt Et Tal Spillet!");
            System.out.println("Tænk på et tal mellem 1 og 100.");

            int lavesteTal = 1;
            int højesteTal = 100;
            int gæt;

            do {
                gæt = (lavesteTal + højesteTal) / 2;
                System.out.println("Er tallet " + gæt + "? (Skriv 'ja', 'lavere' eller 'højere')");
                String svar = inputScanner.nextLine().toLowerCase();

                if (svar.equals("ja")) {
                    System.out.println("Jeg har gættet rigtigt! Tallet er " + gæt);
                    break;
                } else if (svar.equals("lavere")) {
                    højesteTal = gæt - 1;
                } else if (svar.equals("højere")) {
                    lavesteTal = gæt + 1;
                } else {
                    System.out.println("Ugyldigt svar. Brug 'ja', 'lavere' eller 'højere'.");
                }
            } while (true);

            inputScanner.close();
        }
    }
