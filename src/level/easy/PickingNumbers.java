package level.easy;

import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Arrays.sort(a);
        int len=1;
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
               if(a[j]-a[i]<=1 && len<j-i+1) len=j-i+1;
            System.out.println(len);
    }
}
