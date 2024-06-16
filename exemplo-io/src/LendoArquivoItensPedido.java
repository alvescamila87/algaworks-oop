import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class LendoArquivoItensPedido {

    public static void main(String[] args) {

        // Ler arquivo
        try (Scanner entrada = new Scanner(new BufferedReader(new FileReader("itens_pedido.txt")))){

            // Delimitador (padrão é espaço)
            entrada.useDelimiter(";");
            Locale localeUSA = new Locale("en", "US"); // separador de casa decimal
            entrada.useLocale(localeUSA);

            // Formatar número
            NumberFormat formatador = NumberFormat.getCurrencyInstance(localeUSA);

            // Ficar lendo as linhas
            while (entrada.hasNext()){
                String produto = entrada.next();
                int quantidade = entrada.nextInt();
                double valor = entrada.nextDouble();
                entrada.nextLine();

                System.out.printf("Produto: %s. Quantidade: %s. Por: %s\n", produto, quantidade, formatador.format(valor));
            }

        } catch (IOException e){
            System.err.println("Problema ao abrir o arquivo. Erro: " + e.getMessage());
        }
    }
}
