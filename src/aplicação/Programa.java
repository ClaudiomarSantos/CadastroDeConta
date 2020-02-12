package aplicação;

import java.util.Locale;
import java.util.Scanner;

import entidades.ContaBancaria;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double saldo;

		System.out.println("Abrir conta ");
		System.out.println("Digite o numero da conta: ");
		int numConta = sc.nextInt();
		sc.nextLine();
		System.out.println("digite o nome completo do titular: ");
		String name = sc.nextLine();
		ContaBancaria cont = new ContaBancaria(numConta, name);

		System.out.println("deseja fazer depósito inicial? s, ou n?");
		char resp = sc.nextLine().charAt(0);
		char resp1 = 's';
		char resp2 = 'n';

		while (resp != resp1 && resp != resp2) {
			System.out.println("Resposta inválida");
			System.out.println("deseja fazer depósito inicial? s, ou n?");
			resp = sc.nextLine().charAt(0);

		}
		if (resp == resp1) {
			System.out.println("digite o valor do depósito: ");
			saldo = sc.nextDouble();
			cont.deposito(saldo);
		} else if (resp == resp2) {
		}
		;

		System.out.println(cont.toString());
		
		System.out.println("Valor de depósito");
		saldo = sc.nextDouble();
		cont.deposito(saldo);
		System.out.println(cont.toString());
		
		System.out.println("Valor de Saque: ");
		saldo = sc.nextDouble();
		cont.saque(saldo);
		System.out.println(cont.toString());
		

		sc.close();
	}
}
