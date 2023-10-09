package string;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class stringtæl {
    // se gerne stringlæser i samme mappe som forklare det!

    public static void main(String[] args) throws IOException {
        FileReader fil = new FileReader("WordCount.txt");

        ArrayList<String> ordliste = new ArrayList<>();

        BufferedReader ind = new BufferedReader(fil);
        int antalord =0;
        int enkeltOrd = 0;
        String linje;
        while ((linje = ind.readLine()) != null){
            String[] words = linje.split(" ");

            for ( String word : words){
                ordliste.add(word);

                antalord = ordliste.size();


                if(word.compareToIgnoreCase("funny")==0){

                enkeltOrd++;

                }

            }

        }
        System.out.println("hvor mange ord er der af funny = "+ enkeltOrd);
        System.out.println("hvor mange ord er der: "+antalord);

    }
}
