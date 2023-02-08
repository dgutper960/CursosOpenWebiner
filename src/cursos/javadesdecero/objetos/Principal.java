package cursos.javadesdecero.objetos;

public class Principal {
    public static void main(String[] args) {

        Persona persona1 = new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Persona persona4 = new Persona();
        Persona a = new Persona();
        Persona b = new Persona();

        b.setApellidos("Gonzalez Gomez");
        /** nombreObjeto.setAtributo --> inicializar los atributos de cada objeto por separado */
        a.setNombre("Manolo");
        a.setApellidos("Jimenez Barragán");
        a.setEdad(34);
        a.setAltura(181);
        a.setPeso(84);

        /** nombreObjeto.nombreMétodo --> acceder a los metodos de los objetos creados */
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

/** El objeto persona1 no tiene sobreescritos los valores de sus atributos, los objetos a y b tienen los inicializados con setter */
        System.out.println(persona1);
        System.out.println(b);
        System.out.println(a);
    }
}
