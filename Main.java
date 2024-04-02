import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            Mapa mapa = new Mapa("casoC50.txt");
            Mapa mapa2 = new Mapa("casoC100.txt");
            Mapa mapa3 = new Mapa("casoC200.txt");
            Mapa mapa4 = new Mapa("casoC500.txt");
            Mapa mapa5 = new Mapa("casoC750.txt");
            Mapa mapa6 = new Mapa("casoC1000.txt");
            Mapa mapa7 = new Mapa("casoC1500.txt");
            Mapa mapa8 = new Mapa("casoC2000.txt");
            System.out.println(mapa.toString());
            System.out.println(mapa2.toString());
            System.out.println(mapa3.toString());
            System.out.println(mapa4.toString());
            System.out.println(mapa5.toString());
            System.out.println(mapa6.toString());
            System.out.println(mapa7.toString());
            System.out.println(mapa8.toString());
            // Aqui você pode realizar operações com o objeto mapa, se necessário
        } catch (IOException e) {
            System.err.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }
}
