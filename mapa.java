import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Mapa {
    private int lineSize;
    private int columnSize;
    private String[][] mapaString;

    public Mapa(String arquivo) throws IOException {
        lerDesenho(arquivo);
        this.mapaString = new String[lineSize][columnSize];
    }

    private void lerDesenho(String caminhoArquivo) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(caminhoArquivo));
        String linha;
        int numLinhas = 0; // Inicializa o contador de linhas
        int numColunas = 0; // Inicializa o contador de colunas

        // Enquanto houver linhas no arquivo, adiciona cada linha ao StringBuilder
        while ((linha = bufferedReader.readLine()) != null) {
            numLinhas++; // Incrementa o contador de linhas

            // Conta o número máximo de colunas encontradas até agora
            if (linha.length() > numColunas) {
                numColunas = linha.length();
            }
        }

        // Fecha o BufferedReader após a leitura
        bufferedReader.close();

        // Imprime o número de linhas e colunas lidas
        System.out.println("Número de linhas lidas: " + numLinhas);
        System.out.println("Número de colunas lidas: " + numColunas);

        this.lineSize = numLinhas;
        this.columnSize = numColunas;
    }

    public int getLineSize() {
        return lineSize;
    }

    public void setLineSize(int lineSize) {
        this.lineSize = lineSize;
    }

    public int getColumnSize() {
        return columnSize;
    }

    public void setColumnSize(int columnSize) {
        this.columnSize = columnSize;
    }

    public String[][] getMapaString() {
        return mapaString;
    }

    public void setMapaString(String[][] mapaString) {
        this.mapaString = mapaString;
    }

    @Override
    public String toString() {
        return "Mapa{" +
                "lineSize=" + lineSize +
                ", columnSize=" + columnSize + "}";
    }
}