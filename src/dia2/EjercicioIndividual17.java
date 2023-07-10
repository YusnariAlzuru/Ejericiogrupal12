package dia2;

import java.util.Scanner;


public class EjercicioIndividual17 {

    public static void main(String[] args){

        String texto;

        System.out.println("Ingrese texto: ");
        Scanner leer = new Scanner(System.in);
        //System.out.println("Ingrese nuevamente/Obligatorio: ");
        //Scanner leer = new Scanner(System.in);
        texto = leer.next();
        texto = texto.toLowerCase();
        String resultado = cuentaVocalesConsonantes(texto);
        System.out.println(resultado);

    }

    /**
     *
     * @param texto
     * @return
     * 
     *cuentaVocalesConsonantes sirve para arrojas el numero de consontaes y de vocales en un texto ingresado
     */
    public static String cuentaVocalesConsonantes(String texto){

        int cont_vocales = 0, cont_consonantes = 0;

        for(int i = 0; i < texto.length(); i++) {
            char ch = texto.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                cont_vocales++;
            } else if ((ch >= 'a' && ch <= 'z')) {
                cont_consonantes++;
            }
        }
        return "Número de vocales: " + cont_vocales + "Número de consonantes: " + cont_consonantes;
    }
}
