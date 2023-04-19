package CollectionsExer;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Iterator;

public class Exercicio2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Integer> setNumeros = new HashSet<>();
		
		int i = 0;
		while(i < 10) {
			System.out.println("Digite o valor: ");
			setNumeros.add(sc.nextInt());
			i++;
		}
		
		Iterator<Integer> isetNumero = setNumeros.iterator();
		
		System.out.println("Lista dados do set: ");
		while(isetNumero.hasNext()) {
			System.out.println(isetNumero.next());
		}
		
	
		
		

		}

	}


