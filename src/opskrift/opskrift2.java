package opskrift;

import java.io.*;

public class opskrift2 {

    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("src/Kødsovs.txt");
        BufferedReader ind = new BufferedReader(fil);

        String linje = ind.readLine();
        while (linje != null) {
            String[] bidder = linje.split(",");
            String name = bidder[0];
            int startNo=Integer.parseInt(bidder[1]);
            char startGroup=bidder[2].charAt(0);
            saveRegistration(name, startNo, startGroup);
            linje = ind.readLine();
        }
        ind.close();

    }

    static void saveRegistration(String name, int startNumber, char startGroup) throws IOException {
        //Gemmer filen / skriver
        FileWriter fil = new FileWriter(name+".txt");
        PrintWriter ud = new PrintWriter(fil);
        ud.println("Dear "+name+" !"); //læg mærke til, at vi kan erstatte System.out med en PrintWriter
        ud.println("We are happy to receive your registration.");
        ud.println("Your start number is: "+ startNumber);
        ud.println("You start in start group: "+startGroup);
        ud.println("Please check in 10 minutes before start.");
        ud.close(); //PrintWriter skal lukkes efter man er færdig

    }
}
