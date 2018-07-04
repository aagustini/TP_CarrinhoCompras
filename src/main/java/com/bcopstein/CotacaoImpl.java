package com.bcopstein;

public class CotacaoImpl implements Cotacao{

	@Override
	public double getCotacao(Moeda moeda) {
		switch(moeda){
           case REAL: 
                return 3.8;
            case DOLAR:
                return 1.1;
            case EURO:
                return 0.8;
            case PESOARG:
                return 4.0*3.8;
            default:
                 return -1;
        }
	}

}