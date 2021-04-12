package rota;

import padraoStrategy.StrategyRota;

public class RotaCarro implements StrategyRota{
	@Override
	public void calcularRota() {
		System.out.println("Calculando a rota de Carro…");
	}
}
