package level.easy;

import java.util.Scanner;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        if(n%2==0){
            if(p <= n/2){
                System.out.println(p/2);
            }
            else{
                System.out.println((n+1-p)/2);
            }
        }
        else{
            if(p<=n/2){
                System.out.println(p/2);
            }
            else{
                System.out.println((n-p)/2);
            }
        }
    }
}