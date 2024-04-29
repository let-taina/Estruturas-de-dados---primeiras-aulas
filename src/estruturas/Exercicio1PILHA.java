package estruturas;

import java.util.Scanner;
import java.util.Stack;

public class Exercicio1PILHA {

	public static void main(String[] args) {
		/*Escreva um programa Java contendo uma Collection Stack (Pilha) de Objetos da Classe String, 
		 * para organizar a retirada de livros em uma pilha. 
		 * O programa deverá ter um Menu que aceitará as opções 0, 1, 2 e 3:
		 * 1: Adicionar um novo livro na pilha. Deve solicitar o nome do livro.
		 *2: Listar todos os livros da Pilha
	   	 *3: Retirar um livro da pilha 
		 *0: O programa deve ser finalizado. 
		 */

		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner (System.in);
			
		String livronovo;
		int opcao=-1;			
		
		do {
			System.out.println("------------------------------------------------------------"); //separação p melhor layout
			System.out.println("Por gentileza, digite uma opção: ");
			System.out.println("1 - Adicionar novo livro à pilha.");
	        System.out.println("2 - Listar todos os livros da pilha."); // menu
	        System.out.println("3 - Retirar um livro da pilha.");
	        System.out.println("0 - Finalizar o programa.");
	        System.out.println("------------------------------------------------------------");
	        
	        opcao = leia.nextInt();
	        
	        switch (opcao) {
	        case 1:
	        	System.out.println("Digite o nome do novo livro: ");
	        	Scanner leia2 = new Scanner (System.in);
	        	livronovo = leia2.nextLine();
	        	pilha.add(livronovo);
	        	
	        	System.out.println("Livro \"" +livronovo+ "\" adicionado à pilha com sucesso!");
	        	System.out.println("Pilha de livros atual: "+ pilha);
	        	break;
	        	
	        case 2:
	        	if (pilha.isEmpty()) {
	        	System.out.println("A pilha está vazia.");
	        	}else {
	        		System.out.println(" A pilha de livros atual é: " + pilha);
	        		break;
	        	}
	        case 3:
	        	if (pilha.isEmpty () ) {
	        		System.out.println ("Não é possível retirar um livro. A pilha está vazia.");
	        	}else {
	        		
	        		System.out.println ( "Livro \" " + pilha.pop() + "\" retirado da pilha.");
	        		System.out.println ("Pilha atual: " +pilha);
	        		break;
	        	}
	        case 0:
	        	System.out.println("Programa finalizado.");  
	        	return;
	        	
	        	default: System.out.println("Opção inválida. Digite uma opção de 0 à 3.");
	        	
	        }
		}
	        
	        while (opcao != 0);
	        leia.close();
		
	}

}
