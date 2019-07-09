package level.easy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GradingStudents {
		
	public static void main(String args[]) {
		
		Scanner in = new Scanner(System.in);
		
		int tamanio = in.nextInt();
		List<Integer> arreglo = new ArrayList<>();
		List<Integer> newArreglo = new ArrayList<>();
		
		for (int i = 0; i < tamanio; i++) {
			arreglo.add(in.nextInt());
		}
		
		for (int i = 0; i < tamanio; i++) {
			
			if( arreglo.get(i) < 40 ) {
				
				if( ( 40 - arreglo.get(i) ) < 3) {
					newArreglo.add(40);
				}else {
					newArreglo.add(arreglo.get(i));
				}
				
			} else {
				
				for (int j = 0; j <= 100; j = j + 5) {
					
					if(j >= arreglo.get(i) ) {
						if(j - arreglo.get(i) < 3) {
							newArreglo.add(j);
							break;
						} else {
							newArreglo.add(arreglo.get(i));
							break;
						}
					}
					
				}
				
			}
			
		}
		
		newArreglo.stream().forEach(a -> System.out.println(a));
		
	}
	
}
