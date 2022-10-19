


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alunodev05
 */
public class Aposta {
     private int palpite1;
     private int palpite2;
    private int resultado1;
    private int resultado2;
    private int resultado_final;
    private float valor_aposta;
    
    private Rodada rodada;
    private Jogo jogo;
  
    public Aposta() {
    }


    public Aposta(int palpite1, int palpite2, int resultado1, int resultado2, int resultado_final, float valor_aposta, Rodada rodada, Jogo jogo) {
        this.palpite1 = palpite1;
        this.palpite2 = palpite2;
        this.resultado1 = resultado1;
        this.resultado2 = resultado2;
        this.resultado_final = resultado_final;
        this.valor_aposta = valor_aposta;
        this.rodada = rodada;
        this.jogo = jogo;
    }

    public int getResultado2() {
        return resultado2;
    }

    public void setResultado2(int resultado2) {
        this.resultado2 = resultado2;
    }

    public int getResultado_final() {
        return resultado_final;
    }

    public void setResultado_final(int resultado_final) {
        this.resultado_final = resultado_final;
    }
         
    public int getPalpite1() {
        return palpite1;
    }

    public void setPalpite1(int palpite1) {
        this.palpite1 = palpite1;
    }

    public int getPalpite2() {
        return palpite2;
    }

    public void setPalpite2(int palpite2) {
        this.palpite2 = palpite2;
    }

    public int getResultado1() {
        return resultado1;
    }

    public void setResultado1(int resultado) {
        this.resultado1 = resultado;
    }

    public float getValor_aposta() {
        return valor_aposta;
    }

    public void setValor_aposta(float valor_aposta) {
        this.valor_aposta = valor_aposta;
    }

    public Rodada getRodada() {
        return rodada;
    }

    public void setRodada(Rodada rodada) {
        this.rodada = rodada;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    

    

    

}   