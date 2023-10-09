public class pyramid {

    public static void main(String[] args) {
        Nypyramide a= new Nypyramide(100,100);
        Nypyramide b= new Nypyramide(250,500);
        Nypyramide c= new Nypyramide(10,150);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
    class Nypyramide{
        double side;
        double højde;

    Nypyramide (double side,double højde){
    this.side = side;
    this.højde = højde;
    }

    double regn (){
        return side*side*højde/4;
    }
    
        @Override
        public String toString() {
            return "nypyramiden side er "+ side+ " pyramidens højde er " + højde+ " volumen er "+ regn();
        }
    }



