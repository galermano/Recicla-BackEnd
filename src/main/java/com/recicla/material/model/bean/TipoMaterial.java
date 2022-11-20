package com.recicla.material.model.bean;

/**
 *
 * @author Lauro
 */
public class TipoMaterial {
    private int id;
    private String especificacao;
    private String nome;
    private String descricao;

    public TipoMaterial(int id) {
        this.id = id;
    }

    public TipoMaterial(String nome) {
        this.nome = nome;
    }

    public TipoMaterial(int id, String especificacao, String nome, String descricao) {
        this.id = id;
        this.especificacao = especificacao;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
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
