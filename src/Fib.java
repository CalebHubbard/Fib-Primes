import java.math.BigInteger;
import java.util.Scanner;

public class Fib {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        long febCount = input.nextLong();
        System.out.println("fib # (Un)" + "      point in fib seq (n)");
        input.close();
        

        BigInteger nMinus2 = BigInteger.valueOf(0);
        BigInteger nMinus1 = BigInteger.valueOf(1);
        BigInteger hold;
        int number = 0;
        int psum = 0;
        int esum = 0;
        for(int i=2; i <= febCount; i++){
            hold = nMinus1;
            nMinus1 = nMinus1.add(nMinus2);
            if      (hold.mod(BigInteger.valueOf(i)) == BigInteger.valueOf(0) || 
                    ((hold.add(hold)).add(nMinus2)).mod(BigInteger.valueOf(i)) == BigInteger.valueOf(0)) {
                System.out.println(i);
                number++;
                psum+=i;
            }
            if (i==5) {
                System.out.println(i);
                number++;
                psum+=i;
            }
            
            
            nMinus2 = hold;
            
            
            //System.out.println(i + " " + nMinus1);
        }
        for (int i = 2; i < febCount; i++) {
            if (i%2 == 0) {
                esum+=i;
            }
        }
        System.out.println("total = " + number);
        System.out.println("psum = " + psum);
        System.out.println("esum = " + esum);
        
        System.out.println((double)(psum) / (double) febCount);
        System.out.println((double) (esum) / (double) febCount);
        /*for (int i = 0; i < pri.size(); i++) {
            System.out.println(pri.get(i));
        }*/
        //System.out.println("total amount = " + pri.size());
            //if(feb[i-1].mod(BigInteger.valueOf(i)) == BigInteger.valueOf(0) || feb[i+1].mod(BigInteger.valueOf(i)) == BigInteger.valueOf(0)) {
            //    //System.out.println(i);
               // pri.add(i);
            //}
        
        /*boolean succ = false;
        for(int i = 0; i <= febCount; i++) {
            if (i%2 == 0) {
                for (int j = 0; j < pri.size(); j++) {
                    for (int k = 0; k < pri.size(); k++) {
                        if (succ == false) {
                            if (pri.get(j) + pri.get(k) == i) {
                                System.out.println(pri.get(j) + " + " + pri.get(k) + " = " + i);
                                succ = true;
                            }
                        }
                    }
                }
                if (succ == false) {
                    //System.out.println("fail");
                } else succ = false;
            }
        }*/
    }
}