package situacoes;

import Entity.Paciente;

public class NaoHabilitadaParaVacina implements SituacaoState {

	@Override
	public void habilitadaParaTomarAPrimeiraDose(Paciente paciente) {
	}

	@Override
	public void tomouAPrimeiraDose(Paciente paciente) {
}

	@Override
	public void habilitadaParaSegundaDose(Paciente paciente) {
	}

	@Override
	public void finalizadaVacinacao(Paciente paciente) {
}

	
}
