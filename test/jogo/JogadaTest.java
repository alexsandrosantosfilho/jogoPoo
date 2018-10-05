package jogo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JogadaTest {

	@Test
	void testPedra() {
		Jogada pedra = new Jogada(Escolha.PEDRA);
		Jogada papel = new Jogada(Escolha.PAPEL);
		Jogada tesoura = new Jogada(Escolha.TESOURA);
		assertEquals(Resultado.PERDEU, pedra.compararCom(papel));
		assertEquals(Resultado.GANHOU, pedra.compararCom(tesoura));
		assertEquals(Resultado.EMPATOU, pedra.compararCom(pedra));
		fail("Not yet implemented");

	}

	@Test
	void testTesoura() {
		Jogada pedra = new Jogada(Escolha.PEDRA);
		Jogada papel = new Jogada(Escolha.PAPEL);
		Jogada tesoura = new Jogada(Escolha.TESOURA);
		assertEquals(Resultado.PERDEU, tesoura.compararCom(papel));
		assertEquals(Resultado.GANHOU, tesoura.compararCom(tesoura));
		assertEquals(Resultado.EMPATOU, tesoura.compararCom(pedra));
		fail("Not yet implemented");
	}

	@Test
	void testPapel() {
		Jogada pedra = new Jogada(Escolha.PEDRA);
		Jogada papel = new Jogada(Escolha.PAPEL);
		Jogada tesoura = new Jogada(Escolha.TESOURA);
		assertEquals(Resultado.PERDEU, papel.compararCom(papel));
		assertEquals(Resultado.GANHOU, papel.compararCom(tesoura));
		assertEquals(Resultado.EMPATOU, papel.compararCom(pedra));
		fail("Not yet implemented");
	}
}
