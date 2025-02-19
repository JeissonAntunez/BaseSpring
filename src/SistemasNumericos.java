import javax.swing.*;

public class SistemasNumericos {
    public static void main(String[] args) {

        String numeroSrt = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal = 0;

        try {
            numeroDecimal = Integer.parseInt(numeroSrt);
        }catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null,"Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        imprimir("NumeroDecimal = " + numeroDecimal);

        imprimir("Hola Jeisson");
    }

    // Realizo un metodo o funcion para imprimir cualquier tipo de dato
    public static  void imprimir(Object dato){
        System.out.println(dato);
    }
}
