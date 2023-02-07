package cursos.javadesdecero.desiciones;

public class Ejemplo_If_Else {
    public static void main(String[] args) {

        /** Nos permite tomar diferentes caminos
         *  en consecuencia de que se cumplan o no
         *  diferentes posibilidades que pueden ser true or false */

        //TODO UN EJEMPLO DE IF-ELSE SERÍA:

        float notaAlumno = 7.6f; //Este es el valor que usaremos en la sentencia if-else

        if (notaAlumno == 10) {/** entre parentesis la condicion que se debe cumplir para la sentencia */
            System.out.println("ENHORABUENA, eres un alumno de 10!!");
        }else if ((notaAlumno <= 10)&&(notaAlumno>8.5)){
            System.out.println("Sientete orgulloso! Tu nota es Sobresaliente!");
        }else if ((notaAlumno <= 8.5)&&(notaAlumno>7.0)){
            System.out.println("Fenomenal!!! Tienes un notable!!");
        }else if ((notaAlumno <= 7.0)&&(notaAlumno>6.0)){
            System.out.println("No es ta nada mal, muy bien");
        }else if ((notaAlumno <= 6.0)&&(notaAlumno>=5.0)) {
            System.out.println("Deberías estar contento, pero seguramente puedas hacerlo mejor. Suficiente");
        }else if ((notaAlumno < 5)&&(notaAlumno>3)){
            System.out.println("MMmmmm... Debes reaccionar, tu nota es insuficiente. PUEDES HACERLO!!");
        } else if ((notaAlumno <= 3)&&(notaAlumno>1.5)) {
            System.out.println("Debes tomartelo más en serio, tu nota es muy baja... Insuficiente ");
        } else if ((notaAlumno <= 1.5)&&(notaAlumno>0.0)) {
            System.out.println("Si estas desmotivado, pide ayuda, o repetirás curso");
        }else{
            System.out.println("¿Seguro que tienes matricula en el centro??");
        }

        //TODO PARA COMPARACIONES DE IGUALDAD TAMBIÉN PODEMOS USAR UN SWITCH
    }
}
