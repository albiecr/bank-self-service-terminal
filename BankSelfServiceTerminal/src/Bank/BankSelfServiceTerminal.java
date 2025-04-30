package Bank;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BankSelfServiceTerminal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcaoinicial;
		int simounao;
		double saldo = 0;
		double valordep = 0;
		double valorsaq = 0;
		double[] movim = new double[10]; // Array para armazenar as movimentações
		int numMovimentos = 0; // Contador para acompanhar quantas movimentações foram feitas
		LocalDateTime dataAtualHora = LocalDateTime.now();
		DateTimeFormatter mascaraCompleta = DateTimeFormatter.ofPattern("dd/MM/yyyy hh:mm:ss");

		do {
			System.out.println(
					"|BANCO BOLINHA REDONDINHA| TELA INICIAL |\n\nPor favor digite o número correspondente à ação que você deseja: \n1. Consultar Saldo\n2. Realizar depósito\n3. Realizar Saque\n4. Extrato\n5. Sair do Sistema");
			opcaoinicial = scanner.nextInt();

			if (opcaoinicial == 1) {
				System.out.println("\n--- Seu saldo atual é: " + saldo + " ---\n\n");
			}

			if (opcaoinicial == 2) {
				System.out.println(
						"Por favor, digite o valor que deseja depositar e em seguida insira o envolope com as cédulas no terminal a direita da tela: ");
				valordep = scanner.nextDouble();
				if (valordep < 0) {
					System.err.println(
							"Não é possível depositar um VALOR NEGATIVO!\n\nESTAMOS DE VOLTA A TELA INICIAL,POR FAVOR REINICIE O PROCEDIMENTO!\n\n");
				} else {
					System.out.println("O valor do depósito é R$: " + valordep + "?" + "\n1. SIM         2. NÃO");
					simounao = scanner.nextInt();
					if (simounao == 1) {
						System.out.println("Depósito concluído com sucesso! \n --- Seu novo saldo é: R$ "
								+ (valordep + saldo) + " ---\n\n");
						saldo = saldo + valordep;
						movim[numMovimentos] = valordep; // Armazena o depósito como valor positivo no array
						numMovimentos++;
					} else {
						System.out.println("ESTAMOS DE VOLTA A TELA INICIAL,POR FAVOR REINICIE O PROCEDIMENTO!\n");
					}
				}
			}

			if (opcaoinicial == 3) {
				System.out.println("Por favor, digite o valor que você deseja sacar: ");
				valorsaq = scanner.nextDouble();
				if (valorsaq < 0) {
					System.err.println(
							"Não é possível sacar um VALOR NEGATIVO!\n\nESTAMOS DE VOLTA A TELA INICIAL,POR FAVOR REINICIE O PROCEDIMENTO!\n\n ");
				} else {
					if (valorsaq > saldo) {
						System.err.println("Saldo insuficiente! Seu saldo é apenas de: R$ " + saldo + "!\n\n");
					} else {
						System.out.println(
								"Aguarde a liberação do dinheiro no terminal abaixo da tela. \n\n --- Seu saldo atual é de: R$ "
										+ (saldo - valorsaq) + " ---\n\n");
						saldo = saldo - valorsaq;
						movim[numMovimentos] = -valorsaq; // Armazena o saque como valor negativo no array
						numMovimentos++;
					}
				}
			}

			if (opcaoinicial == 4) {
				System.out.println("\n--- EXTRATO BANCÁRIO ---");
				System.out.println("Movimentações recentes:\n\nData       Horário      Operação\n");

				if (numMovimentos == 0) {
					System.out.println("Nenhuma movimentação registrada.");
				} else {
					// Mostra as últimas 10 movimentações (ou todas se tiver menos de 10)
					int inicio = Math.max(0, numMovimentos - 10);
					for (int i = inicio; i < numMovimentos; i++) {
						if (movim[i] > 0) {
							System.out
									.println(dataAtualHora.format(mascaraCompleta) + "     Depósito: +R$ " + movim[i]);
							// System.out.println(dataMovim);
						} else {
							System.out.println(
									dataAtualHora.format(mascaraCompleta) + "     Saque:    -R$ " + Math.abs(movim[i]));
							// System.out.println(dataMovim);
						}
					}
				}
				System.out.println("\nSaldo atual: R$ " + saldo);
				System.out.println("-----------------------\n");
			}

		} while (opcaoinicial < 5);

		scanner.close();
	}

}
