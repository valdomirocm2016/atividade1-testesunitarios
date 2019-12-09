/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exfila;

/**
 *
 * @author Valdomiro
 */
public class Paciente implements Comparable{
    
    private String nome;
	private Integer idade;
	private String  classificacao;
	private Integer prioridade  ;
	

	public Paciente() {}
	
	

	
	    public String toString() {
	    	return this.getNome()+ ' '+ this.getPrioridade();
	    }

	public Paciente(String nome, Integer idade, String classificacao, Integer prioridade) {
		this.nome = nome;
		this.idade = idade;
		this.classificacao = classificacao;
		this.prioridade = prioridade;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Integer getIdade() {
		return idade;
	}


	public void setIdade(Integer idade) {
		this.idade = idade;
	}


	public String getClassificacao() {
		return classificacao;
	}


	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}


	public Integer getPrioridade() {
		return prioridade;
	}


	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}

	@Override
	public int compareTo(Object o) {
		
		Paciente p = (Paciente) o;
	
		 if (this.prioridade > p.prioridade) {
	            return -1;
	        }
	        if (this.prioridade < p.prioridade) {
	            return 1;
	        }
	        return 0;
		
	}
        public Paciente getPaciente(){
            return new Paciente(nome,idade,classificacao,prioridade);
        }
}
