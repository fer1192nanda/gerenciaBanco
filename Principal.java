package gerenciaBanco;

import java.util.Scanner;

public class Principal {
	public static void exibirMenu() {
		Banco b = new Banco();
		int opcao;
		double valor;
		Scanner ler = new Scanner(System.in);
		String texto = """
			======================
			1 - Exibir Saldo
			2 - Depositar 
			3 - Retirar 
			0 - Encerrar
			Opcao:
				""";
		
		do {
			System.out.print(texto);
			opcao = ler.nextInt();
			
			switch (opcao){
				case 1: 
					b.exbirSaldo();
				break;
				
				case 2:
					System.out.println("\nInforme o valor a depositar: ");
					valor = ler.nextDouble();
					b.depositar(valor);
					System.out.println("deposito feito");
				break;
				
				case 3:
					System.out.println("\ninforme o valor a retirar");
					valor = ler.nextDouble();
					b.retirar(valor);					
				break;
				
				case 0:
					System.out.print("Programa Encerrado");
				break;
				
				default:
					System.out.println("opcao invalida\n");
				break;	
			}
			
		}while(opcao != 0);
	}
	
	public static void main (String[] arg) {
		Scanner ler = new Scanner(System.in);
		Pessoa p1 = new Pessoa();
		
		System.out.print("Escreva o nome");
		String nome = ler.next();
		p1.setNome(nome);
		
		System.out.print("Escreva o sobrenome");
		String sobrenome = ler.next();
		p1.setSobrenome(sobrenome);
		
		System.out.print("Escreva o cpf");
		String cpf = ler.next();
		p1.setCpf(cpf);
		
		
		exibirMenu();
	}
}
	