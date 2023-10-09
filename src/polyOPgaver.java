public class polyOPgaver {
    public static void main(String[] args){
        polo f1 = new udrengning(50,20);
        System.out.println(f1.Fx(50));
        polo f2 = new udrengning2(10,20,30);

    }
}

abstract class polo {
     abstract double Fx(double x);
}

class udrengning extends polo{
    int a;
    int b;


    udrengning (int A , int B){
        a=A;
        b=B;

    }

    @Override
    double Fx(double x) {
        return a*x+b;
    }

}

class udrengning2 extends polo {
    int a;
    int b;
    int c;

    udrengning2(int A, int B, int C) {
        a = A;
        b = B;
        c = C;
    }

    @Override
    double Fx(double x) {
        return a*x*x*b+x+c;
    }
}