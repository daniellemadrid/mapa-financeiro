import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Mapa mapa = new Mapa("casoC50.txt");
            Mapa mapa2 = new Mapa("casoC1000.txt");
            System.out.println(mapa2.toString());
            // Aqui você pode realizar operações com o objeto mapa, se necessário
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
