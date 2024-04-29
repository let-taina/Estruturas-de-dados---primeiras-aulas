package estruturas;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// criando uma pilha
		
		Stack <String> nomes = new Stack <String> ();
		System.out.println("Pilha atual, vazia" + nomes);	
		
		nomes.add("Letícia");
		nomes.add("Alex");
				
		System.out.println("Pilha atual, com adição de dados metodo add " + nomes);	
		System.out.println("Exibindo o último que foi colocado na pilha, que está no topo, na primeira posição " + nomes.peek());
		
		nomes.push("Eduarda");
		nomes.push("Bruce");
		
		System.out.println("Pilha atual, com adição de dados metodo push " + nomes);
		System.out.println("Exibindo o último que foi colocado na pilha, que está no topo, na primeira posição " + nomes.peek());
		

	}

}
