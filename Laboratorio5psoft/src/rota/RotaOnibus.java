package rota;

import padraoStrategy.StrategyRota;

public class RotaOnibus implements StrategyRota{

	@Override
	public void calcularRota() {
		System.out.println("Calculando a rota de Onibus…");
	}

}
