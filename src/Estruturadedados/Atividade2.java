package Estruturadedados;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		Stack<String> pilha = new Stack<>();
		
		int escolha;
		
		do {
			System.out.println("Qual opção você deseja?");
			System.out.println("1: Adicionar um novo livro na pilha");
			System.out.println("2: Listar todos os livros na pilha");
			System.out.println("3: Retirar um livro da pilha");
			System.out.println("0: Sair");
			
			escolha = sc.nextInt();
			sc.nextLine();
			
			switch (escolha) {
			case 1:
				System.out.println("Qual o nome do livro que deseja adicionar?");
				String livro = sc.nextLine();
				pilha.push(livro);
				System.out.println("O livro " + livro + " foi adicionado!");
				break;

			
			case 2: 
				if (pilha.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					System.out.println("A pilha de livros contem: ");
					for (String livro2 : pilha) {
						System.out.println(livro2);
					}
				}
				break;
			
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("A pilha de livros está vazia!");
				} else {
					pilha.pop();
					System.out.println("Um livro foi retirado da pilha!");
				}
				break;
				
			case 0:
				System.out.println("Sistema finalizado!");
				break;
			
			default: 
				System.out.println("Escolha invalida!");
			}

		} while ( escolha != 0);
		
		
		
		
		
		
		sc.close();
	}

}
