//Nome: Gabriel Mediotti Marques
//RA: 2266377
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Leitura {
    public String input(String texto){
        System.out.println(texto);
        InputStreamReader teclado = new InputStreamReader(System.in);
        BufferedReader bufferTeclado = new BufferedReader(teclado);
        String returnText = "";
        try {
            returnText = bufferTeclado.readLine();
        } catch (IOException ioException){
            System.out.println("\nHouve um erro na leitura de dados do teclado!");
        }
        return returnText;
    }
}
