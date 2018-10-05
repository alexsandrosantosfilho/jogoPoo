package jogo;

public class Jogada {

	private Escolha escolha;

	public Jogada(Escolha escolha) {
		this.escolha = escolha;
	}
	
	public Escolha getEscolha() {
		return this.escolha;
	}

	public Resultado compararCom(Jogada jogada) {
		switch (this.escolha) {
		case PEDRA:
			return this.compararComPedra(jogada.getEscolha());
		default:
			break;
		}
		return Resultado.PERDEU;
	}	
	protected Resultado compararComPedra(Escolha adversario) {
		if (adversario == Escolha.PAPEL) {
			return Resultado.PERDEU;
		}else if (adversario == Escolha.PEDRA) {
			return Resultado.EMPATOU;
		}else {
			return Resultado.GANHOU;
		}
	 }
		
    
 }








