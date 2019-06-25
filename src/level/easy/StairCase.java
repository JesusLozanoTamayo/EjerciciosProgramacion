package level.easy;

import java.util.Scanner;

public class StairCase {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();

        for (int i = 0; i < tamanio; i++) {

            for (int j = 0; j < tamanio; j++) {

                if(j < (tamanio - 1 - i)) {
                    System.out.print("-");
                } else  {
                    System.out.print("#");
                }

            }
            System.out.println();
        }

    }

}
