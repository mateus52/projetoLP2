package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op=0;
		
		do {
			System.out.println("\n--- Selecione um opção ---");
			System.out.println("1 - Cliente \n2 - Supermercado\n3 - Sair");
			System.out.print("# Digite um opção: ");
			op = sc.nextInt();
			
			if(op < 1 || op > 3)
				System.out.println("\n--> Opção Inválida <--");
			
			if(op == 1) {
				//mostrar menus referente ao cliente
				System.out.println("Você vai implementar as funcionalidades de cliente.");
			}else {
				//mostrar menus referentes ao supermercado
				System.out.println("Você vai implementar as funcionalidades do supermercado");
			}
				
			
			
		}while(op != 3);
	}

}
