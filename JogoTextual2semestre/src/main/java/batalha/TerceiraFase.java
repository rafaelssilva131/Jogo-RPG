/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalha;

import arquivos.Arquivo;
import java.io.IOException;
import personagens.Personagem;


/**
 *
 * @author rafin
 */
public class TerceiraFase extends Personagem{
    public static void TerceiraFase(String apelido,String classe,int pontos) throws IOException{
         System.out.println("Você Chegou a terceira fase");
        Personagem personagem1 = new Personagem();
        String arquivo = "";
        int atk = 0;
        
        System.out.println("--------------------------------------------------");
        if(personagem1.classe.equals("cacador")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Cacador/terceirafaseCa.txt";
        }else if(personagem1.classe.equals("explorador")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Explorador/terceirafaseEx.txt";
        }else if(personagem1.classe.equals("biologa")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Biologa/terceirafaseBi.txt";
        }
        Arquivo.imprimirArquivo(arquivo);
        System.out.println("--------------------------------------------------");
        
        personagem1.setHpUsuario(120);
        personagem1.setHpPc(120);
        personagem1.setContEspecial(1);
        
        
    while(hpUsuario > 0){
            while(hpUsuario > 0 && hpPc > 0){
                Personagem.imprimirHp(hpUsuario,hpPc,contEspecial);
                if(personagem1.classe.equals("cacador")){
                    personagem1.setHabilidade1("Empurrão");
                    personagem1.setHabilidade2("Madeira");
                    personagem1.setEspecial("Rifle");
                    atk = Personagem.ataqueCacador(habilidade1,habilidade2,especial);
                }else if(personagem1.classe.equals("explorador")){
                    personagem1.setHabilidade1("Lança");
                    personagem1.setHabilidade2("Faca");
                    personagem1.setEspecial("Arco e Flecha");
                    atk = Personagem.ataqueExplorador(habilidade1,habilidade2,especial);
                }else if(personagem1.classe.equals("biologa")){
                    personagem1.setHabilidade1("Veneno");
                    personagem1.setHabilidade2("Chute");
                    personagem1.setEspecial("Pão com mortadela");
                    atk = Personagem.ataqueBiologa(habilidade1,habilidade2,especial);
                }
                switch(atk){
                    case 1:
                        if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Você empurrou um pirata por escada abaixo!");
                            hpPc -= 25;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("Você deu uma facada no pirata !");
                            hpPc -= 25;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Você jogou veneno de plantas na cara dela !");
                            hpPc -= 25;
                            pontos += 5;
                            break;
                        }
                        
                    case 2:
                        if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Você bateu com um pedaço de madeira no pirata!");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("Você perfurou o pirata com a lança !");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Você chutou a cara dela!");
                            hpPc -= 40;
                            pontos += 5;
                        }break;
                    case 3:
                            if(personagem1.classe.equals("cacador")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você atirou com seu rifle!");
                            hpPc -= 40;
                            contEspecial --;
                            pontos += 10;
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }break;
                        }else if(personagem1.classe.equals("explorador")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você flechou o pirata !");
                            hpPc -= 40;
                            contEspecial --;
                            pontos += 10;
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }break;
                        }else if(personagem1.classe.equals("biologa")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você comeu de um pão com mortadela");
                            hpUsuario += 75;
                            contEspecial --;
                            pontos += 10;
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }break;
                        }
                    default :
                            System.out.println("Opção invalida, você perdeu sua vez!");
                }
                if(hpPc > 0){
                    atk = Personagem.ataqueComputador();
                    
                    switch(atk) {
                        case 1 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Pirata bate em você com um taco de beisebol !");
                            hpUsuario -= 10;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O pirata arremessa a faca em você ! \n -15 hp");
                            hpUsuario -= 10;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("A Pantera pulou em cima e te derrubou! \n -15 hp");
                            hpUsuario -= 10;
                            pontos += 5;
                        }  
                            break;
                        case 2 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Pirata lança uma faca em você !");
                            hpUsuario -= 15;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O pirata te acerta com um porrete !\n -20 hp");
                            hpUsuario -= 15;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("A pantera te cortou com as unhas afiadas\n -20 hp");
                            hpUsuario -= 15;
                            pontos += 5;
                            
                        }  
                            break;
                        case 3 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Pirata atira com pistola contra você !\n -30 hp");
                            hpUsuario -= 30;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O pirata atira com um revólver em você !\n -30 hp");
                            hpUsuario -= 30;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("A pantera mordeu seu braço!\n -30 hp");
                            hpUsuario -= 30;
                            pontos += 5;
                            
                        }  
                            break;
                    }
                    
                }else {
                    System.out.println("--------------------------------------------------");
                    Arquivo.imprimir("Derrotou o inimigo!");
                    Arquivo.imprimir("Passou para o último desafio!");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                    if(personagem1.classe.equals("cacador")){
                        arquivo = "C:/JogoTextual2semestre/Arquivos/Cacador/desafio-finalCa.txt";
                    }else if(personagem1.classe.equals("cacador")){
                        arquivo = "C:/JogoTextual2semestre/Arquivos/Explorador/desafio-finalEx.txt";
                    }else if(personagem1.classe.equals("cacador")){
                        arquivo = "C:/JogoTextual2semestre/Arquivos/Biologa/desafio-finalBi.txt";
                    }
                    Arquivo.imprimirArquivo(arquivo);
                    DesafioFinal.DesafioFinal(apelido,classe,pontos);
                }
            }
        }
    }
}
