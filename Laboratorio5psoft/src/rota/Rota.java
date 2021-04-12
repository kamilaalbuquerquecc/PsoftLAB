package rota;

import padraoStrategy.StrategyRota;

public class Rota {

	private StrategyRota estrategiaRota;
	
	public void tipoTransporte(StrategyRota estrategiaRota) {
		this.estrategiaRota = estrategiaRota;
		estrategiaRota.calcularRota();
	}
	
	
}
