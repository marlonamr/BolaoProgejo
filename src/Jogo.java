/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import javax.xml.crypto.Data;

/**
 *
 * @author alunodev05
 */
public class Jogo {
    private Data data_hora;
    private int gols_mandante;
    private int gols_visitante;
    private String local_jogo;
    private int resultado_jogo;
    private Data tempo_jogo;
    
    private Selecao selecao;

    public Jogo() {
    }
   
    public Jogo(Data data_hora, int gols_mandante, int gols_visitante, String local_jogo, int resultado_jogo, Data tempo_jogo) {
        this.data_hora = data_hora;
        this.gols_mandante = gols_mandante;
        this.gols_visitante = gols_visitante;
        this.local_jogo = local_jogo;
        this.resultado_jogo = resultado_jogo;
        this.tempo_jogo = tempo_jogo;
    }

    public Data getData_hora() {
        return data_hora;
    }

    public void setData_hora(Data data_hora) {
        this.data_hora = data_hora;
    }

    public int getGols_mandante() {
        return gols_mandante;
    }

    public void setGols_mandante(int gols_mandante) {
        this.gols_mandante = gols_mandante;
    }

    public int getGols_visitante() {
        return gols_visitante;
    }

    public void setGols_visitante(int gols_visitante) {
        this.gols_visitante = gols_visitante;
    }

    public String getLocal_jogo() {
        return local_jogo;
    }

    public void setLocal_jogo(String local_jogo) {
        this.local_jogo = local_jogo;
    }

    public int getResultado_jogo() {
        return resultado_jogo;
    }

    public void setResultado_jogo(int resultado_jogo) {
        this.resultado_jogo = resultado_jogo;
    }

    public Data getTempo_jogo() {
        return tempo_jogo;
    }

    public void setTempo_jogo(Data tempo_jogo) {
        this.tempo_jogo = tempo_jogo;
    }
    
    


    
}
