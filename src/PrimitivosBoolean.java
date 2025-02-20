

public class PrimitivosBoolean extends  SistemasNumericos {
    public static void main(String[] args) {
       imprimir("Hola Jeisson de Nuevo");

       boolean datoLogico = true;
       imprimir("datoLogico = " + datoLogico);

       double d = 98765.43e-3; // 98.76543
        imprimir("d = " + d);

        float f = 1.2345e2f; // 123.45
        imprimir("f = " + f);

        datoLogico = d < f;
        imprimir("datoLogico = " + datoLogico);

        boolean esIgual = (3-2 == 1);
        imprimir("esIgual = " + esIgual);


    }
}
