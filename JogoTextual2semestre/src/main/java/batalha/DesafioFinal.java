/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalha;

import arquivos.Arquivo;
import com.mycompany.projetowallace.JogoTextualKALAHARY;
import java.io.IOException;
import personagens.Personagem;
import static personagens.Personagem.contEspecial;

/**
 *
 * @author rafin
 */
public class DesafioFinal extends Personagem{
    
    public static void DesafioFinal(String apelido,String classe,int pontos) throws IOException{   
        Arquivo.imprimir("Desafio Final!!");
        String arquivo = "";
        int atk = 0;
        Personagem personagem1 = new Personagem();
    
        personagem1.setHpUsuario(200);
        personagem1.setHpPc(200);
        personagem1.setContEspecial(2);
        Arquivo.imprimir("-----------------------------------------------");
        Arquivo.imprimir("Último Desafio!!");
        Arquivo.imprimir("-----------------------------------------------");
        
        while(hpUsuario>100){
            Personagem.imprimirHp(hpUsuario, hpPc, contEspecial);
            if(personagem1.classe.equals("cacador")){
                 personagem1.setHabilidade1("Pistola");
                 personagem1.setHabilidade2("Rifle");
                 personagem1.setEspecial("Metralhadora");
                 atk = Personagem.ataqueCacador(habilidade1, habilidade2, especial);
            }else if(personagem1.classe.equals("explorador")){
                 personagem1.setHabilidade1("Facão");
                 personagem1.setHabilidade2("Arco e flecha");
                 personagem1.setEspecial("Rifle");
                 atk = Personagem.ataqueExplorador(habilidade1, habilidade2, especial);
            }else if(personagem1.classe.equals("biologa")){
                 personagem1.setHabilidade1("Pó");
                 personagem1.setHabilidade2("Dardo");
                 personagem1.setEspecial("Marmitex");
                 atk = Personagem.ataqueExplorador(habilidade1, habilidade2, especial);
            }
            switch(atk) {
                case 1 :
                    if(personagem1.classe.equals("cacador")){
                        System.out.println("");
                        System.out.println("Você acertou um tiro de pistola no peito do gorila!");
                        hpPc -= 15;
                        pontos += 5;
                }else if(personagem1.classe.equals("explorador")){
                        System.out.println("");
                        System.out.println("Você acertou um golpe com Facão!");
                        hpPc -= 15;
                        pontos += 5;
                }else if(personagem1.classe.equals("biologa")){
                        System.out.println("");
                        System.out.println("Você jogou pó na cara do gorila!");
                        hpPc -= 15;
                        pontos += 5;
                }
                    break;
                
                case 2 :
                    if(personagem1.classe.equals("cacador")){
                        System.out.println("");
                        System.out.println("Você acertou um tiro de rifle no braço do gorila!");
                        hpPc -= 20;
                        pontos += 5;
                    }else if(personagem1.classe.equals("explorador")){
                        System.out.println("");
                        System.out.println("Na mosca, você pacertou uma flechada!");
                        hpPc -= 20;
                        pontos += 5;
                    }else if(personagem1.classe.equals("biologa")){
                        System.out.println("");
                        System.out.println("Você atirou um dardo no olho do gorila!");
                        hpPc -= 20;
                        pontos += 5;
                    }
                    break;
                    
                case 3:
                    if(personagem1.classe.equals("cacador")){
                        if(contEspecial > 0){
                        System.out.println("");
                        System.out.println("Você fuzilou o gorila com uma metralhadora!");
                        hpPc -= 20;
                        pontos += 5;
                        contEspecial --;
                        }else {
                            System.out.println("Nâo tem mais energia para usar o especial");
                        }
                    }else if(personagem1.classe.equals("explorador")){
                        if(contEspecial > 0){
                        System.out.println("");
                        System.out.println("Você acertou o gorila com um tiro de rifle!");
                        hpPc -= 20;
                        pontos += 5;
                        contEspecial --;
                        }else {
                            System.out.println("Nâo tem mais energia para usar o especial");
                        }
                    }else if(personagem1.classe.equals("biologa")){
                        if(contEspecial > 0){
                        System.out.println("Você comeu um belo marmitex!");
                        System.out.println("");
                        hpPc -= 20;
                        pontos += 5;
                        contEspecial --;
                    }else {
                            System.out.println("Nâo tem mais energia para usar o especial");
                        }
                        break;
                    }
                    default :
                            System.out.println("Opção invalida, você perdeu sua vez!"); 
            
            }
            if(hpPc > 0){
                atk = Personagem.ataqueComputador();
                
                switch(atk){
                    case 1 :
                        System.out.println("O gorila jogou cocos na sua cabeça!");
                        hpUsuario -= 5;
                    break;
                    case 2 :
                        System.out.println("Gorila pulou em cima de você!");
                        hpUsuario -= 7;
                    break;
                    case 3 :
                        System.out.println("Gorila deu uma voadora em você!");
                        hpUsuario -= 15;

                }
            }else {
                //Gambiarra para sair do while
                hpUsuario = 0;
                arquivo = "C:/JogoTextual2semestre/Arquivos/DesafioFinal/jogoganho.txt";
                Arquivo.imprimirArquivo(arquivo);
                System.out.println("");
                System.out.println("Você fez "+pontos+"pontos! \n Parabéns!");
                System.out.println("");
                String ponto = String.valueOf(pontos);
                Arquivo.escreverArquivo("\n"+ponto);
                System.out.println("");
                
                JogoTextualKALAHARY.creditos();
            }      
        }   
    }
}