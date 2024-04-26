package view;

import lib.model.Lista;

public class Principal
{
	public static void main(String[] args)
	{
		Lista<Integer> L = new Lista<>();
		
		//PREENCHER E MOSTRAR LISTA
		preencherLista(L);
		System.out.print(" Original -> ");
		mostrarLista(L);
		
		//INVERTE A LISTA
		try {
			int tamanho = L.size();
			for (int i = 0; i < tamanho - 1; i++) {
				int aux = L.get(0);
				L.removeFirst();
				L.add(aux, tamanho - 1 - i);
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		//MOSTRA LISTA INVERTIDA
		System.out.print("Invertida -> ");
		mostrarLista(L);
	}
	
	private static void preencherLista(Lista<Integer> L)
	{
		L.addFirst(		16	);
		L.addFirst(		4	);
		L.addFirst(		13	);
		L.addFirst(		2	);
		L.addFirst(		6	);
		L.addFirst(		7	);
		L.addFirst(		9	);
		L.addFirst(		12	);
		L.addFirst(		18	);
		L.addFirst(		5	);
		L.addFirst(		3	);
	}
	
	private static void mostrarLista(Lista<Integer> L)
	{
		try {
			int tamanho = L.size();
			for (int i = 0; i < tamanho; i++)
			{
				int num = L.get(0);
				L.remove(0);
				L.addLast(num);
				System.out.print(num + " -> ");
			}
			System.out.println("Fim!");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
