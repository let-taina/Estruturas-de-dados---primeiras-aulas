package estruturas;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		// Utilizando fila e métodos QUEUE
		
		Queue <Integer> fila = new LinkedList <Integer>();
		
		System.out.println("Fila atual sem adições: " + fila);
		
		fila.add(5);
		fila.add(10);
		fila.add(15);
		fila.add(20);
		
		System.out.println("Nova fila com adições:"+ fila);
		
		fila.remove(10);
		System.out.println("Nova fila com a remoção aleatória:"+ fila);
		
		System.out.println("Primeiro elemento a ser removido: "+ fila.poll());
		System.out.println("Nova fila com remoção do primeiro usando poll:"+ fila);
		
		System.out.println("Novo primeiro da fila (exibindo com peek): "+ fila.peek());
		
		

	}

}
