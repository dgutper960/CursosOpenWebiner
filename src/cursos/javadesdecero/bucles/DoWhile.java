package cursos.javadesdecero.bucles;

public class DoWhile {
    public static void main(String[] args) {
        //TODO SINTAXIS DO WHILE
        // do {
        // ...
        // ...
        // } while(condición); --> Hasta que la condición sea false

        /** Volvemos al ejemplo del while visto en este paquete */
        int contador = 0;

        do{
            System.out.println(contador);
            contador += 2;/** Ojo con no añadir algo que modifque la variable de la condición */
        }while (contador <= 14);
    } /** Tenemos prácticamente lo mismo que con el while */
    /** con este metodo aseguramos al menos una iteración */
}
