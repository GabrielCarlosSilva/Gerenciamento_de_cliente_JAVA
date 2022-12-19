import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Debug {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("/Users/Gabriel/Desktop/Projetos Java/Café Fazenda/arquivos/teste.txt");
        try (Scanner scan = new Scanner(file)) {
            while (scan.hasNextLine()) {
                System.out.println(scan.nextLine());
            }
        }
    }
}
