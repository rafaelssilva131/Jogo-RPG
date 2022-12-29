package arquivos;

import com.mycompany.projetowallace.JogoTextualKALAHARY;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import static java.lang.Math.random;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;
import java.util.stream.Collectors;

public class Arquivo {

    public static String arquivo;

    
    public static Path criarDiretorio() throws IOException {
        Path novaPasta = Files.createDirectory(Path.of("./ranking-"));
//        System.out.println("Novo diretório:" + novaPasta.toAbsolutePath());
        return novaPasta;
    }

    public static Path criarArquivo(Path novaPasta) throws IOException {
        Path novoArquivo = Files.createFile(novaPasta.resolve("ranking.txt"));
//        System.out.println("Novo arquivo:" + novoArquivo.toAbsolutePath());
        return novoArquivo;
    }
    
    public static void criarRanking(String pontos) throws IOException{
        Path novaPasta = Arquivo.criarDiretorio();
        System.out.println(novaPasta);
//       Arquivo.EscreverArquivo(pontos, novaPasta);
    }
    
    public static void escreverArquivo(String texto) throws IOException {
        Path caminho = Paths.get("C:/JogoTextual2semestre/ranking-/ranking.txt");
        System.out.println("O ranking se encontra:" + caminho.toAbsolutePath());
        Files.writeString(caminho, texto, StandardCharsets.ISO_8859_1, StandardOpenOption.APPEND);
        Arquivo.ordenar(caminho);
    }

    public static void imprimir(String imprimir) {

        int cont = imprimir.length();

        for (int i = 0; i < cont; i++) {
            char result = imprimir.charAt(i);

            try {
                Thread.sleep(10);
                System.out.print(result);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println();
    }

    public static void imprimirArquivo(String arquivo) {
        Path caminho = Paths.get(arquivo);
        try {
            BufferedReader bufferedReader = Files.newBufferedReader(caminho, StandardCharsets.UTF_8);
            for (String linha : bufferedReader.lines().toList()) {
                System.out.println(linha);
            }
        } catch (IOException exe) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    exe.getMessage());
        }
    }

    public static void introducao() {
        Scanner entrada = new Scanner(System.in);
        System.out.println();
        System.out.println("Digite N para a Introdução do jogo");
        System.out.println("Ou digite J para começar o jogo");
        String n = entrada.nextLine();
        n = n.toUpperCase();
        if (n.equals("N")) { 
            Arquivo.imprimirArquivo("C:/JogoTextual2semestre/Arquivos/Introducao/introducao.txt");
            Arquivo.imprimirArquivo("C:/JogoTextual2semestre/Arquivos/Introducao/introducao-2.txt");
        }else{
        Arquivo.imprimirArquivo("C:/JogoTextual2semestre/Arquivos/Introducao/introducao-2.txt");
        }
    }
 
    public static void ordenar(Path arquivo) throws IOException {
        //lê o arquivo
        BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(arquivo)));
        List<String> linhas = reader.lines().collect(Collectors.toList());
        int[] vetor = new int[linhas.size()];
        for (int i = 0; i < linhas.size(); i++) {
            vetor[i] = Integer.parseInt(linhas.get(i));
        }
        System.out.println("Ranking desordernado"+Arrays.toString(vetor));
       
        int aux = 0;
        for (int i = 0; i < vetor.length; i++)
        {
            for (int j = 0; j < vetor.length; j++)
            {
                if (vetor[i] < vetor[j])
                {
                    aux = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = aux;
                }
            }
        }

        System.out.println("Ranking ordernado\n"+Arrays.toString(vetor));

    }
    public String getArquivo() {
        return arquivo;
    }

    public void setArquivo(String arquivo) {
        this.arquivo = arquivo;
    }
}
