package dia3;

public class NumerosPrimos {

    public static void main (String[] args) {

         int n;
         int cont =1;

         for(int i = 1; i <= 30; i = i + 1){
         if (calcularPrimos(i) == true){
         System.out.println(i);
         }

         }

    }

    public static boolean calcularPrimos(int num) {
        int cantidadDivisores =0;
        int cont =0;
        boolean resultado = false;

        for(cont= 1; cont <= num; cont++){
            if (num % cont == 0) {
                cantidadDivisores = cantidadDivisores+1;
            }

        }
        if (cantidadDivisores <= 2){
            resultado = true;

        }
        else {
           resultado = false;
        }
        return resultado;
    } 
}
