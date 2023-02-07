package cursos.javadesdecero.bucles;

public class BucleWile {
    public static void main(String[] args) {
        //TODO SINTAXIS WHILE
        // while (condición) {
        //  ...
        //  ... }
        /** Mientas la condición sea cierta, el bucle se repite
         *  Por ello deberemos hacer que la condición cambie en la sentencia
         *  De lo contrario el bucle será infinito */

        /** inicializamos una variable fuera de while */
        int contador = 0; /** inicializamos contador a 0 */

        while (contador <= 14){ /** Mientras que la condición sea true sigue el bucle **/
            System.out.println(contador); /** imprime el valor de contador en cada iteración */
            contador +=2; /** Contador incrementa de 2 en 2 */
        }
    }
}
