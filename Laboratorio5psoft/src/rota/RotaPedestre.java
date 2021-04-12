package rota;

import padraoStrategy.StrategyRota;

public class RotaPedestre implements StrategyRota{
	@Override
	public void calcularRota() {
		System.out.println("Calculando a rota de Pedrestre…");
	}

}
