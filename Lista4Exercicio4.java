import javax.swing.JOptionPane;

public class Lista4Exercicio4 {
    public static void main(String[] args) {
        int numero = 4;
        double[] notas = new double[numero];

        String nome = JOptionPane.showInputDialog(null, "Nome Completo:");

        notas[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota1:"));
        notas[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota2:"));
        notas[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota3:"));
        notas[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a Nota4:"));

        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / numero;
        String resultado = "esta aprovado, parabens!";

        if (media < 7) {
            resultado = "reprovou, estude mais!";
        }

        JOptionPane.showMessageDialog(null, 
            "Seu nome: " + nome + 
            "\nSua media: " + media + 
            "\nVoce " + resultado);
    }
}