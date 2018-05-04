import javax.swing.JOptionPane;

public class Lista4Exercicio6 {
    public static void main(String[] args) {
        int numero = 9, maiorIdade = 0;
        int[] idade = new int[numero];
        String[] nome = new String[numero];
        String nomeIdade = "";

        nome[0] = JOptionPane.showInputDialog(null, "Informe o nome 1");
        idade[0] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 1"));
        if (idade[0] > maiorIdade) {
            maiorIdade = idade[0];
            nomeIdade = nome[0];
        }
        nome[1] = JOptionPane.showInputDialog(null, "Informe o nome 2");
        idade[1] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 2"));
        if (idade[1] > maiorIdade) {
            maiorIdade = idade[1];
            nomeIdade = nome[1];
        }
        nome[2] = JOptionPane.showInputDialog(null, "Informe o nome 3");
        idade[2] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 3"));
        if (idade[2] > maiorIdade) {
            maiorIdade = idade[2];
            nomeIdade = nome[2];
        }
        nome[3] = JOptionPane.showInputDialog(null, "Informe o nome 4");
        idade[3] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 4"));
        if (idade[3] > maiorIdade) {
            maiorIdade = idade[3];
            nomeIdade = nome[3];
        }
        nome[4] = JOptionPane.showInputDialog(null, "Informe o nome 5");
        idade[4] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 5"));
        if (idade[4] > maiorIdade) {
            maiorIdade = idade[4];
            nomeIdade = nome[4];
        }
        nome[5] = JOptionPane.showInputDialog(null, "Informe o nome 6");
        idade[5] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 6"));
        if (idade[5] > maiorIdade) {
            maiorIdade = idade[5];
            nomeIdade = nome[4];
        }
        nome[6] = JOptionPane.showInputDialog(null, "Informe o nome 7");
        idade[6] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 7"));
        if (idade[6] > maiorIdade) {
            maiorIdade = idade[6];
            nomeIdade = nome[6];
        }
        nome[7] = JOptionPane.showInputDialog(null, "Informe o nome 8");
        idade[7] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 8"));
        if (idade[7] > maiorIdade) {
            maiorIdade = idade[7];
            nomeIdade = nome[7];
        }
        nome[8] = JOptionPane.showInputDialog(null, "Informe o 9º nome");
        idade[8] = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe a idade 9"));
        if (idade[8] > maiorIdade) {
            maiorIdade = idade[8];
            nomeIdade = nome[8];
        }
        System.out.println(nomeIdade + " tem a maior idade: " + maiorIdade + " anos");
    }
}