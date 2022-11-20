package com.recicla.material.model.been;

/**
 *
 * @author Lauro
 */
public class Material {

    private int id;
    private int id_tipo_material;
    private String nome;
    private String descricao;

    public Material(int id) {
        this.id = id;
    }

    public Material(String nome) {
        this.nome = nome;
    }

    public Material(int id, int id_tipo_material, String nome, String descricao) {
        this.id = id;
        this.id_tipo_material = id_tipo_material;
        this.nome = nome;
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_tipo_material() {
        return id_tipo_material;
    }

    public void setId_tipo_material(int id_tipo_material) {
        this.id_tipo_material = id_tipo_material;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
