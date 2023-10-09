public class landsholdet {

        public static void main(String[] args) {
            Spiller[] hold=new Spiller[11];
            hold[0]=new Spiller("Kasper Schmeichel", 1);
            hold[1]=new Spiller("Henrik Dalsgaard", 14);
            hold[2]=new Spiller("Simon KjÃ¦r", 4);
            hold[3]=new Spiller("Mathias JÃ¸rgensen", 13);
            hold[4]=new Spiller("Jens Larsen", 17);
            hold[5]=new Spiller("Thomas Delaney", 8);
            hold[6]=new Spiller("Andreas Christensen", 6);
            hold[7]=new Spiller("Christian Eriksen", 10);
            hold[8]=new Spiller("Martin BraithWaite", 11);
            hold[9]=new Spiller("Andreas Cornelius", 21);
            hold[10]=new Spiller("Pione Sisto", 23);

            printOpstilling(hold);
            System.out.println();
            hold[9]=new Spiller("Rasmus HÃ¸jlund", 18);
            printOpstilling(hold);
        }

        static void printOpstilling(Spiller[] team){
            for (int i=0; i< team.length; i++)
                System.out.println(team[i]);
        }
    }

    class Spiller {
        String navn;
        int rygnummer;

        Spiller(String navn, int nummer){
            this.navn=navn;
            this.rygnummer=nummer;
        }

        @Override
        public String toString() {
            return navn+" "+rygnummer;
        }
    }


