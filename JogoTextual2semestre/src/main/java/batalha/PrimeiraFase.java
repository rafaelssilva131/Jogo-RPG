/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batalha;

import arquivos.Arquivo;
import com.mycompany.projetowallace.JogoTextualKALAHARY;
import java.io.IOException;
import personagens.Computador;
import personagens.Personagem;

/**
 *
 * @author rafin
 */

public class PrimeiraFase extends Personagem{
   

    public static void PrimeiraFase(String apelido,String classe) throws IOException{
        Personagem personagem1 = new Personagem();
        String arquivo ="";
        int pontos = 0;
        int atk = 0;
        
        System.out.println("");
        System.out.println("--------------------------------------------------");
        
        
        if(personagem1.classe.equals("cacador")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Cacador/primeirafaseCa.txt";
    }else if(personagem1.classe.equals("explorador")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Explorador/primeirafaseEx.txt";
    }else if(personagem1.classe.equals("biologa")){
            arquivo = "C:/JogoTextual2semestre/Arquivos/Biologa/primeirafaseBi.txt";
    }
        Arquivo.imprimirArquivo(arquivo);
        System.out.println("--------------------------------------------------");
        System.out.println("Seja Bem Vindo "+personagem1.getApelido());
        
        personagem1.setHpUsuario(100);
        personagem1.setHpPc(100);
        personagem1.setContEspecial(1);
        
//        boolean loopMenu = true;
        
        while(hpUsuario > 0){
            while(hpUsuario > 0 && hpPc > 0){
                Personagem.imprimirHp(hpUsuario,hpPc,contEspecial);
                if(personagem1.classe.equals("cacador")){
                    personagem1.setHabilidade1("Soco");
                    personagem1.setHabilidade2("Chute");
                    personagem1.setEspecial("Faca");
                    atk = Personagem.ataqueCacador(habilidade1,habilidade2,especial);
                }else if(personagem1.classe.equals("explorador")){
                    personagem1.setHabilidade1("Mão");
                    personagem1.setHabilidade2("Tocha");
                    personagem1.setEspecial("Facão");
                    atk = Personagem.ataqueExplorador(habilidade1,habilidade2,especial);
                }else if(personagem1.classe.equals("biologa")){
                    personagem1.setHabilidade1("Mochila");
                    personagem1.setHabilidade2("Chute");
                    personagem1.setEspecial("Paçoca");
                    atk = Personagem.ataqueBiologa(habilidade1,habilidade2,especial);
                }
                switch(atk){
                    case 1:
                        if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Você deu um soco no queixo do pirata !");
                            hpPc -= 15;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("Você deu um tapa no morcego !");
                            hpPc -= 15;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Você bateu com a sua mochila nele!");
                            hpPc -= 15;
                            pontos += 5;
                            break;
                        }
                        
                    case 2:
                        if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("Você deu um chute na barriga do pirata !");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("Você bateu com a tocha acesa no morcego !");
                            hpPc -= 20;
                            pontos += 5;
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Você deu uma bica nele!");
                            hpPc -= 40;
                            pontos += 5;
                            break;
                        }
                        
                    case 3:
                            if(personagem1.classe.equals("cacador")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você cortou o pirata com a sua faca !");
                            hpPc -= 40;
                            contEspecial --;
                            pontos += 10;
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }
                            break;
                        }else if(personagem1.classe.equals("explorador")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você esfaqueou o morcego com o facão !");
                            hpPc -= 40;
                            contEspecial --;
                            pontos += 10;
                            }else {
                                System.out.println("Você não tem mais especial!");
                            }
                            break;
                        }else if(personagem1.classe.equals("biologa")){
                            if (contEspecial > 0) {
                            System.out.println("");
                            System.out.println("Você comeu uma paçoca!");
                            hpUsuario += 25;
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
                            System.out.println("O pirata deu um soco no  seu nariz !\n -05 hp");
                            hpUsuario -= 5;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O morcego mordeu o seu nariz !\n -05 hp");
                            hpUsuario -= 5;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Dragão-de-Komodo mordeu a sua canela! \n -5 hp");
                            hpUsuario -= 5;
                            pontos += 5;
                        }  
                            break;
                        case 2 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("O pirata bateu em você com um porrete!/n - 7 hp");
                            hpUsuario -= 7;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O morcego cortou o seu rosto com as garras !\n - 7 hp");
                            hpUsuario -= 7;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Dragão-de-Komodo bateu com a cauda na sua cara !\n - 7 hp");
                            hpUsuario -= 7;
                            pontos += 5;
                            
                        }  
                            break;
                        case 3 :
                            if(personagem1.classe.equals("cacador")){
                            System.out.println("");
                            System.out.println("O pirata atirou em você com uma pistola !/n - 13 hp");
                            hpUsuario -= 13;
                            pontos += 5;
                        }else if(personagem1.classe.equals("explorador")){
                            System.out.println("");
                            System.out.println("O morcego mordeu o seu pescoço !\n -13 hp");
                            hpUsuario -= 13;
                            pontos += 5;
                        }else if(personagem1.classe.equals("biologa")){
                            System.out.println("");
                            System.out.println("Dragão-de-Komodo cuspiu ácido em você !\n -13 hp");
                            hpUsuario -= 13;
                            pontos += 5;
                            
                        }  
                            break;
                    }
                    
                }else {
                    System.out.println("--------------------------------------------------");
                    Arquivo.imprimir("Derrotou o inimigo!");
                    Arquivo.imprimir("Passou para o proximo desafio!");
                    System.out.println("--------------------------------------------------");
                    System.out.println("");
                   SegundaFase.SegundaFase(apelido,classe,pontos);
                }
            }
        }
    }
}

