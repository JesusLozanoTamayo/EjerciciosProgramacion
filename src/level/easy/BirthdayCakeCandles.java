package level.easy;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class BirthdayCakeCandles {
		
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		int tamanio = in.nextInt();
		int ar[] = new int[tamanio];
		int count = 0;
		
		for (int i = 0; i < tamanio; i++) {
			ar[i] = in.nextInt();
		}
		
		OptionalInt valMax = Arrays.stream(ar).max();
		
		for (int i = 0; i < tamanio; i++) {
			
			if(ar[i] == valMax.getAsInt()) {
				count++;
			}
			
		}
		System.out.println(count);
		
	}
	
}
