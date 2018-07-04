package com.bcopstein;

public class FreteImpl implements Frete{

	@Override
	public double custoFrete(double peso, int qtdade) {
		if (qtdade >= 20){
            return 0.0;
        }else{
            return (double)peso;
        }
	}
}