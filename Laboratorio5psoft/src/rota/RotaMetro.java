package rota;

import padraoStrategy.StrategyRota;

public class RotaMetro implements StrategyRota{

	@Override
	public void calcularRota() {
		System.out.println("Calculando a rota de Metro…");
	}

	
}
