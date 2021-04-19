package situacoes;

import Entity.Paciente;

public class TomouAPrimeiraDose implements SituacaoState{

	@Override
	public void habilitadaParaTomarAPrimeiraDose(Paciente paciente) {
	}

	@Override
	public void tomouAPrimeiraDose(Paciente paciente) {
		System.out.println("Tomou a primeira dose!");
		paciente.setSituacao(this);
		
	}

	@Override
	public void habilitadaParaSegundaDose(Paciente paciente) {
	}

	@Override
	public void finalizadaVacinacao(Paciente paciente) {
	}

	
}
