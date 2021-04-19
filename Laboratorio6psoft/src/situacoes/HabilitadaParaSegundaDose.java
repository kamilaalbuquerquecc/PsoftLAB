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
		
		if((paciente.getQuantDias() > 20) && (paciente.getSituacao() instanceof TomouAPrimeiraDose)) {
			System.out.println("Habilitada para segunda dose!");
			paciente.setSituacao(this);
		} else if ( paciente.getSituacao() instanceof TomouAPrimeiraDose ) {
			System.out.println("Faltam "+ (20-paciente.getQuantDias()) +" dias para tomar a segunda dose. Espere mais um pouco");
		}
		
	}

	@Override
	public void finalizadaVacinacao(Paciente paciente) {
}

	

}
