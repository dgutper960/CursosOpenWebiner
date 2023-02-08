package cursos.javadesdecero.objetos;

public class Persona {

    /** Propiedades o Atributos */
    //TODO NOMENCLATURA PARA DECLARAR ATRIBUOS / PROPIEDADES
    // modificadorAcceso - tipoDato - nombreDato - ;
    private String nombre;
    private String apellidos;
    private int edad;
    private float altura;
    private float peso;

    /** CONSTRUCTOR VACÍO porque no recibe ningún argumento '()' */
    //TODO NOMENCLATURA PARA GENERAR CONSTRUCTORES
    //  modificadorAcceso - modificadorDeModo - tipoRetorno - nombreMétodo - (tipo ParamEntrada1, tipo ParamEntrada2, ...) ---> Si hay cuerpo -> {}  Si no cuerpo -> ;
    public Persona() { //TODO UN CONSTRUCTOR SIEMPRE SE LLAMA COMO LA CLASE
        this.nombre = "desconocido"; //this nos dice que nos referimos al de esta clase
        this.apellidos = "desconocidos";
        this.edad = 0; //inicializamos los valores así para no ponerlo null
    }

    /** CONSTRUCTOR CON PARÁMETROS lo que lleva entre paréntesis es la diferencia entre uno y otro */
    public Persona(String nombre, String apellidos, int edad){
        this.nombre = nombre; /** Inicializamos propiedades */
        this.apellidos = apellidos;
        this.edad = edad;
    }

    //TODO PARA DISTINGUIR ENTRE UN CONSTRUCTOR Y OTRO MIRAMOS
    // O BIEN EL NÚMERO DE ARGUMENTOS
    // O DE SER IGUAL NÚMERO, LOS DE LOS DATOS QUE RECIBEN DEBERÍAN SER DIFERENTES
    public Persona(String nombre, String apellidos, int edad, float peso) {
        /** Si tenemos un constructor previo con propiedades inicializadas,
         * podemos usarlos en el nuevo con esta estructura **/
        this (nombre, apellidos, edad);/** Propiedades inicializadas en el constructor de arriba */
        this.peso = peso; /** Nueva propiedad para este constructor */
    }

    //TODO PODEMOS GENERAR UN CONSTRUCTOR DE MANERA AUTOMÁTICA CON EL IDE
    // SELECCIONAREMOS LOS ARGUMENTOS QUE QUEREMOS INICIALIZAR Y SU POSICIÓN EN EL CÓDIGO

    public Persona(String nombre, String apellidos, int edad, int altura, float peso) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.altura = altura;
        this.peso = peso;
        /*** Supuéstamente se pueden inicializar con valores concretos */
    }

    /** Comportamiento / Métodos */
    void caminar(){
        System.out.println("Estoy Caminando");
    }

    void hablar(){
        System.out.println("Hola illo, que?? como va la cosa??");
    }

    void nacer(){
        System.out.println("Preparate Mundo que Vooooy");
    }

    void morir(){
        System.out.println("Me despido del mundo, os doy las gracias a algunos y a los demás que os jodan");
    }
    /** Creamos un método público void y sin parametros de entrada  */
    public void presentacion(){
        System.out.println("Hola me llamo "+this.nombre+" y tengo "+this.edad+" años");
    }

    /** Creamos un método publico void con parámetros de entrada */
    public void saludo(String mensaje){
        System.out.println("Hola soy "+this.nombre+" "+this.apellidos+" y quiero saludarte dicioendote "+mensaje);
    }

    /** Creamos un método público con retorno String y sin parámetros de entrada  */
    public String obtenerNombreCompleto(){
        return this.nombre + " " + this.apellidos;
    }

    //TODO COMO EL MODIFICADOR DE ACCESO DE LOS ATRIBUTOS ES 'PRIVATE'
    // VAMOS A AUTOGENERAR MÉTODOS Getters y Setters PARA TODOS LOS ATRIBUTOS DE LA CLASE


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    //TODO TAMBIÉN VAMOS A AUTOGENERAR UN MÉTODO ESPECIAL
    //  ---> toString() -> Relacionado con la Herencia

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", edad=" + edad +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
        //TODO ESTE MÉTODO TRANSFORMA UN OBJETO EN UNA CADENA DE TEXRO,
        // A TRAVÉS DE SUS PROPIEDADES, SI NO LO USAMOS VEREMOS LA POSICIÓN DE MEMORIA AL HACER 'Sout-> Print'
    }
}
