package level.easy;

import java.util.Scanner;

public class SolveMeFirst {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);

        int a = 0;
        int b = 0;

        SolveMeFirst resultado = new SolveMeFirst();
        int result = resultado.solveMeFirst(in.nextInt(),in.nextInt());
        System.out.println(result);
    }

    public int solveMeFirst(int a, int b){
        return a + b;
    }

}
