package opskrift;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class opskrifter {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String indskrivning;

        System.out.println("hvilken opskrift ville du gerne gemme");
        System.out.println("1 aftensmad ");
        System.out.println("2 forkost ");
        System.out.println("3 morgenmad ");
        System.out.println("4 afslut program");

        int valg = scanner.nextInt();
        scanner.nextLine();
        boolean færdig = true;


            switch (valg) {
                case 1:
                    System.out.println("skriv navnet på aftensmad");
                    String aftensmadTitel = scanner.nextLine();

                    System.out.println("skriv ingredienser");
                    String ingredienser = scanner.nextLine();

                    System.out.println("skriv rangsering");
                    int rangsering = scanner.nextInt();

                    GemOpskrift("aftensmad.txt",aftensmadTitel,ingredienser,rangsering);
                    break;

                case 2:
                    System.out.println("skriv ingredienser");
                    indskrivning = scanner.nextLine();
                case 3:
                    System.out.println("ranksering");
                    int rank = scanner.nextInt();
                    break;
            }

        }
        public static void GemOpskrift(String filnavn, String navn, String ingredienser, int rang) throws IOException {
            try (PrintWriter skrivOpskrift = new PrintWriter(new FileWriter(filnavn,true))){
                skrivOpskrift.println(navn + "," + ingredienser+","+ rang);
                System.out.println("aftensmad er gemt i "+filnavn);

            }catch (IOException e){
                System.out.println(" der sket en teknisk fejl "+ e.getMessage());
            }
        }

}

