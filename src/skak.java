import java.util.ArrayList;

public class skak {

    public static void main(String[] args) {
            Brik b1 = new Bunde(Brik.Farve.hvid, 1,2);
        System.out.println(b1);
        }



}

     abstract class Brik {
       enum Farve { sort, hvid};
       Farve farve;
        int xPos;
        int yPos;


        Brik( Farve farve, int b, int c){
            this.farve =farve ;
            xPos = b;
            yPos = c;
        }
         abstract boolean kanFlytteTil(int nyxPos, int nyyPos) ;
            public String  toString(){
                return farve+"("+xPos+","+yPos+")";
             }

    }

    class Bunde extends Brik {
    Bunde (Farve farve, int xPos, int yPos){
    super (farve,xPos,yPos);
    }
    boolean kanFlytteTil(int nyXPos, int nyYPos){
    if (xPos>1 || xPos<8 && yPos>1 || yPos<8) return false;
    if (xPos!=nyXPos) return false;
    if (nyYPos == yPos + 1) return true;
    else return false;
    }

        @Override
        public String toString() {
            return "bunde " + super.toString();
        }
    }

