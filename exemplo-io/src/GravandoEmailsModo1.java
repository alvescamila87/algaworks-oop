import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class GravandoEmailsModo1 {
    public static void main(String[] args) {
        String[] emails = {"joao_2@joao.com", "maria_2@maria.com", "jose_2@jose.com"};

        try (BufferedWriter writer = new BufferedWriter(new FileWriter("emails.txt", true))){

            for(String email : emails){
                writer.write(email);
                writer.newLine();
            }

        } catch (IOException e) {
            System.out.println("Não conseguiu gravar o arquivo." + e.getMessage());
        }
    }
}