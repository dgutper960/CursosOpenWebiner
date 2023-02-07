package cursos.javadesdecero.introduccion;

public class CastingCambioTipoDato {
    public static void main(String[] args) {
        /** Para cambiar de un tipo de dato a otro
         * veamos un ejemplo para cambiar un integer a double **/

        System.out.println(5/9);/** Esto nos devuelve como resultado 0 el entero no tiene valores decimales */
        /** Para pasarlo a double y ver las decimales */

        /** Si añadimos informacion a la operacion también nos capta porque son literales */
        System.out.println(5d/9);

        /** Cuando los valores los tenemos declarados debemos hacer el casting */
        int a = 5;
        int b = 9;
        System.out.println((double) a/b); /** Ahora veremos el resultado en double 0.5555555555555556 */
    }
}
