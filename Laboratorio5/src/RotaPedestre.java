
public class RotaPedestre implements StrategyRota{
	private static final long HORA_EM_MIN = 60; //MINUOS
	private static final long KM_P_HORA = 6;

	@Override
	public double calcularRota(double distancia) {
		double tempo;
		//6KM EM 60MIN
		tempo= distancia/KM_P_HORA*HORA_EM_MIN;
		return tempo;
	}

}
