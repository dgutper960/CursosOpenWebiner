package cursos.javadesdecero.introduccion;

public class DeclaracionVariables {
    public static void main(String[] args) {

        /** Esto java lo interpreta como un número seguido, no teniendo en cuenta las barrasBajas */
        long creditCardNumber = 5698_3654_474_1120L; /** Sufijo L a tener en cuenta */

        /** Valor 26 en decimal */
        int decVeintiSeis = 26;

        /** Valor 26 en haxadecimal */
        int hexVeintiSeis = 0x1a;

        /** Valor 26 en binario */
        int binVeintiSeis = 0b11010; /** 0b es para la nomenclatrura de binario */

        boolean resultado = true;  /** Valores de si o no; de 0 ó 1 */

        char letraC = 'C'; /** para literales de caracter las comillas simples */

        String palabra = "Petardo"; /** Para literales de cadenas de caracteres son las comillas dobles */

        short sh = 1000; /** Ahorra memoria con números pequeños */

        //TODO TIPO DE NÚMEROS ENTEROS
        byte b = 127;
        short s = 32469;
        int i = 965954464;
        long l = 2222633215215211172L; /** Debe ir con la l en may o min, da igual */

        //TODO TIPOS DE NÚMEROS REALES
        float f = 1.01f; /** debe llevar la f al final */
        double d = 23.012d; /** debe llevar la d al final */

        //TODO DECLARAR UNA COSNTANTE IMPORTANDOLA DE UNA CLASE
        Double PI = Math.PI; /** Esto usa la constante PI de la Clase Math */




    }

}
