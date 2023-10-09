package forskelligeOpgaver;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lommeregner {

    public static void main(String[] args) {
         double tal1=0;
         double tal2=0;
         char op;
         double result;
        Scanner input = new Scanner(System.in);


         while ( true){
             System.out.println("velcomen til regnemaskinen");
             System.out.println(" + for at ligge 2 tal ");
             System.out.println(" - for at minus 2 tal");
             System.out.println(" * for at gange 2 tal ");
             System.out.println(" / for at dividere 2 tal");
             System.out.println(" q for at stoppe programmet");
             op=input.next().charAt(0);
             if (op == 'q')
                 break;

          tal1= indputDoubel("indtast dit første Nr: ");
          tal2 = indputDoubel("indtast dit andet nr: ");



             switch (op){
                 case '+':
                     result = tal2 + tal2;
                     System.out.println("det bliver" + result);
                     break;
                 case '-':
                     result = tal2 - tal1;
                     System.out.println("det bliver " + result);
                     break;
                 case '*':
                     result = tal1 * tal2;
                     System.out.println("det bliver " +result);
                     break;
                 case '/':
                     result = tal1 / tal2;
                     System.out.println("det bliver " +result);
                     break;

                 default:
                     System.out.println("du har skrevet forkert");
             }// switch

         }// while loopet


    }// det høre til main.
    static double indputDoubel (String promp){
        Scanner input = new Scanner(System.in);
        boolean ok= false;
        double tal1=0;
        do {
            try {
                System.out.println(" indtast dit første tal");
                tal1 = input.nextDouble();
                ok =true;
            } catch (InputMismatchException e) {
                System.out.println("du har skrevet forkert");
                input.nextLine();
            }
        }while(!ok);
        return tal1;

    }


}
