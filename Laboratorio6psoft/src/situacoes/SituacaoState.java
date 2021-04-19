package situacoes;

import entities.Paciente;

public interface SituacaoState {
	public void habilitadaParaTomarAPrimeiraDose(Paciente paciente);
	public void tomouAPrimeiraDose(Paciente paciente);
	public void habilitadaParaSegundaDose(Paciente paciente);
	//public void naoHabilitadaParaVacina(Paciente paciente);
	public void finalizadaVacinacao(Paciente paciente);
}
