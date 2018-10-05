package jogo.jogador;

import jogo.Escolha;
import jogo.Jogada;

public class Humano implements Jogador{
	
	private String nome;
	
	public Humano() {
		System.out.println("Qual o nome do jogador?");
		this.nome = System.console().readLine("Resposta: ");
	}
	
	@Override
	public String getNome() {
		return this.nome;
		
	}

	@Override
	public Jogada jogar() {
		System.out.println("Qual a sua jogada? ");
		String escolha = System.console().readLine("Resposta: ");
		Jogada jogada = new Jogada(Escolha.valueOf(escolha));
		return jogada;
	}
	
	public void Resposta() {
		
	}

}
