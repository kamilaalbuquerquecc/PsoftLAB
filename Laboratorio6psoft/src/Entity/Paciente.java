package Entity;

import situacoes.HabilitadaParaPrimeiraDose;
import situacoes.NaoHabilitadaParaVacina;
import situacoes.SituacaoState;

public class Paciente {
	private String name;
	private String cpf;
	private String end;
	private String nunSus;
	private String email;
	private String telefone;
	private String profissao;
	private String comorbidades;
	private int quantDias;
	
	private SituacaoState situacao;
	
	
	public Paciente() {
		//situacao = new NaoHabilitadaParaVacina();
	}


	public Paciente(String name, String cpf, String end, String nunSus, String email, String telefone, String profissao,
			String comorbidades) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.end = end;
		this.nunSus = nunSus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidades = comorbidades;
		//situacao = new NaoHabilitadaParaVacina();
	}
	
	
	public SituacaoState getSituacao() {
		return situacao;
	}


	public void setSituacao(SituacaoState situacao) {
		this.situacao = situacao;
	}


	public int getQuantDias() {
		return quantDias;
	}


	public void setQuantDias(int quantDias) {
		this.quantDias = quantDias;
	}


	
	

}
