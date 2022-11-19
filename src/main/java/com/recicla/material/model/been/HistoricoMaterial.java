package com.recicla.material.model.been;

/**
 *
 * @author Lauro
 */
public class HistoricoMaterial {

    private int id;
    private int id_material;
    private int id_tipo_material;
    private String nome;
    private String descricao;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HistoricoMaterial(int id, int id_material, int id_tipo_material, String nome, String descricao) {
        this.id = id;
        this.id_material = id_material;
        this.id_tipo_material = id_tipo_material;
        this.nome = nome;
        this.descricao = descricao;
    }
    
    public int getId_material() {
        return id_material;
    }

    public void setId_material(int id_material) {
        this.id_material = id_material;
    }

    public int getId_tipo_material() {
        return id_tipo_material;
    }

    public void setId_tipo_material(int id_tipo_material) {
        this.id_tipo_material = id_tipo_material;
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
}
