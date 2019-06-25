package level.easy;

import java.util.Scanner;

public class DiagonalDifference {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int tamanio = in.nextInt();
        int arreglo[][] = new int[tamanio][tamanio];
        int sumaDiagonalA = 0;
        int sumaDiagonalB = 0;

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                arreglo[i][j] = in.nextInt();
            }
        }

        for (int i = 0; i < tamanio; i++) {
            for (int j = 0; j < tamanio; j++) {
                if(i == j) {
                    sumaDiagonalA = sumaDiagonalA + arreglo[i][j];
                }
                if((j==(tamanio - i - 1)) ){
                    sumaDiagonalB = sumaDiagonalB + arreglo[i][j];
                }
            }
        }

        int resultado = Math.abs(sumaDiagonalA - sumaDiagonalB);
        System.out.println(resultado);

    }
}
