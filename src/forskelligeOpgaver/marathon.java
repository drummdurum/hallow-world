package forskelligeOpgaver;

import java.util.Random;

public class marathon {
    public static void reg(String navn) {
        int ran;
        Random gen = new Random();
        ran = gen.nextInt(6000);

    if (ran <4000) {
        System.out.println("tak for din tilmeldning " + navn);
        System.out.println(navn + " du er nu registret!");
        System.out.println("dit start nr er: " + ran);
        System.out.println("du stater i sektion A");
        System.out.println("husk at tjekke ind 10 min før");
        System.out.println(" ");
    }else if (ran >3000){
            System.out.println("tak for din tilmeldning " + navn);
            System.out.println(navn + " du er nu registret!");
            System.out.println("dit start nr er: " + ran);
            System.out.println("du stater i sektion B");
            System.out.println("husk at tjekke ind 20 min før");
            System.out.println(" ");
        } else if (ran > 1000) {
            System.out.println("tak for din tilmeldning " + navn);
            System.out.println(navn + " du er nu registret!");
            System.out.println("dit start nr er: " + ran);
            System.out.println("du stater i sektion C");
            System.out.println("husk at tjekke ind 20 min før");
            System.out.println(" ");
        }

    }

        public static void main (String[]args){

        reg("sebastian drumm");
        reg("julie mortesen");


        }


        }
