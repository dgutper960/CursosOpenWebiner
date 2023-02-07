package cursos.javadesdecero.introduccion;

public class OperadoresAritmeticos {
    public static void main(String[] args) {
         int a = 15;
         int b = 5;
         int z;

         //SUMA
         z = a + b;
        System.out.println("Suma = "+z);

         //RESTA
        z = a - b;
        System.out.println("Resta = "+z);

        //MULT
        z = a * b;
        System.out.println("Mult = "+z);

        //DIVISIÓN
        z = a / b; /** Esto proporciona el cociente de una división */
        System.out.println("División = "+z);

        //RESTO
        z = a % b; /** Esto proporcona el resto de una división */
        System.out.println("El resto de "+a+" entre "+b+" es = "+z);

        //TODO PARA INCREMENTOS Y DECREMENTOS

        int h = ++a; /** El valor de 'a' aumenta antes de la asignación a h */
        int j = b++; /** El valor de 'b' incrementa después de la asignacion a j */
        System.out.println(h);
        System.out.println(j);

    }
}
