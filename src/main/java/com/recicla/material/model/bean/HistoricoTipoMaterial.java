package com.recicla.material.model.bean;

/**
 *
 * @author Lauro
 */
public class HistoricoTipoMaterial {

    private int id;
    private String especificacao;
    private String nome;
    private String descricao;

    public HistoricoTipoMaterial(int id) {
        this.id = id;
    }

    public HistoricoTipoMaterial(String nome) {
        this.nome = nome;
    }

    public HistoricoTipoMaterial(int id, String especificacao, String nome, String descricao) {
        this.id = id;
        this.especificacao = especificacao;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public HistoricoTipoMaterial(String especificacao, String nome, String descricao) {
        this.especificacao = especificacao;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    @Override
	public String toString() {
		return "HistoricoTipoMaterial [id=" + id + ", especificacao=" + especificacao + ", nome=" + nome
				+ ", descricao=" + descricao + "]";
	}

	public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(String especificacao) {
        this.especificacao = especificacao;
    }
}
