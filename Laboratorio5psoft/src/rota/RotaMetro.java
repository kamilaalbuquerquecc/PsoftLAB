package rota;

import padraoStrategy.StrategyRota;

public class RotaMetro implements StrategyRota{

	private static final long HORA_EM_MIN = 60; //MINUOS
	private static final long KM_P_HORA = 30;

	@Override
	public double calcularRota(double distancia) {
		double tempo;
		tempo= distancia/KM_P_HORA*HORA_EM_MIN;
		return tempo;
	}

	
}
