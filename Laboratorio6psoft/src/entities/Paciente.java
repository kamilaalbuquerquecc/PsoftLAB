package entities;

import situacoes.NaoHabilitadaParaVacina;
import situacoes.SituacaoState;

public class Paciente {
	private String name;
	private String cpf;
	private String end;
	private String nunSus;
	private String email;
	private String telefone;
	private boolean profissao;
	private boolean comorbidades;
	private int quantDias;
	private boolean faixaEtaria;
	private SituacaoState situacao = new NaoHabilitadaParaVacina();
	
	
	public Paciente() {
	}


	
	
	
	public Paciente(String name, String cpf, String end, String nunSus, String email, String telefone,
			boolean profissao, boolean comorbidades, int quantDias, boolean faixaEtaria) {
		super();
		this.name = name;
		this.cpf = cpf;
		this.end = end;
		this.nunSus = nunSus;
		this.email = email;
		this.telefone = telefone;
		this.profissao = profissao;
		this.comorbidades = comorbidades;
		this.quantDias = quantDias;
		this.faixaEtaria = faixaEtaria;
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


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	public String getEnd() {
		return end;
	}


	public void setEnd(String end) {
		this.end = end;
	}


	public String getNunSus() {
		return nunSus;
	}


	public void setNunSus(String nunSus) {
		this.nunSus = nunSus;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}





	public boolean isProfissao() {
		return profissao;
	}





	public void setProfissao(boolean profissao) {
		this.profissao = profissao;
	}





	public boolean isComorbidades() {
		return comorbidades;
	}





	public void setComorbidades(boolean comorbidades) {
		this.comorbidades = comorbidades;
	}





	public boolean isFaixaEtaria() {
		return faixaEtaria;
	}





	public void setFaixaEtaria(boolean faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}


	
	
	

}
