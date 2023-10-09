public class figur {

    public static void main(String[] args) {
        Firgur f1 = new Raktangel(50, 40);
        Firgur f2 = new Punkt();

        System.out.println(f1);
        System.out.println(f2);
    }
}
    abstract class Firgur {
        abstract double Bomkreds();
        abstract double Bareal ();
    }

    class Punkt extends Firgur {
        double Bomkreds(){return 0;}
        double Bareal () {return 0;}

        @Override
        public String toString() {
            return "punktets a og b "+ Bareal() + " "+ Bomkreds();
        }
    }

    class Raktangel extends Firgur {
        double hojde;
        double bredde;

        Raktangel(double a, double b){
            hojde = a;
            bredde = b;
        }

        double Bomkreds(){
            return 2*(hojde+bredde);
        }

        double Bareal(){
            return 2*hojde*bredde;
        }

        @Override
        public String toString() {
            return "omkredsen af raktangel " + Bomkreds() + " arealet af en raktangel "+Bareal();
        }
    }



