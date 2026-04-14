public class Estudiante {
    private String nombre;
    private int  edad;
    private double notaPromedio;

    //Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad);              
        setNotaPromedio(notaPromedio);
    }

    // GET - retorna el valor
    public String getNombre() { return nombre; }
    public int getEdad(){return edad;}
    public double getNotaPromedio(){return notaPromedio;}

    // SET - asigna el valor
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setEdad(int edad){
        if (edad >= 0) {
            this.edad = edad;
            } else {
            System.out.println("Edad inválida, debe ser positiva.");
        }
    }
    public void setNotaPromedio(double notaPromedio){
        if (notaPromedio >= 0 && notaPromedio <= 5) {
            this.notaPromedio = notaPromedio;
        } else {
            System.out.println("Nota inválida, debe estar entre 0 y 5");
        }
    }

    public void mostrarInfo(){
        System.out.println("## INFORMACION DEL ESTUDIANTE ##");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Nota Promedio: " + notaPromedio);
        System.out.println("-------------------------");
    }

    @Override
    public String toString(){
        return "Estudiante{Nombre= '"+nombre+"',Edad = '"+edad+"', Nota Promedio = '"+notaPromedio+"'}";
    }
}
