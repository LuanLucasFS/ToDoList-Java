/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package todolist;

/**
 *
 * @author Luanl
 */
public class Tarefas {
    private String nome;
    private String descricao;
    private boolean finalizado;

    
    public Tarefas(String nome) {
        this.nome = nome;
        finalizado = false;
    }

    public Tarefas(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        finalizado = false;
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

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public String toString() {
        return "Tarefas{" + "nome=" + nome + ", descricao=" + descricao + ", finalizado=" + finalizado + '}';
    }
    
    
}
