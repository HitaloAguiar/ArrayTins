package aplication;

import unitins.ArrayTins;
import unitins.LinkedTins;

public class TesteDeCenarios {

	public static void main(String[] args) {
		
		ArrayTins<Pessoa> lista = new ArrayTins<Pessoa>();
		
		lista.add(new Pessoa("Paulo Henrique", "1111", 40));
		lista.add(new Pessoa("João Almeida", "2222", 25));
		lista.add(new Pessoa("Maria Fernanda", "3333", 34));
		
		System.out.println(lista);
		
		// Cenários de sucesso
		
		lista.add(0, new Pessoa("Lucas Ferreira", "4444", 22));
		
		System.out.println("\nNovo objeto adcionado na posição 0:\n" + lista);
		
		lista.add(4, new Pessoa("Joana Costa", "5555", 38));
		
		System.out.println("\n\nNovo objeto adcionado na última posição:\n" + lista);
		
		lista.add(1, new Pessoa("João Miguel", "6666", 21));
		
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
		
		// ------------- Testes com LinkedTins ----------------- //
		
		LinkedTins<Pessoa> lista2 = new LinkedTins<Pessoa>();
		
		System.out.println(lista2.isEmpty());
		
		System.out.println(lista2.size());
		
		lista2.add(new Pessoa("Paulo Henrique", "111", 40));
		
		System.out.println("\n" + lista2);
		
		lista2.add(new Pessoa("João Almeida", "222", 25));
		
		System.out.println("\n" + lista2);
		
		lista2.add(new Pessoa("Maria Fernanda", "333", 34));
		
		System.out.println("\n" + lista2);
		
		System.out.println("\n" + lista2.size());
		
		Pessoa pessoa1 = lista2.getFirst();
		
		System.out.println("\n" + pessoa1);
		
		Pessoa pessoa2 = lista2.getLast();
		
		System.out.println("\n" + pessoa2);
		
		Pessoa pessoa3 = lista2.get(1);
		
		System.out.println("\n" + pessoa3);
	}
}
