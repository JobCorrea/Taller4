public class Main{

    public static void main(String[] args) {
        Estudiante study1 = new Estudiante("Job", 15, -1); //Ivalido
        study1.mostrarInfo();
        study1.setEdad(22);
        study1.setNotaPromedio(5);
        study1.mostrarInfo();

        //Coche
        Coche auto1 = new Coche("aaa", null, 0);
        auto1.mostrarInfo();
        auto1.setMarca("Auudi");
        auto1.setModelo("i10");
        auto1.setVelocidadMaxima(100);
        auto1.mostrarInfo();
        auto1.acelerar(10);
        auto1.mostrarInfo();
        // Intento de acceso directo a atributos privados
        // System.out.println(auto.marca);          
        // System.out.println(auto.modelo);         
        // System.out.println(auto.velocidadMaxima);
        //variable marca is never read
    }
}