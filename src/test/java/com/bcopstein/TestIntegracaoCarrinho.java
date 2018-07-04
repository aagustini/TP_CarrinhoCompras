package com.bcopstein;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

// http://static.javadoc.io/org.mockito/mockito-core/2.18.3/org/mockito/Mockito.html
public class TestIntegracaoCarrinho {
	CarrinhoCompras carrinho;
	
	@Before
	public void setUp() throws Exception {
		carrinho = new CarrinhoCompras(new CotacaoImpl(),new FreteImpl());
		carrinho.addItem(new Produto("CPU I7",2.0,450), 1);  // 450 + 2 = 452
		carrinho.addItem(new Produto("Monitor",3.0,120), 1); // 120 + 3 = 123
		carrinho.addItem(new Produto("Celular",0.67,200), 25); // 5000 + 0 = 5000
	}

	@Test
	public void testCustoDolar() {
		carrinho.defineMoeda(Moeda.DOLAR);
		assertEquals(5575.0,carrinho.calculaCusto(),0.001);
	}

	@Test
	public void testCustoReal() {
		carrinho.defineMoeda(Moeda.REAL);
		assertEquals(21185.0,carrinho.calculaCusto(),0.001);
	}

}