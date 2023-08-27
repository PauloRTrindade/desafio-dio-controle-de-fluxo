package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Digite o primeiro par�metro:");
			int parametroUm = sc.nextInt();
			System.out.println("Digite o segundo par�metro:");
			int parametroDois = sc.nextInt();

			contar(parametroUm, parametroDois);

		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		} catch (InputMismatchException e) {
			System.out.println("Por favor, digite apenas n�meros inteiros.");
		}
		sc.close();
	}

	static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo par�metro deve ser maior que o primeiro.");
		}
		int contagem = parametroDois - parametroUm;

		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o n�mero " + i);
		}
	}
}
