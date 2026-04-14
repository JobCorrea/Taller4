public class Main{

    public static void main(String[] args) {
        Estudiante study1 = new Estudiante("Job", 15, -1); //Ivalido
        study1.mostrarInfo();
        study1.setEdad(22);
        study1.setNotaPromedio(5);
        study1.mostrarInfo();
    }
}