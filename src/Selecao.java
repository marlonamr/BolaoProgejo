/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alunodev05
 */
public class Selecao {
    private String nome;
    private String tecnico;
    private int vitoria;

    public Selecao(String nome, String tecnico) {
        this.nome = nome;
        this.tecnico = tecnico;
    }

    public Selecao(String nome, String tecnico, int Vitoria) {
        this.nome = nome;
        this.tecnico = tecnico;
        this.vitoria = Vitoria;
    }

    public void setVitoria(int vitoria) {
        this.vitoria = vitoria;
    }

    public Selecao() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTecnico() {
        return tecnico;
    }

    public void setTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

}