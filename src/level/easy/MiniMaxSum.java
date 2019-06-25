package level.easy;

import java.math.BigInteger;
import java.util.Scanner;

public class MiniMaxSum {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        BigInteger arreglo[] = new BigInteger[5];
        BigInteger newArreglo[] = new BigInteger[5];
        BigInteger valSuma = BigInteger.valueOf(0);
        BigInteger numMin = new BigInteger("99999999999");
        BigInteger numMax = new BigInteger("-99999999999");

        for (int i = 0; i < 5; i++) {
            arreglo[i] = in.nextBigInteger();
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {

                if(i != j) {
                    valSuma = valSuma.add(arreglo[j]);
                }

            }
            newArreglo[i] = valSuma;
            valSuma = BigInteger.valueOf(0);
        }

        for(BigInteger a: newArreglo) {
            if(a.compareTo(numMax) == 1) {
                numMax = a;
            }
            if(a.compareTo(numMin) == -1) {
                numMin = a;
            }
        }

        System.out.println(numMin + " "  + numMax);

    }

}
