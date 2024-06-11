package Estruturadedados;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<String> fila = new LinkedList<>();
		System.out.println("Bem vindo ao Banco Genérico");
		int escolha;

		
		do {
		
		System.out.println("Qual opção você deseja?");
		System.out.println("1: Adicionar um novo Cliente na fila");
		System.out.println("2: Listar todos os Clientes na fila");
		System.out.println("3: Chamar uma pessoa da fila");
		System.out.println("0: Sair");
		escolha = sc.nextInt();
		sc.nextLine(); 

		
		switch (escolha) {
		case 1:
			System.out.println("Qual o nome do cliente que deseja adicionar?");
			String nome = sc.nextLine();
			fila.add(nome);
			System.out.println("O cliente " + nome + " foi adicionado!");
			break;
			
		case 2:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia!");
			} else {
				System.out.println("A fila é:"  );
				for (String cliente : fila) {
					System.out.println(cliente);
				}
			}
			break;
			
		case 3:
			if (fila.isEmpty()) {
				System.out.println("A fila está vazia!");
			} else {
				String pessoa = fila.poll();
				System.out.println(pessoa + " foi chamada!");
			}
			break;
		
		case 0:
			System.out.println("Programa finalizado!");			
			break;
			
		default:
			System.out.println("Opção invalida! Escolha uma opção de 0 a 3!");		

			}
	
		} 	while (escolha != 0);
		
		sc.close();
	}
}