import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EnviandoEmails {

    public static void main(String[] args) {

        try (BufferedReader reader = new BufferedReader(new FileReader("emails2.txt"))){

            // Ler arquivo
            String email = reader.readLine();
            while (email != null && !email.trim().equals("")) {
                System.out.println("Enviando e-mail para: " + email);
                email = reader.readLine();
            }

        } catch (IOException e){
            System.out.println("Não conseguiu ler o arquivo." + e.getMessage());
        }

    }
}
