import javax.swing.*;
import java.lang.reflect.Field;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HolaMundo {

    // Método main debe ser estático
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        imprimir("Ingrese un número entero: ");
        //String numeroStr = scanner.nextLine();
        int numeroDecimal = 0;
        try {
            numeroDecimal = scanner.nextInt();
        } catch (InputMismatchException e){
            //Va cambiando
            imprimir("Error debe ingresar un número entero");
            main(args);
            System.exit(0);
        }

        imprimir("numeroDecimal = " + numeroDecimal);
        imprimir("numero binario de " + numeroDecimal + " = " + Integer.toBinaryString(numeroDecimal));

        // numero binario un 0n adelante y b y ahi recien la lógica
        int numeroBinario = 0b11110;
        int numeroSegundo = 0b11011;
        int numeroTercero = 0b000001;
        imprimir("numeroBinario = " + numeroBinario);
        imprimir("numero de ejemplo = " + numeroSegundo);
        imprimir("numero Tercero = " + numeroTercero );
        imprimir("---------------------");
        imprimir("numeroOctal = " + numeroDecimal + " = " + Integer.toOctalString(numeroDecimal));
        // Ya es un numero octal con base a 8
        int numeroOctal = 036;
        imprimir("numeroOctal = " + numeroOctal);
        imprimir("numeroOctal = " + numeroOctal + " = " + Integer.toOctalString(numeroOctal));
        // Ejemplo de 65
        int numeroOctal2 = 0101;
        imprimir("numeroOctal2 = " + numeroOctal2 );
        imprimir("numeroOctal2 = " + numeroOctal2 + " = " + Integer.toOctalString(numeroOctal2));
        imprimir("----------");
        int numeroOctal3 = 0201;
        imprimir("numeroOctal3 = " + numeroOctal3);
        imprimir("numeroOctal3 = " + numeroOctal3 + " = " + Integer.toOctalString(numeroOctal3));
        imprimir("-------------------");
        imprimir("numero hexadecimal de " + numeroDecimal + " = " + Integer.toHexString(numeroDecimal));
        int numeroHex = 0x8b;
        imprimir("numeroHex = " + numeroHex);
        imprimir("---------------------------");

        // Crear un objeto de la clase numHexadecimal
        numHexadecimal obj = new numHexadecimal();
        // Llamar al metodo para mostrar los atributos
        obj.mostrarAtributos();
    }

    // Esta es una función de imprimir cualquier tipo de dato ingresado
    public static void imprimir(Object dato) {
        System.out.println(dato);
    }
}

// Clase numHexadecimal debe estar fuera de la clase HolaMundo
class numHexadecimal {
    int a = 10;
    int b = 11;
    int c = 12;
    int d = 13;
    int e = 14;
    int f = 15;

    public void mostrarAtributos() {
        HolaMundo.imprimir("Atributos y sus valores:");
        // Obtener todos los campos de la clase usando reflexión
        Field[] fields = this.getClass().getDeclaredFields();

        // Recorrer los campos y mostrar el nombre y el valor de cada uno
        for (Field field : fields) {
            try {
                // Obtener el valor del atributo y mostrarlo
                Object value = field.get(this);
                HolaMundo.imprimir(field.getName() + " = " + value);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        }
    }
}
