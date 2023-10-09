package dice;

public class DiceArry {

    public static void main(String[] args) {
        kop k = new kop();

        int [] numberOfturn = new int [100];
        for (int i =0;i<100; i++){
            k.roll();
            numberOfturn[i] = k.getSum();
        }

        for (int i=0; i<numberOfturn.length; i++)

            System.out.print( numberOfturn[i] + " ");


        int s = sum(numberOfturn);
        System.out.println(s);
        int calculat = s /100;
        System.out.println("så er gennemsnittet det her : "+ calculat);

        int h = howMany(numberOfturn);
        System.out.println();

    }

    static int howMany(int [] arr){
        int numberOf = 10;
        int count = 0;
        for (int i = 0; i<arr.length; i ++) {
            if (numberOf == arr[i]) {
                count++;
            }
        }
        System.out.println(count);
        return count;
    }



static int sum (int [] arr){
        int result=0;
        for(int i =0; i< arr.length; i++){
            result = result +arr[i];
        }
return result;
}


}
