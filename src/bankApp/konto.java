package bankApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Locale;

public class konto {

        public static void main(String[] args) {
            int a=5;
            Account a1=new Account( "Joe Pass", 5);
            Account a2=new Account( "Jimmy Hendrix", 7);

            a1.deposit(100);
            a1.withdraw(50);
            a1.setOwner("Carsten");

//        a1.accountNo=1;
//        a1.owner="Joe Pass";
//        a1.balance=0;
//        a1.interestRate=5;
            a1.rente();
            a1.printTransektions();

            a2.printTransektions();
        }
    }

    class Account {
    static int accountNr=0;
        protected int accountNo;
        protected String owner;
        protected double balance;         // IndestÃ¥ende
        protected double interestRate;    // Ã…rlig rente i %
        protected ArrayList<transektion> transektions = new ArrayList<>();

        Account( String ow, double ir){
            accountNr ++;
            accountNo = accountNr;
            owner=ow;
            interestRate=ir;
            balance=0;
        }

        void setOwner(String newName){
            owner=newName;
        }

        void deposit(double amount){
            transektions.add(new transektion("indsæt",amount,balance));
            balance=balance+amount;
        }

        void withdraw(double amount){
            transektions.add(new transektion("hævet",amount,balance));
            balance=balance-amount;
        }

        void rente(){
            double rentePlus = balance *interestRate/100;
            balance=balance + rentePlus;
            transektions.add(new transektion("rente",rentePlus,balance));
        }

        void printTransektions(){
            System.out.println(this);
            System.out.println("text"+"\t"+"dato"+"\t"+"saldo");
            for ( transektion t : transektions){
                System.out.println(t);
            }
            System.out.println();
        }

        @Override
        public String toString() {
            return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
        }

    }

    class transektion {
    String text;
    LocalDate date;
    double amount;
    double newBalacen;


    transektion (String text, double amount, double newBalacen){
        this.text=text;
        this.amount=amount;
        this.newBalacen=newBalacen;
        date=LocalDate.now();
    }

        @Override
        public String toString() {
            return text + "\t"+date+"\t"+amount+"\t"+newBalacen;
        }
    }



