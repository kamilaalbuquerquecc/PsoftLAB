package rota;

import padraoStrategy.StrategyRota;

public class Rota {

	private double distancia;
	private StrategyRota estrategiaRota;
	private double tempoFinal;
	
	public Rota(double distancia, StrategyRota estrategiaRota) {
		super();
		this.distancia = distancia;
		this.estrategiaRota = estrategiaRota;
	}
	
	public void mudaRota(StrategyRota estrategiaRota) {
		this.estrategiaRota = estrategiaRota;
	}


	public void calcularRota() {
		this.tempoFinal=estrategiaRota.calcularRota(this.distancia);
	}


	public double getDistancia() {
		return distancia;
	}


	public void setDistancia(double distancia) {
		this.distancia = distancia;
	}


	public StrategyRota getEstrategiaRota() {
		return estrategiaRota;
	}


	public void setEstrategiaRota(StrategyRota estrategiaRota) {
		this.estrategiaRota = estrategiaRota;
	}


	public double getTempoFinal() {
		return tempoFinal;
	}

	@Override
	public String toString() {
		return "Distancia= " + distancia + "km " + "\nTempoFinal= " + tempoFinal + " min\n";
	}
	
}
