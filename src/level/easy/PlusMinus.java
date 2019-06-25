package level.easy;

import java.util.Scanner;

public class PlusMinus {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int ar[] = new int[tamanio];
        int countPos = 0;
        int countNeg = 0;
        int countCero = 0;

        for (int i = 0; i < tamanio; i++) {
            ar[i] = in.nextInt();
        }

        for (int i = 0; i < tamanio; i++) {
            if(ar[i] > 0) {
                countPos ++;
            } else if(ar[i] < 0) {
                countNeg++;
            } else if(ar[i] == 0) {
                countCero++;
            }
        }

        System.out.println((double)countPos/tamanio);
        System.out.println((double)countNeg/tamanio);
        System.out.println((double)countCero/tamanio);

    }

}
