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
public class SegundaFase extends Personagem{

    public static void SegundaFase(String apelido,String classe,int pontos) throws IOException{
        System.out.println("Você Chegou a segunda parte ao derrotar o pirata maluco");
        Personagem personagem1 = new Personagem();
        String arquivo = "";
        int atk = 0;
        
        System.out.println("--------------------------------------------------");
        if(personagem1.classe.equals("cacador")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Cacador/segundafaseCa.txt";
        }else if(personagem1.classe.equals("explorador")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Explorador/segundafaseEx.txt";
        }else if(personagem1.classe.equals("biologa")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Biologa/segundafaseBi.txt";
        }
        Arquivo.imprimirArquivo(arquivo);
        System.out.println("--------------------------------------------------");
        
        personagem1.setHpUsuario(120);
        personagem1.setHpPc(150);
        personagem1.setContEspecial(1);
        
        
    while(hpUsuario > 0){
            while(hpUsuario > 0 && hpPc > 0){
                Personagem.imprimirHp(hpUsuario,hpPc,contEspecial);
                if(personagem1.classe.equals("cacador")){
                    personagem1.setHabilidade1("Pedra");
                    personagem1.setHabilidade2("Pistola");
                    personagem1.setEspecial("Revolver");
                    atk = Personagem.ataqueCacador(habilidade1,habilidade2,especial);
                }else if(personagem1.classe.equals("explorador")){
                    personagem1.setHabilidade1("Chute");
                    personagem1.setHabilidade2("Tocha");
                    personagem1.setEspecial("Lança");
                    atk = Personagem.ataqueExplorador(habilidade1,habilidade2,especial);
                }else if(personagem1.classe.equals("biologa")){
                    personagem1.setHabilidade1("Soco");
                    personagem1.setHabilidade2("Pedra");
                    personagem1.setEspecial("Maça");
                    atk = Personagem.ataqueBiologa(habilidade1,habilidade2,especial);
                }
                switch(atk){
                    case 1:
                        if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Você atirou uma pedra na direção dos piratas!");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("Voce deu um pontapé na lacraia !");
                            hpPc -= 15;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Você deu um soco na cara dele!");
                            hpPc -= 15;
                            pontos += 5;
                            break;
                        }
                        
                    case 2:
                        if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Você deu um tiro de pistola na direção dos piratas!");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("Você bateu com sua tocha na lacraia!");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Você jogou uma pedra nele.");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }
                    case 3:
                            if(personagem1.classe.equals("cacador")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você deu vários tiros em sequência nos piratas !");
                            hpPc -= 40;
                            contEspecial --;
                            pontos += 10;
                            
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }break;
                        }else if(personagem1.classe.equals("explorador")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você esfaqueou o morcego com o facão !");
                            hpPc -= 40;
                            contEspecial --;
                            pontos += 10;
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }break;
                        }else if(personagem1.classe.equals("biologa")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você  comeu uma maçã !");
                            hpUsuario += 50;
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
                            System.out.println("Os piratas atiram flechas em você !\n -10 hp");
                            hpUsuario -= 10;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O morcego mordeu o seu nariz !\n -10 hp");
                            hpUsuario -= 10;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("O nativo bateu com a lança na sua cabeça !\n - 7 hp");
                            hpUsuario -= 7;
                            pontos += 5;
                        }  
                            break;
                        case 2 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Os piratas dão tiros raspão em você !\n -10 hp");
                            hpUsuario -= 10;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O morcego cortou o seu rosto com as garras !\n -10 hp");
                            hpUsuario -= 10;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("O nativo corta sua pele com a lança!\n -15 hp");
                            hpUsuario -= 15;
                            pontos += 5;
                            
                        }  
                            break;
                        case 3 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Os piratas atiram com precisão em você !\n -20 hp");
                            hpUsuario -= 20;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println(" O morcego mordeu o seu pescoço !\n -20 hp");
                            hpUsuario -= 20;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("O nativo atira uma flecha em você!\n -20 hp");
                            hpUsuario -= 20;
                            pontos += 5;
                            
                        }  
                            break;
                    }
                    
                }else{
                    System.out.println("--------------------------------------------------");
                    Arquivo.imprimir("Derrotou o inimigo!");
                    Arquivo.imprimir("Passou para o proximo desafio!");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                   TerceiraFase.TerceiraFase(apelido,classe,pontos);
                }
            }
        }
    }
}

