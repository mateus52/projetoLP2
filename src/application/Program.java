package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op=0;
		
		do {
			System.out.println("\n--- Selecione um op��o ---");
			System.out.println("1 - Cliente \n2 - Supermercado\n3 - Sair");
			System.out.print("# Digite um op��o: ");
			op = sc.nextInt();
			
			if(op < 1 || op > 3)
				System.out.println("\n--> Op��o Inv�lida <--");
			
			if(op == 1) {
				//mostrar menus referente ao cliente
				System.out.println("Voc� vai implementar as funcionalidades de cliente.");
			}else {
				//mostrar menus referentes ao supermercado
				System.out.println("Voc� vai implementar as funcionalidades do supermercado");
			}
				
			
			
		}while(op != 3);
	}

}
