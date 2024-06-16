import java.io.IOException;
import java.io.PrintStream;

public class GravandoEmailsModo2 {
    public static void main(String[] args) {
        String[] emails = {"joao_2@joao.com", "maria_2@maria.com", "jose_2@jose.com"};

        try (PrintStream writer = new PrintStream("emails2.txt")){

            for(String email : emails){
                writer.println(email);
            }

        } catch (IOException e) {
            System.err.println("Não conseguiu gravar o arquivo." + e.getMessage());
        }
    }
}