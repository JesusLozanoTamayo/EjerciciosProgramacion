package level.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSum {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        List<BigInteger> listNum = new ArrayList<>();
        int tamanio = in.nextInt();

        for (int i = 0; i < tamanio; i++) {
            listNum.add(in.nextBigInteger());
        }

        System.out.println(listNum.stream().reduce(BigInteger.ZERO,BigInteger::add));

    }

}
