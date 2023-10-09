package forskelligeOpgaver;

public class StringOpgaver {

        public static void main(String[] args) {
                      
        String set = "det er måske en dejlig dag, måske den bedste længe";
        String fjern = "måske";
        int ud = set.indexOf(fjern);

        //neden for kan man se en m´ny string variabel/metode, den starter med at kalde den
        // gamle sætning som hedder set. vi ville dog kun fjerne et måske.
        // så vi er nød til at kalde den set igen, men denne gang starter vi sætning
        // hvor vi fjernet måsket.

        String nySet = set.substring(0,ud) + set.substring(ud + fjern.lastIndexOf(""));
            System.out.println(nySet);

/*       String set = "jeg har en dejlig dag";
       String s = set.replace("jeg","");
            System.out.println(s);
                                                      */
       /*   her kan man se hvordan man replacer et ord eller mere.
        String sæt = "jeg har haft en dejlig dag";
        String s = sæt.replace("har","god") ;
            System.out.println(s);*/


        // her kan man se hvor en String variabel står i en sætning.
     //  String text = "jeg har et mellem rum men hvor";

     //     System.out.println("hvor er mellemrummet " + text.indexOf(" "));

        }
    }


