import javax.swing.JOptionPane;

public class Lista4Exercicio7 {
    public static void main(String[] args) {
        double menorAltura = 0;
        int numero = 4;
        double[] animalAltura = new double[numero];
        String[] nomeAnimal = new String[numero];
        String menorAnimal = "";

        nomeAnimal[0] = JOptionPane.showInputDialog("Nome do Animal 1");
        animalAltura[0] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura 1"));
        
        menorAltura = animalAltura[0];

        if (animalAltura[0] < menorAltura) {
            menorAltura = animalAltura[0];
            menorAnimal = nomeAnimal[0];
        }
        
        nomeAnimal[1] = JOptionPane.showInputDialog("Nome do Animal 2");
        animalAltura[1] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura 2"));
        
        if (animalAltura[1] < menorAltura) {
            menorAltura = animalAltura[1];
            menorAnimal = nomeAnimal[1];
        }
        
        nomeAnimal[2] = JOptionPane.showInputDialog("Nome do Animal 3");
        animalAltura[2] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura 3"));
        
        if (animalAltura[2] < menorAltura) {
            menorAltura = animalAltura[2];
            menorAnimal = nomeAnimal[2];
        }
        
        nomeAnimal[3] = JOptionPane.showInputDialog("Nome do Animal 4");
        animalAltura[3] = Double.parseDouble(JOptionPane.showInputDialog(null, "Informe a altura 4"));
        
        if (animalAltura[3] < menorAltura) {
            menorAltura = animalAltura[3];
            menorAnimal = nomeAnimal[3];
        }
        
        System.out.println("O animal " + menorAnimal + " tem a menor altura: " + menorAltura + " metros");
    }
}