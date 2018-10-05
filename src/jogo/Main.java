package jogo;

public class Main {

	public static void main(String[] args) {
		System.out.println(" === Jogo ====");
		Partida partida = new Partida();
		String opcao = "";

		while (!"x".equalsIgnoreCase(opcao)) {
			partida.jogar();
			System.out.println("Pressione 'x' para sair");
			opcao = System.console().readLine();
		}

		System.out.println(" === fim ====");

	}

}
