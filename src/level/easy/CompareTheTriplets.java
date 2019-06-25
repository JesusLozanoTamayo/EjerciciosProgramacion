package level.easy;

import java.util.Scanner;

public class CompareTheTriplets {

    public static void main(String args[]) {

        Scanner in = new Scanner(System.in);
        int alice[] = new int[3];
        int bob[] = new int[3];

        for (int i = 0; i < 3; i++) {
            alice[i] = in.nextInt();
        }

        for (int i = 0; i < 3; i++) {
            bob[i] = in.nextInt();
        }

        comparar(alice, bob);
    }

    public static void comparar(int alice[], int bob[]){

        int countAlice = 0;
        int countBob = 0;

        for (int i = 0; i < 3; i++) {
            if(alice[i] > bob[i]) {
                countAlice++;
            } else if(alice[i] < bob[i]) {
                countBob ++;
            }
        }

        System.out.println(countAlice + " " + countBob);

    }

}
