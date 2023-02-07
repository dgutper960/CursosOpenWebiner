package cursos.javadesdecero.desiciones;

public class EjemploSwitch {
    public static void main(String[] args) {
        /** En esta ocasión tenemos diferentes casos posibles al que
         * le vamos a atribuir sus correspondientes sentencias **/

       int mes = 4; //Este dato es el que vamos a evaluar
        String mesString; //Esta es la variable que usaremos para imprimir la sentenca del Switch

        switch (mes){
            case 1: mesString = "Enero";
                break;
            case 2: mesString = "Febrero;";
                break;
            case 3: mesString = "Marzo";
                break;
            case 4: mesString = "Abril";
                break;
            case 5: mesString = "Mayo";
                break;
            case 6: mesString = "Junio";
                break;
            case 7: mesString = "Julio";
                break;
            case 8: mesString = "Agosto";
                break;
            case 9: mesString = "Septiembre";
                break;
            case 10: mesString = "Octubre";
                break;
            case 11: mesString = "Noviembre";
                break;
            case 12: mesString = "Diciembre";
                break;
            default: mesString = "Número para mes no válido";
        }
        System.out.println(mesString);

        //TODO SI QUEREMOS AGRUPAR LA MISMA SENTENCIA EN DIFERENTES CASOS
        /** Vamos a suponer que queremos agrupar los meses por el número de días **/

        int numMes = 6; /**Variable para seleccionar mes */
        int diasMes= 0; /**Variable para imprimir núm de días */

        switch (numMes){

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diasMes = 31;
                break;
            case 2:
                diasMes = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diasMes = 30;
                break;
            default:
                System.out.println("Número introducido no válido");
        }
        System.out.println("El mes seleccionado tiene "+diasMes+" días");
    }
}
