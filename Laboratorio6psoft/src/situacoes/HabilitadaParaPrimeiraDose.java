package situacoes;

import entities.Paciente;

public class HabilitadaParaPrimeiraDose implements SituacaoState {

	@Override
	public void habilitadaParaTomarAPrimeiraDose(Paciente paciente) {
		
		if((paciente.isComorbidades()==true || paciente.isProfissao()==true || paciente.isFaixaEtaria()==true)  && 
				(paciente.getSituacao() instanceof NaoHabilitadaParaVacina )) {

			System.out.println("Habilitada para primeira dose!");
			paciente.setSituacao(this);
		}
		else {
			System.out.println("Ainda não chegou sua vez de ser vacinado!");
		}
		
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
