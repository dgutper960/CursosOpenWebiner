package cursos.javadesdecero.objetos;

public class Principal {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();

        persona1.nacer();
        persona1.caminar();
        persona1.hablar();
        persona1.morir();

        persona2.nacer();
        persona2.hablar();

        persona3.hablar();

        persona4.caminar();
        persona4.hablar();
        persona4.morir();

    }
}
