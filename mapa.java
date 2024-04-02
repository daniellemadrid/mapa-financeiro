import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class mapa {
    private Integer orientacao;
    private Boolean invertido;
    private String[][] mapaStrings;
    private String nomeArquivo = "arquivo.txt";
    private int contagem;

    public static int contarColunasNaoNulas(String nomeArquivo) {
        int contagemColunas = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;

            while ((linha = br.readLine()) != null) {
                String[] colunas = linha.split("\t"); // Assumindo que as colunas são separadas por tabulação (\t)

                for (String coluna : colunas) {
                    if (!coluna.trim().isEmpty()) { // Verifica se a coluna não está vazia
                        contagemColunas++;
                    }
                }
            }
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return contagemColunas;
    }
}