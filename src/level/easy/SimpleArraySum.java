package level.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);

        int tamanioArray = in.nextInt();
        List<Integer> arreglo = new ArrayList<>();

        for (int i = 0; i < tamanioArray; i++) {
            arreglo.add(in.nextInt());
        }

        int  resultado = arreglo.stream().mapToInt(a -> a).sum();

        System.out.println(resultado);
    }


}
