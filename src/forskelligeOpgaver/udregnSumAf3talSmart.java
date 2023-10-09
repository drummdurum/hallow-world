package forskelligeOpgaver;

public class udregnSumAf3talSmart {

    // ind smart vej at finden den største int værdi
public static void main(String[] args) {
    int a=100,b=90, c=50;

    int størst = udregn(a,udregn(b,c));
    System.out.println("størst = " + størst);
}
static  int udregn(int x, int y){
    if (x<y)
        return y;
    else
        return x;
    }

}
