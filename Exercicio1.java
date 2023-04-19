package CollectionsExer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<>();
		
		cores.add("Azul");
		cores.add("Verde");
		cores.add("Amarelo");
		cores.add("Branco");
		cores.add("Laranja");
		
		//Mostrar todas as cores.
		System.out.println("\nLista de todas as cores: "+cores.toString());
		
		//Ordenar as cores em ordem crescente
		Collections.sort(cores);
		System.out.println("\nCores ordenada em ordem crescente: "+ cores);
		
			
		
		
		
		
		

	}

}
