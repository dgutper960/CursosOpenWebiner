package cursos.javadesdecero.calculadora;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        int opcion = 0;
        Scanner sc;
        sc = new Scanner(System.in); /** Con esto se almacena el imput del teclado**/
        float resultado;
        /** Con el do while imprimimos el menú */
        do{
            System.out.println("\n");
            System.out.println("*** CALCULADORA ***");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Resto");
            System.out.println("0. Salir del programa");
            System.out.print("Introduzca una opción válida: ");

            //1) Recoge el valor escrito por teclado
            //2) Transforma el valor string a int
            opcion = Integer.parseInt(sc.nextLine());

            if(opcion < 0 || opcion > 5){
                System.out.println("-WARNING---> Opcion no válida.\n" +
                        "-WARNING---> Selecione una de las opciones disponibles  ");
            }else if(opcion != 0) {
                System.out.println("\n");

                float operando1, operando2;

                System.out.println("Introduzca el primer operando: ");
                operando1 = Float.parseFloat(sc.nextLine());

                System.out.println("Introduzca el segundo operando: ");
                operando2 = Float.parseFloat(sc.nextLine());

                System.out.println("\n");

                switch (opcion){
                    case 1: //SUMA
                        resultado = operando1 + operando2;
                        System.out.println("El resultado de la suma es: "+resultado);
                            break;
                    case 2: //RESTA
                        resultado = operando1 - operando2;
                        System.out.println("El resultado de la resta es: "+resultado);
                            break;
                    case 3: //MULT
                        resultado = operando1 * operando2;
                        System.out.println("El resultado de la multiplicación es: "+resultado);
                            break;
                    case 4: //DIV
                        resultado = operando1 / operando2;
                        System.out.println("El resultado de la división es: "+resultado);
                            break;
                    case 5: //RESTO
                        resultado = operando1 % operando2;
                        System.out.println("El resto de la división es: "+resultado);
                            break;
                }

            }

        } while (opcion != 0);// MIENTRAS QUE SE CUMPLA LA CONDICIÓN EL PROGRAMA SIGUE
        //INDICAMOS QUE NO VAMOS A LEER MÁS POR TECLADO
        sc.close();

        System.out.println("La ejecución de la calculadora ha finalizado\n Good Look!");
    }
}
