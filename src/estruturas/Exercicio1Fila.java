package estruturas;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Exercicio1Fila {

	public static void main(String[] args) {
		/*Escreva um programa Java contendo uma Collection Queue (Fila) de Objetos da Classe String, 
		 * para organizar a ordem de chegada dos Clientes de um Banco. 
		 * O programa deverá ter um Menu que aceitará as opções 
		 * 1: Adicionar um novo Cliente na fila. Deve solicitar o nome do Cliente.
		 * 2: Listar todos os Clientes na fila
		 * 3: Chamar (retirar) uma pessoa da fila 
		 * 0: O programa deve ser finalizado
		 * Caso a fila esteja vazia, o programa deverá informar que a fila está vazia ao tentar retirar (chamar) um cliente da fila		 * 
		 */		
		Queue <String> fila = new LinkedList <String>(); // sintaxe para novas listas
		Scanner leia = new Scanner (System.in);   
		int opcao = -1; // iniciali-za/ da (qlqr) valor a variavel
		String nomenovo;		    // variavel para ser inclusa no comando de adc a fila
	    while(opcao != 0) {
	    	System.out.println("Selecione uma opção: ");
			System.out.println("1 - Adicionar novo cliente na fila");
	        System.out.println("2 - Listar todos os Clientes na fila");
	        System.out.println("3 - Chamar uma pessoa da fila");
	        System.out.println("0 - Finalizar programa"); // menu
	              
	        opcao = leia.nextInt();
	        
	        switch (opcao) { //cria loop para programa continuar retornando o menu após cada execução
	        
	        case 1:
	        	System.out.println("Digite o nome do novo cliente: ");
	        	Scanner leia2 = new Scanner (System.in);
	        	nomenovo = leia2.nextLine();
	        	fila.add(nomenovo);
	        	
	        	System.out.println("Cliente " +nomenovo+ " adicionado à fila com sucesso!");
	        	System.out.println("Fila atual: "+ fila);
	        	break;
	        	
	        case 2:
	        	
	        	if (fila.isEmpty() == true) {
	        		System.out.println("A fila está vazia!");	
	        	}else {
	        		System.out.println(" A fila atual é" + fila);
	        	}	
	        	break;
	        case 3:
	        	
	        	if (fila.isEmpty()) {
	        		System.out.println("Não é possível chamar alguém. A fila está vazia");
	        	}else {
	        		System.out.println( "Cliente "+  fila.poll() + " chamado(a) e removido(a) da fila." );
		    		System.out.println("Fila atual: "+ fila);	
		    		break;
	        	}
	    		
	        case 0:
	        	System.out.println("Programa finalizado.");  
	        	return;
	        	
	        	default: System.out.println("Opção inválida. Digite uma opção de 0 à 3."); /* para impedir entrada de dados 
	        	que não seja a lista de opção (cases)*/
	        		       	        	        	
	        	}	
	    }
	     		 
        leia.close(); // fechar leitor da inserção de dados do usuário
		}
  
        
        	}
        
