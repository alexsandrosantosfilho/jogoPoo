package jogo;

import jogo.jogador.Humano;
import jogo.jogador.Jogador;

public class Partida {
	
	private Jogador jogador1;
	private Jogador jogador2;
	
	
	
	public Partida() {
		this.jogador1 = new Humano();
		this.jogador2 = new Humano();
	}
    
	public void jogar() {
		Jogada jogada1 = this.jogador1.jogar();
		Jogada jogada2 = this.jogador2.jogar();
		Resultado resultado = jogada1.compararCom(jogada2);
		switch (resultado) {
		case GANHOU:
			System.out.println("GANHOU");
			break;
		case PERDEU:
			System.out.println("PERDEU");
		case EMPATOU:
			System.out.println("EMPATOU");
			break;
		}
		
	}
	
}
