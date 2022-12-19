import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clientes {
    private String Nome, Contato;
    private double Quant, Val;
    private int OrdemServ;

    public String getNome() {
        return Nome;
    }

    public double getQuant() {
        return Quant;
    }

    public double getVal() {
        return Val;
    }

    public int getOrdemServ() {
        return OrdemServ;
    }

    public String getContato() {
        return Contato;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public void setContato(String Contato) {
        this.Contato = Contato;
    }

    public void setContato(int OrdemServ) {
        this.OrdemServ = OrdemServ;
    }

    public void setVal(double Val) {
        this.Val = Val;
    }

    public void setQuant(double Quant) {
        this.Quant = Quant;
    }

    public String Salvar() {

        try {
            FileWriter fw = new FileWriter(
                    "/Users/Gabriel/Desktop/Projetos Java/Café Fazenda/arquivos/" + Nome + ".txt");
            PrintWriter pw = new PrintWriter(
                    "/Users/Gabriel/Desktop/Projetos Java/Café Fazenda/arquivos/" + Nome + ".txt");
            pw.println(Nome);
            pw.println(Contato);
            pw.flush();
            pw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }

        return "Cadastrado com  sucesso";
    }

    public String RegistrarServiço() throws IOException {

        File file = new File("/Users/Gabriel/Desktop/Projetos Java/Café Fazenda/arquivos/" + Nome + ".txt");
        Scanner scan = new Scanner(file);

        String conteudo = "";
        while (scan.hasNextLine()) {
            conteudo = conteudo.concat(scan.nextLine() + "\n");
        }
        conteudo = conteudo.concat("\n R$" + Val + "\n " + Quant + " Kg");
        FileWriter fw = new FileWriter("/Users/Gabriel/Desktop/Projetos Java/Café Fazenda/arquivos/" + Nome + ".txt");
        fw.write(conteudo);
        fw.close();
        scan.close();

        return "Registrado com sucesso";
    }
}
