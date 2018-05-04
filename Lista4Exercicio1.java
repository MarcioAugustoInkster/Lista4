import javax.swing.JOptionPane;

public class Lista4Exercicio1 {
   public static void main(String[] args) {
        int numeros = 16, soma = 0;
        int[] vetor = new int[numeros];

        //int vetor[] = {13, 8, 21, 52, 33, 85, 26, 49, 63, 28, 74, 43, 29, 57, 5, 31, 12};

        vetor[0] = 13;
        vetor[1] = 8;
        vetor[2] = 21;
        vetor[3] = 52;
        vetor[4] = 33;
        vetor[5] = 85;
        vetor[6] = 26;
        vetor[7] = 49;
        vetor[8] = 63;
        vetor[9] = 28;
        vetor[10] = 74;
        vetor[11] = 43;
        vetor[12] = 29;
        vetor[13] = 57;
        vetor[14] = 5;
        vetor[15] = 31;
        
        soma += vetor[0];
        soma += vetor[1];
        soma += vetor[2];
        soma += vetor[3];
        soma += vetor[4];
        soma += vetor[5];
        soma += vetor[6];
        soma += vetor[7];
        soma += vetor[8];
        soma += vetor[9];
        soma += vetor[10];
        soma += vetor[11];
        soma += vetor[12];
        soma += vetor[13];
        soma += vetor[14];
        soma += vetor[15];

        System.out.print("Total: " + soma);
    }
}