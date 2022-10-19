/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author alunodev05
 */
public class Apostador {
     private String email;
    private String senha;
    private float carteira;
    
    public Aposta aposta;
   
   
  
  
   

    public Apostador() {
    }

    public Apostador(String email, String senha, float carteira, Aposta aposta) {
        this.email = email;
        this.senha = senha;
        this.carteira = carteira;
        this.aposta = aposta;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getCarteira() {
        return carteira;
    }

    public void setCarteira(float carteira) {
        this.carteira = carteira;
    }

    public Aposta getAposta() {
        return aposta;
    }

    public void setAposta(Aposta aposta) {
        this.aposta = aposta;
    }

    String setEmail() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        
}
