package com.mycompany.projetowallace;

import arquivos.Arquivo;
import static arquivos.Arquivo.arquivo;
import static arquivos.Arquivo.imprimirArquivo;
import batalha.PrimeiraFase;
import java.io.IOException;
import java.util.Scanner;
import personagens.Personagem;
import static personagens.Personagem.classe;


//import java.ult.Random;


public class JogoTextualKALAHARY{
    public static void main(String[] args) throws IOException {
          menuIncial();
        
    }
   public static void menuIncial() throws IOException{
        Personagem personagem1 = new Personagem();
        Scanner entrada = new Scanner(System.in);
        String apelido = "";
        
        boolean loopMenu = true;
        
        while(loopMenu == true){
            System.out.println("---------------------------------------------");
            System.out.println("****MENU****");
            System.out.println("---------------------------------------------");
            System.out.println("1) Iniciar");
            System.out.println("2) Instruções");
            System.out.println("3) Sair");
            System.out.println("");
            int opcaoMenu = entrada.nextInt();
            switch(opcaoMenu) {
                case 1: 
                   personagem1.apelido = Personagem.player();
                   Arquivo.introducao();
                   personagem1.classe = Personagem.escolhaClasse(); 
                   PrimeiraFase.PrimeiraFase(apelido,classe);  
                   loopMenu = true;
                
                case 2 :
                    instrucoes();
                    loopMenu = true;
                    break;
                case 3 :
                    System.exit(0);
                    loopMenu = false;
                    break;
                default :
                    System.out.println("Opção inválida, Tente Novamente");
                    loopMenu= true;
            }
        }
    }
   
   public static boolean menuDerrota() throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("");
        System.out.println("Você foi derrotado!");
        System.out.println("");
        System.out.println("--------------------------------------------------");
        System.out.println("(1) - Menu");
        System.out.println("(2) - Sair");
        System.out.println("");

        int escolha = input.nextInt();

        boolean loop = true;
        while(loop == true){
        switch (escolha) {

            case 1:
                menuIncial();
                loop = true;
                break;

            case 2:
                System.exit(0);
                loop = false;
                break;

            default:

                System.out.println("Opção invalida, tente novamente!");
                loop = true;

            }
        }
        return loop;
    }
    
   public  static boolean instrucoes() throws IOException{
        Scanner entrada = new Scanner(System.in);
        
        String arquivo = "C:/JogoTextual2semestre/Arquivos/Instrucao/instrucao.txt";
        Arquivo.imprimirArquivo(arquivo);
        System.out.println("1) Menu");
        System.out.println("2) Sair");
        System.out.println("");
            
        int escolha = entrada.nextInt();
        
        boolean loop = true;
 
        switch (escolha){
            case 1:
                
                loop = false;
                
                break;
            case 2:
                System.exit(0);
                loop = false;
                break;
            default :
                
                System.out.println("Opção Invalida!");
                break;
        }
      
        return loop;
    }
    
   public static void creditos() throws IOException {

        Scanner input = new Scanner(System.in);

        System.out.println("");
        arquivo = "C:/JogoTextual2semestre/Arquivos/Creditos/creditos.txt";
        imprimirArquivo(arquivo);
        System.out.println("");
        System.out.println("1) Menu inicial");
        System.out.println("2) Sair");
        int escolha = input.nextInt();
        
        if(escolha == 1){
            menuIncial();
        }else{
            System.exit(0);
        }
    }
   
}
