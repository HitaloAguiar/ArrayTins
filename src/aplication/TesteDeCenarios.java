package aplication;

import unitins.ArrayTins;

public class TesteDeCenarios {

	public static void main(String[] args) {
		
		ArrayTins<Pessoa> lista = new ArrayTins<Pessoa>();
		
		lista.add(new Pessoa());
		lista.add(new Pessoa());
		lista.add(new Pessoa());
		
		System.out.println(lista);
		
		// Cenários de sucesso
		
		lista.add(0, new Pessoa());
		
		System.out.println("\nNovo objeto adcionado na posição 0:\n" + lista);
		
		lista.add(4, new Pessoa());
		
		System.out.println("\n\nNovo objeto adcionado na última posição:\n" + lista);
		
		lista.add(1, new Pessoa());
		
		System.out.println("\n\nNovo objeto adcionado na posição 1:\n" + lista);
		
		lista.remove(2);
		
		System.out.println("\n\nObjeto removido da posição 2:\n" + lista);
		
		// Cenários de erro
				
//		lista.add(-1, new Pessoa()); // Tentativa de adicionar um objeto em um índice menor que zero
//		
//		lista.add(10, new Pessoa()); // Tentativa de adicionar índice maior que lastPosition
//		
//		lista.remove(-1); // Tentativa de remover um objeto em um índice menor que zero
//		
//		lista.remove(5); // Tentativa de remover um objeto no índice de lastPosition
//		
//		lista.remove(10); // Tentativa de remover um objeto com um índice maior que lastPosition
	}
}
