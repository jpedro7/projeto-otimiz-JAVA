package br.com.cesarschool.projeto;

import java.util.Scanner;

public class ProgramaConsultoria {
	private static final Scanner INPUT = new Scanner(System.in);
	private static final Consultoria CONSULTORIA = new Consultoria();

	public static void main(String[] args) {
		RepositorioUsers repositorioUsers = new RepositorioUsers();
		User user = null;
		int option = 0;
		String username = "";
		String password = "";
		boolean response = false;
		boolean isLogged = false;
		int id = 1;

		do {
			if (!isLogged) {
				System.out.println("Selecione uma das opções abaixo");
				System.out.println("1 - Fazer login");
				System.out.println("2 - Fazer cadastro");
				System.out.println("0 - Encerrar programa");
				System.out.print("Sua escolha: ");

				option = INPUT.nextInt();

				if (option == 1) {
					System.out.print("Username: ");
					username = INPUT.next();
					System.out.print("Senha: ");
					password = INPUT.next();

					response = repositorioUsers.login(username, password);

					if (response) {
						System.out.println("\nLogin efetuado com sucesso!");
						user = repositorioUsers.getUserByUsername(username);
						isLogged = true;
					} else {
						System.out.println("\nFalha no login! Usuário ou senha incorretos!");
					}
				} else if (option == 2) {
					System.out.print("Digite o username desejado (sem espaços): ");
					username = INPUT.next();
					System.out.print("Digite a senha desejada: ");
					password = INPUT.next();

					response = repositorioUsers.cadastrar(id, username, password);
					if (response) {
						System.out.println("\nUsuário cadastrado com sucesso!");
						user = new User(id, username, password);
						isLogged = true;
						id++;
					} else {
						System.out.println(
								"\nUsuário já existente ou número máximo de usuários atingido!");
					}
				} else if (option != 0) {
					System.out.println("\nOpção inválida!");
				}

				System.out.println();
			} else {
				System.out.println("Logado: " + username);
				System.out.println("Selecione uma das opções abaixo");
				System.out.println("1 - Realizar consultoria");
				System.out.println("2 - Ver resultado anterior");
				System.out.println("3 - Encerrar sessão");
				System.out.println("0 - Encerrar programa");
				System.out.print("Sua escolha: ");

				option = INPUT.nextInt();

				if (option == 1) {
					CONSULTORIA.realizarConsultoria(user);
				} else if (option == 2) {
					if (user.isAvaliado()) {
						System.out.println("\nResultado anterior: " + user.getResultadoConsultoria());
					} else {
						System.out.println("\nUsuário ainda não realizou nenhum consultoria!");
					}
				} else if (option == 3) {
					System.out.println("\nSessão encerrada!");
					isLogged = false;
				} else if (option != 0) {
					System.out.println("\nOpção inválida!");
				}

				System.out.println();
			}
		} while (option != 0);

		System.out.println("Até a próxima!");
	}
}
