package forskelligeOpgaver;

public class HentEtTal {
    public static void main(String[] args) {


         //gennemsnit af 4 tal.
        int tal = 20;
        int tal2= 30;
        int tal3= 40;
        int tal4= 50;

        int gggg = (tal + tal2 + tal3 + tal4) /4;
        System.out.println(" her udregner vi talerne " +gggg);

        //for at kunne få det her til at virker skal man huske at kalde class'en
        // i dette tilfælde er det forskelligeOpgaver.HentEtTal2, da vi gerne ville have en udregning det fra.
        // vi kalder udregning HentMinTal, det er et methode kald!
        // her efter kalder vi vores metode i class'en "forskelligeOpgaver.HentEtTal2" som nu hedder HentMineTal
        // den har en "Public void udreng" som har nogle int værdier og en udregning
        // og en udskrift igennem println, så nu kan den printe vores udregning her.

        HentEtTal2 HentMineTal = new HentEtTal2();
        HentMineTal.udregn();


    }



}
