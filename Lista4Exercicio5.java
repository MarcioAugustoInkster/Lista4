import javax.swing.JOptionPane;

public class Lista4Exercicio5 {
    public static void main(String[] args) {
        int numero = 5;
        double[] pesos = new double[numero];
        double somaPesos = 0, mediaPesos = 0;

        pesos[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 1:"));
        pesos[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 2:"));
        pesos[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 3:"));
        pesos[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 4:"));
        pesos[4] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe o peso 5:"));

        somaPesos += pesos[0];
        somaPesos += pesos[1];
        somaPesos += pesos[2];
        somaPesos += pesos[3];
        somaPesos += pesos[4];
        
        mediaPesos = somaPesos / numero;
        
        System.out.println("A soma dos pesos fica: " + somaPesos);
        System.out.println("A media dos pesos fica: " + mediaPesos);
        
    }
}