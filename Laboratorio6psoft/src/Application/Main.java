package Application;

import Entity.Paciente;
import situacoes.FinalizadaVacinacao;
import situacoes.HabilitadaParaPrimeiraDose;
import situacoes.HabilitadaParaSegundaDose;
import situacoes.TomouAPrimeiraDose;

public class Main {

	public static void main(String[] args) {
		
		HabilitadaParaPrimeiraDose primeiraDose = new HabilitadaParaPrimeiraDose();
		TomouAPrimeiraDose tomouPDose = new TomouAPrimeiraDose();
		HabilitadaParaSegundaDose segundaDose = new HabilitadaParaSegundaDose();
		FinalizadaVacinacao finalizada = new FinalizadaVacinacao();
		
		System.out.println("1° Paciente");
		Paciente p1 = new Paciente();
		primeiraDose.habilitadaParaTomarAPrimeiraDose(p1);
		tomouPDose.tomouAPrimeiraDose(p1);
		segundaDose.habilitadaParaSegundaDose(p1);
		finalizada.finalizadaVacinacao(p1);
		
		System.out.println("\n2° Paciente");
		Paciente p2 = new Paciente();
		primeiraDose.habilitadaParaTomarAPrimeiraDose(p2);
		tomouPDose.tomouAPrimeiraDose(p2);
		segundaDose.habilitadaParaSegundaDose(p2);
		finalizada.finalizadaVacinacao(p2);
	}

}
