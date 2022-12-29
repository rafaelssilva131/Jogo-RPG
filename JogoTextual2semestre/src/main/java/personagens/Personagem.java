package personagens;

import batalha.PrimeiraFase;
import java.util.Random;
import java.util.Scanner;

public class Personagem {
    
    public static String classe;
    public static String apelido;
    public static int hpUsuario;
    public static String habilidade1;
    public static String habilidade2;
    public static String especial;
    public static int contEspecial;
    public static int hpPc;
    
    public Personagem(){    
    }
    
    public static void imprimirHp(int hpUsuario, int hpPc, int contEspecial){
        
        System.out.println("__________________________________________________");
        System.out.println("");
        System.out.println("* HP USER: " + hpUsuario);
        System.out.println("* HP PC: " + hpPc);
        System.out.println("* ESPECIAL: " + contEspecial + "/1");
        System.out.println("__________________________________________________");
    }
    
    public static int ataqueComputador(){
        Random input = new Random();
        return input.nextInt(3) + 1;
    }
    
    public static String player(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("-------------------------------------------------");
        System.out.println("Qual seu nome aventureiro? ");
        System.out.println("-------------------------------------------------");
        String user = entrada.nextLine();
        return user;
    }
    
    public static  int ataqueCacador(String habilidade1,String habilidade2,String especial){
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\nEscolha seu ataque:\n");
        System.out.println("(1) " + habilidade1);
        System.out.println("(2) " + habilidade2);
        System.out.println("(3) " + especial);
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static int ataqueExplorador(String habilidade1,String habilidade2, String especial){
         Scanner entrada = new Scanner(System.in);
         
        System.out.println("\nEscolha seu ataque:\n");
        System.out.println("(1) " + habilidade1);
        System.out.println("(2) " + habilidade2);
        System.out.println("(3) " + especial);
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static int ataqueBiologa(String habilidade1,String habilidade2, String especial){
         Scanner entrada = new Scanner(System.in);

        System.out.println("\nEscolha seu ataque:\n");
        System.out.println("(1) " + habilidade1);
        System.out.println("(2) " + habilidade2);
        System.out.println("(3) " + especial);
        int numero = entrada.nextInt();
        return numero;
    }
    
    public static String escolhaClasse(){
        Scanner entrada = new Scanner(System.in);  

        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.print("Antes de começar, selecione uma das classes abaixo:");
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("(1) - Caçador\n(2) - Explorador\n(3) - Bióloga");
        System.out.println();
        int escolha = entrada.nextInt();

        switch (escolha) {

            case 1:

                System.out.println("\n--------------------------------------------------");
                System.out.println("        Você escolheu o caçador, vamos lá!");
                System.out.println("--------------------------------------------------\n");
                Personagem.classe = "cacador";
               // PrimeiraFase.PrimeiraFase();
                break;
             
            case 2:

                System.out.println("\n--------------------------------------------------");
                System.out.println("      Você escolheu o explorador, vamos lá!");
                System.out.println("--------------------------------------------------\n");
                Personagem.classe = "explorador";  
              //  PrimeiraFase.PrimeiraFase();
                break;

            case 3:

                System.out.println("\n--------------------------------------------------");
                System.out.println("        Você escolheu a bióloga , vamos lá !");
                System.out.println("--------------------------------------------------\n");
                Personagem.classe = "biologa";
                //PrimeiraFase.PrimeiraFase();
                break;

        }
        return classe;
    }
    
    public String getClasse(){
        return classe;
    }  
    public String getHabilidade1(){
        return habilidade1;
    }
    public void setHabilidade1(String habilidade1){
        this.habilidade1 = habilidade1;
    }
    public String getHabilidade2(){
        return habilidade2;
    }
    public void setHabilidade2(String habilidade2){
        this.habilidade2 = habilidade2;
    }
    public void setClasse(String classe){   
        this.classe = classe;
    }
    
    public String getApelido(){
        return apelido;
    }
    
    public void setApelido(String apelido){
        this.apelido = apelido;
    }
    
    public String getEspecial(){
        return especial;
    }
    
    public void setEspecial(String especial){
        this.especial = especial;
    }
    
    public int getGontEspecial(){
        return contEspecial;
    }
    
    public void setContEspecial(int contEspecial){
        this.contEspecial = contEspecial;
    }
    
    public int gethpPc(){
        return hpPc;
    }
    
    public void setHpPc(int hpPc){
        this.hpPc = hpPc;
    }
    
    public int getHpUsuario(){
        return hpUsuario;
    }
    
    public void setHpUsuario(int hpUsuario){
        this.hpUsuario = hpUsuario;
    }
}
