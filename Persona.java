// Clase con atributo private
// public class Persona {
//     private String nombre = "Daniel";
// }

//Error que lanza Java:
//error: nombre has private access in Persona

//CORREGIDO

public class Persona {
    private String nombre = "Daniel";
    

    // Solo accesible mediante getter
    public String getNombre() { return nombre; }
}