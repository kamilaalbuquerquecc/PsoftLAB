package situacoes;

import entities.Paciente;

public class HabilitadaParaSegundaDose implements SituacaoState {

	@Override
	public void habilitadaParaTomarAPrimeiraDose(Paciente paciente) {
	}

	@Override
	public void tomouAPrimeiraDose(Paciente paciente) {
	}

	@Override
	public void habilitadaParaSegundaDose(Paciente paciente) {
		System.out.println("Habilitada para segunda dose!");
		paciente.setSituacao(this);
		
	}

	@Override
	public void finalizadaVacinacao(Paciente paciente) {
}

	

}
