/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */



import java.util.Scanner;

/**
 *@ANDERSON FALQUETO JÚNIOR
 *@MARLON ANTONIO MONTEIRO RODRIGUES
 *@Felipe Souza de Castro 
 */
public class Bolao {

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        Apostador apostador = new Apostador();
        
        Aposta aposta = new Aposta();
        
        System.out.println("Digite o seu email :");
        String emailx;
        emailx = obj.next();
        apostador.setEmail(emailx);
        
        System.out.println("Digite a quantidade de gols da primeira seleção: ");
        int pal;
        pal = obj.nextInt();
        aposta.setPalpite1(pal);
        
        System.out.println("Digite a quantidade de gols da segunda seleção: ");
        int pal2;
        pal2 = obj.nextInt();
        aposta.setPalpite2(pal2); 
        
        System.out.print(" Digite o valor que pretende apostar ");
        float valor;
        valor = obj.nextFloat();
        aposta.setValor_aposta (valor);
        
        System.out.println(apostador.getEmail());
                     
        Selecao sele1 = new Selecao();
        Selecao sele2 = new Selecao();
        sele1.setNome("Qatar");
        sele2.setNome("Equador");
        
        Jogo jogo1 = new Jogo();
        int gols1 = 4;
        int gols2 = 3;
        jogo1.setGols_mandante(gols1);
        jogo1.setGols_visitante(gols2);
        
        if (aposta.getPalpite1() == jogo1.getGols_mandante()){
            int x = 2;
            aposta.setResultado1(x);
        }
        
        
        if(aposta.getPalpite2() == jogo1.getGols_visitante()){
            int y = 2;
            aposta.setResultado2(y);
            
            if(aposta.getResultado1() == aposta.getResultado2()){
                int j = 10;
                aposta.setResultado_final(j);
            } 
        }
              
              
       System.out.println("A aposta feita foi de "+sele1.getNome()+" "+aposta.getPalpite1()+" x "+aposta.getPalpite2()+" "+sele2.getNome());
      
       
        if (jogo1.getGols_mandante() > jogo1.getGols_visitante()){
            sele1.setVitoria(1);
        }
        else if (jogo1.getGols_visitante() > jogo1.getGols_mandante()){
            sele2.setVitoria(1);
        }
        System.out.println("O resultado da partida foi: "+ sele1.getNome() +" "+ jogo1.getGols_mandante()+" x "+ jogo1.getGols_visitante() +" " + sele2.getNome());
        
       
        if (aposta.getResultado_final() == 10){
            System.out.println("\n Vocé acertou o resultado do jogo \n\n" );
            System.out.println("Valor ganhou\n" + aposta.getValor_aposta()*2+"R$");
            
        }else{
            System.out.println("\n Vocé perdeu "+aposta.getValor_aposta()+"R$  \n NA PRIXIMA VOCE GANHA \n CONTINUE TENTANDO");
        }
       
    
    
    }
}
