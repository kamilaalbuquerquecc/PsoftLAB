package situacoes;

import entities.Paciente;

public class FinalizadaVacinacao implements SituacaoState{

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
		if(paciente.getSituacao() instanceof HabilitadaParaSegundaDose){
			System.out.println("Vacina��o concluida, em 15 dias voc� estar� imunizado.");
			paciente.setSituacao(this);
		}
	}

	
	

} 
