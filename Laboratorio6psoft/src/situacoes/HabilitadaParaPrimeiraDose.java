package situacoes;

import Entity.Paciente;

public class HabilitadaParaPrimeiraDose implements SituacaoState {

	@Override
	public void habilitadaParaTomarAPrimeiraDose(Paciente paciente) {
		paciente.setSituacao(this);
		
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