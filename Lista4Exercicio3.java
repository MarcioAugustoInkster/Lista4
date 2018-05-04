import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista4Exercicio3 {
   public static void main(String[] args) {
        int numero = 7;
        String[] produto = new String[numero];
        double[] preco = new double[numero];

        produto[0] = "Xicara";
        preco[0] = 2.50;
        produto[1] = "Chinelo";
        preco[1] = 5.30;
        produto[2] = "Pilhas";
        preco[2] = 8.60;
        produto[3] = "Caixa de Ferramentas";
        preco[3] = 25.00;
        produto[4] = "Refrigerante";
        preco[4] = 3.20;
        produto[5] = "Caneta";
        preco[5] = 2.50;
        produto[6] = "Cadeira Plastica";
        preco[6] = 18.50;
		
		System.out.print(
			produto[0] + " - " + preco[0] + "\n" +
			produto[1] + " - " + preco[1] + "\n" +
			produto[2] + " - " + preco[2] + "\n" +
			produto[3] + " - " + preco[3] + "\n" +
			produto[4] + " - " + preco[4] + "\n" +
			produto[5] + " - " + preco[5] + "\n" +
			produto[6] + " - " + preco[6]
		);
        /*
		System.out.println(
            Arrays.toString(produto) + "\n" +
            Arrays.toString(preco)
        );
		*/
    }
}