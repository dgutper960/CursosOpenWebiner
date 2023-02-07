package cursos.javadesdecero.introduccion;

public class OpCondicionalesYRelacionales {
    public static void main(String[] args) {

        //TODO OPERADORES CONDICIONALES//
        /** !  --> Realiza la negación de la operación
         *  && --> Operación lógica condicional AND (deben ser verdadero los dos)
         *  || --> Operación lógica condicional OR (solo debe ser verdadero uno)
         *  ?: --> (Ternario) Si el primer operando es verdadero
         *         devuelve el valor del segundo;
         *         en otro caso devuelve el tercero */

        //TODO OPERADORES RELACIONALES//
        /** == --> Comparador de igualdad
         * != ---> Comparador de desigualdad
         * > ----> Valor de la izquierda Mayor que el valor de la derecha
         * < ----> Valor de la izquierda Menor que el valor de la derecha
         * >= ---> Valor de la iquierda Mayor o Igual que
         * >= ---> Valor de la izquierda Menor o Igual que */

        //TODO EJEMPLOS
        /** Declaramos dos variables de tipo int para compararlas */
        int a = 10;
        int b = 5;
        int c = b*2; //Tomamos b y lo multiplicamos por 2

        if((a == 10) && (c == 10));
            System.out.println("Los valores de las variables a AND b son equivalentes");
        if((b == 5) || (c == 2));
        System.out.println("OR b es igual a 5 OR c es igual a 2");

        //OPERADOR TERNARIO
        int result;
        boolean someCondicion = true;
        result = someCondicion ? b : a; /** Si true devuelve b y si false devuelve a */
        System.out.println(result);
    }
}
