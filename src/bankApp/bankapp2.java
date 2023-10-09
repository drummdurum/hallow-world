package bankApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class bankapp2 {

    public static void main(String[] args) {

        Account a1 = new Indlaan("joe pass", 5);
        //      a1.deposit(500);
        //      a1.withdraw(700);
        //      a1.printTransektions();
        Account a2 = new Højrente("jimmy h", 10,100000, LocalDate.of(2025, 9, 10));
        //      a2.deposit(500);
        //      a2.withdraw(100);
        //      a2.printTransektions();
        Account a3 = new BørneOpsparing ("kaj j", 8, LocalDate.of(2010,9,26),5000);
        //      a3.deposit(100);
        //      a3.withdraw(500);
        //      a3.printTransektions();
        Account a4 = new milionærKlub(" kim H", 0,500);
        //      a4.deposit(300);
        //      a4.printTransektions();
        Account a5 = new milionærKlub(" jan H", 0,500);
         //       a5.deposit(400);
         //       a5.rente();
         //       a5.printTransektions();

        Account a6 = new Kridit("julie", 0);
              a6.withdraw(400);
              a6.withdraw(600);


 /*      list.add(a1);
        list.add(a2);
        list.add(a3);
        list.add(a5);
        list.add(a4);
        for(Account a:list) a.printTransektions();
        for(Account a:list)a.deposit(100);
        for(Account a:list) a.printTransektions();
*/

    }
}

class Kridit extends Account {

    Kridit(String a, int b) {
        super(a, b);

    }

    void withdraw (double amount)  {
        if( balance -amount >= -500){
            super.withdraw(amount);
        }else
            System.out.println("du har nået dit max ");

    }

}


class milionærKlub extends Account{
    double jackPot = 10000;
    Random gen = new Random();

    milionærKlub(String a, int b, double amount){
        super(a,b);

    }
    public void rente(){
      int winner = gen.nextInt(5)+1;
        System.out.println(winner);
        if(accountNo==winner){
            balance=balance + jackPot;
        }
    }

}

class  BørneOpsparing extends Account{
LocalDate fødsD;
    BørneOpsparing(String a, int b,LocalDate føds, double startBeløb){
        super(a,b);
        this.fødsD =føds;

    }
    void withdraw (double amount){
        int føds2 =LocalDate.now().compareTo(fødsD);
            if(føds2<18) {
                System.out.println("du kan først hæve penge når barnet er 18, barnet er" + føds2);
            }else
        super.withdraw(amount);
    }


}

class Indlaan extends Account {
    Indlaan(String name, int rate) {
        super(name,rate);
    }
    void withdraw (double amount){
        if (balance >= amount) {
            super.withdraw(amount);
        }else
            System.out.println("du kan hørest hæve "+balance);
    }

}

class Højrente extends Account{
    LocalDate RD;

    Højrente(String name, double rate, double startSaldo, LocalDate RD) {
        super(name,rate);
        super.deposit(startSaldo);
        this.RD =RD;

    }

    @Override
    void deposit(double amount) {
        System.out.println("du kan ikke sætte penge ind på konto");
        System.out.println();
    }

    void withdraw (double amount){
        if(RD.isAfter(LocalDate.now())) {
            System.out.println("du kan først hæve " + RD);
            System.out.println();
        }else super.withdraw(amount);
    }

}



