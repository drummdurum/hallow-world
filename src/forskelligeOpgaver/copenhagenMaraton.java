package forskelligeOpgaver;

public class copenhagenMaraton {

    public static void main(String[] args) {

        rigistring("sebastian", 44, 'D');
        rigistring("morten", 45, 'A');

    }

    static void rigistring (String navn, int nr,char bogstav){
        System.out.println("Dear " + navn);
        System.out.println("we ar happy for your registration");
        System.out.println("your start nr is: "+ nr);
        System.out.println("your grup is " + bogstav);
        System.out.println("pleas tjek ind 10 min before start");
        System.out.println(" ");


    }

}
