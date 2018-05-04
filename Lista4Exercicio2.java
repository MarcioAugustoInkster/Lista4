import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista4Exercicio2 {
   public static void main(String[] args) {
        int numero = 10;
        String[] nomes = new String[numero];

        nomes[0] = "Paulo";
        nomes[1] = "Souza";
        nomes[2] = "Juan";
        nomes[3] = "Flavia";
        nomes[4] = "Joao";
        nomes[5] = "Amanda";
        nomes[6] = "Wagner";
        nomes[7] = "Roberta";
        nomes[8] = "Julia";
        nomes[9] = "Bruno";
        
        System.out.println(
            nomes[0] + "\n" +
            nomes[1] + "\n" +
            nomes[2] + "\n" +
            nomes[3] + "\n" +
            nomes[4] + "\n" +
            nomes[5] + "\n" +
            nomes[6] + "\n" +
            nomes[7] + "\n" +
            nomes[8] + "\n" +
            nomes[9] + "\n"
        );
        
        //System.out.println(Arrays.toString(nomes));
    }
}