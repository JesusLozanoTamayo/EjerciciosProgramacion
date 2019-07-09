package level.easy;

import java.util.Scanner;

public class AppleAndOrange {
	
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int s = in.nextInt();
		int t = in.nextInt();
		int a = in.nextInt();
		int b = in.nextInt();
		int m = in.nextInt();
		int n = in.nextInt();
		int countA = 0;
		int countB = 0;
		
		
		int arregloM[] = new int[m];
		int arregloN[] = new int[n];
		
		for (int i = 0; i < m; i++) {
			arregloM[i] = in.nextInt();
		}
		
		for (int i = 0; i < n; i++) {
			arregloN[i] = in.nextInt();
		}
		
		for (int i = 0; i < m; i++) {
			if( a + arregloM[i] >= s && a + arregloM[i] <= t) {
				countA++;
			}
		}
		
		for (int i = 0; i < n; i++) {
			if( b + arregloN[i] >= s &&  b + arregloN[i] <= t)  {
				countB++;
			}
		}
		
		
		System.out.println(countA);
		System.out.println(countB);
		
	}
	
}
