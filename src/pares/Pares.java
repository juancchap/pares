package pares;

import javax.swing.JOptionPane;

public class Pares {

    public static void main(String[] args) {
        int numero;

        numero = Integer.parseInt(JOptionPane.showInputDialog("Digita un numero"));

        while (numero != 0)
        {
            
            if (numero % 2 == 0)
            {
                System.out.println("El numero es par");
            } 
            else
            {
              System.out.println("El numero es impar");
            }
        numero=Integer.parseInt(JOptionPane.showInputDialog("Digita un numero")); 
        }

    }

}
